package Pessoa;
public class Pessoa {
  String nome;
  Integer idade;
  Double peso;
  Double altura;

  public Pessoa(String nome, Integer idade, Double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = 0.0;
    this.altura = altura;
  }

  public Pessoa(String nome, Integer idade, Double peso, Double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public void mostrarPessoa() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Peso: " + peso);
    System.out.println("Altura: " + altura);
  }

  public void envelhecer() {
    this.idade++;
    if(this.idade <= 21) {
      this.altura += 0.05;
    }
  }

  public  void engordar(double pesoGanho) {
    this.peso += pesoGanho;
  }

  public  void emagrecer(double pesoPerdido) {
    this.peso -= pesoPerdido;
  }

  public void crescer() {
  }

}
