class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        return (x % sumOfDigits(x) == 0) ? sumOfDigits(x) : -1;
    }
    private int sumOfDigits(int n){
        int res = 0;
        while(n != 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}