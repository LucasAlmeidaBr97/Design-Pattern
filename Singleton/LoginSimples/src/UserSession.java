public class UserSession {

    private static final UserSession session = new UserSession();

    private boolean logged;

    private UserSession() {

    }

    public static synchronized UserSession getUserSession() {
        return session;
    }

    public synchronized void startSession(){
        this.logged = true;
    }

    public synchronized void stopSession(){
        this.logged = false;
    }

    public boolean isLogged() {
        return logged;
    }
}
