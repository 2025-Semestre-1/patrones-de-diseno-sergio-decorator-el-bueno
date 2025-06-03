// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        Pizza miPizza1 = new PizzaBasica(); //creamos la pizza
        miPizza1 = new Queso(miPizza1); //le agregamos queso
        miPizza1 = new Pepperoni(miPizza1);// le agregamos pepperoni
        System.out.println(miPizza1.descripcion());  
        System.out.println("Costo: $" + miPizza1.costo()); //imprimimos la descripción y el costo de la pizza de queso y pepperoni

        Pizza miPizza2 = new PizzaBasica(); //creamos otra pizza
        miPizza2 = new Queso(miPizza2) 
        miPizza2 = new Jamón(miPizza2); //le agregamos queso y jamón
        System.out.println(miPizza1.descripcion());  
        System.out.println("Costo: $" + miPizza1.costo()); //imprimimos la descripción y el costo de la pizza de jamón y queso
        
    }
}
