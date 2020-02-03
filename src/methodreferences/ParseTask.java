package methodreferences;


public class ParseTask {

 public String name;
 public String id;
 public String score;
 
 public void split(String str){
String [] array = str.split("-");
name = array[0];
id = array[1];
score  = array[2];
 }
 
    public static void main(String[] args) {

     ParseTask obj = new ParseTask();
     String  s = "Said-20-3322";
     
     obj.split(s);
        
       
        System.out.println("Name is: " + obj.name + "\nScore is: " +obj.score +"\nID number is: " + obj.id);

  }
        
     
    }

