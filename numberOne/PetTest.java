package numberOne;
public class PetTest {
    public static void main(String[] args) {
        Pet myPet = new Pet("Oreo", "Aeron");
        
        // Pet Actions
        System.out.println(PetSound.makeSound(myPet, "Ow ow!"));
        System.out.println(PetEating.eat(myPet, "Chicken"));
    }
}