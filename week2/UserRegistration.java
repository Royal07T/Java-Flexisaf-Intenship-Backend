import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        // 👇 This will auto-close the scanner at the end of the try block
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Enter your name:");
            String name = scanner.nextLine();

            System.out.println(" Enter your age:");
            int age = scanner.nextInt();

            try {
                registerUser(name, age);
                System.out.println(" Registration successful for " + name);
            } catch (UnderAgeException e) {
                System.out.println("🚫 Registration failed: " + e.getMessage());
            }

        } // no need to call scanner.close()
    }

    public static void registerUser(String name, int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("User " + name + " is under 18 and not eligible to register.");
        }
    }
}
