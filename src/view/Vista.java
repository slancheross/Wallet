package view;
import model.Wallet;

public class Vista {
    public static void main(String[] args) {
/* Ambos se crean a partir de la misma clase*/
        Wallet wallet1 = new Wallet(true);
        Wallet wallet2 = new Wallet(false);

        String saldo1 = wallet1.putSaldo(6000000);
        //System.out.println(wallet1.getSaldo());
        System.out.println(saldo1);
        String saldo2 = wallet2.putSaldo(6000000);
        //System.out.println(wallet2.getSaldo());
        System.out.println(saldo2);

    }
    
}
