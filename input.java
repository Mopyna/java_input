import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Input
        Scanner eingabe = new Scanner(System.in);

        // Names
        name nameObject;
        nameObject = new name();

        // Age
        age ageObject;
        ageObject = new age();

        // Input name:
        System.out.println("bitte gib deinen Nachnamen ein: ");
        nameObject.FirstName = eingabe.nextLine();

        System.out.println("bitte gib deinen Vornamen ein: ");
        nameObject.LastName = eingabe.nextLine();

        // Input Age:
        System.out.println("Bitte gibt dein Alter ein; ");
        ageObject.age = eingabe.nextInt();

        // Age over 18 or not

        if (ageObject.age > 18) {
            System.out.println("Hallo " + nameObject.FirstName + " " + nameObject.LastName + " du darfst rein!");
        } else if (ageObject.age < 18) {
            System.out.println("Hallo " + nameObject.FirstName + " " + nameObject.LastName + " du bist zu jung und du darfst nicht rein!");
        }
    }
}
