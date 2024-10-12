import java.util.Arrays;
import java.util.ArrayList;

class UniqueElements {
    public int[] getUniqueElements(int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i : a) {
            if (!res.contains(i)) {
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



public class homework3Task2 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } 
        else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
