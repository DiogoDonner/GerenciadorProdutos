import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> Estoque = new ArrayList<>();
        boolean ativo = true;
        while (ativo) {
            System.out.println("===Gerenciador de Estoque===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escolha as opções\n" +
                    "1 - Adicionar Item no Estoque\n" +
                    "2 - Ver Lista \n" +
                    "3 - Remover Item no Estoque\n" +
                    "4 - Alterar Produto\n" +
                    "5 - Sair");
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("===Gerenciador de Estoque===");
                    System.out.println("Digite o nome do produto para adicionar à lista:");
                    String add = scanner.nextLine();
                    Estoque.add(add);
                    System.out.println("O item " + add + "foi adicionado á lista");
                    System.out.println(Estoque);
                    break;
                case "2":
                    System.out.println("===Gerenciador de Estoque===");
                    System.out.println("Estoque: " + Estoque);
                    break;
                case "3":
                    System.out.println("===Gerenciador de Estoque===");
                    System.out.println("Diga a localização do item a ser removido: ");
                    System.out.println(Estoque);
                    String remove = scanner.nextLine();
                   int RemoveItem = Integer.parseInt(remove)-1;
                   Estoque.remove(RemoveItem);
                   System.out.println("Estoque Atualizado: ");
                   System.out.println(Estoque);
                   break;
                case "4":
                    System.out.println("===Gerenciador de Estoque===");
                    System.out.println("Diga a localização do item a ser alterado: ");
                    System.out.println(Estoque);
                    String alter = scanner.nextLine();
                    System.out.println("Digite o novo nome: ");
                    String New = scanner.nextLine();
                    int AlterItem = Integer.parseInt(alter)-1;
                    Estoque.set(AlterItem,New);
                    System.out.println("Estoque atualizado:");
                    System.out.println(Estoque);
                    break;
                case "5":
                    System.out.println("Você deseja sair?\n" +
                            "Sim\n" +
                            "Não");
                    String yesno = scanner.nextLine();
                    ativo=false;
                    break;





            }

        }
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



    }
}