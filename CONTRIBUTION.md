# Guía de Contribución

Gracias por tu interés en contribuir a @noemec/react-native-brightness. Las contribuciones son bienvenidas y apreciadas.

## Estado del Proyecto

Actualmente, esta librería **solo soporta Android**. El soporte para iOS aún no está disponible.

## Contribuciones Deseadas

### Alta Prioridad

1. **Soporte para iOS**: Esta es la contribución más importante que necesitamos. Si tienes experiencia con desarrollo nativo de iOS y React Native, tu ayuda sería invaluable.

2. **Pruebas**: Agregar pruebas unitarias y de integración para mejorar la confiabilidad de la librería.

3. **Documentación**: Mejorar la documentación existente y agregar ejemplos más detallados.

### Media Prioridad

1. **Optimizaciones de rendimiento**: Mejorar el rendimiento en dispositivos Android de gama baja.

2. **Validaciones adicionales**: Agregar más validaciones y manejo de casos edge.

3. **Soporte para TypeScript**: Mejorar las definiciones de tipos existentes.

## Cómo Contribuir

### Configuración del Entorno de Desarrollo

1. Fork el repositorio
2. Clona tu fork:
   ```bash
   git clone https://github.com/tu-usuario/react-native-brightness-noemec.git
   cd react-native-brightness-noemec
   ```

3. Instala las dependencias:
   ```bash
   npm install
   ```

4. Compila el proyecto:
   ```bash
   npm run build
   ```

### Para Contribuir con Soporte iOS

Si quieres trabajar en el soporte para iOS, necesitarás:

1. **Conocimientos requeridos**:
   - Objective-C o Swift
   - Desarrollo nativo de iOS
   - React Native bridge para iOS
   - Xcode y herramientas de desarrollo de iOS

2. **Estructura esperada**:
   ```
   ios/
   ├── DeviceBrightness.h
   ├── DeviceBrightness.m (o .swift)
   └── DeviceBrightness.podspec
   ```

3. **Funcionalidades a implementar**:
   - `setBrightnessLevel(level: number)`: Establecer brillo (0.0 - 1.0)
   - `getBrightnessLevel()`: Obtener brillo actual
   - Manejo de permisos si es necesario
   - Validaciones de entrada

4. **Consideraciones importantes**:
   - iOS tiene limitaciones diferentes a Android para el control de brillo
   - Algunos dispositivos/versiones pueden tener restricciones
   - Mantener consistencia en la API con la versión Android

### Proceso de Pull Request

1. Crea una rama para tu feature:
   ```bash
   git checkout -b feature/ios-support
   # o
   git checkout -b fix/descripcion-del-fix
   ```

2. Realiza tus cambios siguiendo las convenciones del proyecto

3. Asegúrate de que el código compile:
   ```bash
   npm run build
   ```

4. Crea un commit descriptivo:
   ```bash
   git commit -m "feat: agregar soporte básico para iOS"
   ```

5. Push a tu fork:
   ```bash
   git push origin feature/ios-support
   ```

6. Abre un Pull Request con:
   - Descripción clara de los cambios
   - Explicación de cómo probar los cambios
   - Screenshots o videos si aplica
   - Referencias a issues relacionados

### Estándares de Código

- **TypeScript**: Usa TypeScript para todo el código nuevo
- **Formato**: El proyecto usa las configuraciones estándar de TypeScript
- **Comentarios**: Agrega comentarios para lógica compleja
- **Validaciones**: Incluye validaciones apropiadas para parámetros de entrada

### Pruebas

Aunque actualmente no hay pruebas automatizadas, si agregas funcionalidad nueva:

1. Prueba manualmente en múltiples dispositivos/versiones
2. Documenta los casos de prueba realizados
3. Incluye instrucciones de prueba en tu PR

### Reportar Bugs

Para reportar bugs, por favor incluye:

1. **Descripción clara** del problema
2. **Pasos para reproducir** el bug
3. **Comportamiento esperado** vs comportamiento actual
4. **Información del entorno**:
   - Versión de React Native
   - Versión de la librería
   - Dispositivo/emulador usado
   - Versión del SO

### Solicitar Features

Para solicitar nuevas funcionalidades:

1. Abre un issue describiendo la funcionalidad deseada
2. Explica el caso de uso
3. Considera las implicaciones en ambas plataformas (Android/iOS)

## Comunicación

- **Issues**: Para bugs, feature requests y discusiones
- **Email**: joralmopro@gmail.com para comunicación directa

## Reconocimientos

Todos los contribuidores serán reconocidos en el README y en los release notes.

## Licencia

Al contribuir, aceptas que tus contribuciones serán licenciadas bajo la misma licencia MIT del proyecto.

---

**Nota especial**: Si estás interesado en trabajar específicamente en el soporte para iOS, por favor contacta primero abriendo un issue para coordinar el trabajo y evitar duplicación de esfuerzos.