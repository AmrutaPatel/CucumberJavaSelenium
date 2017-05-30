package products;


public class MatchByPrice implements IMatchStrategy {

    private double productPrice;
    public MatchByPrice(Double productPrice){
        this.productPrice = productPrice;
    }

     public Boolean matchProduct(Products product){
        return (product.getPrice() <= this.productPrice );
    }
}
