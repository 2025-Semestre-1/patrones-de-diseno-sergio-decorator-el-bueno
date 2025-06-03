// Uso
public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionCorreo(); //creamos la notificacion básica (Por correo)
        notificacion = new NotificacionSMS(notificacion); //creamos la notificacion por sms
        notificacion = new NotificacionSlack(notificacion); //creamos la notificación por slack
        notificacion = new NotificacionFacebook(notificacion); //creamos la notificación por facebook

        notificacion.enviar("¡Hola mundo!"); //enviamos notificaciones
    }
}
