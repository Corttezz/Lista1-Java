import java.util.Scanner;

//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
//rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
//que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
// tem quepagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um
//programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na 
// excesso a quantidade de quilos além do limite e na variável multa o valor 
//da multa que João deverá pagar. Imprima os dados do programa com as mensagens 
//adequadas.

 public class Ex014 {
    public static void main(String[] args) throws Exception {
        double peso;
        double excedente;
        int valor;
        System.out.println("Digite o peso dos peixes: ");
        Scanner tc = new Scanner(System.in);
        peso = tc.nextDouble();
        tc.close();
        if(peso - 50 > 0){
            excedente = peso - 50;
        }else{
            excedente= 0;
        }
        System.out.println("O peso excedente é de: "+excedente+"Kg");
        valor = (int) (excedente * 4);
        System.out.println("e o valor a ser pago é de: R$" + valor+",00");
    }
}
