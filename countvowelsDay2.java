public class countvowelsDay2 {
   public static int getvowels(String input) {
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char character=input.charAt(i);
            if (character == 'a' ||
                character =='e'||
                character=='o' ||
                character=='i'||
                character=='u' )
                count++;
        }
        return count;
   }
   public static void invoke_getvowls() {
    String input="nandu";
    int count=getvowels(input);
    System.out.println("no of vowels"+input+ " "+count);
   }
   public static void main(String[] args) {
    invoke_getvowls();
   }

       
}
