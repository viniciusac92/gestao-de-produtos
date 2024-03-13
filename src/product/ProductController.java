package product;

import java.util.ArrayList;
import java.util.List;

import exceptions.NegativePriceException;
import exceptions.NotFoundException;

public class ProductController {
    /*
     * Lista da produtos com base na product model
     */
    private ArrayList<ProductModel> products;

    /* 
     * Inicializa o construtor com 'products' vazio
     */ 
    public ProductController() {
        this.products = new ArrayList<>();
    }

    /*
     * Faz overload do construtor recebendo parâmetros
     */
    public ProductController(List<ProductModel> initialData) {
        this.products = new ArrayList<>(initialData);
    }

    /*
     * Criação do produto
     */
    public String create(ProductModel payload) throws NegativePriceException{
        // Valida preço do produto
        if (payload.getPriceInCents() <= 0) {
            throw new NegativePriceException("O preço do produto precisa ser um número positivo.");
        }

        // Adiciona o novo produto na lista de clientes
        products.add(payload);
        
        return "Produto " + payload.getName() + " adicionado.";
    }

    /*
     * Retorna produtos ja adicionados
     */
    public ArrayList<ProductModel> read(){
        return products;
    }

    /*
     * Retorna o preço do produto pesquisado pelo barCode
     */
    public Integer retrievePrice(String barcode) throws NotFoundException{
        boolean foiLocalizadoId = false;
        Integer precoProdutoLocalizado = null;

        // Iterando sobre products
        for(ProductModel produto: products) {
            
            if(produto.getBarCode() == barcode) {
                foiLocalizadoId = true;
                precoProdutoLocalizado = produto.getPriceInCents();
            }
        }
        
        if(!foiLocalizadoId){
            throw new NotFoundException("Product ‘nomeDoProduto’ not found.");
        }

        return precoProdutoLocalizado;
    }
}
