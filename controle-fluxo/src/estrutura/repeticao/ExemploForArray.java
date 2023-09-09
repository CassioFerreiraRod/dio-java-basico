package estrutura.repeticao;
import java.util.ArrayList;
import java.util.List;

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

    List<String> pizza = new ArrayList<>();
    pizza.add("Calabreza");
    pizza.add("Napolitana");
    pizza.add("4 Queijos");
    pizza.add("Frango com catupiri");

    pizza.forEach(sabores -> System.out.println("Temos sabor de " + sabores));
  }
}
