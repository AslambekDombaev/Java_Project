public class homework2Task3 {
    
    public static String removeEmptyLines(String text) {
        String[] text1 = text.split("\n");
        StringBuilder res = new StringBuilder();

        for (String st : text1) {
            if (!st.trim().isEmpty()) {
                res.append(st + "\n");
            }
        }

        
        return res.toString();
    }
    
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {

        text = "line1\n\nline2\n\nline3";
        } 
        else {
        text = args[0];
        }

        System.out.println(removeEmptyLines(text));
    }
}
