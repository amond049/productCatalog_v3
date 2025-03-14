package alirezamontazer.createbest.productcatalog_v3;

public class Product {

    private String _id;
    private String _productname;
    private int _price;

    public Product() {
    }

    public Product(String id, String productname, int price) {
        _id = id;
        _productname = productname;
        _price = price;
    }

    public Product(String productname, int price) {
        _productname = productname;
        _price = price;
    }

    public void setId(String id) {
        _id = id;
    }

    public String getId() {
        return _id;
    }

    public void setProductName(String productname) {
        _productname = productname;
    }

    public String getProductName() {
        return _productname;
    }

    public void setPrice(int price) {
        _price = price;
    }

    public int getPrice() {
        return _price;
    }

}
