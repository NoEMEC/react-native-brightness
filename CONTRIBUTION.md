# Guía de Contribución

Gracias por tu interés en contribuir a @noemec/react-native-brightness. Las contribuciones son bienvenidas y apreciadas.

## Estado del Proyecto

Esta librería actualmente **soporta Android e iOS**. Ambas plataformas están implementadas y funcionando.

## Contribuciones Deseadas

### Alta Prioridad

1. **Pruebas**: Agregar pruebas unitarias y de integración para mejorar la confiabilidad de la librería en ambas plataformas.

2. **Documentación**: Mejorar la documentación existente y agregar ejemplos más detallados.

3. **Optimizaciones de rendimiento**: Mejorar el rendimiento en dispositivos de gama baja.

### Media Prioridad

1. **Validaciones adicionales**: Agregar más validaciones y manejo de casos edge.

2. **Soporte para TypeScript**: Mejorar las definiciones de tipos existentes.

3. **Funcionalidades adicionales**: Nuevas características relacionadas con el control de brillo.

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

### Proceso de Pull Request

1. Crea una rama para tu feature:
   ```bash
   git checkout -b feature/nueva-funcionalidad
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
   git push origin feature/nueva-funcionalidad
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

1. Prueba manualmente en múltiples dispositivos/versiones (Android e iOS)
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