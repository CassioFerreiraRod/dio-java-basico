public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

    String carro[] = { "Ar-condicionado", "Direção elétrica", "4 portas", "Freio ABS" };

    for (String aluno : alunos) {
      System.out.println("O nome do aluno é: " + aluno);
    }
    System.out.println();
    for (String componentes : carro) {
      System.out.println("O carro tem: " + componentes);
    }
  }
}
