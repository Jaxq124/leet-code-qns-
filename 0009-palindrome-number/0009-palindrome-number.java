class Solution {
    public boolean isPalindrome(int x)  {
        int rev = 0; 
        int a=x; 
        if(x<0)
        { return false;}
        while (x != 0) {
            int pop = x % 10;  // Extract the last digit of x (pop operation)
            x /= 10;  // Remove the last digit from x (shrink x)

             //Check if the new rev value would overflow when multiplied by 10
            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && pop > 7)) 
                return false;

             //Check if the new rev value would underflow when multiplied by 10
            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
                return false;

            rev = rev * 10 + pop;  // Update rev by adding the popped digit
        }
          if(rev==a){
            return true;
          }
        return false;


    }
}

        
