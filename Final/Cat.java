public class Cat extends Mammal implements Pet {

    public Cat (String name) {
       
        super(name);
    
    }
    
    public void makeSound () {
        System.out.println("meow");
    }
    
    public void petPet () {
        System.out.println("purr");
    }
    
    public void feedPet () {
        petPet();
        makeSound();
    }
}