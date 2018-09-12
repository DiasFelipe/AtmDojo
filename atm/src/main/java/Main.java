import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankNotes bankNotes = new BankNotes();
        System.out.println("Quanto você quer sacar?");
        Scanner scanner = new Scanner(System.in);
        int totalValue = scanner.nextInt();
        try {
            bankNotes.countBankNotes(totalValue);
            System.out.println(bankNotes.printResult());
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
