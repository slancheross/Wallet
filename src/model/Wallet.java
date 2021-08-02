package model;

public class Wallet {
    /**
     * saldo de la billetera
     */
    //Constantes, valores que no cambian- Static final permite que sean constantes
    public static final int CAPACIDAD_MAXIMA = 1000000;
    //Aun no
    public static final int TOPE_TRANSACCION = 200000;
    public static final double TAZA_TRANSFERENCIA = 0.2;

    private int saldo;
    private boolean tieneLimite;
    private int meta;
    
    //Nombre del constructor es igual al de la clase
    //Al crear una wallet se debería crear así.
    public Wallet() {
        super();
        saldo = null;
        tieneLimite = true;
        meta = 0;
    }

    public int getSaldo(){
        return saldo;
    }

    public boolean getTieneLimite(){
        return tieneLimite;
    }

    //permite cambiar el atributo de tieneLimite
    public void setTieneLimite(boolean newTieneLimite){
        this.tieneLimite = newTieneLimite;
    }

    public String saveMoney(int value){
        if (saldo + value > CAPACIDAD_MAXIMA && tieneLimite){
            return "No se puede superar el limite" + CAPACIDAD_MAXIMA;
        }
        saldo += value;
        return "Transacción exitosa, nuevo saldo" +  saldo;
    }

    public String takeMoney(int value){
        if (saldo<value){
            return "Saldo insuficiente";
        }
        saldo -= value;
        return "Transacción exitosa, nuevo saldo" +  saldo;
    }

    public String breakLimit(){
        if (saldo > 10000){
            saldo -= 10000;
            tieneLimite = false;
            return "Proceso exitoso, has roto los límites";
        }
        return "Saldo insuficiente"; 
    }

    public boolean establecerMeta(int value){
        if(value==0){
            meta = value;
            return true;
        }
        if(value < 0 || value <= saldo || value > CAPACIDAD_MAXIMA && tieneLimite){
            return false;
        }
        meta = value;
        return true;
    }   

    public boolean verificarMeta(){
        if (meta == 0 || meta > saldo){
            return false;
        }
        return true;
    }

    //Comparar dos saldos diferetes
    public String compararCuenta(Wallet otraWallet){
        if(saldo == otraWallet.getSaldo()){
            return "Su saldo es el mismo";
        }
        
        if (saldo > otraWallet.getSaldo()){
            return "La primera cuenta es mayor";
        }
        return "La segunda cuenta es mayor";
        
    }
    
}
