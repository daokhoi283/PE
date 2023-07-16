
public class Eagle {
    private int quantity;
    private String type;

    public Eagle() {
    }

    public Eagle(String type, int quantity) {
        this.quantity = quantity;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type.substring(0,1) + type.substring(2,3);
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
