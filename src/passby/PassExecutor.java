package passby;

public class PassExecutor {

    public static void main(String[] args) {

        PassBySomething result1 = new PassBySomething();

        result1.carModel = "BMW";
result1.carModel="Audi";
        result1.passByReference(result1);
        System.out.println(result1.carModel);

        
        int x = useVarargs(10,10,10);
        
        System.out.println(x);
    
    
        int number = 50;
        passByValue(number);
        System.out.println(number);
        
    }
    
    
    public static void passByValue(int number){
     number=100;
        
        
    }
    
    public static int useVarargs( int ... operands){
        int result = 0;
        for(int i = 0; i<operands.length;i++){
            result+=operands[i];
        }
        return result;
    }
    

}
