package numberOne;
public class PetSound {
    public static String makeSound(Pet pet, String sound) {
        return pet.getPetName() + " is making a sound: " + sound;
    }
}