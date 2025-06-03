import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {

    static Scanner scanner = new Scanner(System.in);

    public static void addFood(ArrayList<Comida> foodList){

        System.out.println("Agregarás comida a tu carrito.");
        System.out.println("Dame el nombre de la comida");
        String foodName = scanner.nextLine();

        System.out.println("Dame el lugar de origen de la comida");
        String foodOrigin = scanner.nextLine();

        System.out.println("Dame el peso de la comida en kilos");
        double foodWeight = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Dame el precio de la comida por unidad de peso en euros");
        double priceFood = scanner.nextDouble();
        scanner.nextLine();

        foodList.add(new Comida(foodName, foodOrigin, foodWeight, priceFood));

    }

    public static void showFood(ArrayList<Comida> foodList){

        for (int i=0; i<foodList.size();i++){

            System.out.println(foodList.get(i).toString());

        }

    }

    public static void searchOnList(ArrayList<Comida> foodList){

        System.out.println("¿Deseas buscar algo de tu lista?");
        System.out.println("Dime el nombre del alimento que buscas");
        String foodName = scanner.nextLine();

        int searchResult = searchFood(foodList, foodName);
        
        if (searchResult < 0){
            System.out.println("El alimento que buscas no esta en la lista");
        } else {
            System.out.println(foodList.get(searchResult).toString());
        }



    }

    public static void modifyCart(ArrayList<Comida> foodList){
    
        System.out.println("¿Deseas  modificar algo de tu lista?");
        System.out.println("Dime el nombre del alimento que buscas");
        String foodName = scanner.nextLine();

        int searchResult = searchFood(foodList, foodName);
        
        if (searchResult < 0){
            System.out.println("El alimento que buscas no esta en la lista");
        } else {
            System.out.println("Que quieres modificar (1-4)");
            System.out.println("1.- Nombre");
            System.out.println("2.- Origen");
            System.out.println("3.- Peso");
            System.out.println("4.- Precio");
            int option = scanner.nextInt();
            scanner.nextLine();

            modifyMenu(foodList, searchResult, option);
        }
    
    
    }

    private static int searchFood(ArrayList<Comida> foodList, String foodName) {
    for (int i = 0; i < foodList.size(); i++) {
        if (foodList.get(i).getName().equalsIgnoreCase(foodName)) {
            return i;
        }
    }
        return -1;
    }

    public static void modifyMenu(ArrayList<Comida> foodList,int foodIndex, int option){

        switch (option) {
            case 1:
                System.out.println("Dame el nuevo nombre.");
                String name = scanner.nextLine();
                foodList.get(foodIndex).setName(name);
                break;
            case 2:
                System.out.println("Dame el nuevo origen.");
                String origin = scanner.nextLine();
                foodList.get(foodIndex).setOrigin(origin);
                break;
            case 3:
                System.out.println("Dame el nuevo peso.");
                double weight = scanner.nextDouble();
                foodList.get(foodIndex).setWeight(weight);
                scanner.nextLine();
                break;
            case 4:
                System.out.println("Dame el nuevo precio.");
                double price = scanner.nextDouble();
                foodList.get(foodIndex).setPrice(price);
                scanner.nextLine();
                break;
            default:
                System.out.println("El alimento que mencionas no existe en tu carrito.");
        }
    } 

    public static void removeFood(ArrayList<Comida> foodList){

        System.out.println("¿Deseas  remover algo de tu lista?");
        System.out.println("Dime el nombre del alimento que buscas");
        String foodName = scanner.nextLine();

        int searchResult = searchFood(foodList, foodName);

        if (searchResult < 0){
            System.out.println("El alimento que buscas no esta en la lista");
        } else {
            
            foodList.remove(searchResult);
            System.out.printf("El producto %f fue removido exitosamente",searchResult);
        }

    }

    public static void cartPrice(ArrayList<Comida> foodList){

        ArrayList<Double> totalByFood = new ArrayList<Double>();

        for (Comida food : foodList) {
            double totalPrice = food.getPrice() * food.getWeight();
            totalByFood.add(totalPrice);
        }

        double cartPrice = totalByCart(totalByFood);

        System.out.printf("El total de la comida en tu carrito es de %.2f€.\n", cartPrice);


    }

    public static double totalByCart(ArrayList<Double> totalByFood){
        
        double totalSum = 0.0;

        for (double value : totalByFood) {
            totalSum += value;
        }

        return totalSum;

    }





}
