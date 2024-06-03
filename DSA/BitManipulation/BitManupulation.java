/**
 * BitManupulation
 */
public class BitManupulation {

    public static int getBit(int bit, int position){
        return bit & 1 << position;
    }
    public static int setBit(int bit, int position){
        return bit | 1 << position;
    }
    public static int clear(int bit, int position){
        return bit & ~ (1 << position);
    }
    public static int updateBit(int bit, int position){
        return -1;
    }
    public static void main(String[] args) {
        int bit = 5;

        System.out.println(getBit(bit, 2));
        System.out.println(setBit(bit, 1));
        System.out.println(clear(bit, 2));
        System.out.println(updateBit(bit, 2));
        // -> 0101 | 0010 :-  0111 => 7
    }
}