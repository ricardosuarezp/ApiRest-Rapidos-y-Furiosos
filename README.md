# Rápidos y Furiosos - API REST

API REST para sistema de alquiler de vehículos desarrollada con Spring Boot.

## Descripción

Aplicación backend que gestiona el alquiler de vehículos, incluyendo administración de clientes, vehículos, servicios, empleados y catálogos auxiliares (distritos, marcas, colores, tipos de documento, etc.).

## Stack Tecnológico

| Tecnología | Versión |
|------------|---------|
| Java | 25 |
| Spring Boot | 4.1.1 |
| Spring Data JPA | - |
| Spring Web MVC | - |
| MySQL | 8.x |
| Lombok | - |
| SpringDoc OpenAPI | 3.1.1 |
| Maven | 3.x |

## Estructura del Proyecto

```
src/main/java/pe/com/rapidosyfuriosos/
├── RapidosyFuriososApplication.java    # Clase principal
├── entity/                              # Entidades JPA (11)
├── repository/                          # Repositorios Spring Data JPA
├── service/                             # Interfaces de servicio
│   └── impl/                            # Implementaciones de servicio
└── restcontroller/                      # Controladores REST (10)
```

## Entidades

| Entidad | Tabla | Descripción |
|---------|-------|-------------|
| ClienteEntity | cliente | Clientes del sistema |
| VehiculoEntity | vehiculo | Vehículos disponibles |
| ServicioEntity | servicio | Servicios de alquiler |
| EmpleadoEntity | empleado | Empleados de la empresa |
| DistritoEntity | distrito | Distritos/Ubicaciones |
| MarcaEntity | marca | Marcas de vehículos |
| ColorEntity | color | Colores de vehículos |
| SexoEntity | sexo | Catálogo de sexo |
| TipoDocumentoEntity | tipodocumento | Tipos de documento |
| EstadoCivilEntity | estcivil | Estados civiles |
| RolEntity | rol | Roles de usuario |

## Requisitos Previos

- **JDK 25** o superior
- **Maven 3.x**
- **MySQL 8.x** con base de datos `bdrapidosyfuriosos20262` creada

## Configuración

Editar `src/main/resources/application.properties`:

```properties
spring.application.name=RapidosyFuriosos
server.port=8089
server.servlet.context-path=/rapidosyfuriosos
spring.datasource.url=jdbc:mysql://localhost:3306/bdrapidosyfuriosos20262
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

## Instalación y Ejecución

### 1. Clonar el repositorio

```bash
git clone <url-del-repositorio>
cd RapidosyFuriosos
```

### 2. Compilar el proyecto

```bash
./mvnw clean install
```

### 3. Ejecutar la aplicación

```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en: `http://localhost:8089/rapidosyfuriosos`

## API Endpoints

Base URL: `http://localhost:8089/rapidosyfuriosos/api`

### Clientes

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/cliente` | Listar todos los clientes |
| GET | `/cliente/custom` | Listar clientes (consulta personalizada) |
| GET | `/cliente/{id}` | Obtener cliente por ID |
| POST | `/cliente` | Crear nuevo cliente |
| PUT | `/cliente/{id}` | Actualizar cliente |
| DELETE | `/cliente/{id}` | Eliminar cliente |
| PATCH | `/cliente/{id}` | Habilitar/deshabilitar cliente |

### Vehículos

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/vehiculo` | Listar todos los vehículos |
| GET | `/vehiculo/{id}` | Obtener vehículo por ID |
| POST | `/vehiculo` | Crear nuevo vehículo |
| PUT | `/vehiculo/{id}` | Actualizar vehículo |
| DELETE | `/vehiculo/{id}` | Eliminar vehículo |
| PATCH | `/vehiculo/{id}` | Habilitar/deshabilitar vehículo |

### Servicios

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/servicio` | Listar todos los servicios |
| GET | `/servicio/{id}` | Obtener servicio por ID |
| POST | `/servicio` | Crear nuevo servicio |
| PUT | `/servicio/{id}` | Actualizar servicio |
| DELETE | `/servicio/{id}` | Eliminar servicio |
| PATCH | `/servicio/{id}` | Habilitar/deshabilitar servicio |

### Empleados

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/empleado` | Listar todos los empleados |
| GET | `/empleado/{id}` | Obtener empleado por ID |
| POST | `/empleado` | Crear nuevo empleado |
| PUT | `/empleado/{id}` | Actualizar empleado |
| DELETE | `/empleado/{id}` | Eliminar empleado |
| PATCH | `/empleado/{id}` | Habilitar/deshabilitar empleado |

### Catálogos

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/distrito` | Listar distritos |
| GET | `/marca` | Listar marcas |
| GET | `/color` | Listar colores |
| GET | `/sexo` | Listar sexos |
| GET | `/tipodocumento` | Listar tipos de documento |
| GET | `/estadocivil` | Listar estados civiles |
| GET | `/rol` | Listar roles |

## Documentación Swagger

La documentación interactiva de la API está disponible en:

- **Swagger UI:** `http://localhost:8089/rapidosyfuriosos/swagger-ui.html`
- **OpenAPI JSON:** `http://localhost:8089/rapidosyfuriosos/v3/api-docs`

## Ejemplo de Uso

### Crear un cliente

```bash
curl -X POST http://localhost:8089/rapidosyfuriosos/api/cliente \
  -H "Content-Type: application/json" \
  -d '{
    "nombre": "Juan",
    "apellidopaterno": "Pérez",
    "apellidomaterno": "García",
    "numerodocumento": "12345678",
    "fechanacimiento": "1990-01-15",
    "nacionalidad": "Peruana",
    "direccion": "Av. Principal 123",
    "telefono": "01-1234567",
    "celular": "987654321",
    "correo": "juan.perez@email.com",
    "estado": true,
    "distrito": {"codigo": 1},
    "sexo": {"codigo": 1},
    "tipodocumento": {"codigo": 1}
  }'
```

### Listar todos los clientes

```bash
curl http://localhost:8089/rapidosyfuriosos/api/cliente
```

## Licencia

Proyecto educativo - Ciclo 6, Desarrollo de Soluciones Cloud Básico
