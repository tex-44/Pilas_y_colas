package Pilas;
import java.util.Scanner;
import java.util.Stack;
public class Pila {

	public static void main(String[] args) {
		//Crear una pila para almacenar los platos sucios
		Stack <String> pilaPlatos = new Stack();
		//Creamos un objeto para que Scanner pueda leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		//Variable para controlar la salida del bucle
		boolean salir= false;
		//Iniciamos el bucle while 
		while (!false) { //Inicio del bucle while que se estará ejecutanco mientras salir sea falso
			System.out.println("1-Agregar un plato sucio a la pila");//Muestra la opción para añadir un plato sucio a la oila
			System.out.println("2-Lavar el plato superior de la pila");//Muestra opción para limpiar el plato superior de la pila
			System.out.println("3-Ver el plato superior de la pila");//Muestra opción para ver el plato superior de la pila sin limpiarlo
			System.out.println("4-Verificar si la pila está vacía");//Muestra la opción para verificar si la pila de platos está vacía
			System.out.println("5-Buscar plato en la pila");//Muestra la opción para buscar un plato específico de la pila
			System.out.println("6-Salir");//Muestr la opción para salir del programa
			//Solicitamos al usuario que ingrese una opcion
			System.out.println("Ingrese una opción:");
			//Leer la opción ingresada por el usuario
			int opcion= scanner.nextInt();
			scanner.nextLine();//Salto de línea después de leer la opción
			//Inicio del bloque switch evaluando el valor de la variable opcion
			switch (opcion) {
				case 1:
					//Solicito al usuario que ingrese un plato
					System.out.println("Ingrese el plato a la pila:");
					//Leer el plato ingresado
					String plato= scanner.nextLine();
					//Agregar el plato a la pila utilizando push
					pilaPlatos.push(plato);
					//Mostrar mensaje indicando que fue ingresado a la pila 
					System.out.println("Plato agregado a la lista");
					break;//Salir del bloque
				case 2:
					//Verificamos si la lista no está vacía
					if (!pilaPlatos.isEmpty()) {
						//Limpiar el plato superior de la pila utilizando el método pop
						String platoLimpio= pilaPlatos.pop();
						System.out.println("Se lavó el plato superior:" + platoLimpio);//Mostrar un mensaje que indique que el plato ha sido limpiado
					}else {
						//Indicar que la pila está vacía
						System.out.println("La pila está vacía, no se puede lavar ningún plato");
					}
					break;//Salimos del bloque 
				case 3:
					//Verificamos si la lista no está vacía
					if (!pilaPlatos.isEmpty()) {
						//Obtenemos el plato superior de la pila sin limpiarlo utilizando el método peek
						String platoSuperior= pilaPlatos.peek();
						System.out.println("Este es el plato superior de la pila:" + platoSuperior);//Mostramos el plato superior de la pila
					}else {
						//Indicar que la pila está vacía
						System.out.println("La pila está vacía, no hay ningún plato");
					}
					break;//Salimos del bloque
			
				case 4:
					boolean estaVacia=pilaPlatos.isEmpty();//Verificamos si la pila está vacía
					System.out.println("La pila de platos está vacía: " +estaVacia);//Mostramos un mensaje indicando si la pila está vacía o no
					break;//Salimos del bloque
				case 5:
					//Solicitar al usuario que ingrese el plato a buscar en la pila
					System.out.println("Ingrese el plato que desea buscar:");
					//Lee el plato a buscar ingresado por el usuario
					String platoBuscar =scanner.nextLine();
					//Buscar el plato en la pila utilizando el método search()
					int distanciaDesdeSuperior= pilaPlatos.search(platoBuscar);
					if (distanciaDesdeSuperior!=-1) {//Verificar si el plato se encuentra en la pila (search() devuelve -1 si no se encuentra)
						//Mostrar mensaje indicando la posición del plato en la pila
						System.out.println("El plato "+platoBuscar + "se encuentra a una distancia "+distanciaDesdeSuperior+" desde la parte superior de la pila");
					}else {
						System.out.println("El plato "+platoBuscar+ " no se encuentra en la pila");//Mostrar un mensaje indicando que el plato no se encuentra en la pila
					}
					break;//Salimos del bloque
				case 6:
					salir=true;//Cambiamos el valor de la variable para salir del bucle while
					break;//Salimos del bloque
					default: 
						System.out.println("Opción inválida, intente de nuevo");//Mostrar un mensaje indicando que la opción que el usuario ingresó no es válida
						break;//Salimos del bloque switch
			}
			System.out.println();//Imprimir un salto de linea para separar las iteraciones del ciclo while
			
		}
			
	}
	
	}


