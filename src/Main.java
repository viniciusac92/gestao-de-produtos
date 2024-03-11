import product.ProductModel;

public class Main {

    public static void main(String[] args){
        ProductModel product = new ProductModel();

        /* Teste atributo barCode */
        System.out.println(product.getBarCode());
        
        /* Teste atributo name */
        System.out.println(product.getName());
        product.setName("novo nome para testes");
        System.out.println(product.getName());
        
        /* Teste atributo priceInCents */
        System.out.println(product.getPriceInCents());
        product.setPriceInCents(900);
        System.out.println(product.getPriceInCents());
        
        /* Teste atributo stock */
        System.out.println(product.getStock());
        product.setStock(6);
        System.out.println(product.getStock());
    }
}