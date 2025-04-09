public class NotificationService {
    private List<Notificador> notificadores = new ArrayList<>();

    public void adicionarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }