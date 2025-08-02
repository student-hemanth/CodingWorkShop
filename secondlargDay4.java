public class secondlargDay4 {
    public static int getsecondlarge(int[] numbers) {
        if(numbers.length==0) {
            return -1;
        }
        int largest=0;
        int secondlargest=0;
         for(int i=1;i<numbers.length;i++)
         {
            if(numbers[i]>largest)
            {
                secondlargest=largest;
                largest=numbers[i];
            }
            else if(numbers[i]>secondlargest)
            {
                secondlargest=numbers[i];
            }
         }
         return secondlargest;
        
    }
    public static void invoke_getsecondlarge() {
        int[] input={1,2,3,4,8,6};
        int res=getsecondlarge(input);
        System.out.println("get sum of seco:"+res);
    }
    public static void main(String[] args) {
        invoke_getsecondlarge();
    }
}

