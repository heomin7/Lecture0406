/**
 * Created by danawacomputer on 2017-04-06.
 */
public class AppleShopFunctionVersion {
    public static void main(String[] args){

        int regularPriceForiPadPro = 999_000;
        double dcRate = 15.0/100;

        double discountedPriceForiPad = regularPriceForiPadMaker(regularPriceForiPadPro, dcRate);

        System.out.printf("result: %,.1f", discountedPriceForiPad);

    }

    public static double regularPriceForiPadMaker(int regularPriceForiPadPro, double dcRate){
        return regularPriceForiPadPro * (1 - dcRate);

    }
}
