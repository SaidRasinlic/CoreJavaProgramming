package one;

public class SportBrandEx {

    public static void main(String[] args) {
        SportBrands nike = new SportBrands();
        
        System.out.println(nike.getTop5());
               
        SportBrands.setColor("Black, ");
        nike.setName("Nike SWOOSH");
        System.out.println(nike.getColor() + nike.getName());
       
        SportBrands adidas = new SportBrands("Orange, ");
        adidas.setName("Adidas YEEZY,");
        adidas.setTop5( " I am not on the top, I am the top!");
        System.out.println(adidas.getColor() + adidas.getName() + adidas.getTop5());
        
       
        
        
    }

}
