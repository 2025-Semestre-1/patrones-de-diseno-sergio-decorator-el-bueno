// Componente concreto que representa una pizza básica
class PizzaBasica implements Pizza {
    public String descripcion() {
        return "Pizza con salsa";
    }

    public double costo() {
        return 5000;
    }
}