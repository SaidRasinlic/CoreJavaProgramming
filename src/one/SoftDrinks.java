package one;

public class SoftDrinks {

    private String name;
    private String color;
    private int litres;

     int count = 0;
    SoftDrinks (){
   count++; 
}
    
    

     SoftDrinks(String c) {
      this.setColor(c);
    }
    
    
    
    
    int sum(int a, int b){
        return a +b;
    }
    static void message(String n){
        System.out.println("Hello dear " + n+  ", hope you enjoy drinking our drink!");
    }

    void openSound() {
        System.out.println("csssss");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLitres() {
        return litres;
    }

    public void setLitres(int litres) {
        this.litres = litres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
    
}
