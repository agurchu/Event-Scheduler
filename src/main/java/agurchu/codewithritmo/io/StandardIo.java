package agurchu.codewithritmo.io;


import java.util.Scanner;

public class StandardIo implements Io {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void println(String message) {
        System.out.println(message);
    }

    @Override
    public void print(String message) {
        System.out.print(message);
    }

    @Override
    public int anyInteger(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    @Override
    public float anyFloat(String prompt) {
        System.out.print(prompt);
        return scanner.nextFloat();
    }

    @Override
    public String anyString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}