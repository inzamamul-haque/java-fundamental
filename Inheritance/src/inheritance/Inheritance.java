
package inheritance;

public class Inheritance {

 
    public static void main(String[] args) {
        Eagle ob = new Eagle();
        System.out.println("Bird Name: "+ob.name);
        ob.flyUp();
        ob.flyDown();
        ob.lifespan();
        System.out.println("Reproduction: "+ob.reproduction);
        
    }
    
}
