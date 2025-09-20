package com.noemec.brightness

import android.app.Activity
import android.provider.Settings
import android.view.WindowManager
import com.facebook.react.bridge.*

class DeviceBrightnessModule(private val reactCtx: ReactApplicationContext)
  : ReactContextBaseJavaModule(reactCtx) {

  override fun getName() = "DeviceBrightness"

  @ReactMethod
  fun setBrightnessLevel(level: Double, promise: Promise) {
    val activity: Activity? = reactCtx.currentActivity
    if (activity == null) {
      promise.resolve(null)
      return
    }

    val brightness: Float = when {
      level == -1.0 -> WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_NONE
      level < 0.0 || level > 1.0 -> {
        promise.reject("E_RANGE", "Brightness must be between 0 and 1 (or -1 to reset on Android)")
        return
      }
      else -> level.toFloat()
    }

    activity.runOnUiThread {
      val lp = activity.window.attributes
      lp.screenBrightness = brightness
      activity.window.attributes = lp
      promise.resolve(null)
    }
  }

  @ReactMethod
  fun getBrightnessLevel(promise: Promise) {
    val activity: Activity? = reactCtx.currentActivity
    if (activity == null) {
      promise.resolve(getSystemBrightnessInternal())
      return
    }
    val lp = activity.window.attributes
    val value = lp.screenBrightness
    if (value == WindowManager.LayoutParams.BRIGHTNESS_OVERRIDE_NONE) {
      promise.resolve(getSystemBrightnessInternal())
    } else {
      promise.resolve(value.toDouble())
    }
  }

  @ReactMethod
  fun getSystemBrightnessLevel(promise: Promise) {
    try {
      promise.resolve(getSystemBrightnessInternal())
    } catch (e: Exception) {
      promise.reject("E_SYSTEM_BRIGHTNESS", e)
    }
  }

  private fun getSystemBrightnessInternal(): Double {
    val raw = Settings.System.getInt(
      reactCtx.contentResolver,
      Settings.System.SCREEN_BRIGHTNESS,
      127
    )
    return raw / 255.0
  }
}
