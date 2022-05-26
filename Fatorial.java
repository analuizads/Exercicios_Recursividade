import java.util.Scanner;
public class Fatorial{

    public static int fatRecursivo(int n){

        if(n==1 || n==0){
            return 1;
        }
        else{
            return (n*fatRecursivo(n-1));
        }
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        int fat;

        System.out.print("Entre com o número a ser calculado o fatorial: ");
        n = sc.nextInt();

       fat = fatRecursivo(n);

        System.out.printf("O fatorial de %d é %d", n, fat);

        sc.close();

    }
}