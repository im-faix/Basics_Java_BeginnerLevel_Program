public class Reverse_Number
{
    public static void main(String[] args)
    {
        int n =153,rev=0;
        System.out.println(n);
        while(n>0)
        {
            int rem = n%10;
            rev = rev *10 + rem;
            n = n/10;
        }
        System.out.println(rev);
    }
}