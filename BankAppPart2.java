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

        String[][] customer = new String[0][];
        
        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n",COLOR_BLUE_BOLD, "%s" , RESET);
        

        do{
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

                    String id;
                    String name;
                    int deposit;
                    boolean valid;
                    
                    id = String.format("SDB-%05d",(customer.length + 1));
                    System.out.printf("\tNew Customer ID: %s \n", id);

                    do{
                        valid = true;
                        System.out.print("\tEnter Customer Name: ");
                        name = SCANNER.nextLine().strip();
                        if (name.isBlank()){
                            System.out.printf("\t%sName can't be empty%s\n", COLOR_RED_BOLD, RESET);
                            valid = false;
                            continue;
                        }
                        for (int i = 0; i < name.length(); i++) {
                            if (!(Character.isLetter(name.charAt(i)) || 
                                Character.isSpaceChar(name.charAt(i))) ) {
                                System.out.printf("\t%sInvalid Name%s\n", COLOR_RED_BOLD, RESET);
                                valid = false;
                                break;
                            }
                        }
                    }while(!valid);

                    do{
                        valid = true;
                        System.out.print("\tEnter Initial deposit : ");
                        deposit = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (deposit < 5000){
                            System.out.printf("\t%sInsufficient amount%s\n",COLOR_RED_BOLD,RESET);
                            valid = false;
                            continue ;
                        }else valid = true;
                    
                    } while (!valid);

                    String[][] tempCustomer = new String[customer.length + 1][3];

                    tempCustomer[tempCustomer.length - 1][0] = id;
                    tempCustomer[tempCustomer.length - 1][1] = name;
                    tempCustomer[tempCustomer.length - 1][2] = deposit + "";

                    customer = tempCustomer;

                    System.out.println();
                    System.out.printf(SUCCESS_MSG, String.format("%s:%s added successfully \n", id, name));
                    System.out.print("\tDo you want to continue adding marks? (Y/n)");
                    if (!SCANNER.nextLine().toUpperCase().strip().equals("Y"))
                        screen = DASHBOARD;
                    break;




            }
            
        }while (true);


    }
}

