public class Msum {
    public static void main(String[] args) {
        int a=1089;
        int b=Sum(a);
        System.out.println(b);
    }
   
    static int Sum(int num)
    {    int sum=0;
         while (num>0) {
        int res=num%10;
        sum=sum+res;
        num/=10;
    }
      return sum; 
    }
}
