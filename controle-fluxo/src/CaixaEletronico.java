public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicidado = 22.0;

    if (valorSolicidado < saldo) {
      saldo -= valorSolicidado;
      System.out.println("O novo saldo é:" + saldo);
    } else
      System.out.println("Saldo insulficiente.");

  }
}
