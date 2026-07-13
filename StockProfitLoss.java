import java.util.Scanner;
public class StockProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase price of one stock: ");
        double purchasePrice = sc.nextDouble();
        System.out.print("Enter number of stocks purchased: ");
        int quantity = sc.nextInt();
        System.out.print("Enter current stock price: ");
        double currentPrice = sc.nextDouble();
        double investment = purchasePrice * quantity;
        double currentValue = currentPrice * quantity;
        double result = currentValue - investment;
        if (result > 0) {
            System.out.println("Profit = " + result);
        } else if (result < 0) {
            System.out.println("Loss = " + (-result));
        } else {
            System.out.println("No Profit No Loss");
        }
        sc.close();
    }
}