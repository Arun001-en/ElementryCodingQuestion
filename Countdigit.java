import java.util.*;
public class Countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number is:");
        int n = sc.nextInt();
        int c = 0;
        while(n>0){
            c++;
            n = n/10;
        }
        System.out.println("The count of the digit is:"+c);
    }
}
