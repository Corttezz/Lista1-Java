//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, 
//sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% 
//para o sindicato, faça um programa que nos dê:
//salário bruto.
//quanto pagou ao INSS.
//quanto pagou ao sindicato.
//o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//+ Salário Bruto : R$
//- IR (11%) : R$
//- INSS (8%) : R$
//- Sindicato ( 5%) : R$
//= Salário Liquido : R$
import java.util.Scanner;
public class Ex015 {
    public static void main(String[] args) throws Exception {
        double gainPerHour;
        double hoursOfWorkMonth;
        double salario;
        double taxaIR;
        double taxaINSS;
        double taxaSindicato;
        double salarioLiquido;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite seu ganho por hora:");
        gainPerHour = tc.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        hoursOfWorkMonth = tc.nextDouble();
        tc.close();
        salario = gainPerHour * hoursOfWorkMonth;
        taxaIR = salario * 0.11;
        taxaINSS = salario * 0.08;
        taxaSindicato= salario * 0.05;
        salarioLiquido= salario - taxaINSS - taxaIR - taxaSindicato;
        System.out.println("Seu salário é bruto é de: " + salario + " reais");
        System.out.println("Foi pago para o IR: " + taxaIR + " reais");
        System.out.println("Foi pago para o INSS: " + taxaINSS+ " reais");
        System.out.println("Foi pago para o sindicato: "+ taxaSindicato+ " reais");
        System.out.println("Com os descontos, seu salário líquido é de: "+salarioLiquido+ " reais");


    }
}
