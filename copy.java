import java.util.Arrays;

public class copy {
    public static void main(String[] args) {
        int[] a={98,23,45,56,21};
        int[] b=new int[a.length];
        System.out.println(Arrays.toString(a));
    for (int i = 0; i < a.length; i++) {
        b[i]=a[i];
    }
    System.out.println(Arrays.toString(b));    
}

}
