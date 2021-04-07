# Torneo de Frescas

## ¿Qué es Maven?
**Apache Maven** es una herramienta de administración y comprensión de proyectos
de software. Basada en el concepto de un *Modelo Objeto de Proyecto* 
(Project Object Model o POM), Maven puede administrar la compilación, reporte y
documentación de un proyecto desde una pieza central de información.

## POM ¿Qué significa? ¿Para qué nos sirve?
El Modelo Objeto de Proyecto o **POM**, es el conjunto información que Maven 
necesita para trabajar con un proyecto. Se guarda en un archivo llamado
"project.xml" y esta ubicado en el directorio raíz de cada proyecto.

## Diferencia entre Archetype y Artifact
**Archetype** o Arquetipo, es un conjunto de herramientas para crear plantillas de
proyectos de Maven. Un arquetipo se define como *un patron o modelo original del
cual todas las cosas del mismo tipo se crean*. Los arquetipos ayudan a los autores
a crear plantillas de proyectos de Maven para sus usuarios, y le proveen a esos
usuarios medios para generar versiones parametrizadas de esas plantillas.

Sin embargo, un **Artifact** o Artefacto, es algo que es producido o utilizado 
por un proyecto.
Algunos ejemplos de artefactos producidos por Maven para un proyecto son: JARs, 
distribuciones binarias o de codigo fuente, WARs. Cada artefacto es identificado
por un id de grupo, un id de artefacto, una versión, una extensión y un 
clasificador (La extension y el clasificador pueden ser nombrados por un tipo)

## Goals de Maven
El objetivo primario de Maven es permitirle al desarrollador comprender el estado
completo de un esfuerzo de desarrollo en el menor tiempo posible. Para cumplir
este objetivo, Maven se enfoca en distintas areas:
* **Facilitar el proceso de compilación.**  
  Si bien usar Maven no elimina por completo la necesidad de saber acerca de
  mecanismos internos, Maven proteje a los desarrolladores de muchos detalles.
* **Proveer un sistema de compilación uniforme.**  
  Maven compila un proyecto utilizando su Modelo Objeto de Proyecto (POM) y un
  conjunto de *plugins* (Extensiones). Todos los proyectos de Maven tienen esta
  misma estructura, por lo que basta con comprender como funciona uno de ellos
  para poder trabajar con facilidad con cualquier otro.
* **Proveer información del proyecto de calidad.**  
  Maven provee información útil que es en parte tomada desde el POM y desde la
  fuente del proyecto.
* **Promover mejores prácticas de desarrollo.**  
  Maven apunta a reunir principios actuales para un desarrollo con buenas
  practicas y facilita el guiar un proyecto en esa dirección.


## Comamnds
* **Compile**  
  Compila el codigo fuente del proyecto.
* **Clean**  
  Limpia artifacts creados por compilaciones previas.
* **Package**  
  Toma el codigo compilado y lo empaqueta en su formato distribuible, como por 
  ejemplo JAR.
* **Install**
  Es un proceso realizado por Maven donde se descargan y compilan todas
  las dependencias que un proyecto necesita en un directorio llamado `.m2` en el
  directorio de usuario. Es necesario que las dependencias existan en este
  *repositorio local*, para que luego puedan ser utilizadas en el proceso de
  compilación.  
  Este proceso también se puede realizar manualmente utilizando el comando
  `mvn install`.

## Scopes
El **Scope** de dependencia es usado para limitar la transitividad de la misma y
para determinar cuándo una dependencia se incluye en un classpath.

Existen 6 Scopes:

* **Compile**  
  Es el scope por defecto, que se utiliza si no se especifica otro. Las dependencias
  compiladas están disponibles en todas las classpath de un proyecto. Y de ahí en 
  más, esas dependencias son propagadas a los objetos dependientes.
* **Provided**  
  Es como `compile`, pero indica que se espera que el JDK o un contenedor provea la
  dependencia en tiempo de ejecución. Una dependencia con este scope es añadida al
  classpath usado para compilación y test, pero no al classpath de tiempo de
  ejecución. No es transitivo.
* **Runtime**  
  Este scope indica que una dependencia no es requerida para compilación, pero sí 
  para ejecución. Maven incluye una dependencia con este scope en los classpath de
  tiempo de ejecucion y de test, pero no en el de compilación.
* **Test**  
  Este scope indica que la dependencia no es requerida para uso normal de la
  aplicación, y solo esta disponible para las fases de compilación de test y
  ejecución. Este scope no es transitivo.
* **System**
  Este scope es similar al de `provided`, con la diferencia de que se debe proveer
  el JAR que lo contiene explícitamente. El artifact siempre esta disponible y no
  se busca en el repositorio.
* **Import**  
  Este scope solo es soportado en una dependencia de tipo `pom` en la seccion de
  `<dependencyManagement>`. Indica que la dependencia será reemplazada con la
  efectiva lista de dependencias en la sección `<dependencyManagement>` especificada
  del POM.
  
