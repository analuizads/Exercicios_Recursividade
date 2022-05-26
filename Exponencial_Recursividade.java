import java.util.Scanner;
public class Exponencial_Recursividade {

    public static int Exponencial(int base, int expoente){

        if(expoente == 0){
            return 1;
        }
        else if(expoente > 0){
            return base*Exponencial(base, expoente-1);
        }
        else{
            return 1/(base*Exponencial(base, expoente-1));
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int base, expoente, calc;

        System.out.print("Entre com o valor da base: ");
        base = sc.nextInt();

        System.out.print("Entre com o valor do expoente: ");
        expoente = sc.nextInt();

        calc = Exponencial(base, expoente);

        System.out.printf("%d elevado a %d é igual a %d.", base, expoente, calc);

        sc.close();

    }
    
}
