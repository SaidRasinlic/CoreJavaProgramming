package interfejsiTwo;

public  interface NoiseMaker {
    // polja 
    
    
    
    public static final String name = "Making noise";
    
    public abstract String makeNoise();
    
    default  void printNoise(){
        System.out.println("Noise printing: " + makeNoise());
        
    }
    
    
    
}
