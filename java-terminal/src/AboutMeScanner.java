import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
  public static void main(String[] args) {
    // criando o objeto Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome:");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome:");
    String sobrenome = scanner.next();

    System.out.println("Qual sua idade:");
    int idade = scanner.nextInt();

    System.out.println("Qual sua altura");
    double altura = scanner.nextDouble();

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " anos ");
    System.out.println("Minha altura é " + altura + "cm ");
  }
}
