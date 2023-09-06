import java.lang.Math;
public class VariaveisEMetodos {
  public static void main(String[] args) {
    String meuNome = "Cassio";
    int anoDeFabricacao = 2023;

    boolean verdadeira = true;

    anoDeFabricacao = 2018;

    String primeiroNome = meuNome;
    String segundoNome = "Ferreira";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

    double areaCirculo  = calcularArea(12);
    System.out.println("A área do circulo é: " + Math.round(areaCirculo));
    
  }
  /* ----------------Métodos------------------ */
  public static String nomeCompleto (String primeiroNome, String segundoNome) {
      return "Resultado do métdo " + primeiroNome.concat(" ").concat(segundoNome);
  }

  public static double calcularArea (int r) {
    return Math.PI * Math.pow(r, 2);
  } 
}
