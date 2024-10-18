import java.util.Deque;
import java.util.LinkedList;

class BrowserHistory {
    Deque<String> q = new LinkedList<>();
    public void visitSite(String site) {
        q.addFirst(site);
    }
    public String back(int steps) {
        if (steps >= q.size()) {
            return null;
        }
        return q.stream().skip(steps).findFirst().orElse(null);
    }
    public Deque<String> getHistory() {
        return q;
    }
}
        



public class homework5Task2 {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitSite("google.com");
        browserHistory.visitSite("stackoverflow.com");
        browserHistory.visitSite("github.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.getHistory());
    }
}
