package ra;

public class Exercise06 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hai mươi số nguyên tố đầu tiên: ");
        int count=0;
        for (int i = 2; i < 100; i++) {
            if(isPrime(i)){
                count++;
                if(count<=20) {
                    System.out.print(i+" ");
                }
            }
        }

    }
}
