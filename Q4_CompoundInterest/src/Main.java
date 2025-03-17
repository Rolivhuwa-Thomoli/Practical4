import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double finalAmount, principalAmount, rate;
     int years;
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter the principal amount: ");
     principalAmount = sc.nextDouble();
     System.out.println("Please Enter the number of years: ");
     years = sc.nextInt();
     if (principalAmount >=0 && years >=0)
         for(int r = 5; r<=10;r++) {//different rates
             for (int n = 1; n <= years; n++) { //compounded yearly
                 System.out.printf("%s%d%s%.2f%s%d%s%n ", "Year", n, " The balance is : R", (principalAmount * Math.pow(1.0 + (double)(r / 100.0), (double) n)), " with interest ", r, "%");
             }
             System.out.println();
         }
     else System.out.println("Error input");
    }
}