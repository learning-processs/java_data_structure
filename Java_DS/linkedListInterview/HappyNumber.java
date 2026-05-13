package linkedListInterview;

public class HappyNumber {

    public boolean isHappy(int n){

        int slow = n;
        int fast = n;

        do {
            fast = findSqare(findSqare(fast));
            slow = findSqare(slow);
        } while (slow != fast);

        if(slow == 1){
            return true;
        }else{
            return false;
        }
    }

    private int findSqare(int number){
        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;

    }

    
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        boolean ans = hn.isHappy(19);
        System.out.println(ans);
    }
}
