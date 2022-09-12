// Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//o produto do dobro do primeiro com metade do segundo .
//a soma do triplo do primeiro com o terceiro.
//o terceiro elevado ao cubo
import java.util.Scanner;
import java.lang.Math;

public class Ex011 {
    public static void main(String[] args) throws Exception {
        int intNumb1;
        int intNumb2;
        double dbNum1;
        double conta1;
        double conta2;
        double conta3;

        System.out.println("Digite dois numeros inteiros: ");
        Scanner tc = new Scanner(System.in);
        intNumb1 = tc.nextInt();
        intNumb2= tc.nextInt();
        System.out.println("Digite um número real: ");
        dbNum1 = tc.nextDouble();
        tc.close();

        conta1 = (intNumb1*2) * (intNumb2/2);
        conta2 = (intNumb1*3) + (dbNum1);
        conta3= Math.pow(dbNum1, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo é de: " + conta1);
        System.out.println("a soma do triplo do primeiro com o terceiro é de: "+ conta2);
        System.out.println("o terceiro elevado ao cubo é igual a: "+ conta3);
    }
}
