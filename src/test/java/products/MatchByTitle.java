package products;


public class MatchByTitle implements IMatchStrategy {
    private String productTitle;

    public MatchByTitle (String productTitle){
        this.productTitle = productTitle;
    }

    public Boolean matchProduct (Products product){
        return (product.getTitle().equals(this.productTitle));
    }

}
