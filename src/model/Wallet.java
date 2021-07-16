package model;

public class Wallet {
    /**
     * saldo de la billetera
     */
    //Constantes, valores que no cambian
    public static final int LIMITE_BILLETERA = 500000;
    
    private int saldo;
    private boolean tieneLimite;

    //Nombre del constructor es igual al de la clase
    public Wallet(boolean limite) {
        super();
        saldo = 0;
        tieneLimite = limite;
    }

    public int getSaldo(){
        return saldo;
    }

    public String putSaldo(int valor){
        if(saldo+valor > LIMITE_BILLETERA && tieneLimite){
            return "No puede superar el limite";
        }
        saldo += valor;
        return "Operacion exitosa, nuevo saldo: " + saldo;
    }
    public String getMoney(int valor){
        if (saldo > valor && valor > 10000){
            saldo -= valor;
            return "Transacción exitosa, nuevo saldo" + saldo;
        }
        int saldoTemp = saldo;
        saldo = 0;
        return "Saldo disponible, su nuevo saldo es:" + saldoTemp;
    }

    public String brokeLimits(){
        if (saldo > 10000){
            saldo -= 10000;
            tieneLimite = false;
            return "Proceso exitoso";
        }
        return "Saldo insuficiente";
        
    }
    
}
