# technical_test
Prueba Técnica

# Solución

La solución hace uso de:

- **Maven :** Para gestionar las dependencias, facilitar la construcción del proyecto, facilitar reproducir el ambiente en cualquier equipo de forma rápida.
- **JMS :** Para poder realizar una implementación del manejo de la cola de mensajes, para hacer transparente el motor de **MQ** que se escoja.
- **Java Persistence API :** Para poder realizar una implementación del manejo de la base de datos, para hacer transparente el motor de **Base de Datos** que se escoja, luego se puede combinar con un **ORM** como **Hibernate** para gestionar la conexión con la **BD**.

## Archivos

- **MessageQueue.java :** Contiene la firma de los métodos que hay que implementar cuando se escoja el motor de cola de mensajes (Esto si se decide usar librería nativa de la cola).
- **MessageQueueImpl.java :** Contiene una implementación genérica de los métodos los métodos para gestionar los mensajes en la cola, se uso **JMS**, debido a que esta **API** permite hacer transparente el **MQ** que se use.
- **RentalDao.java :** **DAO** de los datos, para hacer transparente el motor de base de datos empleado.
- **FamilyRental.java :** Clase Java para el modelo de negocios de las promociones.
- **Rental.java :** Clase Java para el modelo de negocios de los alquileres.
- **RentalType.java :** Enumeración de los tipos de alquileres.
- **Constant.java :** Archivos de constante.

## Correr Test

Para ejecutar los test se emplea el siguiente comando, estando situado en el mismo directorio de la solución:

**mvn clean package**
