package bola;

public class Bola {
  Double circunferencia;
  String cor;
  String marca;
  String material;
  Double velocidade;
  String novaCor;

  public Bola(Double circunferencia, String cor, String marca, String material, Double velocidade) {
    this.circunferencia = circunferencia;
    this.cor = cor;
    this.marca = marca;
    this.material = material;
    this.velocidade = velocidade;

  }

  public void mostraBola(){
    System.out.println("-----Informações da bola-----");
    System.out.println("Circunferência: " + circunferencia);
    System.out.println("Cor: " + cor);
    System.out.println("Marca: " + marca);
    System.out.println("Material: " + material);
    System.out.println("Velocidade: " + velocidade);
  }

  public void mostraCor() {
    System.out.println("A cor da bola é: " + cor);
  }

  public Bola(String novaCor) {
    this.novaCor = novaCor;
  }

  public void trocaCor() {
    System.out.println("Nova cor da bola: " + novaCor);
  }
}
