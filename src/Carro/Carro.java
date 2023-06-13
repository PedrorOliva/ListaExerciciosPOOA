package Carro;

public class Carro {

  String marca;
  String modelo;
  Integer quantidadePortas;


  Double potencia;

  public Carro( String marca, String modelo,Integer quantidadePortas, Double potencia) {
    this.quantidadePortas = quantidadePortas;
    this.modelo = modelo;
    this.marca = marca;
    this.potencia = potencia;
  }

  public Carro(String marca, String modelo,Integer quantidadePortas) {
    this.quantidadePortas = quantidadePortas;
    this.modelo = modelo;
    this.marca = marca;
    this.potencia = 0.0;
  }

  public void ligarCarro() {
    System.out.println("O carro está ligado!!");
  }

  public  void desligarCarro() {
    System.out.println("O carro está desligado!!");
  }
}
