public class countofwordDay5 {
    public static int getcountofword(String input) {
        int countofwords=0;
        if(input==null)
            return countofwords;
        if(input.length()==0)
            return countofwords;
        for(int i=0;i<input.length();i++)
        {
            char character=input.charAt(i);
            if(character==' '||character=='\t'||character=='\n')
            {
                countofwords++;
            }
        } 
        countofwords=countofwords+1;
        return countofwords;       
    }
    public static void invoke_getcountofword() {
        String input="i love my country";
        int countofwords=getcountofword(input);
        System.out.println("count of word:"+countofwords);
        System.out.println(input);
        
    }
    public static void main(String[] args) {
        invoke_getcountofword();
    }
}