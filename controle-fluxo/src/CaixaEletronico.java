public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicidado = 27.0;

    if (valorSolicidado < saldo) {
      saldo -= valorSolicidado;
    }

    System.out.println(saldo);
  }
}
