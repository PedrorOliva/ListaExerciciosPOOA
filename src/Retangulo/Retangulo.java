package Retangulo;

public class Retangulo {
  Double comprimento;
  Double largura;

  public Retangulo(Double comprimento, Double largura) {
    this.comprimento = comprimento;
    this.largura = largura;
  }

  public void retornaValorLados() {
    System.out.println("Comprimento: " + comprimento);
    System.out.println("Largura: " + largura);
  }

  public double calculaArea() {
    double area = comprimento * largura;
    System.out.println("Area do retângulo: " + area);
    return  area;
  }

  public double calculaPerimetro() {
    double perimetro = comprimento + largura;
    System.out.println("Perímetro do retângulo: " + perimetro);
    return perimetro;
  }

}
