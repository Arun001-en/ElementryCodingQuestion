import java.util.*;
public class Sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int sum = 0;
    int n = sc.nextInt();
    while(n>0){
        int r = n%10;
        sum = sum+r;
        n = n/10;
    }
    System.out.println("The sum of the digit is:"+sum);
    }
}
