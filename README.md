# LABORATORIO_1_ARSW:

## PARTE-1-Introduction to Java Threads:
Change the beginning with start() to run(). How does the output change? Why?

si usamos el metodo start() se correran los tres hilos al tiempo y se cambiaran los estados del hilo y esto permitira que este los inicie sin importar el orden mostrando asi los intervalos del metodo intercalados,
en cambio si usamos el metodo run() se ejecutara el hilo en el orden definido sin cambiar los estados del hilo. 

## PARTE-2-BBP Formula Exercise:

### Join
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/join.PNG)
### Pruebas
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/JUnit.PNG)

## PARTE-3-Performance Evaluation:

When starting the program, run the jVisualVM monitor, and as the tests run, check and record the CPU and memory consumption in each case.

![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/uno.PNG)
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/cuatroNucleos.PNG)
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/ocho.PNG)
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/docientos.PNG)
![Imagenes](https://github.com/checho1998/LAB_1_ARSW/blob/master/fotos/cores.PNG)

Why is the best performance not achieved with the 500 threads? How does this performance compare when 200 are used?.

R//: Al revisar los resultados aun asi no mejora mucho ya que este tiene que guardar los estados de cada hilo y volver a su estado normal. 

How does the solution behave using as many processing threads as cores compared to the result of using twice as much?

R//: La solucion con el doble de hilos que nucleos es mas efectiva por casi un minuto(50 seg) que la de el mismo numero de hilos ya que cada nucleo usa solamente dos hilos cada uno y no es una carga demasiado grande para ellos.


