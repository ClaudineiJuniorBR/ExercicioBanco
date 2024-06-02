import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        System.out.println("MENU: ");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Encerrar");

        while (continuar) {
            System.out.println("Qual é a sua opção? ");
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Qual valor deseja depositar ? ");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("Saldo atual R$ %.1f \n", saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja sacar ?");
                    double valorSacar = scanner.nextDouble();
                    if (valorSacar < saldo) {
                        saldo = saldo - valorSacar;
                        System.out.printf("Saldo atual R$ %.1f \n", saldo);
                    } else if (valorSacar > saldo) {
                        System.out.println("Saldo insuficiente !, tente novamente.");
                        System.out.printf("Saldo atual R$ %.1f \n", saldo);
                    } else {
                        System.out.println("ERRO NO PROGRAMA, TENTE NOVAMENTE.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual R$ %.1f \n", saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}