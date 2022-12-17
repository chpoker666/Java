package lol;

public class Practice5 {

    private static void isPrime(int number) {isPrime(number, 2);}
    private static void isPrime(int number, int div){
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if(number % div == 0) {
            System.out.println("NO");
            return;
        }
        if(div > Math.sqrt(number)){
            System.out.println("YES");
            return;
        }
        isPrime(number, div+1);
    }


    private static boolean isNumPrime(int number){
        return isNumPrime(number, 2);
    }
    private static boolean isNumPrime(int number, int div){
        if(number == 2) return true;
        if(number % div == 0) {
            return false;
        }
        if(div > Math.sqrt(number)){
            return true;
        }
        return isNumPrime(number, div+1);
    }

    private static void factorization(int number) {factorization(number, 2);}
    private static void factorization(int number, int div){
        if(number == 2) {
            System.out.println("2");
            return;
        }
        if(number <= 1) return;
        if(!isNumPrime(div)) {
            factorization(number, div+1);
            return;
        }
        if(number % div == 0){
            System.out.print(div +", ");
            factorization(number / div, div);
        }else factorization(number, div+1);
    }


    private static void isPalindrome(String s){
        if(s.length() == 1){
            System.out.println("YES"); return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO"); return;
        }
        if(s.length()==2){
            System.out.println("YES"); return;
        }
        isPalindrome(s.substring(1, s.length()-1));
    }


    private static int count(int a, int b){
        if(a==0) return 1;
        if(a==1) return b+1;
        if(a>1 && b==0) return 0;
        return count(a-1, b-1) + count(a, b-1);
    }


    private static int revers(int num, int rev){
        if(num==0)return rev;
        return revers(num/10, 10*rev + num%10);
    }


    public static void main(String[] args) {

        System.out.println("\nEx6: Простые числа");
        isPrime(2);
        isPrime(18756);
        isPrime(3571);

        System.out.println("\nEx7: Разложение на множители");
        factorization(525);
        System.out.println();
        factorization(777);
        System.out.println();
        factorization(360);
        System.out.println();
        factorization(2);

        System.out.println("\nEx8: Палидром");
        isPalindrome("hellolleh");
        isPalindrome("heloeh");
        isPalindrome("h");

        System.out.println("\nEx9: Нули");
        System.out.println(count(0,0));
        System.out.println(count(1,3));
        System.out.println(count(14,15));

        System.out.println("\nEx10: Разворот числа");
        System.out.println(revers(123,0));
        System.out.println(revers(1, 0));
        System.out.println(revers(9968123, 0));
    }
}
