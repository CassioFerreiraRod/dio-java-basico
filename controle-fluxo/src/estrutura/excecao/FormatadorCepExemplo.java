package estrutura.excecao;

public class FormatadorCepExemplo {
  public static void main(String[] args) {

    try {
      String cepFormatado = formatarCep("2376064");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("Cep não corresponde as regras de negócio.");
    }

  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    // simulando um cep formatado
    return "23.765-064";
  }
}
