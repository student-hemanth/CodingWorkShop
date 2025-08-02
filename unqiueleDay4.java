public class unqiueleDay4 {
    public static void printuniqueEle(int[] numbers) {
        for(int readidx=0;readidx<numbers.length;readidx++) {
            boolean isdulpicate=false;
            for(int compareidx=0;compareidx<numbers.length;compareidx++) {
                if(readidx==compareidx)
                {
                    continue;
                } else if(numbers[readidx]==numbers[compareidx]) 
                {
                    isdulpicate=true;
                    break;
                }
            }
            if(!isdulpicate) {
                System.out.println(numbers[readidx]);
            }
        }
        
    }
    public static void invoke_printuniqueEle() {
            int[] input1= {1,2,3,3};
            printuniqueEle(input1);
   }
   public static void main(String[] args) {
    invoke_printuniqueEle();
   }

    
}
