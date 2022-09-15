//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link 
//de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este
// link (em minutos).
import java.util.Scanner;

class Ex018 {
  public static void main(String[] args) {
    double tamanhoMb, internetMbps, tempoDownloadMinutes;
    Scanner tc = new Scanner(System.in);

    System.out.println("Digite o tamanho do arquivo em MB: ");
    tamanhoMb = tc.nextDouble();
    System.out.println("Digite sua velocidade de internet em Mbps: ");
    internetMbps = tc.nextDouble();
    tc.close();

    tempoDownloadMinutes = (tamanhoMb/(internetMbps/8))/60;

    System.out.println("A instalação será concluida em " + tempoDownloadMinutes + " minutos");
  }
}
