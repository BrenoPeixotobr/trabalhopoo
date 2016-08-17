import java.util.Scanner;
//import backend.Telefone;

public class Testa {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer user = 4;

    do {
      System.out.println("\n0 - Sair\n1 - Inserir\n2 - Atualizar\n3 - Deletar");
      user = ler.nextInt();
      switch(user){
        case 0:
          break;
        case 1:
          //insere();
          Funcionario f = new Funcionario();
          f.Imprime();
          break;
        case 2:
          //Update();
          break;
        case 3:
          //delete();
          break;
        default:
          System.out.println("Opcao invalida!\n");
      }
    }while(user != 0);

  }
}
