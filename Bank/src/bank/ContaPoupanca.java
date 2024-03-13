package bank;

public class ContaPoupanca extends Conta{
 
    void atualiza(double taxa){
       super.atualiza(taxa*3);
    }
    
    void deposita(double valor){
        super.deposita(valor);
    }
    
}
