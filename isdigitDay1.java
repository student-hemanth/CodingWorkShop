public class isdigitDay1 {
    public static boolean isnum(String input) {
        boolean res=true;
        for(int idx=0; idx<input.length();idx++)
        {
            char character=input.charAt(idx);
            if(character<'0'|| character>'9')
            {
                res=false;
                break;
            }
        }return res;
    }
    public static void invoke_isnum() {
        boolean res=isnum("123a");
        if(res)
            System.out.println("it is proper num");
        else
            System.out.println("is not proper num");    
    }
    public static void main(String[] args) {
        invoke_isnum();
    }
}
