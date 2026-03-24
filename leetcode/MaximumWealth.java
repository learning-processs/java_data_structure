package leetcode;

public class MaximumWealth {
    public static void main(String[] args) {
        int accounts[][] = { 
                            { 1, 2, 8 }, 
                            { 3, 2, 1 } 
                          };
        int result = maxWealth(accounts);
        System.out.println(result);
    }

    static int maxWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for(int person = 0 ; person < accounts.length ; person++){
            int sum = 0;
            for(int acc = 0 ; acc < accounts[person].length ;acc++){
                sum+=accounts[person][acc];
            }

            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
