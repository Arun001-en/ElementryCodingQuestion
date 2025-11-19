import java.util.*;
public class SumofAlldigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum = sum+i;
        }
        System.out.println("The sum of all th edigit is:"+ sum);
    }
}
