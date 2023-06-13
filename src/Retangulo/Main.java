package Retangulo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe o valor do comprimento: ");
    double comprimetoValor = inputUsuario.nextDouble();
    System.out.println("Informe o valor da largura: ");
    double larguraValor = inputUsuario.nextDouble();

    Retangulo novoRetangulo = new Retangulo(comprimetoValor, larguraValor);

    System.out.println("Os valores fornecidos: ");
    novoRetangulo.retornaValorLados();
    System.out.println("\nCalculando a área do retangulo: ");
    novoRetangulo.calculaArea();
    System.out.println("\nCalculando o perímetro do retangulo: ");
    novoRetangulo.calculaPerimetro();


  }
}
