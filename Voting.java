import java.util.Scanner;

class Voting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("உங்கள் வயதை டைப் செய்யவும் (Enter Age):");
        int age = scan.nextInt(); 

        // நிபந்தனை (Logic)
        if (age >= 18) {
            System.out.println("நன்றி! நீங்கள் ஓட்டு போடலாம் (You can Vote).");
        } else {
            System.out.println("மன்னிக்கவும்! நீங்கள் ஓட்டு போட முடியாது (You cannot Vote).");
        }
    }
}