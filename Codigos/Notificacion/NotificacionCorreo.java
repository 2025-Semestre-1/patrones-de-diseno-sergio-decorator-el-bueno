// Componente concreto
class NotificacionCorreo implements Notificacion {
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje por correo: " + mensaje);
    }
}
