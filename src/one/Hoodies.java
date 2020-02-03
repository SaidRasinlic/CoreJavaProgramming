package one;

public class Hoodies {

    private String color;
 private int y;
 Hoodies (){
     this.setY(100);
 }
 public Hoodies(int val){
     y=val;
 }
   // Hoodies() {
       // this.setColor("ORANGE");
   // }

    Hoodies(String x) {
        this.setColor(x);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
