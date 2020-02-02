
package abstraction;


public class Abstraction {

    public static void main(String[] args) {
        Fish F = new Fish();
        Bird b = new Bird();
        F.label();
        F.move();
        F.eat();
        b.label();
        b.eat();
        b.move();
    }
    
}
