import java.util.Scanner;
public class BankAppPart2 {
    private static final Scanner SCANNER = new Scanner (System.in);
    public static void main(String[] args) {

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "👷 WELCOME TO SMART BANKING";
        final String CREATE_NEW_ACC = "➕ Create new account";
        final String DEPOSITS = "Deposits";
        final String WITHDRAWALS = "Withdrawals";
        final String TRANSFER = "Transfer";
        final String PRINT = "🖨 Print";
        final String DELETE_ACC = "❌ Delete account";
    }
}

