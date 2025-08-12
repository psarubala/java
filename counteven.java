import java.util.Arrays;

public class counteven {
    public static void main(String[] args) {
        int [] a={8,5,3,4,6,2};
        int[] res=findodd(a);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findodd(int[] a)
    {        int count=0;
        for (int i = a.length-1; i>0; i--) {
    
            if (a[i]%2==0) {
                count++;
            }
            else
            {
                break;
            }
        }
        int[] temp=new int[a.length-count];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=a[i];
        }
        return temp;
    }
}
