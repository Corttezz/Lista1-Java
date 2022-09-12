//Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
//trabalhadas no mês.Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) throws Exception {
        int gainPerHour;
        int hoursOfWorkMonth;
        int salario;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite seu ganho por hora:");
        gainPerHour = tc.nextInt();
        System.out.println("Digite quantas horas você trabalha por mês: ");
        hoursOfWorkMonth = tc.nextInt();
        tc.close();
        salario = gainPerHour * hoursOfWorkMonth;
        System.out.println("Seu salário é de: " + salario);

    }
}
