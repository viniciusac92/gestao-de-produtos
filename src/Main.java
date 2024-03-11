import java.util.HashMap;

import product.ProductController;
import product.ProductModel;

public class Main {

    public static void main(String[] args){

        // HashMap<String, String> payloadExample = new HashMap<String, String>();

        // payloadExample.put("name", "bolo");
        // payloadExample.put("priceInCents", "1200");
        // payloadExample.put("stock", "3");

        ProductController productActions = new ProductController();
        
        ProductModel product = new ProductModel();
        product.setName("bolo");
        product.setPriceInCents( -1200);
        product.setStock(3);

        try {
            String result = productActions.create(product);
            
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }








        // ProductModel product = new ProductModel();

        /* Teste atributo barCode */
        // System.out.println(product.getBarCode());
        
        /* Teste atributo name */
        // System.out.println(product.getName());
        // product.setName("novo nome para testes");
        // System.out.println(product.getName());
        
        /* Teste atributo priceInCents */
        // System.out.println(product.getPriceInCents());
        // product.setPriceInCents(900);
        // System.out.println(product.getPriceInCents());
        
        /* Teste atributo stock */
        // System.out.println(product.getStock());
        // product.setStock(6);
        // System.out.println(product.getStock());
    }
}