# Conversor de Unidades
Sprint 01: Crea tu propio conversor de monedas
Desafio de la ruta Java Orientado a Objetos del programa Oracle Next Education

## Descripcion 
En esta oportunidad, a los Devs se nos solicitó crear un conversor de divisas utilizando el lenguaje
Java. Las características solicitadas por nuestro cliente son las siguientes:

-Que sea posible convertir de la moneda nacional a diversas monedas internacionales
-Que sea posible convertir inversamente


## Funcion

### Pantalla Principal

![Captura de pantalla 2023-02-11 192049](https://user-images.githubusercontent.com/106214586/218288100-10d60c69-ba49-4f89-8c42-2c50b5b16763.png)

Implementado con la API JavaFX, le da a el usuario la opcion de escoger que tipo de unidades quiere
convertir, ya sean monedas o unidades de longitud.
Al hacer click en el boton continuar, cambia la escena a el conversor de las unidades que selecciono

### Conversor
![Captura de pantalla 2023-02-11 192558](https://user-images.githubusercontent.com/106214586/218288161-921b779f-28f5-43b9-ade1-f5e98854d2d3.png)

Aqui el usuario puede seleccionar el tipo de monedas que quiere convertir e ingresar el valor.

## Mostrar resultado
Al hacer click en el boton Convertir, se muestra una alerta con el resultado

![Captura de pantalla 2023-02-11 192740](https://user-images.githubusercontent.com/106214586/218288192-59cacec6-f8a8-4342-a533-d7ae85e5bafc.png)

Al hacer click en aceptar, se muestra una alerta pidiendo al usuario que confirme si quiere continuar
![Captura de pantalla 2023-02-11 192812](https://user-images.githubusercontent.com/106214586/218288218-6bbba9a2-9af1-4c09-826d-29d18fd322ee.png)

Si hace click en el boton terminar, se finaliza la ejecucion del programa. Mientras que si hace
click en el boton aceptar, se regresa a el usuario a la pantalla de inicio

### Extension
Las pantallas de los conversores fueron instanciadas de la clase Conversor.java, la cual esta
diseñada para que sea posible instanciar mas conversores segun sea necesario ampliar la aplicacion




