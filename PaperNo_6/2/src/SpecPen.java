public class SpecPen extends Pen{
    private int price;

    public SpecPen() {
    }

    public SpecPen(int price) {
        this.price = price;
    }

    public SpecPen(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + super.getColor() + ", " + price;
    }
    public void setData(){
        super.setName(super.getName() + price);
    }
    public int getValue(){
        if(super.getColor().contains("Y") ||super.getColor().contains("O")) return price;
        return price *2;
    }
    
    
}
