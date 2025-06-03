import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws Exception {
/*         Tienes un carrito de la compra donde puedas añadir, leer, modificar, borrar y BUSCAR elementos.
        Crear menú con opciones. Si opción = ‘salir’ u opción 0, se acaba el programa.

        Se propone que sean objetos Comida: nombre, origen, peso, precio.

        Se aconseja en este caso realizar un switch dentro de un while. El switch sobre las opciones del menú del tipo:

        1- Añadir comida (implica añadir por teclado todas las características del objeto)

        2- Mostrar lista completa

        3- Mostrar un producto específico por nombre (implica opción buscar)

        4- Modificar por nombre. ¿Cuál quieres modificar? (implica opción buscar)

        5- Borrar elemento por nombre (implica opción buscar)

        0- Salir

        Para buscar, se aconseja el método equalsIgnoreCase().

        +EXTRA: poner todos los métodos en una clase aparte

        *EXTRA: calcular precio final del producto según su peso y precio/Kg */

        ArrayList<Comida> foodList = new ArrayList<>();
        options(foodList);



    }


    public static void options(ArrayList<Comida> foodList){

        boolean quitLoop = false;
        Scanner scanner = new Scanner(System.in);
       

        do {

            System.out.println("Seleccióna el numero de opcion");
            System.out.println("1.- Añade comida al carrito");
            System.out.println("2.- Mostrar carrito");
            System.out.println("3.- Busca producto por nombre");
            System.out.println("4.- Modifica producto por nombre");
            System.out.println("5.- Remover producto del carrito");
            System.out.println("6.- Precio total carrito");
            System.out.println("0.- Salir");

            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
            
                case 1:
                    Carrito.addFood(foodList);    
                    break;
                case 2:
                    Carrito.showFood(foodList);
                    break;
                case 3:
                    Carrito.searchOnList(foodList);
                    break;
                case 4:
                    Carrito.modifyCart(foodList);
                    break;
                case 5:
                    Carrito.removeFood(foodList);
                    break;
                case 6:
                    Carrito.cartPrice(foodList);
                    break;
                case 0:
                    quitLoop = true;
                    break;
                    default:
                    System.out.println("La opción marcada no es valida.");
                }       
                
        } while (!quitLoop);

        System.out.println("Muchas gracias! vuelva pronto!");
        scanner.close();
       
    }


}
