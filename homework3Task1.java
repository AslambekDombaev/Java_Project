import java.util.ArrayList;
import java.util.Arrays;


class FilterNegative {
    public int[] filterNegative(int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : a) {
            if (i >= 0) {
                res.add(i);
            }
        }
        int[] res2 = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            res2[i] = res.get(i);
        } 
            
        return res2;
    }
}



public class homework3Task1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{-1, 2, -3, 4, -5, 6};
        } 
        else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
            
    }
}




