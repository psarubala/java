public class range {
    public static void main(String[] args) {
            int[] arr={18,55,21,11,54,3};
            System.out.println(min(arr));
        
    }
      static int min(int[] arr)
      {
        int ans=arr[0];
        for (int i =1;i<arr.length;i++) {
         if (arr[i]<ans) {
            ans=arr[i];
         }            
        }
        return ans;
      }
}
