# Practica5 ~ Desarrollo de API REST con Spring Boot

[![](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/BlancadePedro/Practica5)

# Objetivos de la práctica

Reutilizando la practica de html o css, se va a conectar el formulario correspondiente al registro de la aplicación con un endpoint implementado con Spring Boot.

# Desarrollo de la práctica

Un usuario ingresará por pantalla sus datos personales para el registro de la aplicación. Una vez se hayan validado, se mostarrán por pantalla en la misma página web. Si se ha equivocado en algún campo podrá modificarlo en el campo y volver a dar a enviar para su actualización. Finalmente podrá regresar a la página principal para su navegación por la web.

# Especificaciones/Extras de la práctica

-El desarrollo de la práctica se ha realizado en la página "Register.html", que se puede encontrar en "pages"
-Se han utilizado los métodos POST y GET para obtener la información e imprimirla por pantalla cuando el usuario pulse el botón de registrarse. 
-Se ha reutilizado la validación implementada en las prácticas anteriores de Javascript, añadiendola también en el lado del servidor, mediante la validación de Springboot en la clase "Cliente.java"
-Se ha añadido un actuador para verificar el estado de la página. Para ello se podrá acceder mediante "localhost:8080/actuator" y los archivos correspondintes se encuentran en la carpeta actuador
