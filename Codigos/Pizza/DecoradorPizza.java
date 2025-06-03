// Decorador abstracto de la pizza
abstract class DecoradorPizza implements Pizza {
    protected Pizza pizza; //Agregación de la interfaz pizza

    public DecoradorPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
