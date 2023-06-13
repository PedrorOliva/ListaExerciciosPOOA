package bola;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inputUsuario = new Scanner(System.in);

    System.out.println("Informe a circunferencia da bola: ");
    double respCircunferencia = inputUsuario.nextDouble();
    System.out.println("Informe a cor da bola: ");
    String respCor = inputUsuario.next();
    System.out.println("Informe a marca da bola: ");
    String respMarca = inputUsuario.next();
    System.out.println("Informe o material da bola: ");
    String respMaterial = inputUsuario.next();
    System.out.println("Informe a velocidade da bola: ");
    double respVelocidade = inputUsuario.nextDouble();

    Bola bola1 = new Bola(respCircunferencia, respCor, respMarca, respMaterial, respVelocidade);

    bola1.mostraBola();
    bola1.mostraCor();

    System.out.println("Informe a nova cor da bola: ");
    String respNovaCor = inputUsuario.next();

    Bola bolaNovaCor = new Bola(respNovaCor);
    bolaNovaCor.trocaCor();

  }
}
