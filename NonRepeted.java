import java.util.Scanner;
public class NonRepeted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[10];
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            freq[digit]++;
            temp /= 10;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
