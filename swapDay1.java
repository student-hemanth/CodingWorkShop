public class swapDay1 {
    public static void swapnum(int[] numbers) 
    {
        int temp=numbers[0];
        numbers[0]=numbers[1];
        numbers[1]=temp;
    }
    public static void invoke_swap() {
        int[] input3={10,20};
        swapnum(input3);
        System.out.println("after swapping:"+ "number[0] is "+ input3[0] + " number[1] is:"+ input3[1]);
    }
    public static void main(String[] args) {
        invoke_swap();
    }
}
