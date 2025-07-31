// public class ispalindromDay3 {
//     public static Boolean checkpalindrome(String input) {
//         boolean res=true;
//         int left=0;
//         int right=input.length()-1;
//         while(left<right) {
//             if(input.charAt(left)!=input.charAt(right)) {
//                 res=false;
//                 break;
//             }
//             left++;
//             right--;
//         }
//         return res;
//     }
//     public static void invoke_checkplaindrome() {
//         String input="moam";
//         boolean palindrome=checkpalindrome(input);
//         if(palindrome) {
//             System.out.println("string is palindrome");
//         } else {
//             System.out.println("string is not palindrome");
//         }
//     }
//     public static void main(String[] args) {
//         invoke_checkplaindrome();
//     }
// }

import java.util.Scanner;

public class ispalindromDay3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num=sc.nextInt();
        int original_num=num;
        int reverse_num=0;
        while(num!=0)
        {
            reverse_num=reverse_num*10+num%10;
            num=num/10;
        }
        if(original_num==reverse_num) {
            System.out.println(original_num+"is palindrome num");
        } else {
            System.out.println(original_num+"not palindrome num");
        }
    }
}