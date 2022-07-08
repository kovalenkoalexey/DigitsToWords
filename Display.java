import java.util.Scanner;
public class Display {
    public void output() {
        Assembling assembling = new Assembling();
        Scanner scan = new Scanner(System.in);
        int number;
        String s;
        System.out.println("Enter number between 0 and 999 999 999: ");
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if (number < 0 || number > 999999999) {
                System.err.println("The sum out of range! Enter sum again.");
                output();
            } else {
                s = assembling.assemble(number);
                System.out.println(s);
                output();
            }
        } else {
            System.err.println("You have entered not correct signs!!! Try one more time.");
            output();
        }
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.output();
    }
}
