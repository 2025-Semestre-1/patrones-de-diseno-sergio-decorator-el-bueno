// Decorador abstracto de la notificación
abstract class NotiDecorador implements Notificacion {
    //la agregación de la interface notificación, protected para que ninguna clase externa pueda acceder a ella
    protected Notificacion noti; 

    //constructor de la clase
    public NotiDecorador(Notificacion noti) {
        this.noti = noti;
    }

    public void enviar(String mensaje) { //se pueden implementar metodos debido a que son relegados de una interfaz
        noti.enviar(mensaje); // se envia el mensaje de la clase concreta básica
    }
}