import java.util.Scanner;

public class homework1Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int res = findMaxOfThree(a, b, c);
        System.out.println(res);
    }

    public static int findMaxOfTwo (int a, int b) {
        return (a > b) ? a : b;
    }
        
    public static int findMaxOfThree (int a, int b, int c) {
        return findMaxOfTwo (findMaxOfTwo(a, b), c);
    }
    
}
