import java.util.Scanner;

public class UI {
    
    Scanner scan = new Scanner(System.in);

    public void showMenu(){
        System.out.println("#######################");
        System.out.println("---------Menu-----------");
        System.out.println("Username: ");
        String userName = scan.nextLine();
        System.out.println("Password: ");
        String password = scan.nextLine();
        User user = new User();

        if(userName.equals(user.getUsername()) && (password.equals(user.getPassword()))){
            UserSession session = UserSession.getUserSession();
            session.startSession();
            System.out.println(session+ "---"+session.isLogged());
            session.stopSession();
            System.out.println(session.isLogged());
        } else {
            System.out.println("Login ou senha incorreto!");
        }


    }
}
