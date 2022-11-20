import java.util.Scanner;
public class WoodType extends  Customization{
    public void material() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your Wood Type between Mahogany, Pine , Oak:");
        woodType = myInput.next();
        if ("Mahogany".compareToIgnoreCase(woodType) == 0) {
            System.out.println("You will be charged an additional 3,000Ksh");
            additional = 3000;
        } else if ("Oak".compareToIgnoreCase(woodType) == 0) {
            System.out.println("You will be charged an additional 2,015Ksh");
            additional = 2015;
        } else {
            System.out.println("No additional charge");
        }
    }

}
