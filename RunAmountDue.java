import java.util.*;
class AmountDue{
    public  double computeAmountDue(double price){
        double total = price + 0.12;
        return total;
    }
    public  double computeAmountDue(double price, int qnty){
         double total = (price * qnty)+0.12;
        return total;
        
    }public  double computeAmountDue(double price, int qnty, int Discount){
          double total = ((price * qnty)-Discount)+0.12;
          return total;

    }

}
class RunAmountDue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AmountDue due = new AmountDue();
        
        System.out.println("Press any of the following then enter the values seperated by spaces");
        System.out.println("1 - Price Only");
        System.out.println("2 - Price and quantity");
        System.out.println("3 - Price, quantity and discount amount");
        int ch = scan.nextInt(); 
        
        
      
        switch (ch) {
            case 1:
                double total;
                total=due.computeAmountDue(scan.nextDouble());
                System.out.println("Amount due is "+total);

                break;
            case 2:
                {
                    double total1;
                    total1 = due.computeAmountDue(scan.nextDouble(), scan.nextInt());
                    System.out.println("Amount due is "+total1);
                    break;
                }
            case 3:
                {
                    double total2;
                    total2 = due.computeAmountDue(scan.nextDouble(), scan.nextInt(), scan.nextInt());
                    System.out.println("Amount due is "+total2);
                    break;
                }
            default:
                break;
        }

    }
}
