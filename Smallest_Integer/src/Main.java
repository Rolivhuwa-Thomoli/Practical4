import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minval, numVal, tempval;
        System.out.println("Enter number of values: ");
        numVal = sc.nextInt();
        if (numVal >0){
            System.out.println("Enter integer value: ");
            minval = sc.nextInt();
            for(int i = 1; i<numVal; i++) {
                System.out.println("Enter integer value: ");
                tempval = sc.nextInt();
                if(tempval<minval)
                    minval = tempval;
            }//end for
            System.out.println("Minimum value = " + minval);}
        else System.out.println("Error input");
    }//end main method
}//end main class