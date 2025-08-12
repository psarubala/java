
public class maxweath {
    public static void main(String[] args) {
        int account[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(maximumwealth(account));
    }
           static public int maximumwealth(int[][] account)
    { //person=i;
        // account=j;g
        int ans=Integer.MIN_VALUE;
        for (int person= 0; person< account.length; person++) {
            int sum=0;
            for (int bank = 0; bank<account[person].length; bank++) {

                sum=sum+account[person][bank];
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}
