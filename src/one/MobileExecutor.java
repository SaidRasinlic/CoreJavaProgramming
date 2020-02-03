    package one;

public class MobileExecutor {

    public static void main(String[] args) {
        Mobiles huawei = new Mobiles();
        System.out.println(huawei.camMegaPixels);
        huawei.color = "black";
        huawei.displayInches = 5.8;
        huawei.modelName = "Huawei P20 Lite";
        huawei.price = 650;
        huawei.ringtone();

        System.out.println("Huawei color: " + huawei.color + "\nDisplay inches: " + huawei.displayInches + "\nHauwei model name: " + huawei.modelName + "\nHuawei price: " + huawei.price);
        System.out.println(" ");
        System.out.println("GETTER AND SETTER");
        System.out.println(" ");

        Mobiles huawei1 = new Mobiles();
        Mobiles.ringtone();
        huawei1.setColor("Blue");
        huawei1.setDisplayInches(5.8);
        huawei1.setModelName("Huawei P30 Lite");
        huawei1.setPrice(995);

        System.out.println("Huawei color: " + huawei1.getColor() + "\nDisplay inches: " + huawei1.getDisplayInches() + "\nHuawei model name: " + huawei1.getModelName() + "\nHuawei price : " + huawei1.getPrice());

        Mobiles huawei2 = new Mobiles();
        System.out.println(huawei2.camMegaPixels);

        Mobiles huawei3 = new Mobiles(36);
        System.out.println(huawei3.camMegaPixels);
        System.out.println("CONSTRUCTOR");
        System.out.println(" ");
        Mobiles huawei4 = new Mobiles();
        System.out.println(huawei4.color);
        Mobiles huawei5 = new Mobiles("Yellow");
        System.out.println(huawei5.color);
        Mobiles huawei6 = new Mobiles(64);
        System.out.println(huawei6.camMegaPixels);
        Mobiles huawei7 = new Mobiles();
        System.out.println(huawei7.camMegaPixels);
        
        

    }

}
