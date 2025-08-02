public class removespaceDay5 {
    public static String removewhitespace(String input) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char character=input.charAt(i);
            if(character==' ')
                continue;
                res.append(character);
              
        }
        return res.toString(); 
        
        
    }
    static void invoke_removewhitespaces() {
            String res="";
            res=removewhitespace("namskara frinds");
            System.out.println(res);
    }
    public static void main(String[] args) {
        invoke_removewhitespaces();
    }
}


