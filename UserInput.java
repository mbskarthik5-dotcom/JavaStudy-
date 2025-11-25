import java.util.Scanner; // ஸ்கேனர் கருவியை அழைத்தல்

class UserInput {
    public static void main(String[] args) {
        // ஸ்கேனரை உருவாக்குதல்
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt(); // முதல் எண்ணை வாங்குதல்

        System.out.println("Enter second number:");
        int num2 = scan.nextInt(); // இரண்டாம் எண்ணை வாங்குதல்

        int total = num1 + num2;
        System.out.println("The Result is: " + total);
    }
}