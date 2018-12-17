# PackLink Test

1) La prueba que hay que ejecturar es TestSuite, dentro de esa estan determinados los test a correr.
2) Para que el driver se ejecute exitosamente hay que modificar la url a donde se tenga guardado el webdriver en la maquina donde se corran las pruebas. La URL se encuentra dentro de Test.Base
3) Si al ejecutar lanza "No runnable methods" puede ser porque Jupiter (jUnit 5) no este reconociendo los tags @test en las clases de prueba, validar que este no sea el caso, tienen que estar marcadas en amarillo.

Mejoras al codigo
A continuacion dejo anotado las mejoras que me gustaria haberle hecho al codigo con mas tiempo:
1) Extraer la configuracion del WebDriver a un archivo de configuracion
2) Extraer los datos de usuario a un archivo de datos
3) Crear las respectivas clases para leer los archivos mencionados y utilizar la informacion en las pruebas
4) Al tener los datos en archivos de configuracion, agregar la funcion de correr las pruebas con distintos webDrivers, de esta manera seria facil correrlas en distintos navegadores

