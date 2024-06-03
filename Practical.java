 import java.util.*;
 class OnlineShoppingPortal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        if( i == 1){
            Prime obj = new Prime();
            obj.amount = sc.nextDouble();
            obj.cart = sc.nextInt();
            obj.checkDiscount(obj.cart, obj.amount);
        }
        else{
            Regular obj = new Regular();
            obj.amount = sc.nextDouble();
            obj.cart = sc.nextInt();
            obj.promo = sc.nextLine();
            obj.checkDiscount(obj.cart, obj.amount, obj.promo);
        }
    }
}
