package restfulclient;

public class BBDDRestFulClientApp {
    
    public static void main(String[] args) {
        BBDDRestFulClient rsclient = new BBDDRestFulClient();
        System.out.println("Número de Clientes: " + rsclient.countREST());
    }
    
}
