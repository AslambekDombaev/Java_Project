import java.util.Scanner;

public class homework1Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        

        extracted(a);
    }

    private static void extracted(int a) {
        if (a < 0) {
            System.out.println(-1);
        } else if (a == 0) {
            System.out.println(1);
        } else {
            int res = 1;
            for (int i = 2; i <= a; i++) {
                res *= i;
            }
            System.out.println(res);
        }
    }
}