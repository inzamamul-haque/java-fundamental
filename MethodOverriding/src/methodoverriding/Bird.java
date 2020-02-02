
package methodoverriding;

public class Bird extends Animal {
   
    @Override
    public void name(String name){
        System.out.println("The Bird name is "+name);
    }
    
}
