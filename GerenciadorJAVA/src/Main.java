import java.util.ArrayList;
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
            if (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4") && !option.equals("5")) {
                System.out.println("Operação não reconhecida");
            } else {
                switch (option) {
                    case "1":
                        boolean ativoadd = true;
                        while (ativoadd) {
                            System.out.println("===Gerenciador de Estoque===");
                            System.out.println("Digite o nome do produto para adicionar à lista:");
                            String add = scanner.nextLine();
                            Estoque.add(add);
                            System.out.println("O item " + add + "foi adicionado á lista");
                            System.out.println(Estoque);
                            System.out.println("Você deseja adicionar algo mais?\n" +
                                    "Sim\n" +
                                    "Não");
                            String yesno = scanner.nextLine();
                            if (yesno.equals("Não") || yesno.equals("não") || yesno.equals("nÃO") || (yesno.equals("Nao") || yesno.equals("nao") || yesno.equals("no") || yesno.equals("nAO"))) {

                                ativoadd = false;
                            }
                        }
                        break;
                    case "2":
                        System.out.println("===Gerenciador de Estoque===");
                        System.out.println("Estoque: " + Estoque);
                        break;
                    case "3":
                        boolean ativoremove = true;
                        while (ativoremove) {
                            System.out.println("===Gerenciador de Estoque===");
                            System.out.println("Diga a localização do item a ser removido: ");
                            System.out.println(Estoque);
                            String remove = scanner.nextLine();
                            int RemoveItem = Integer.parseInt(remove) - 1;
                            if (RemoveItem < 0 || RemoveItem >= Estoque.size()) {
                                System.out.println("Valor Invalido");
                                break;
                            }
                            Estoque.remove(RemoveItem);
                            System.out.println("Estoque Atualizado: ");
                            System.out.println(Estoque);
                            System.out.println("Você deseja remover algo mais?\n" +
                                    "Sim\n" +
                                    "Não");
                            String yesno = scanner.nextLine();
                            if (yesno.equals("Não") || yesno.equals("não") || yesno.equals("nÃO") || (yesno.equals("Nao") || yesno.equals("nao") || yesno.equals("no") || yesno.equals("nAO"))) {

                                ativoremove = false;
                            }
                        }
                        break;
                    case "4":
                        boolean ativoedit = true;
                        while (ativoedit) {
                        System.out.println("===Gerenciador de Estoque===");
                        System.out.println("Diga a localização do item a ser alterado: ");
                        System.out.println(Estoque);
                        String alter = scanner.nextLine();
                        int AlterItem = Integer.parseInt(alter) - 1;
                        if (AlterItem < 0 || AlterItem >= Estoque.size()) {
                            System.out.println("Valor Invalido");
                            break;
                        } else {
                            System.out.println("Digite o novo nome: ");
                            String New = scanner.nextLine();
                            Estoque.set(AlterItem, New);
                            System.out.println("Estoque atualizado:");
                            System.out.println(Estoque);
                            System.out.println("Você deseja alterar algo mais?\n" +
                                    "Sim\n" +
                                    "Não");
                            String yesno = scanner.nextLine();
                            if (yesno.equals("Não") || yesno.equals("não") || yesno.equals("nÃO") || (yesno.equals("Nao") || yesno.equals("nao") || yesno.equals("no") || yesno.equals("nAO"))) {

                                ativoedit = false;
                                break;
                            }
                        }


                        }
                        break;
                    case "5":
                        System.out.println("Você deseja sair?\n" +
                                "Sim\n" +
                                "Não");
                        String yesno = scanner.nextLine();
                        if (yesno.equals("Sim") || yesno.equals("sim") || yesno.equals("SIM") || yesno.equals("sIM")) {
                            // Your code here for when the condition is true
                            ativo = false;
                            break;
                        }


                }

            }
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.


        }
    }
}