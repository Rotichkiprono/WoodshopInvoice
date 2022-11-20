import java.util.Scanner;
public class PasswordCheck {
    public String password,username;
    public void setPasswordAndUsername() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your username:");
        username=myInput.next();
        System.out.println("Enter your password:");
        password=myInput.next();
    }
     public void LoginCheck(){
        if (username.equals("Felix") && password.contains("21-2112"))
        {
            System.out.println("Login successful");
        }
        else {
            System.out.println("Wrong details");
        }
     }
}
