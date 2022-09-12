import java.util.Scanner;

//Faça um  Programa que peça um número e então mostre a mensagem O número informado 
//foi [número].
public class Ex002 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número:");
        double numero;
        Scanner tc = new Scanner(System.in);
        numero = tc.nextDouble();
        tc.close();
        System.out.println("O número digitado foi: " + numero);

    }
}
