public class getstrlengthDay2 {
    

    // Function to get the length of a string
    public static int strlength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int length = strlength(input);
        System.out.println("The length of the string is: " + length);
    }

}
