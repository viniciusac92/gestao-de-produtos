package product;

public class ProductModel {
    
    private String barCode = "ID-5216";
    private String name;
    private Integer priceInCents; // VALOR EM CENTAVOS
    private Integer stock;

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
        if (newName != null && !newName.isEmpty()){
            name = newName;
        }
    }

    /* Getter priceInCents */
    public Integer getPriceInCents(){
        return priceInCents;
    }

    /* Setter priceInCents */
    public void setPriceInCents(Integer newPriceInCents){
        if (newPriceInCents >= 0){
            priceInCents = newPriceInCents;
        }
    }

    /* Getter stock */
    public Integer getStock(){
        return stock;
    }

    /* Setter stock */
    public void setStock(Integer newStock){
        if (newStock >= 0){
            stock = newStock;
        }
    }





}
