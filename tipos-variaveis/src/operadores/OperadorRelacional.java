package operadores;

public class OperadorRelacional {
  public static void main(String[] args) {

    String nome = "Cassio";
    String nome2 = new String("Ferreira");

    System.out.println(nome.equals(nome2));

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if (numero1 < numero2) {
      System.out.println("A nossa condição é verdadeira \n");
    }

    System.out.println("numero1 é igual a numero2? \n" + simNao);

    simNao = numero1 != numero2;

    System.out.println("numero1 é diferente a numero2? \n" + simNao);

    simNao = numero1 > numero2;

    System.out.println("numero1 é maior que numero2? \n" + simNao);

    simNao = numero1 < numero2;

    System.out.println("numero1 é menor que numero2? " + simNao);
  }
}
