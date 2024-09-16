package ra;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên bất kỳ từ 0-9");
        int n = Integer.parseInt(sc.nextLine());
        if(n==0){
            System.out.println("Số không");
        }else if(n==1){
            System.out.println("Số một");
        }else if(n==2){
            System.out.println("Số hai");
        }else if(n==3){
            System.out.println("Số ba");
        }else if(n==4){
            System.out.println("Số bốn");
        }else if(n==5){
            System.out.println("Số năm");
        }else if(n==6){
            System.out.println("Số sáu");
        }else if(n==7){
            System.out.println("Số bảy");
        }else if(n==8){
            System.out.println("Số tám");
        }else if(n==9) {
            System.out.println("Số chín");
        }
    }
}
