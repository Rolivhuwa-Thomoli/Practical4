import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double itemsSold;
        while (true) {
            System.out.println("Enter Sales person's items sold :");
            itemsSold = sc.nextDouble();
            if(itemsSold >=0)
            System.out.printf("%s%.2f%n", "Salesperson's Earnings: $", (200 + (0.09 * itemsSold)));
            else
                System.out.println("Error input");
            System.out.println();
        }
    }
}