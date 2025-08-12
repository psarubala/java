import java.util.*;
public class LR {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.print("Enter the rotation :");
        int k=sc.nextInt();
        System.out.println(Arrays.toString(a));
        shift(a,k);
        System.out.println(Arrays.toString(a));

    }
    public static void shift(int []a,int k)
    {     
        for (int j = 1; j<k; j++) {
            int last=a[a.length-1];
            for(int i=a.length-2;i>=0;i--)
            {
                a[i+1]=a[i];
            }
            a[0]=last;
        }
    }
}
