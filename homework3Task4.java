
import java.util.Arrays;
import java.lang.Math;

class AverageCalculator {
    public int calculateAverage(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        double res = 0;
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        res = sum / a.length;
        int res2 = (int)Math.round(res);
        return res2;
    }
}





public class homework3Task4 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{4, 2, 7, 5, 1};
        } 
        else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}
