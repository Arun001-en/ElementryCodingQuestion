import java.util.*;
public class primeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        int c = 0;
        for(int n = a ; n<=b ; n++){
           if(n<=1) continue;
           boolean isprime = true;
           for(int i = 2 ; i<=n/2 ; i++){
                if(n%i==0){
                    isprime = true;
                    break;
                }
           }
           if(isprime){
            System.out.println(n+" ");
           }
        } 
    }
}
