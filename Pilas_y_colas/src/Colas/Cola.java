package Colas;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cola {

	public static void main(String[] args) {
		Queue <String> colaAtencion = new LinkedList<>();//Crear una nueva cola utilizando la clase LinkedList de Java
		Scanner scanner = new Scanner (System.in);//Crear un objeto de la clase Scanner para que el usuario pueda introducir datos
		boolean salir = false; //Variable que nos ayudará a controlar la salida del bucle while
		
		while (!salir) {//Ejecutamos el bucle while mientras que la variable salir no sea verdadera 
			System.out.println("1. Agregar un cliente a la cola de atención"); //Muestra un mensaje para que el usuario agregue un cliente a la cola
			System.out.println("2. Atender al próximo cliente de la cola");//Mostrar opción para atender al próximo cliente de la cola 
			System.out.println("3. Ver el próximo cliente de la cola");//Mostrar la opción para ver que cliente es el siguiente en la cola 
			System.out.println("4. Verificar si la cola de atención está vacía");//Mostramos una opción que nos permitirá ver si la cola esta vacía 
			System.out.println("5. Salir");//Mostramos una opción para salir del programa
			System.out.println("Ingrese una opción");//Solicitamos que el usuario ingrese una de las cinco opciones
			int opcion = scanner.nextInt();//Leer la opción ingresada por el usuario
			
			switch (opcion) {//Inicializamos el boque switch evaluando la variable opcion
				case 1:
					System.out.println("Ingrese el cliente a agregar a la cola: ");//Solicitamos al usuario que ingrese un cliente a la cola
					String cliente = scanner.nextLine();//Leer el nombre del cliente ingresado por el usuario
					colaAtencion.add(cliente);//Para agregar a un cliente utilizamos el método add
					System.out.println("Cliente agregado a la cola de atención");//Mostrar un mensaje indicando que el cliente se ha agregado exitosamente a la cola
					break;//Cerramos el bloque
				case 2:
					if (!colaAtencion.isEmpty()) {//Verificamos si la cola no está vacía
						String clienteAtendido = colaAtencion.poll();//Atender al próximo cliente de la cola utilizando el método poll
						System.out.println("Cliente atendido: " +clienteAtendido);//Mostramos al cliente que ha sido atendido
					}else {
						System.out.println("La cola de atención está vacía, no hay clientes por atender");
					}
					break;//Cerramos el bloque
				case 3:
					if (!colaAtencion.isEmpty()) {//Verificamos si la cola está vacía
						String proximoCliente= colaAtencion.peek(); //Obtenemos el próximo cliente de la cola sin haberlo atendido usando el método peek
						System.out.println("Próximo cliente en la cola: " +proximoCliente);//Mostrar el nombre del próximo cliente en la cola
					}else {
						System.out.println("La cola está vacía");//Muestra si la cola está vacía o no
					}
					break;//Salir del bloque 
				case 4: 
					boolean estaVacia= colaAtencion.isEmpty();//Verificamos si la cola está vacía con el método
					System.out.println("La cola de atenciín está vacía: " +estaVacia);//Moestramos el mensaje en pantalla
					break;
				case 5:
					salir= true;//Cambiamos el valor de la variable para salir del programa
					break;//Salimos del bloque
					default: 
						System.out.println("Opción inválida, intente otra vez");//Mostrar mensaje indicando que la opción que el usuario ingresó no es válida
						break;
			}
			
			System.out.println();//Imprimir una linea en blanco para separar las iteraciones
			
		}
		System.out.println("¡Gracias por usar mi programa!");//Un mensaje de despedida cuando se cierre el programa

	}

}
