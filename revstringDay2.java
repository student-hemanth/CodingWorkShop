public class revstringDay2 {
    public static String reversestring(String input) {
        StringBuilder output=new StringBuilder();
        for(int i=input.length()-1;i>=0;i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
    public static void invoke_revervsestring() {
        String input1="abcd";
        String output1=reversestring(input1);
        System.out.println("input"+input1+"output" + output1);
    }
    public static void main(String[] args) {
        invoke_revervsestring();
    }
}
