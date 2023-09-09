package estrutura.repeticao;

import java.util.Random;

public class TesteDoWhile {

  public static void main(String[] args) {
    System.out.println("Din-Don");

    do {
      System.out.println("Tocando campainha.");
    } while (campainha());
  }

  private static boolean campainha() {
    int valor = new Random().nextInt(3);
    boolean atendeu = valor == 1;
    System.out.println(valor + " Atendeu? " + atendeu);
    return !atendeu;
  }
}
