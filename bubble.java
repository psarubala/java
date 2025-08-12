import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr={4,5,6,3,2,1};
        Bubble(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            Boolean swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
