class newD {
    public static int reverse(int x) {
        if(-Math.pow(2, 31) >= x || x >= (Math.pow(2, 31) - 1)){
            return 0;
        }
        boolean isnegative = false;
        if(x < 0){
            isnegative = true;
            x = Math.abs(x);
        }
        long result = 0;
        int size = 1;
       while(x / size > 9){
           size *= 10;
       }
        while(x  > 0){
            System.out.println(x % 10);
            result += size * (long)(x % 10);
            x /= 10;
            size /= 10;
        }
        if(-Math.pow(2, 31) >= result || result >= (Math.pow(2, 31) - 1)){
            return 0;
        }
        int newResult = (int) result;
    return isnegative ? 0-newResult :  newResult;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}