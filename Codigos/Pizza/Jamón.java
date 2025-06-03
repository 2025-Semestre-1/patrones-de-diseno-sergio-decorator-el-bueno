// Decorador concreto
class Jamón extends DecoradorPizza {
    public Jamón(Pizza pizza) {
        super(pizza); // se llama a la clase padre que en este caso sería la pizza basica
    }

    public String descripcion() {
        return pizza.descripcion() + " + Jamón";
    }

    public double costo() {
        return pizza.costo() + 1000;
    }
}