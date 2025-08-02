public class commoneleDay4 {
    public static void printcommomele(int[] input1,int[] input2) {
        for(int input1idx=0;input1idx<input1.length;input1idx++) {
            boolean isfound=false;
            for(int input2idx=0;input2idx<input2.length;input2idx++) {
                if(input1[input1idx]==input2[input2idx])
                {
                    isfound=true;
                    break;
                }
            }
            if(isfound) {
                System.out.println(input1[input1idx]);
            }
        }
    }
    public static void invoke_printcommonele() {
        int[] input1={1,2,3,4};
        int[] input2={2,3};
        printcommomele(input1, input2);
    }
    public static void main(String[] args) {
        invoke_printcommonele();
    }
}
