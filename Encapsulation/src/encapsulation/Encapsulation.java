
package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.setName("Tiger");
        ob.setAge(10);
        ob.setWeight(35);
        System.out.println(ob.getName());
        System.out.println(ob.getAge());
        System.out.println(ob.getWeight());
       
    }
    
}
