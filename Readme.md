Preparacion de entorno:

Correr un contenedor de docker en local :
From Oficial https://hub.docker.com/_/mongo/

Bajar la imagen oficial
>docker pull mongo

Arrancar un contendor con el puerto expuesto 
>docker run -d -p 27017:27017 --name mongoVulgus mongo

Construir el proyecto, en la raiz del proyecto
>./gradlew build

Si todo va bien Success, si no, pues dara error de TimeOut con conection mongo DB , para ver trazas del error
>workspace/vulgus () $ ./gradlew --stacktrace --debug build  

Arrancar la aplicacion
>./gradlew bootRun

Acceder a http://localhost:8080


**********************
** OTROS COMANDOS
**********************
Entrar en el contenedor con la shell de mongo:
>docker exec -t -i mongoVulgus /bin/bash

Si se necesita crear el schema, entrar en el contenedor y ejectuar
root@1dd4ffd2c349:/# use vulgus (esto retorna la bbdd o la crea si no existe)

dentro de la shell ejecutar (y estaremos dentro del schema)
root@1dd4ffd2c349:/# mongo vulgus

listar las bbdd
>show dbs
Para ver las entidades/collecciones
>show collections