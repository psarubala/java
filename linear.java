public class linear {
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25};
        System.out.println(search(arr));
    }
    public static int search(int[] arr)
    { int target=15;
       int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                sum=i;
            }
        }
       return sum; 
    }

}
