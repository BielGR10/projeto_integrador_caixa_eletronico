package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        float saldoConta = 0f, deposito = 0f, saque = 0f;

        do {
            System.out.println("""
                    ----------CAIXA ELETRONIC0----------
                    1 - Consultar Saldo
                    2 - Realizar Depósito
                    3 - Realizar Saque
                    4 - Sair
                    """);
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Seu saldo é de: \nR$"+saldoConta+"\n");
                    break;

                case 2:
                    System.out.print("Qual valor do depósito desejado? \nR$");
                    deposito = input.nextFloat();
                    if (deposito <= 0){
                        System.out.println("Depósito inválido.\n");
                    }else {
                        saldoConta += deposito;
                        System.out.println("Depósito de R$"+deposito+" feito.\n");

                    }
                    break;

                case 3:
                    System.out.print("Qual valor do saque desejado? \nR$");
                    saque = input.nextFloat();
                    if (saque > saldoConta){
                        System.out.println("Saldo insuficiente.\n");
                    }else {
                        saldoConta -= saque;
                        System.out.println("Saque sucedido.\n");
                    }
                    break;

                case 4:
                    System.out.println("Sistema encerrando.");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE.\n");
                    break;
            }
        }while (escolha != 4);

    }
}
