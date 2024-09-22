import java.util.Scanner;

public class homework1Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        
        int res = extracted(a);
        System.out.println(res);
    }

    private static int extracted(int a) {
        int sum = 0;
        while (a != 0) {
            sum += (a%10);
            a = a/10;
        }
        return sum;
    }
}
