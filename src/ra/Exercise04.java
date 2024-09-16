package ra;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập một số nguyên dương");
        int n = sc.nextInt();
        int tongSoChan=0;
        for(int i = 1; i <= n; i++) {
            if(i%2==0){
                tongSoChan += i;
            }
        }
        System.out.println(tongSoChan);
    }
}
