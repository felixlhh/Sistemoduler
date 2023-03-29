import java.util.Random;
public abstract class Animal {
    
    private String name;
    private int age;
    //private boolean gender;
    
    public Animal (String name) {
        //Random r = new Random ();
        this.name = name;
        age = 0;
        //gender = (r.nextBoolean()) ? true : false;
    }
    
    /*public boolean getGender () {
        return gender;
    }*/
    
    public abstract void makeSound ();
    
    public int getAge () {
        return age;
    }
    
    public String getName () {
        return name;
    }
    
    @Override
    public int hashCode () {
        int result = 17;
        result = 67 * result + name.hashCode();
        result = 38 * result + age;
        return result;
    }
    
    @Override
    public boolean equals (Object obj) {
        if (this.getClass() != obj.getClass() || obj == null) {
            return false;
        }
        
        if (this == obj) {
            return true;
        }
                
        Animal other = (Animal) obj;
        
        return this.name.equals(other.name) && this.age == other.age;
        }
    }
