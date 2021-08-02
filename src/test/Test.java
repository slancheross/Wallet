package test;
import model.Client;

public class Test {
    public static void main(String[] args) {
        Test iniciarPruebas = new Test();
        iniciarPruebas.escenarioClient();
    }
    
    public void escenarioClient(){
        Client cliente1 = new Client("Esteban");
        boolean test1 = assertEquals("Esteban", cliente1.getNombre());
        boolean test2 = assertNotNull(cliente1.getWallet());


        //Operador ternario
        // ()? responseTrue: responseFalse
        System.out.println((test1)? "Paso la prueba":"Error");
        System.out.println((test2)? "Wallet válida":"Error");
        
    }
    
    //Asert valida cosas
    public boolean assertEquals(String expected, String recieved){
        if(expected.equalsIgnoreCase(recieved)){
            return true; 
        }
        return false;

    }

    public boolean assertNotNull(Object objeto){
        if(objeto != null){
            return true;
        }
        return false;
    }

}
