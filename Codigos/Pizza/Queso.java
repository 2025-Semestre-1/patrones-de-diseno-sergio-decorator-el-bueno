// Decorador concreto: Queso
class Queso extends DecoradorPizza {
    public Queso(Pizza pizza) {
        super(pizza); // se llama a la clase padre que en este caso sería la pizza basica
    }

    public String descripcion() {
        return pizza.descripcion() + " + Queso";
    }

    public double costo() {
        return pizza.costo() + 2000;
    }
}