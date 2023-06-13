package ContaCorrente;

public class Conta {
  Integer numeroConta;
  String nomeCorrentista;
  Double saldo;

  Double saque;


  public Conta(Integer numeroConta, String nomeCorrentista) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = 0.0;
  }

  public Conta(Integer numeroConta, String nomeCorrentista, Double saldo ) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = saldo;
  }

  public void extratoConta() {
    System.out.println("Número da conta: " + numeroConta);
    System.out.println("Nome do cliente: " + nomeCorrentista);
    System.out.println("Saldo atual: R$" + saldo);
  }

  public double depositoConta() {
    double valorDepositado = 0;
    double novoSaldo = saldo + valorDepositado;
    return novoSaldo;
  }

  public double saqueConta(double valorASacar) {
    if(valorASacar > saldo){
      System.out.println("Saldo insuficiente!!\n");
    } else {
      saldo = saldo - valorASacar;
    }
    return saldo;
  }
}
