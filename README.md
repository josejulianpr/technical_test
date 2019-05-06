# technical_test
Prueba Técnica

# Solución

La solución al problema hace uso de **maven** para resolver el problema de las dependencias y facilitar la replica del ambiente.


## Archivos

 - **MessageQueue.java :** Contiene la firma de los métodos que hay que implementar  cuando se escoja el manejador de cola de mensajes (Esto si se decide usar librerías nativas de la cola).
 - **MessageQueueImpl.java :** Contiene una implementación genérica de los métodos los métodos para gestionar los mensajes en la cola, se uso **JMS**, debido a que esta **API** permite hacer transparente el **MQ** que se use.
 - **RentalDao.java :** **DAO** de los datos, para hacer transparente el motor de base de datos empleado.
 - **FamilyRental.java :** Clase Java para el modelo de negocios de las promociones.
 - **Rental.java :** Clase Java para el modelo de negocios de los alquileres.
 - **RentalType.java :** Enumeración de los tipos de alquileres.
 - **Constant.java : ** Archivos de constante.

## Correr Test

Para ejecutar los test se emplea el siguiente comando, estando situado en el mismo directorio de la solución:

**mvn clean package**



