public class isevenDay1 {
    public static boolean checkeven(int num) {
        if(num%2==0) {
            System.out.println("num is even");
            return true;
        } else {
            System.out.println("num is odd");
            return false;
        }
    }
    public static void invoke_checkeven() {
        checkeven(11);
        checkeven(12);
    }
    public static void main(String[] args) {
        invoke_checkeven();
    }
}
