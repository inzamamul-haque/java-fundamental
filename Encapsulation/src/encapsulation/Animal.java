
package encapsulation;

public class Animal {
    
        private String name;
	private int age;
	private int weight;

	// Getter methods
	public String getName() {
		return name;
	}
	public double getAge() {
		return age;
	}
	public int getWeight() {
		return weight;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
    
}
