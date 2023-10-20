import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
      // Lê o tipo de cofre (primeira linha da entrada)
      Scanner scanner = new Scanner(System.in);
      String tipoCofre = scanner.nextLine();
      
      // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
      if (tipoCofre.equalsIgnoreCase("digital")) {
         int senha =  scanner.nextInt();
         CofreDigital cofre = new CofreDigital(senha);
         
         int confirmacaoSenha = scanner.nextInt();
         
         boolean senhaValida = cofre.validarSenha(confirmacaoSenha);
         
         cofre.imprimirInformacoes(senhaValida);
         
    }else{
        CofreFisico cofre = new CofreFisico();
        cofre.imprimirInformacoes();
     }
      
  }

}