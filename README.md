TP N°4 Monitoreo

Teoria:

Maven:
Goals: Comandos Para la consola de mvn que realizan distintas acciones.

	$ mvn compile – compila el proyecto y deja el resultado en target/classes

	$ mvn test – compila los test y los ejecuta

	$ mvn package – empaqueta el proyecto y lo dejará en taget/autentiaNegocio-1.0-SNAPSHOT.jar

	$ mvn install – guarda el proyecto en el repositorio

	$ mvn clean – borra el directorio de salida (target)

Scopes: es una seccion dentro de <dependency> en el archivo pom.xml de maven, el cual es usado para indicar de que tipo de libreria se trata esa dependencia.

	compile – es el valor por defecto. Se utiliza en todos los casos (compilar, ejecutar, …).

	provided – también se utiliza en todos los casos, pero se espera que el jar sea suministrado por la JDK o el contenedor. Es decir, no se incluirá al empaquetar el proyecto, ni en el repositorio.

	runtime – no se utiliza para compilar, pero si es necesario para ejecutar.

	test – Sólo se utiliza para compilar o ejecutar los test.

	system – es similar a provided, pero eres tu el que tiene que suministrar el jar. No se incluirá al empaquetar el proyecto, ni en el repositorio.

	import - Este scope solo es admitido en dependencias de tipo POM, en la sección <dependencyManagement>, Indica la dependencia a reemplazar con la lista efectiva de dependencias en la dependencyManagement.

¿Que es un Arquetype?

	Podríamos decir que un “arquetipo” para Maven es una plantilla. Es decir, gracias a un arquetipo Maven es capaz de generar una estructura de directorios y ficheros.

	Es decir que con maven, basta decirle que tipo de proyecto queremos y maven generara automaticamente la estructura base.

Defina la estructura base de un proyecto de maven.
	
	|-- pom.xml  -> Archivo de configuracion de maven, para agregar dependecias, version de programa , etc
	|-- src -> carpeta que contendra nuestro proyecto
	    |-- main
	    |   `-- java
	    |       `-- com
	    |           `-- autentia -> dentro de esta carpeta (que varia su nombre en base al nombre del proyecto) podremos agregar carpetas, para agregar mvc a nuestro proyecto
	    |               `-- demoapp
	    |                   `-- App.java
	    `-- test -> carpeta que contendra los distintos test de nuestra aplicacion.
	        `-- java
	            `-- com
	                `-- autentia
	                    `-- demoapp
	                        `-- AppTest.java
	

¿Cual es la diferencia entre Arquetype y Artefact?

	Artefact es usualmente un archivo Jar, que se implementa en un repositorio de Maven.

	Cada artefacto tiene una ID de grupo (generalmente un nombre de dominio invertido, como com.example.foo), una ID de artefacto (solo un nombre) y una cadena de versión. Los tres juntos identifican de forma única el artefacto.

	Las dependencias de un proyecto se especifican como artefactos.

	La principal diferencia entre arquetype y artefact es que arquetype es una plantilla, genera la estructura de un proyecto maven para poder empezar a trabajar, mientras que artefact se utiliza para agregar librerias externas a nuestro programa, como por ejemplo cuando agregamos spring a nuestro proyecto maven.

Explique los 4 stereotypes basicos y realize un diagrama de cada uno de ellos.

!(https://www.arquitecturajava.com/wp-content/uploads/SpringStereotypes.png)

	@Component: Es el estereotipo general y permite anotar un bean para que Spring lo considere uno de sus objetos.

	@Repository: Es el estereotipo que se encarga de dar de alta un bean para que implemente el patrón repositorio que es el encargado de almacenar datos en una base de datos o repositorio de información que se necesite. Al marcar el bean con esta anotación Spring aporta servicios transversales como conversión de tipos de excepciones.

!(https://www.arquitecturajava.com/wp-content/uploads/SpringStereotypesRepository.png)

	@Service : Este estereotipo se encarga de gestionar las operaciones de negocio más importantes a nivel de la aplicación y aglutina llamadas a varios repositorios de forma simultánea. Su tarea fundamental es la de agregador.

!(https://www.arquitecturajava.com/wp-content/uploads/SpringStereotypesService.png)

	@Controller : El último de los estereotipos que es el que realiza las tareas de controlador y gestión de la comunicación entre el usuario y el aplicativo. Para ello se apoya habitualmente en algún motor de plantillas o librería de etiquetas que facilitan la creación de páginas.

!(https://www.arquitecturajava.com/wp-content/uploads/SpringStereotypesController.png)

REST
	Explique cada uno de los verbos.

		GET
			GET es el tipo más simple de método de solicitud HTTP; La que usan los navegadores cada vez que hace clic en un enlace o escribe una URL en la barra de direcciones. Indica al servidor que transmita los datos identificados por la URL al cliente. Los datos nunca deben ser modificados en el lado del servidor como resultado de una solicitud GET. En este sentido, una petición GET es de sólo lectura, pero por supuesto, una vez que el cliente recibe los datos, es libre de hacer cualquier operación con ella por su cuenta, por ejemplo, formatearla para su visualización.

		PUT
			Una petición PUT se utiliza cuando se desea crear o actualizar el recurso identificado por la URL. Por ejemplo,

			PUT /clients/robin

		 	Podría crear un cliente, llamado Robin en el servidor.

		DELETE

			DELETE debe realizar lo contrario de PUT; Debe utilizarse cuando desee eliminar el recurso identificado por la URL de la solicitud.

		POST

			POST se utiliza cuando el procesamiento que desea que suceda en el servidor debe repetirse, si la solicitud POST se repite (es decir, no son idempotent, más de esto a continuación). Además, las solicitudes POST deben causar el procesamiento del cuerpo de la solicitud como un subordinado de la URL que está publicando.

			En palabras claras:

			POST /clients/

			No debe causar que el recurso en /clients/, se modifique, sino un recurso cuya URL comience con /clients/. Por ejemplo, podría agregar un nuevo cliente a la lista, con un ID generado por el servidor.

		HEAD

			El método HEAD es idéntico a GET, excepto que el servidor NO DEBE devolver un cuerpo del mensaje en la respuesta. La metainformación contenida en los encabezados HTTP en respuesta a una solicitud HEAD DEBERÍA ser idéntica a la información enviada en respuesta a una solicitud GET. Este método se puede usar para obtener metainformación sobre la entidad implicada por la solicitud sin transferir el cuerpo de la entidad en sí. Este método se usa a menudo para probar enlaces de hipertexto para determinar su validez, accesibilidad y modificaciones recientes.

		OPTIONS

			El método OPTIONS representa una solicitud de información sobre las opciones de comunicación disponibles en la cadena de solicitud / respuesta identificadas por el URI de solicitud. Este método permite al cliente determinar las opciones y / o requisitos asociados con un recurso, o las capacidades de un servidor, sin implicar una acción de recurso o iniciar una recuperación de recursos.




