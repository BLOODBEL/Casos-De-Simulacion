Guía de instalación y configuración del jdk, intellij, MAVEN y Junit para Windows.
Pasos.
1	Descarga e instalación del jdk.

1.1	Ingresar a Oracle para la descarga del jdk.
Enlace de descarga: https://www.oracle.com/java/technologies/downloads/#jdk18-windows

1.1.1	Antes de empezar la descarga, la página de Oracle te pedirá que inicies sección, si no posees una cuenta tendrás que crear una, si ya posees una nada más tendrás que iniciar sección. 
![image](https://user-images.githubusercontent.com/79162870/180918179-dee1c67a-3075-4449-81ce-20789da9f62b.png)
 
1.1.2	Después de ingresar a la página, descargar el archivo con el nombre 
x64 Installer y descargar la última versión del archivo. 

1.2	Instalación jdk.
Después de que finalice la descarga abra el archivo para su instalación, tendrás que darle next hasta que aparezca la palabra close, darle click a close y con eso finalizará la instalación. 

![image](https://user-images.githubusercontent.com/79162870/180918585-401d4354-d30e-4429-8298-aae67cc519f9.png)
     

1.3	Configuracion de variables de ambiente para el jdk.

1.3.1	Buscar la configuracion de editar las variables de entorno del sistema en la barra de búsqueda de la computadora y cuando la hayas encontrado le debes dar click.
 ![image](https://user-images.githubusercontent.com/79162870/180918649-959b6f28-decc-4872-b2a0-d9331f878237.png)

1.3.2	Cuando hayas abierto las variables de entorno, hay que darle click a la opcion de “Environment Variables”
 ![image](https://user-images.githubusercontent.com/79162870/180918795-c3d46ba4-fac8-4dc6-a435-4ede13f05835.png)

1.3.3	Cuando hayas abierto Environment Variables, deberás darle click a la opción denominada “new” de las variables de usuario. 
![image](https://user-images.githubusercontent.com/79162870/180918921-0c647257-2ce9-40f7-9924-2782a2d49dc8.png)
 
![image](https://user-images.githubusercontent.com/79162870/180919059-c5ff914d-33b7-478b-bfca-556360d5f2c6.png)


1.3.5	Configurar variable de sistema.
 ![image](https://user-images.githubusercontent.com/79162870/180919104-0c09fd57-0b95-4be8-a57f-b23adb32f9f0.png)

![image](https://user-images.githubusercontent.com/79162870/180919177-47eaf7a0-67db-4bbe-bb85-ec2cbf597b84.png)


1.3.7	Configuracion del path, solo deberás de darle click al path de variables del sistema.
![image](https://user-images.githubusercontent.com/79162870/180919312-6ebdfbc1-8921-43de-8593-6441ed62734b.png)

 
Una vez que abra deberás darle new y colocar la misma locación del jdk que previamente en ” Variable value” y darle ok. 
![image](https://user-images.githubusercontent.com/79162870/180919353-eb024353-3167-48a2-ac08-747dd7d7bfc7.png)

1.3.8	Para confirmar que se instalo correctamente puede ir a simbolos del sistema y colocar  
“java -version” y si te sale esto, es que la informacion del java se instalo correcta mente.
 ![image](https://user-images.githubusercontent.com/79162870/180919449-49713dcb-3dd8-4f9b-87f5-198c1199d55d.png)


2	Descargar y configuracion del MAVEN.
2.1  Ingresa a APACHE MAVEN PROJECT  y descarga MAVEN.
Enlace de descarga: https://maven.apache.org/download.cgi
2.1.1 Decarga el archivo que tiene como nombre, Binary zip archive, pero el que esta en la parte de link.
 ![image](https://user-images.githubusercontent.com/79162870/180919676-d12b53f7-c862-4b7b-a3f6-6284eaf49538.png)

2.1.2 Despues que finalize la descarga tendra que dirijirte a la opcion de descarga de tu computador y prosedera a descomprimir el archivo, por que este esta en formato zip. 
2.1.3 Despues de que lo descomprimas, es recomendable que lo guardes en un lugar donde no se valla a tocar mucho, como ejemplo en el disco local de la computadora y hay que crearas una nueva carpeta llamada Maven y hay guardaras lo que descomprimiste.

2.2  Despues de terminar lo anterior, volveremos a configurar unas variables de entorno como hisimos con el jdk.
2.2.1 Cuando hallas abierto Environment Variables volveremos a darle click  a la opcion de “new” de las variables de sistema. 
 ![image](https://user-images.githubusercontent.com/79162870/180919743-a4cf3a81-c1f6-41b6-8d5e-36c71e80488d.png)

![image](https://user-images.githubusercontent.com/79162870/180919801-a6c5d1cc-0d54-4641-8d98-038b3d41299a.png)

2.3	Configuracion del path para el MAVEN, solo deberas de darle click al path de variables del sistema.
 ![image](https://user-images.githubusercontent.com/79162870/180919866-c3de4a15-9512-45cb-9b17-e446f9cd4459.png)

En este path se agregara lo siguiente: %MAVEN_HOME%\bin
 ![image](https://user-images.githubusercontent.com/79162870/180919916-d843849c-2452-47e2-bc63-d5e33fc7798b.png)


2.3.1	Para confirmar que se instalo correctamente puedes ir a simbolos del sistema y colocar  
“mvn -v” y si te sale esto, es que la informacion del MAVEN se instalo correcta mente.
  ![image](https://user-images.githubusercontent.com/79162870/180919964-ad6a2996-6936-471c-b92e-13138b39c3da.png)


3	Descarga y configuracion de intellij.
3.1 Ingresar a Intellij IDEA para la descarga del intellij
Enlace de descarga:https://www.jetbrains.com/es-es/idea/download/#section=windows
3.1.1 Solo deberas darle descargar a la version gratis del IDEA y empesara la descarga.
 ![image](https://user-images.githubusercontent.com/79162870/180920038-763f441f-f6ff-4151-a9a2-a4c01895cb07.png)

3.2 Una vez descargado nada mas deberas abrirlo y darle next a las 2 primera pantallas, en la tercera pantalla deberas darle en la opcion de 64-bit o 32-bit dependiendo tu computadora y le daras next, en la cuarta pantalla deberas darle install y en la ultima pantalla deberas darle finish para finalizar la instalacion.
![image](https://user-images.githubusercontent.com/79162870/180920089-fb60ca2a-5eea-4478-80df-16e00c1500df.png)


3.3	Despues de la instalacion, se debe configurar intellij, para empesar en la primera pantalla debes darle check y continuar, en la segunda pantalla debes darle  a Send Anonymous Statistics, en las pantallas suientes tu desides como quieres que se vea la interfas y en la ultima nada mas tendras que darle que instale los plugins que binen por defecto y con eso la configracion del intellij a terminado.  
![image](https://user-images.githubusercontent.com/79162870/180920145-c6ba14cf-267b-4c48-966c-aea909294f64.png)

