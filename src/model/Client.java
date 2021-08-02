package model;

//Extends ususario crea la herencia
public class Client extends User {
    private Wallet wallet;

    public Client(String nNombre) {
        super();
        wallet = new Wallet();
        setNombre(nNombre);
    }
    
    public Wallet getWallet() {
        return wallet;
    }
}
