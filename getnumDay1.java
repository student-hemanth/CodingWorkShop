public class getnumDay1 {

    public static int getsum(int num1,int num2) {
        int sum=num1+num2;
        return sum;
    }
    public static void invoke_getsum() {
        int res=getsum(10, 12);
        System.out.println(res);
    }
    public static void main(String[] args) {
        invoke_getsum();
    }
}
