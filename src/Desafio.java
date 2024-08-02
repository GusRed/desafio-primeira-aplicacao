import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCompleto = "Gustavo Almeida de Souza";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("***************************************************");
        System.out.println("Dados iniciais do cliente\n");
        System.out.println("Nome:               " + nomeCompleto);
        System.out.println("Tipo conta:         " + tipoConta);
        System.out.println("Saldo inicial:      R$ " + saldo);
        System.out.println("***************************************************");

        String menu = """
                \nOperações
                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """;

        while (opcao != 4) {
            System.out.print(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double valorRecebido = leitura.nextDouble();

                    saldo += valorRecebido;

                    System.out.println("Saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorTransferido = leitura.nextDouble();

                    if (valorTransferido > saldo){
                        System.out.println("Não há saldo suficiente para fazer a transferência");
                    } else {
                        saldo -= valorTransferido;
                        System.out.println("Saldo atualizado: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Aplicação encerrada");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }

        }

    }

}
