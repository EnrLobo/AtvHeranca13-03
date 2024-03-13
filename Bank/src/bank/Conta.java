package bank;

public class Conta {
    
    private double saldo, vTax, porc;
    
    void atualiza(double taxa){
        this.porc = (this.saldo*taxa)/100;
        this.saldo += this.porc;
    }
    
    void deposita(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getvTax() {
        return vTax;
    }

    public void setvTax(double vTax) {
        this.vTax = vTax;
    }
    
    
        
    
    
}
