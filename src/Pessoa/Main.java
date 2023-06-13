package Pessoa;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe seu nome: ");
    String respNome = inputUsuario.next();
    System.out.println("Informe a sua idade: ");
    Integer respIdade = inputUsuario.nextInt();
    System.out.println("Informe o seu peso (opcional): ");
    Double respPeso = inputUsuario.nextDouble();
    System.out.println("Informe a sua altura: ");
    Double respAltura = inputUsuario.nextDouble();

    Pessoa pessoa1 = new Pessoa(respNome, respIdade, respPeso, respAltura);

    pessoa1.mostrarPessoa();
    pessoa1.envelhecer();
    pessoa1.engordar(4.5);
    pessoa1.emagrecer(1.2);
    pessoa1.crescer();

    System.out.println("\nInformações atualizadas");
    pessoa1.mostrarPessoa();

  }
}
