import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.print("Please enter your character's name: ");
        name = scanner.nextLine();

        System.out.println("Hello, " + name + ". You find yourself in a dark forest.");
        System.out.println("You come across a fork in the road. What do you do?");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the right path");

        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        
        if (choice == 1) {
            System.out.println("You chose the left path. You find a treasure chest!");
            System.out.println("What do you want to do?");
            System.out.println("1. Open the chest");
            System.out.println("2. Leave it and continue your journey");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.println("Congratulations, " + name + "! You found a pile of gold coins. You win!");
            } else if (choice == 2) {
                System.out.println("You continue your journey through the forest.");
            } else {
                System.out.println("Invalid choice. You stumble around and get lost.");
            }
        } else if (choice == 2) {
            System.out.println("You chose the right path. You encounter a fierce dragon!");
            System.out.println("What do you want to do?");
            System.out.println("1. Fight the dragon");
            System.out.println("2. Run away");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
                System.out.println("You valiantly fight the dragon but, unfortunately, the dragon wins. Game over!");
            } else if (choice == 2) {
                System.out.println("You wisely run away from the dragon and continue your journey.");
            } else {
                System.out.println("Invalid choice. The dragon roars, scaring you away.");
            }
        } else {
            System.out.println("Invalid choice. You get lost in the forest.");
        }
        
        System.out.println("Thanks for playing, " + name + "!");
    }
}