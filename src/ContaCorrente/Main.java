package ContaCorrente;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);
    int numeroConta = 0;
    double valorDepositado = 0.0;
    double valorSaque = 0.0;
    String nomeCliente;

    System.out.println("Informe o número da conta: ");
    numeroConta = inputUsuario.nextInt();
    System.out.println("Informe o nome do correntista: ");
    nomeCliente = inputUsuario.next();

    System.out.println("\nEfetuar o primeiro depósito\n");
    System.out.println("Digite o valor que deseja depositar: ");
    valorDepositado = inputUsuario.nextDouble();

    Conta novaConta = new Conta(numeroConta, nomeCliente, valorDepositado);
    novaConta.depositoConta();
    novaConta.extratoConta();

    System.out.println("Quanto deseja sacar? ");
    valorSaque = inputUsuario.nextDouble();
    novaConta.saqueConta(valorSaque);
    novaConta.extratoConta();


  }
}