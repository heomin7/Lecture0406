import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class InterestCalculator {
    public static void main(String[] args){
        //input
        /*
        원금을 입력하세요: 3,000,000(원)
        기간을 입력하세요: 48(개월)
        이율을 입력하세요: 35.5(연 %)
         */


        Scanner input = new Scanner(System.in);

        System.out.println("원금을 입력하세요: ");
        int money = input.nextInt();

        System.out.println("기간을 입력하세요: ");
        int period = input.nextInt();

        System.out.println("이율을 입력하세요: ");

        //process
        /*
        이자 계산 공식: 이자 = 원금 * 이율(연이율/100) * (월/12)
         */

        double interestRate = input.nextDouble();

        double getMoney = clacInterest(money, period, interestRate);

        if(period >= 36) {
            interestRate *= 0.7;
        }



        //Output
        /*
        48개월 후 당신은 5,000,000원을 만들 수 있습니다.
         */
        String strGetMoney = String.format("%,.1f", getMoney);

        System.out.println(period + "개월 후 당신은 "
                + strGetMoney + "원을 만들 수 있습니다");

        //spring interpolation
        /*
        System.out.printf("%d 개월 후에 당신은 %s원을 받을 수 있습니다.", period, strGetMoney);
        ->printf가 jdk 1.6 부터 지원함
         */

    }

    public static double clacInterest(int money, int period, double interestRate){
        double getMoney = money + (interestRate*0.01) * (period / 12.0);
        return getMoney;
    }
}

