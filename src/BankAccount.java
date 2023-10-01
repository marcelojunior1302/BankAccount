import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        String home = """
                ***********************************
                Dados iniciais do cliente:
                                
                Nome:           Mano Menezes
                Tipo conta:     Corrente
                Saldo inicial:  R$ 2500,00
                ***********************************
                                
                """;
        System.out.println(home);

        double balance = 2500.00;
        int selectedNumber;
        Scanner scanner = new Scanner(System.in);
        double receiveAmount;
        double transfer;

        do {
            String options = """
                    Operações
                                        
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4 - Sair
                                        
                    Digite a opção desejada:
                    """;
            System.out.println(options);
            selectedNumber = scanner.nextInt();

            switch (selectedNumber) {
                case 1: {
                    System.out.printf("O saldo atual é R$ %.2f%n%n", balance);
                    break;
                }
                case 2: {
                    System.out.println("Informe o valor a receber: ");
                    receiveAmount = scanner.nextDouble();

                    balance += receiveAmount;
                    System.out.printf("Saldo atualizado R$ %.2f%n%n", balance);
                    break;
                }
                case 3: {
                    System.out.println("Informe o valor que deseja transferir: ");
                    transfer = scanner.nextDouble();
                    if(transfer > balance) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        System.out.println();
                    }
                    else {
                        balance -= transfer;
                        System.out.printf("Saldo atualizado R$ %.2f%n%n", balance);
                    }
                    break;
                }
                case 4: {
                    break;
                }

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (selectedNumber != 4);
    }
}
