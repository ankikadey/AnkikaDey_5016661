import java.util.Scanner;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter command (on/off/exit): ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "on":
                    remote.setCommand(lightOn);
                    remote.pressButton();
                    break;
                case "off":
                    remote.setCommand(lightOff);
                    remote.pressButton();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid command. Please enter 'on', 'off', or 'exit'.");
            }
        } while (!input.equals("exit"));

        scanner.close();
    }
}
