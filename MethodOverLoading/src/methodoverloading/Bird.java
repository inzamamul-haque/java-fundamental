
package methodoverloading;

public class Bird {
    
    public void fly(){
        System.out.println("The Bird is flying..");
    }
    
    public void fly(String name){
        System.out.println("The " +name+ " is flying");
    }
    public void fly(String name, int height){
        System.out.println("The " + name + " is flying in " +height+ " feet" );
    }
    
}
