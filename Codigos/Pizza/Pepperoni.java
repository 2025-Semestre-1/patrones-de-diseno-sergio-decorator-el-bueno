
// Decorador concreto: Pepperoni
class Pepperoni extends DecoradorPizza {
    public Pepperoni(Pizza pizza) {
        super(pizza); // se llama a la clase padre que en este caso sería la pizza basica
    }

    public String descripcion() {
        return pizza.descripcion() + " + Pepperoni";
    }

    public double costo() {
        return pizza.costo() + 1000;
    }
}