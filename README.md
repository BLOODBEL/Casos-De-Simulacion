# Casos-De-Simulacion
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
     

1.3	Configuracion de variables de ambiente para el jdk.

1.3.1	Buscar la configuracion de editar las variables de entorno del sistema en la barra de búsqueda de la computadora y cuando la hayas encontrado le debes dar click.
 

1.3.2	Cuando hayas abierto las variables de entorno, hay que darle click a la opcion de “Environment Variables”
 

1.3.3	Cuando hayas abierto Environment Variables, deberás darle click a la opción denominada “new” de las variables de usuario. 
 
1.3.4	Cuando le hayas dado a la opción denominada new, se desplegará una pantalla donde deberás llenar para la configuracion, Variable name=JAVA_HOME y en Variable value=en esta parte tendrás que ir a donde tengas instalado el jdk y proceder a copiar la locacion de jdk ”path”
Y deberás pegarlo en variable value y darle ok.
 
 






1.3.5	Configurar variable de sistema.
 
1.3.6	Cuando le hayas dado a la opción de new, se desplegará una pantalla donde deberás llenar para la configuracion, Variable name=JAVA_HOME y en Variable value=en esta parte tendrás que ir a donde tengas instalado el jdk y  proceder a copiar la locación de jdk ”path”
Y deberás pegarlo en variable value y darle ok.
 
 








1.3.7	Configuracion del path, solo deberás de darle click al path de variables del sistema.
 
Una vez que abra deberás darle new y colocar la misma locación del jdk que previamente en ” Variable value” y darle ok. 

1.3.8	Para confirmar que se instalo correctamente puede ir a simbolos del sistema y colocar  
“java -version” y si te sale esto, es que la informacion del java se instalo correcta mente.
 

2	Descargar y configuracion del MAVEN.
2.1  Ingresa a APACHE MAVEN PROJECT  y descarga MAVEN.
Enlace de descarga: https://maven.apache.org/download.cgi
2.1.1 Decarga el archivo que tiene como nombre, Binary zip archive, pero el que esta en la parte de link.
 
2.1.2 Despues que finalize la descarga tendra que dirijirte a la opcion de descarga de tu computador y prosedera a descomprimir el archivo, por que este esta en formato zip. 
2.1.3 Despues de que lo descomprimas, es recomendable que lo guardes en un lugar donde no se valla a tocar mucho, como ejemplo en el disco local de la computadora y hay que crearas una nueva carpeta llamada Maven y hay guardaras lo que descomprimiste.

2.2  Despues de terminar lo anterior, volveremos a configurar unas variables de entorno como hisimos con el jdk.
2.2.1 Cuando hallas abierto Environment Variables volveremos a darle click  a la opcion de “new” de las variables de sistema. 
 
2.2.2	Cuando le hallas dado a la opcion de new, se desplegara una pantalla donde deberas llenar para la configuracion, Variable name=MAVEN_HOME y en Variable value=en esta parte tendras que ir a donde guardaste el MAVEN y debes copiar la locacion del MAVEN ”path”
Y deberas pegarlo en variable value y darle ok.
 
 



2.3	Configuracion del path para el MAVEN, solo deberas de darle click al path de variables del sistema.
 
En este path se agregara lo siguiente: %MAVEN_HOME%\bin
 

2.3.1	Para confirmar que se instalo correctamente puedes ir a simbolos del sistema y colocar  
“mvn -v” y si te sale esto, es que la informacion del MAVEN se instalo correcta mente.
  

3	Descarga y configuracion de intellij.
3.1 Ingresar a Intellij IDEA para la descarga del intellij
Enlace de descarga:https://www.jetbrains.com/es-es/idea/download/#section=windows
3.1.1 Solo deberas darle descargar a la version gratis del IDEA y empesara la descarga.
 
3.2 Una vez descargado nada mas deberas abrirlo y darle next a las 2 primera pantallas, en la tercera pantalla deberas darle en la opcion de 64-bit o 32-bit dependiendo tu computadora y le daras next, en la cuarta pantalla deberas darle install y en la ultima pantalla deberas darle finish para finalizar la instalacion.
1 2  3   4 


3.3	Despues de la instalacion, se debe configurar intellij, para empesar en la primera pantalla debes darle check y continuar, en la segunda pantalla debes darle  a Send Anonymous Statistics, en las pantallas suientes tu desides como quieres que se vea la interfas y en la ultima nada mas tendras que darle que instale los plugins que binen por defecto y con eso la configracion del intellij a terminado.  
1  2 
