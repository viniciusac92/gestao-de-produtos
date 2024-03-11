package product;

import java.util.ArrayList;

public class ProductController {

    private ArrayList products;

    public String create(ProductModel payload) throws Exception{
        // ProductModel novoProduto = new ProductModel();

        if (payload.getPriceInCents() <= 0) {
            throw new Exception("O preço do produto precisa ser um número positivo.");
        }



        return "Produto " + payload.getName() + " adicionado.";
    }


    
}
