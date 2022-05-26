import java.util.Scanner;
public class Fibonacci_Recursividade{

    public static int fiboRecursivo(int n){

        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return((fiboRecursivo(n-1)) +(fiboRecursivo(n-2)));
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        int fibo;

        System.out.print("Entre com o valor da posição: ");
        n = sc.nextInt();

        fibo = fiboRecursivo(n);

        System.out.printf("(%d) = %d", n, fibo);

        sc.close();

    }
}