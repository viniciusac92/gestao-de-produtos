import java.util.ArrayList;

import product.ProductController;
import product.ProductModel;

public class Main {

    public static void main(String[] args){
        // Instância da controller
        ProductController instanciaProductController = new ProductController();

        // Produtos de exemplo
        ProductModel produto1 = new ProductModel("Tomate", 400, 15);
        ProductModel produto2 = new ProductModel("Maçã", 600, 20);
        ProductModel produto3 = new ProductModel("Laranja", -600, 20);

        // barCode provávelmente não encontrado, descomentar teste logo abaixo
        String barCodePesquisado = "ID-1";

        // Utilizado try catch para utilizar as custom exceptions
        try {
            String resultadoCriacaoProduto1 = instanciaProductController.create(produto1);
            System.out.println(resultadoCriacaoProduto1);
            
            String resultadoCriacaoProduto2 = instanciaProductController.create(produto2);
            System.out.println(resultadoCriacaoProduto2);

            /* Descomentar abaixo para testar a custom Exception */ 
            // String resultadoCriacaoProduto3 = instanciaProductController.create(produto3);
            // System.out.println(resultadoCriacaoProduto3);
            
            ArrayList<ProductModel> produtosGeral = instanciaProductController.read();
            // System.out.println(Arrays.toString(produtosGeral.toArray()));
            for (ProductModel produto : produtosGeral) {
                System.out.println("[" + 
                produto.getBarCode() + ", " +
                produto.getName() + ", " +
                produto.getPriceInCents() + ", " +
                produto.getStock() +
                "]");
            }

            /* Descomentar abaixo para testar a custom Exception */ 
            // Integer precoProdutoNaoLocalizado = instanciaProductController.retrievePrice(barCodePesquisado);
            // System.out.println(precoProdutoNaoLocalizado);
            
            // Obtendo o barCode gerado para o produto1 para localizar seu preço
            Integer precoProdutoBuscado = instanciaProductController.retrievePrice(produto1.getBarCode());
            System.out.println(precoProdutoBuscado);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}