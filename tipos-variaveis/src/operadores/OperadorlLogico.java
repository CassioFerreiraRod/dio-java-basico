package operadores;

public class OperadorlLogico {
  public static void main(String[] args) {
    boolean condição1 = true;
    boolean condição2 = true;

    if (condição1 && condição2) {
      System.out.println("As duas condições são verdadeiras.");
    } else if (condição1 || condição2) {
      System.out.println("Uma das condições é verdadeira.");
    }

    System.out.println("FIM");
  }
}
