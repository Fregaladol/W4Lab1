public class Comida {

    private String name;
    private String origin;
    private double weight;
    private double price;

    
    public Comida() {
    }


    public Comida(String name, String origin, double weight, double price) {
        setName(name);
        setOrigin(origin);
        setWeight(weight);
        setPrice(price);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getOrigin() {
        return origin;
    }


    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
       
        if (weight >= 0) {
             this.weight = weight;
        } else {
            System.out.println("El peso debe tener valor 0 o positivo.");
        }
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        
        if (price >= 0){
            this.price = price;
        } else {
            System.out.println("El precio debe tener valor 0 o positivo.");
        }
    }


    @Override
    public String toString() {
        return String.format("- %.2f kg de %s (%.2f €/kg), origen: %s", weight, name, price, origin);
    }
    
    
}
