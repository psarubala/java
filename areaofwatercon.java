
public class areaofwatercon {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        System.out.println(areacon(a));
    }
    public static int areacon(int[] a)
    {
        int left=0;
        int right=a.length-1;
        int max_area=0;
        while(left<right)
        {
            int width=right-left;
            int min_area=Math.min(a[left],a[right]);
            int area=width*min_area;
            max_area=Math.max(max_area, area);
            if (a[left]<a[right]) {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max_area;
    }
}
