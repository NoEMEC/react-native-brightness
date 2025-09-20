# @noemec/react-native-brightness

Control de brillo para React Native (Android / iOS)

Una librería nativa para React Native que permite controlar el brillo de la pantalla en dispositivos Android e iOS.

## Características

- Control del nivel de brillo de la pantalla
- Obtener el nivel actual de brillo de la pantalla
- Obtener el nivel de brillo del sistema (Android)
- Resetear el brillo al valor del sistema (Android)
- Soporte para React Native 0.72+
- Compatible con Android e iOS

## Instalación

```bash
npm install @noemec/react-native-brightness
```

o

```bash
yarn add @noemec/react-native-brightness
```

### Instalación nativa

Para React Native 0.60 y superior, la librería se enlaza automáticamente. Solo necesitas:

```bash
cd ios && pod install && cd ..
npx react-native run-ios
```

Para Android:
```bash
cd android && ./gradlew clean && cd .. && npx react-native run-android
```

## Uso

```typescript
import DeviceBrightness from '@noemec/react-native-brightness';

// Establecer el brillo (0.0 - 1.0)
await DeviceBrightness.setBrightnessLevel(0.5);

// Obtener el nivel actual de brillo
const currentBrightness = await DeviceBrightness.getBrightnessLevel();

// Obtener el nivel de brillo del sistema (solo Android)
const systemBrightness = await DeviceBrightness.getSystemBrightnessLevel();

// Resetear al brillo del sistema (solo Android)
await DeviceBrightness.setBrightnessLevel(-1);
```

## API

### `setBrightnessLevel(level: number): Promise<void>`

Establece el nivel de brillo de la pantalla.

**Parámetros:**
- `level` (number): Nivel de brillo entre 0.0 (mínimo) y 1.0 (máximo). En Android, también acepta -1 para resetear al valor del sistema.

**Nota:** El valor -1 para resetear solo funciona en Android. En iOS solo acepta valores entre 0.0 y 1.0.

**Ejemplo:**
```typescript
// Establecer brillo al 75%
await DeviceBrightness.setBrightnessLevel(0.75);

// Resetear al brillo del sistema (solo Android)
await DeviceBrightness.setBrightnessLevel(-1);
```

### `getBrightnessLevel(): Promise<number>`

Obtiene el nivel actual de brillo de la pantalla.

**Retorna:** Promise que resuelve con un número entre 0.0 y 1.0.

**Ejemplo:**
```typescript
const brightness = await DeviceBrightness.getBrightnessLevel();
console.log(`Brillo actual: ${brightness}`);
```

### `getSystemBrightnessLevel(): Promise<number>` (Solo Android)

Obtiene el nivel de brillo configurado en el sistema.

**Retorna:** Promise que resuelve con un número entre 0.0 y 1.0.

**Ejemplo:**
```typescript
const systemBrightness = await DeviceBrightness.getSystemBrightnessLevel();
console.log(`Brillo del sistema: ${systemBrightness}`);
```

## Manejo de errores

La librería puede lanzar los siguientes errores:

- `E_NO_ACTIVITY`: No se encontró la actividad actual
- `E_RANGE`: El valor de brillo está fuera del rango permitido
- `E_SYSTEM_BRIGHTNESS`: Error al obtener el brillo del sistema

```typescript
try {
  await DeviceBrightness.setBrightnessLevel(0.8);
} catch (error) {
  console.error('Error al establecer el brillo:', error);
}
```

## Limitaciones

- **getSystemBrightnessLevel**: Esta función solo está disponible en Android.
- **Reset de brillo (valor -1)**: Solo disponible en Android. En iOS usar valores entre 0.0 y 1.0.
- **Permisos**: No requiere permisos especiales.
- **Expo**: No es compatible con Expo Managed Workflow. Requiere React Native CLI o Expo Bare Workflow.

## Requisitos

- React Native >= 0.72
- React >= 18
- **Android**: SDK 23+, Java 17
- **iOS**: iOS 13.4+, Xcode 12+

## Contribuir

Las contribuciones son bienvenidas. Por favor lee [CONTRIBUTION.md](CONTRIBUTION.md) para más detalles.

## Licencia

MIT

## Autor

**Jose Altamar**
- Email: joralmopro@gmail.com
- Website: https://noemec.net

## Changelog

### 0.1.0
- Versión inicial
- Soporte para control de brillo en Android e iOS
- Funciones para establecer y obtener brillo
- Función para obtener brillo del sistema (solo Android)