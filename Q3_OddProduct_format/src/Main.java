public class Main {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i<=15;i+=2)
            product *=i;
        System.out.printf("%s%d%n","Product = ",product);
    }
}