public class binaryDay5 {
    public static void printBinary(int numbers) {
        if(numbers<0)
            return;
        int countofbits=Integer.BYTES*8;
        int mask=1;
        mask=mask<<(countofbits-2);
        System.out.println("\nbinary from of num"+numbers +" "); 
        while(mask>0)
        {
            int res=numbers &mask;
            if(res!=0)
                System.out.println("0");
            else 
                System.out.println("1");
            mask=mask>>1;     
        }   
    }
    public static void invoke_printbinary() {
        printBinary(1);
    }
    public static void main(String[] args) {
        invoke_printbinary();
    }
}
