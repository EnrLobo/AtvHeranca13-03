package bank;

public class ContaCorrente extends Conta {
    
    void atualiza(double taxa){
       super.atualiza(taxa*2);
    }
    
    void deposita(double valor){
        super.deposita(valor);
    }
    
}
