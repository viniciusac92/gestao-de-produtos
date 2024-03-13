package product;

public class ProductModel {
    private String barCode = "1";
    private String name;
    private Integer priceInCents; // VALOR EM CENTAVOS
    private Integer stock;

    /*
     * Construtor para gerar os produtos
     */
    public ProductModel(String name, Integer priceInCents, Integer stock){
        this.barCode = geradorId();
        this.name = name;
        this.priceInCents = priceInCents;
        this.stock = stock;
    }

    /*
     * Gerador de ID para ir incrementando
     */
    private String geradorId() {
        double numeroAleatorio = Math.random();

        // Mutiplicado por 1001 para ter o range entre 0 e 1000
        double numeroAleatorioGrande = numeroAleatorio * 1001;

        // Transformo em Integer
        int novoNumeroId = (int) numeroAleatorioGrande;

        return "ID-" + novoNumeroId; 
    }


    /* Getter barcode */
    public String getBarCode(){
        return barCode;
    }

    /* Getter name */
    public String getName(){
        return name;
    }

    /* Setter name */
    public void setName(String newName){
        // if (newName != null && !newName.isEmpty()){
            name = newName;
        // }
    }

    /* Getter priceInCents */
    public Integer getPriceInCents(){
        return priceInCents;
    }

    /* Setter priceInCents */
    public void setPriceInCents(Integer newPriceInCents){
        priceInCents = newPriceInCents;
    }

    /* Getter stock */
    public Integer getStock(){
        return stock;
    }

    /* Setter stock */
    public void setStock(Integer newStock){
        stock = newStock;
    }
}
