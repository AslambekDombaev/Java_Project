import java.util.Arrays;
import java.util.ArrayList;

class FilterStrings {
    public String[] filterShortStrings(String[] arr) {
        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 3) {
                res.add(arr[i]);
            }
        }
        String[] res2 = new String[res.size()];
        for (int i = 0; i < res2.length; i++) {
            res2[i] = res.get(i);
        }
        return res2;
    }
}






public class homework3Task3 {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
            arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } 
        else {
            arr = args[0].split(", ");
        }
        
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}