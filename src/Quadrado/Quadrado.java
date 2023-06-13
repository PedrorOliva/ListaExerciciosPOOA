package Quadrado;

public class Quadrado {
  Double tamanhoLado;

  public void mudarValorLado(double tamanhoLado){
    System.out.println("Novo tamanho do quadrado: " + tamanhoLado);
  }
  public void retornarValorLado() {
    System.out.println("Lado do quadrado: " + tamanhoLado);
  }
  public double calcularArea(double tamanhoLado){
   double areaQuadrado = tamanhoLado * tamanhoLado;
    System.out.println("A area do quadrado é: " + areaQuadrado);
    return areaQuadrado;
  }
}
