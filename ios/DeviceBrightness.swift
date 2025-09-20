import Foundation
import UIKit
import React

@objc(DeviceBrightness)
class DeviceBrightness: NSObject {

  @objc static func requiresMainQueueSetup() -> Bool { false }

  @objc(setBrightnessLevel:resolver:rejecter:)
  func setBrightnessLevel(_ level: NSNumber,
                          resolver resolve: @escaping RCTPromiseResolveBlock,
                          rejecter reject: @escaping RCTPromiseRejectBlock) {
    let value = CGFloat(truncating: level)
    guard value >= 0.0 && value <= 1.0 else {
      reject("E_RANGE", "Brightness must be between 0 and 1 on iOS", nil)
      return
    }

    DispatchQueue.main.async {
      UIScreen.main.brightness = value
      resolve(nil)
    }
  }

  @objc(getBrightnessLevel:rejecter:)
  func getBrightnessLevel(_ resolve: @escaping RCTPromiseResolveBlock,
                          rejecter reject: @escaping RCTPromiseRejectBlock) {
    DispatchQueue.main.async {
      resolve(Double(UIScreen.main.brightness))
    }
  }
}
