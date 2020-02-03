package one;

public class SecretStuff {

    private static int hiddenX;
    public  int exposed;

    public  void setHiddenX(int newValueX) {
        hiddenX = newValueX + 5;
    }

    public int getHiddenX() {
        hiddenX = hiddenX + 5;
        return hiddenX;
    }

 
    
    
}
