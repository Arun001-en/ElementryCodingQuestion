import java.util.Scanner;

public class SumofEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int option = sc.nextInt(); 
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (option == 1 && digit % 2 != 0) {  // odd
                sum += digit;
            } 
            else if (option == 2 && digit % 2 == 0) { // even
                sum += digit;
            }
            n = n / 10;
        }
        System.out.println(sum);
    }
}
