package one;

public class Mobiles {

    String modelName;
    String color;
    int price;
    double displayInches;
    int camMegaPixels;

    Mobiles() {
     this.setColor("Red");
    }

    Mobiles(int cam) {
        camMegaPixels = cam;

    }
    Mobiles (String setit){
        this.setColor(setit);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    static void ringtone() {
        System.out.println("Ringtone: Huawei music");
        
        
    }

}
