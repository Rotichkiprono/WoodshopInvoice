import java.util.Scanner;
public  class Table  {
    int size, length, width,drawers,additional,totalDrawerprice,totalBaseprice,tableNo;
    String woodType;
    double totalWoodPrice,discounted,undiscounted;
    public Table() {
        this.size = size;
        this.length = length;
        this.width = width;
        this.drawers = drawers;
        this.additional = additional;
        this.totalDrawerprice = totalDrawerprice;
        this.totalBaseprice = totalBaseprice;
        this.tableNo = tableNo;
        this.woodType = woodType;
    }

    public  void getSize() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter your length in cm:");
        length = myInput.nextInt();
        System.out.println("Enter your width in cm:");
        width = myInput.nextInt();
        size = length * width;
    }
    public void drawerNo() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the number of drawers you would like not more than 6: ");
        drawers = myInput.nextInt();
        if (drawers > 6) {
            System.out.println("This is more than 6");
        } else if (drawers > 0) {
            drawers--;
            totalDrawerprice = 2500 + (drawers * 2000);
            System.out.println("Your total price of drawers is: " + totalDrawerprice);
        }
    }
        public void BasePrice() {
            System.out.println("Total base size is" + size);
            if (length == 120 && width == 80) {
                totalBaseprice = 42500;
                System.out.println("total base price is:" + totalBaseprice);
            } else {
                totalBaseprice = size * 825;
                System.out.println("total base price is:" + totalBaseprice);
            }
        }
    public void NoTables(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many tables would you like:");
        tableNo = myInput.nextInt();
    }
    public void totalprice(){
        totalWoodPrice=(additional*tableNo)+totalBaseprice+totalDrawerprice;
        System.out.println("Your Total price per table is : "+ totalWoodPrice);
        undiscounted = totalWoodPrice *tableNo;
        System.out.println("Your Total price per table is : "+ totalWoodPrice);
        if(tableNo>1){
            discounted= undiscounted*0.95;
            System.out.println("You Have Received a 5% discount, New price is: " + discounted);
        }
    }
    public void invoice(){
        System.out.println(" ANTIQUE FURNITURE KENYA");
        System.out.println("You Have selected wood type : " + woodType);
        System.out.println("You Have selected : "+ tableNo + " tables");
        System.out.println("You Have selected : "+ drawers + " drawers");
        System.out.println("Your total price is " + totalWoodPrice );
    }
}
