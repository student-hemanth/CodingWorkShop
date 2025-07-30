public class asciivalueDay1 {
    public static void printascii(String input) {
        char character;
        for(int i=0;i<input.length();i++)
        {
            character=input.charAt(i);
            int asciivalue=character;
            System.out.println("ascii value of the char" + character + " "+asciivalue);
        }
    }
    public static void main(String[] args) {
        printascii("abc");
    }
}
