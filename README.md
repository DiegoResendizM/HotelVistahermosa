# 🏨 Hotel Vista Hermosa - Sistema de Gestión Hotelera

Sistema de gestión hotelera desarrollado en Java con interfaz gráfica Swing para administrar habitaciones y reservaciones de manera eficiente.


## 📋 Tabla de Contenidos

- [Características](#características)
- [Requisitos](#requisitos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Funcionalidades](#funcionalidades)
- [Capturas de Pantalla](#capturas-de-pantalla)
- [Contribuir](#contribuir)
- [Licencia](#licencia)

## ✨ Características

- 🖥️ Interfaz gráfica intuitiva desarrollada con Java Swing
- 🏠 **Gestión de Habitaciones**: Registro y consulta de habitaciones con diferentes tipos y precios
- 📅 **Sistema de Reservaciones**: Administración completa de reservas con validación de fechas
- 💳 **Procesamiento de Pagos**: Validación de información de tarjetas de crédito
- 💾 **Persistencia de Datos**: Almacenamiento en archivos de texto plano
- 🎨 **Splash Screen**: Pantalla de bienvenida animada
- ✅ **Validación de Datos**: Verificación de campos obligatorios y formatos

## 🔧 Requisitos

- Java Development Kit (JDK) 8 o superior
- NetBeans IDE (recomendado) o cualquier IDE compatible con Java
- Sistema Operativo: Windows, macOS o Linux

## 📥 Instalación

1. Clona este repositorio:
```bash
git clone https://github.com/tu-usuario/hotel-vista-hermosa.git
```

2. Navega al directorio del proyecto:
```bash
cd hotel-vista-hermosa
```

3. Abre el proyecto en NetBeans o tu IDE preferido

4. Compila y ejecuta el proyecto desde la clase `SplashScreen.java`

### Compilación desde línea de comandos

```bash
# Compilar
javac -d bin src/hotel/vistahermosa/*.java

# Ejecutar
java -cp bin hotel.vistahermosa.SplashScreen
```

## 🚀 Uso

### Inicio de la Aplicación

1. Al ejecutar la aplicación, se mostrará el **Splash Screen** con el logo del hotel
2. Después de 3 segundos, se abrirá el **Menú Principal**
3. Desde el menú principal puedes acceder a:
   - Módulo de Habitaciones
   - Módulo de Reservaciones

### Gestión de Habitaciones

**Registrar una habitación:**
1. Clic en "Habitaciones" desde el menú principal
2. Completa los campos:
   - **ID**: Identificador único de la habitación
   - **Tipo**: Categoría de habitación (máx. 50 caracteres)
   - **Descripción**: Detalles adicionales
   - **Precio sin desayuno**: Tarifa base
   - **Precio con desayuno**: Tarifa con desayuno incluido
3. Clic en "GUARDAR"

**Ver registros:**
- Clic en "VER REGISTROS" para visualizar todas las habitaciones guardadas

### Gestión de Reservaciones

**Crear una reservación:**
1. Clic en "Reservas" desde el menú principal
2. Completa los campos:
   - **ID**: Identificador de la reservación
   - **Nombre del cliente**
   - **ID de Habitación**: Debe existir previamente
   - **Fecha de entrada** (formato: YYYY-MM-DD)
   - **Fecha de salida** (formato: YYYY-MM-DD)
   - **Incluye desayuno**: Sí/No
   - **Información de pago**:
     - Número de tarjeta (16 dígitos)
     - Fecha de vencimiento (MM/AA)
     - CVV (3 dígitos)
3. Clic en "GUARDAR"

**Ver registros:**
- Clic en "VER REGISTROS" para visualizar todas las reservaciones

## 📁 Estructura del Proyecto

```
hotel-vista-hermosa/
│
├── src/
│   └── hotel/
│       └── vistahermosa/
│           ├── SplashScreen.java          # Pantalla de inicio
│           ├── MenuPrincipal.java         # Menú principal
│           ├── MenuPrincipal.form         # Diseño GUI del menú
│           ├── ModuloHabitaciones.java    # Gestión de habitaciones
│           ├── ModuloHabitaciones.form    # Diseño GUI habitaciones
│           ├── ModuloReservaciones.java   # Gestión de reservas
│           └── ModuloReservaciones.form   # Diseño GUI reservas
│
├── habitaciones.txt                        # Base de datos de habitaciones
├── reservaciones.txt                       # Base de datos de reservaciones
├── README.md                              # Este archivo
└── resources/
    └── logo/
        └── logo.png                       # Logo del hotel
```

## 🎯 Funcionalidades

### Módulo de Habitaciones

- ✅ Registro de nuevas habitaciones
- ✅ Validación de campos obligatorios
- ✅ Validación de tipos de datos
- ✅ Límite de caracteres en campo "Tipo"
- ✅ Verificación de precios positivos
- ✅ Visualización de todos los registros
- ✅ Almacenamiento persistente en archivo de texto
- ✅ Formato estructurado con delimitadores

### Módulo de Reservaciones

- ✅ Registro de nuevas reservaciones
- ✅ Validación de formato de fechas
- ✅ Validación de fechas lógicas (entrada antes de salida)
- ✅ Validación de número de tarjeta (16 dígitos)
- ✅ Validación de fecha de vencimiento (MM/AA)
- ✅ Validación de CVV (3 dígitos)
- ✅ Verificación de existencia de habitación
- ✅ Cálculo automático de días de estancia
- ✅ Cálculo de precio total según opciones
- ✅ Visualización de todos los registros
- ✅ Almacenamiento persistente

### Validaciones Implementadas

**Habitaciones:**
- Campos no vacíos
- Tipo de habitación máximo 50 caracteres
- Precios numéricos y mayores a cero

**Reservaciones:**
- Formato de fecha válido (YYYY-MM-DD)
- Fecha de salida posterior a fecha de entrada
- Tarjeta de 16 dígitos numéricos
- Vencimiento en formato MM/AA válido
- CVV de 3 dígitos
- Verificación de ID de habitación existente

## 🖼️ Capturas de Pantalla

### Splash Screen
_Pantalla de bienvenida con logo del hotel_

### Menú Principal
_Interfaz principal con acceso a módulos de Habitaciones y Reservaciones_

### Módulo de Habitaciones
_Formulario de registro de habitaciones con validaciones_

### Módulo de Reservaciones
_Formulario completo de reservas con información de pago_

## 🗄️ Formato de Archivos

### habitaciones.txt
```
ID;Tipo;Descripcion;PrecioSinDesayuno;PrecioConDesayuno
101;Suite;Suite ejecutiva con vista al mar;150.00;180.00
```

### reservaciones.txt
```
ID;NombreCliente;IDHabitacion;FechaEntrada;FechaSalida;IncluyeDesayuno;Tarjeta;Vencimiento;CVV;NumDias;PrecioTotal
1;Juan Pérez;101;2024-03-15;2024-03-18;Sí;1234567890123456;12/25;123;3;540.00
```

## 🤝 Contribuir

Las contribuciones son bienvenidas. Para contribuir:

1. Haz fork del proyecto
2. Crea una rama para tu característica (`git checkout -b feature/NuevaCaracteristica`)
3. Commit tus cambios (`git commit -m 'Añadir nueva característica'`)
4. Push a la rama (`git push origin feature/NuevaCaracteristica`)
5. Abre un Pull Request

## 📝 Mejoras Futuras

- [ ] Implementar base de datos (MySQL/PostgreSQL)
- [ ] Sistema de login y usuarios
- [ ] Reportes en PDF
- [ ] Búsqueda y filtrado de registros
- [ ] Edición y eliminación de registros
- [ ] Dashboard con estadísticas
- [ ] Integración con API de pagos real
- [ ] Sistema de notificaciones
- [ ] Modo oscuro/claro
- [ ] Internacionalización (i18n)

## 👨‍💻 Autor

https://github.com/DiegoResendizM

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## 🙏 Agradecimientos

- Desarrollado como proyecto de práctica de programación orientada a objetos
- Interfaz gráfica diseñada con NetBeans GUI Builder
- Inspirado en sistemas reales de gestión hotelera

---

⭐️ Si este proyecto te fue útil, considera darle una estrella en GitHub
