// using recursion in factorial;
public class factorial {
     static int fact=1;
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int num)
    { 
        if (num>=2) 
        {
          fact=fact*num;
          num--;
          fact(num);
        }
 return fact;
    }

}
