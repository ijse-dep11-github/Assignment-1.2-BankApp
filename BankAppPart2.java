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

        String screen = DASHBOARD;
        do{
            final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
            final String SUCCESS_MSG = String.format("\t%s%s%s\n",COLOR_BLUE_BOLD, "%s" , RESET);

            final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD,screen,RESET);
            System.out.println(CLEAR);
            System.out.println("\t"+APP_TITLE+"\n");

            switch(screen){
                case DASHBOARD: 
                    System.out.println("\t[1]. Create New Account");
                    System.out.println("\t[2]. Deposits");
                    System.out.println("\t[3]. Withdrawals");
                    System.out.println("\t[4]. Transfer");
                    System.out.println("\t[5]. Print");
                    System.out.println("\t[6]. Delete Account");
                    System.out.println("\t[7]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                switch (option){
                    case 1: screen = CREATE_NEW_ACC; break;
                    case 2: screen = DEPOSITS; break;
                    case 3: screen = WITHDRAWALS; break;
                    case 4: screen = TRANSFER; break;
                    case 5: screen = PRINT; break;
                    case 6: screen = DELETE_ACC; break;
                    case 7: System.out.println(CLEAR); System.exit(0);
                    default: continue;
                }
                break;

                case CREATE_NEW_ACC:
                    


            }
            
        }while (true);


    }
}

