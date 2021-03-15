import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("What day you born ? ");
        int day = in.nextInt();

        System.out.println("What month you born ? ");
        int month = in.nextInt();

        System.out.println("What year you born ? ");
        int year = in.nextInt();

        System.out.println("What's your Name ? ");
        String name = in.next();

        System.out.println("What's your Last Name ? ");
        String lastName = in.next();

        HeartRates personName = new HeartRates(name, lastName, year, month, day);
        personName.status();
    }
}
