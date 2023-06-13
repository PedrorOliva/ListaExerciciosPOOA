package Quadrado;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe o tamanho do quadrado: ");
    double tamanhoDoQuadrado = inputUsuario.nextDouble();

    Quadrado novoQuadrado = new Quadrado();

    System.out.println("Qualculando área do quadrado: ");
    novoQuadrado.calcularArea(tamanhoDoQuadrado);

    System.out.println("Deseja mudar o tamanho do quadrado? sim ou não");
    String resposta = inputUsuario.next();

    if(resposta.equals("sim")) {
      System.out.println("Informe o novo tamanho do quadrado: ");
      double novoTamanho = inputUsuario.nextDouble();
      novoQuadrado.mudarValorLado(novoTamanho);
    } else if(resposta.equals("não")) {
      System.out.println("O programa encerra aqui!");
    }
  }
}
