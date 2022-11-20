public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO ANTIQUE FURNITURE KENYA");
        System.out.println("Your Predefined Username is :' Felix ' and Password is:' 21-2112 ' ");
        PasswordCheck login = new PasswordCheck();
        login.setPasswordAndUsername();  // user inputs username and password
        login.LoginCheck();  // verification of password
        Table dimensions = new Table();
        dimensions.getSize(); //customer enters the length and width
        dimensions.BasePrice(); //customer receives the base price
        dimensions.drawerNo(); //customer enters the number of drawers
        dimensions.NoTables(); //customer enters the number of tables
        WoodType wood =new WoodType();
        wood.material();
        dimensions.totalprice();
        dimensions.invoice();
        }
}