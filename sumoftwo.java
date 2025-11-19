import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int s=n1%10;
        int v=n%10;
        int sum=s+v;
        System.out.println(sum);
    }
}
