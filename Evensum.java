import java.util.*;
public class Evensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            if(n%2==0){
                sum = sum+i;
            }
        }
    }
}
