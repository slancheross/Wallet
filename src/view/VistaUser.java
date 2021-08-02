package view;
import model.Client;

public class VistaUser {
    
    public static void main(String[] args) {
        Client customer1 = new Client("Daniela");
        Client customer2 = new Client("Carolina");
        System.out.println(customer1.getNombre());
        System.out.println(customer2.getNombre());
        System.out.println(customer1.getWallet().saveMoney(10000));
        String response = customer1.getWallet().compararCuenta(customer2.getWallet());
        System.out.println(response);
    }
}
