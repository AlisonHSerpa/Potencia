import java.util.Scanner;

public class Calcular_Pot {
    public static int multiplicar (int multiplicando, int multiplicador){
        int resultado = 0;

        for (int i=0 ;i<multiplicador ;i++){
            resultado += multiplicando;
        }
        return resultado;
    }

    public static int potencia (int base, int expoente){
        int resultado = base;

        if (expoente == 0){
            return 1;
        }
        for (int i= 1 ; i<expoente ;i++){
            resultado = multiplicar(resultado, base);
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma base:");
        int base = sc.nextInt();

        System.out.println("digite um expoente:");
        int expoente = sc.nextInt();
        
        System.out.println("o resultado eh:");
        System.out.println(potencia(base, expoente));

        //System.out.println(potencia(2,4));
        //System.out.println(potencia(2,3));
        //System.out.println(potencia(7,3));
        sc.close();
    }
}
