package homework;

public class day7homework {
    public static void main(String[] args) {
        //    ex: 1234 => not palindrome :(
        //    ex: 123321 => palindrome !!!
        //    ex: 12321 => palindrome !!

        String a1="123321";
        int n=Integer.valueOf(a1);
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }



}
