public class Ispalidrome {
    public static void main(String[] args) {
        int a=123;
        int ans=ispalidrome(a);
        if (ans==a) {
            System.out.println("it is palidrome:"+ans);
        }
        else
        {
            System.out.println("it is not a palidrome:"+ans);
        }
    }
    public static int ispalidrome(int num)
    {   int sum=0;
        while (num>0) {
             sum=sum*10+num%10;
            num=num/10;
        }
        return sum;
    }

}
