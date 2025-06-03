// Decorador concreto
class NotificacionSMS extends NotiDecorador {
    public NotificacionSMS(Notificacion noti) {
        super(noti); //se llama a la clase padre que en este caso sería una representación de la clase concreta (Correo)
    }

    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando por SMS: " + mensaje);
    }
}