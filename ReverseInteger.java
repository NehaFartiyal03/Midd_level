class ReverseInteger {
    public int reverse(int x) {
        int rev = 0; // ye bnaya variable
        while (x != 0) { // jab tk x 0 nhi ho jata
            int pop = x % 10; // x ka last digit nikalega
            x = x /10; // yha pe x ka last digit hta diya 
            if(rev > Integer.MAX_VALUE / 10) {//ye overflow check krega
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + pop; //isme 
        }
        return rev;
        
    }
}
