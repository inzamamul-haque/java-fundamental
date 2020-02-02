
package methodoverloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        
        Bird ob = new Bird();
        ob.fly();
        ob.fly("Eagle");
        ob.fly("Eagle", 20);
        
       
    }
    
}
