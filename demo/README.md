# AdoptArte - Sistema de Adopción de Mascotas

Sistema web para la gestión de adopción de mascotas desarrollado con Spring Boot.

## Características

- **Gestión de Mascotas**: Catálogo de mascotas disponibles para adopción
- **Sistema de Usuarios**: Diferentes roles (Administrador, Veterinario, Voluntario, Adoptante, Afiliado)
- **Formularios de Adopción**: Proceso de solicitud de adopción
- **Gestión de Eventos**: Organización de eventos relacionados con mascotas
- **Sistema de Autenticación**: Login y gestión de sesiones

## Tecnologías Utilizadas

- **Backend**: Spring Boot 3.5.5
- **Base de Datos**: MySQL 8.0
- **ORM**: JPA/Hibernate
- **Frontend**: Thymeleaf + Bootstrap 5
- **Java**: 17

## Requisitos Previos

- Java 17 o superior
- Maven 3.6+
- MySQL 8.0
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## Configuración del Proyecto

### 1. Clonar el repositorio
```bash
git clone <url-del-repositorio>
cd demo
```

### 2. Configurar la base de datos

1. Crear una base de datos MySQL llamada `adoptarte`
2. Configurar las credenciales en `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/adoptarte
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```

### 3. Ejecutar el proyecto

```bash
# Compilar el proyecto
mvn clean compile

# Ejecutar la aplicación
mvn spring-boot:run
```

La aplicación estará disponible en: `http://localhost:8080`

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/proyectojpa/demo/
│   │       ├── controller/          # Controladores REST
│   │       ├── models/              # Entidades JPA
│   │       ├── repository/          # Repositorios de datos
│   │       └── CruzOzzyApplication.java
│   └── resources/
│       ├── static/                  # Archivos estáticos (CSS, JS, imágenes)
│       ├── templates/               # Plantillas Thymeleaf
│       ├── application.properties   # Configuración
│       └── data.sql                 # Datos iniciales
```

## Funcionalidades Principales

### Páginas Disponibles

- **Inicio** (`/`): Página principal con carrusel de mascotas y testimonios
- **Adopción** (`/adopcion`): Catálogo de mascotas con filtros y búsqueda
- **Eventos** (`/eventos`): Lista de eventos relacionados con mascotas
- **Refugio** (`/refugio`): Información sobre el refugio
- **Donaciones** (`/donaciones`): Información sobre donaciones
- **Contacto** (`/contacto`): Información de contacto
- **Login** (`/login`): Sistema de autenticación

### Roles de Usuario

1. **Administrador** (ID: 1): Acceso completo al sistema
2. **Veterinario** (ID: 2): Gestión médica de mascotas
3. **Voluntario** (ID: 3): Apoyo en actividades del refugio
4. **Adoptante** (ID: 4): Puede solicitar adopciones
5. **Afiliado** (ID: 5): Colaboradores externos

### Usuarios de Prueba

- **Admin**: admin@adoptarte.com / admin123
- **Usuario**: juan@email.com / password123

## Base de Datos

El proyecto incluye un script `data.sql` que inicializa la base de datos con:

- Especies de mascotas (Perro, Gato, Conejo, Hamster)
- Tamaños de mascotas (Pequeño, Mediano, Grande)
- Estados de mascotas (Disponible, En proceso, Adoptado, En tratamiento)
- Perfiles de usuario
- Usuarios de ejemplo
- Mascotas de ejemplo
- Eventos de ejemplo

## Desarrollo

### Agregar nuevas funcionalidades

1. **Nueva Entidad**: Crear en `models/` con anotaciones JPA
2. **Repositorio**: Crear en `repository/` extendiendo `JpaRepository`
3. **Controlador**: Crear en `controller/` con anotaciones Spring MVC
4. **Vista**: Crear en `templates/` usando Thymeleaf

### Ejemplo de nueva entidad:

```java
@Entity
@Table(name = "nueva_tabla")
public class NuevaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre")
    private String nombre;
    
    // getters y setters
}
```

## Contribución

1. Fork el proyecto
2. Crear una rama para tu feature (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Crear un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## Contacto

Para preguntas o sugerencias, contactar a: [tu-email@ejemplo.com]

---

**Nota**: Este proyecto fue migrado desde CodeIgniter 4 (PHP) a Spring Boot (Java) manteniendo la funcionalidad original y mejorando la arquitectura.
