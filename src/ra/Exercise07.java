package ra;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-Mời bạn chọn chức năng 1 hoặc 2 hoặc 3 hoặc 4-" +
                    " \n1: Kiểm tra tính chẵn lẻ của một số" +
                    " \n2: Kiểm tra số nguyên tố" +
                    " \n3: Kiểm tra một số có chia hết cho 3 không" +
                    " \n4: Thoát");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Mời bạn nhập một số nguyên dương");
                    int n = sc.nextInt();
                    if (checkEven(n)) {
                        System.out.println(n + ": là số chẵn");
                    } else {
                        System.out.println(n + ": là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Mời bạn nhập vào một số nguyên dương");
                    int m = sc.nextInt();
                    if (isPrime(m)) {
                        System.out.println(m + ": là số nguyên tố");
                    } else {
                        System.out.println(m + ": không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Mời bạn nhập số nguyên dương");
                    int x = sc.nextInt();
                    if (isDivisible3(x)) {
                        System.out.println(x + ": chia hết cho 3");
                    } else {
                        System.out.println(x + ": không chia hết cho 3");
                    }
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }while (choice!=4);
    }
    public static boolean checkEven(int num){
        return num%2==0;
    }
    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isDivisible3(int num){
        return num%3==0;
    }
}
