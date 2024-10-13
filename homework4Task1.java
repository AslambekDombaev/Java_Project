
import java.util.LinkedList;
class LLTasks {
    public void removeOddLengthStrings(LinkedList<String> ll) {
        LinkedList<String> res = new LinkedList<String>();
        for (String i  : ll) {
            if (i.length() % 2 == 0) {
                res.add(i);
            }
        }
        ll.clear();
        for (String i : res) {
            ll.add(i);
        }
    }
}





public class homework4Task1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        if (args.length == 0) {
            ll.add("apple");
            ll.add("banana");
            ll.add("pear");
            ll.add("grape");
        } 
        else {
            for (String arg : args) {
                ll.add(arg);
            }
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        answer.removeOddLengthStrings(ll);
        System.out.println(ll);
        }
    }
        
