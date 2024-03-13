package bank;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Deposite na conta : ");
        c.deposita(scan.nextDouble());
        
        System.out.println("Digite o valor da taxa da conta : ");
        c.atualiza(scan.nextDouble());
        
        System.out.println("Deposite na conta corrente: ");
        cc.deposita(scan.nextDouble());
        
        System.out.println("Digite o valor da taxa da conta corrente: ");
        cc.atualiza(scan.nextDouble());
        
        System.out.println("Deposite na conta poupanca: ");
        cp.deposita(scan.nextDouble());
        
        System.out.println("Digite o valor da taxa da conta poupanca: ");
        cp.atualiza(scan.nextDouble());
        

        
        System.out.println("O saldo atualizado da conta e: "+c.getSaldo()+"O saldo atualizado da conta corrente e de: "+cc.getSaldo()+" e o da poupanca e de: "+cp.getSaldo());
        
        //Após imprimir o saldo (getSaldo()) de cada uma das contas o saldo atualizado aparece.
        //Conta: 1100, Conta Corrente: 1200, Conta Poupança: 1300.
    }
    
}
