import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `@noemec/react-native-brightness no parece estar linkeado.\n` +
  `- Recompila la app nativa después de instalar\n` +
  `- Evita el workflow Expo Managed\n`;

const Native = NativeModules.DeviceBrightness
  ? NativeModules.DeviceBrightness
  : new Proxy({}, { get() { throw new Error(LINKING_ERROR); } });

export async function setBrightnessLevel(level: number): Promise<void> {
  if (Platform.OS === 'android') {
    if (level !== -1 && (level < 0 || level > 1)) {
      throw new Error('Brightness debe ser 0..1 (o -1 para reset en Android)');
    }
  } else {
    if (level < 0 || level > 1) {
      throw new Error('Brightness debe ser 0..1');
    }
  }
  await Native.setBrightnessLevel(level);
}

export function getBrightnessLevel(): Promise<number> {
  return Native.getBrightnessLevel();
}

export function getSystemBrightnessLevel(): Promise<number> {
  if (Platform.OS !== 'android') {
    return Promise.reject(new Error('getSystemBrightnessLevel es solo Android'));
  }
  return Native.getSystemBrightnessLevel();
}

export default {
  setBrightnessLevel,
  getBrightnessLevel,
  getSystemBrightnessLevel,
};
