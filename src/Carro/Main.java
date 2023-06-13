package Carro;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe a marca do carro: ");
    String marcaCarro = inputUsuario.next();
    System.out.println("Informe o modelo do carro: ");
    String modeloCarro = inputUsuario.next();
    System.out.println("Informe a quantidade de portas: ");
    int qtdPortas = inputUsuario.nextInt();
    System.out.println("Informe a potência do carro (opcional): ");
    double potCarro = inputUsuario.nextDouble();

    Carro novoCarro = new Carro(marcaCarro, modeloCarro, qtdPortas, potCarro);

    System.out.println("Deseja ligar o carro? sim ou não");
    String statusCarro = inputUsuario.next();

    if(statusCarro.equals("sim")){
      novoCarro.ligarCarro();
    } else if (statusCarro.equals("não")) {
      novoCarro.desligarCarro();
    }

  }
}
