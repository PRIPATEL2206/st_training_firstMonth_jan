package petSimulation;

public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public void feedPet(Pet pet, Food food) {
        pet.feed(food);
    }

    public void playWithPet(Pet pet) {
        pet.play();
    }

    public void takeCareOfPet(Pet pet) {
        pet.takeCare();
    }

    public static void main(String[] args) {
        // Example usage
        Owner owner = new Owner("John");
        Pet pet = new Pet("Fluffy");

        System.out.println("Initial Pet Status:");
        pet.displayStatus();

        Food petFood = new Food("HealthyFood", 20);

        owner.feedPet(pet, petFood);
        owner.playWithPet(pet);

        System.out.println("\nPet Status After Feeding and Playing:");
        pet.displayStatus();
    }
}

