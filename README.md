# Automatización de Pruebas

Proyecto desarrollado para el examen de la asignatura Automatización de Pruebas.

El objetivo es implementar un flujo de automatización utilizando Java, Maven, JUnit, Git y GitHub Actions, incorporando pruebas unitarias, de integración, de aceptación y pipelines automatizados.

## Tecnologías utilizadas

- Java 17
- Maven
- JUnit 5
- Selenium
- Git
- GitHub
- GitHub Actions

## Estrategia de pruebas

El proyecto utiliza distintos niveles de prueba para validar el funcionamiento del sistema.

### Prueba unitaria

Se valida de forma independiente la regla de despacho.

Una compra igual o superior a $50.000 obtiene despacho gratis, mientras que una compra inferior debe pagar el despacho.

### Prueba de integración

Se valida la interacción entre las clases `CompraService` y `Despacho`.

`CompraService` calcula el monto total de una compra y utiliza la lógica de `Despacho` para determinar si corresponde despacho gratis o pagado.

### Prueba de aceptación

Se valida un escenario completo de compra.

Una compra total de $60.000 debe finalizar correctamente con despacho gratis.

Esta prueba también es utilizada como punto de control antes del proceso de despliegue.

## Ejecución de las pruebas

Para ejecutar todas las pruebas del proyecto:

```bash
mvn clean test
```

Para ejecutar solamente la prueba de aceptación:

```bash
mvn -Dtest=CompraAcceptanceTest test
```

## Integración Continua

El proyecto incluye un pipeline de Integración Continua mediante GitHub Actions.

El archivo utilizado es:

```text
.github/workflows/ci.yml
```

Este pipeline realiza las siguientes etapas:

1. Compilación del proyecto.
2. Ejecución de pruebas automatizadas.

El pipeline se ejecuta automáticamente cuando se envían cambios al repositorio, permitiendo detectar errores antes de continuar con nuevas modificaciones.

## Deployment Pipeline

También se implementó un Deployment Pipeline mediante GitHub Actions.

El archivo utilizado es:

```text
.github/workflows/deployment.yml
```

Este pipeline contempla las siguientes etapas:

1. Build del proyecto.
2. Ejecución de la prueba de aceptación.
3. Despliegue de la versión Green.
4. Validación de Green.
5. Activación de Green si la validación es correcta.
6. Rollback a Blue en caso de detectar un fallo.

## Estrategia Blue-Green

Para el proceso de despliegue se utilizó una estrategia Blue-Green.

- `Blue` representa la versión estable del sistema.
- `Green` representa la nueva versión que será validada.
- Si Green supera correctamente las validaciones, queda como versión activa.
- Si durante la validación se detecta un problema, Green no se activa y se mantiene Blue mediante rollback.

Para este proyecto, el ambiente Green fue representado dentro del pipeline de GitHub Actions con el objetivo de demostrar el flujo de despliegue, validación y recuperación.

## Flujo de ramas

Se utilizó un flujo de trabajo basado en GitFlow.

Las ramas utilizadas fueron:

- `main`: mantiene la versión estable del proyecto.
- `develop`: permite integrar los cambios antes de incorporarlos a la rama principal.
- `feature/pruebas`: utilizada para desarrollar y probar las nuevas funcionalidades y pruebas automatizadas.

## Evidencias realizadas

Durante el desarrollo del proyecto se comprobó:

- Configuración del entorno con Java, Git y Maven.
- Creación y estructura del proyecto Maven.
- Configuración de dependencias mediante `pom.xml`.
- Ejecución de pruebas unitarias.
- Ejecución de pruebas de integración.
- Ejecución de una prueba de aceptación.
- Configuración y ejecución del pipeline de Integración Continua.
- Configuración del Deployment Pipeline.
- Despliegue y activación de Green.
- Simulación de fallo.
- Ejecución de rollback a Blue.

## Repositorio

El proyecto se encuentra versionado en GitHub junto con sus archivos de configuración, pruebas automatizadas y pipelines.