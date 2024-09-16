package ra;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số
        tự nhiên và kiểm tra xem số đó có chia hết cho 3 và 5 hay không*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số tự nhiên bất kỳ");
        int n = Integer.parseInt(sc.nextLine());
        if(n%3==0&&n%5==0) {
            System.out.println(n+" Chia hết cho 3 và 5");
        }else {
            System.out.println(n+" Không chia hết cho 3 và 5");
        }
    }
}
