package ra;

import java.util.Scanner;

public class Exercise08 {
    public static boolean isTriangular(float a, float b, float c) {
        if((a+b>c) && (a+c>b) && (b+c>a)){
            return true;
        }
        return false;
    }
    public static float chuVi(float a, float b, float c) {
        return a+b+c;
    }
    public static double dienTich(float a, float b, float c) {
        float p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Mời bạn nhập 3 cạnh của tam giác");
            System.out.println("Cạnh thứ nhất: ");
            float a = sc.nextFloat();
            System.out.println("Cạnh thứ hai: ");
            float b = sc.nextFloat();
            System.out.println("Cạnh thứ ba: ");
            float c = sc.nextFloat();
            if(isTriangular(a, b, c)) {
                float chuVi = chuVi(a, b, c);
                double dienTich= dienTich(a, b, c);
                System.out.println("Chu vi hình tam giác: "+chuVi);
                System.out.println("Diện tích hình tam giác: "+dienTich);
                break;
            }else {
                System.out.println("Không thỏa mãn điều kiện hình tam giác, xin vui lòng nhập lại");
            }
        }
    }
}
