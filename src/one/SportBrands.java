package one;

public class SportBrands {

    private String name;
    private static String color;
    private int age;
    private String top5;
    void marketingTrick(String something) {
        System.out.println("Welcome to the " + something);

    }
    
    SportBrands (){
        top5="I belong to the top 5 World sport brands!";
    }

SportBrands (String c){
  SportBrands.color = c;
}

    public static void setColor(String color) {
        SportBrands.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setTop5(String top5) {
        this.top5 = top5;
    }

    public String getTop5() {
        return top5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
  
    
    
    
    

}
