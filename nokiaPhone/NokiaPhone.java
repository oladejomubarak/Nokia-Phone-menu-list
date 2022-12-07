package nokiaPhone;

import java.util.Scanner;
public class NokiaPhone {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.printf("1.Phone book%n2.Messages%n3.Chat%n4.Call register%n5.Tones%n6.Settings%n7.Call divert%n8.Games%n9.Calculator%n" +
                "10.Reminder%n11.Clock%n12.Profiles%n13.SIM services%n");
        System.out.printf("Enter an option: ");
        int option = menu.nextInt();
        switch (option){
            case 1:
                phoneBook();
                break;
            case 2:
                messages();
                break;
             case 3:
                System.out.print("Chat");
                break;
            case 4:
                callRegister();
                break;
            case 5:
                tones();
                break;
            case 6:
                settings();
                break;
            case 7:
                System.out.print("Call divert");
                break;
            case 8:
                System.out.print("Games");
                break;
            case 9:
                System.out.print("Calculator");
                break;
            case 10:
                System.out.print("Remainder");
                break;
            case 11:
                clock();
                break;
            case 12:
                System.out.print("Profiles");
                break;
            case 13:
                System.out.print("SIM Services");
                break;
            default:
                System.out.print("you entered wrong option");
                break;
        }
    }
    public static void phoneBook() {
        System.out.println("1.Search\n2.Services Nos.\n3.Add name\n4.Erase\n5.Edit\n6.Assign tone\n7.Send b'card\n8.options\n" +
                "9.Speed dials\n10.Voice tags\n");
        System.out.print("Select an option: ");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.print("Search");
                break;
            case 2:
                System.out.print("Services Nos.");
                break;
            case 3:
                System.out.print("Add name");
                break;
            case 4:
                System.out.print("Erase");
                break;
            case 5:
                System.out.print("Edit");
                break;
            case 6:
                System.out.print("Assign tone");
                break;
            case 7:
                System.out.print("Send b'card");
                break;
            case 8:
                options();
                break;
            case 9:
                System.out.print("Speed dials");
                break;
            case 10:
                System.out.print("Voice tags");
                break;
            default:
                System.out.print("you entered wrong input");
        }
    }
            public static void options(){
                System.out.println("1.Type of view\n2.Memory status\n");
                System.out.print("select an option: ");
                int option = input.nextInt();
                switch (option){
                    case 1:
                        System.out.print("Type of view");
                        break;
                    case 2:
                        System.out.print("Memory status");
                        break;
                    default:
                        System.out.print("you entered wrong option");



                }
            }
            public static void messages(){
                System.out.println("1.Write messages\n2.Inbox\n3.Outbox\n4.Picture messages\n5.Templates\n6.Smileys\n" +
                        "7.Message settings\n8.info services\n9.Voice mailbox number\n10.service command editor\n");
                System.out.print("Select an option: ");
                int option = input.nextInt();
                switch (option){
                    case 1:
                        System.out.print("Write messages");
                        break;
                    case 2:
                        System.out.print("Inbox");
                        break;
                    case 3:
                        System.out.print("Outbox");
                        break;
                    case 4:
                        System.out.print("Picture messages");
                        break;
                    case 5:
                        System.out.print("Templates");
                        break;
                    case 6:
                        System.out.print("Smileys");
                        break;
                    case 7:
                        messageSettings();
                        break;
                    case 8:
                        System.out.print("Info services");
                        break;
                    case 9:
                        System.out.print("Voice mailbox number");
                        break;
                    case 10:
                        System.out.print("Service command editor");
                        break;
                    default:
                        System.out.print("you entered wrong option");
                }
            }
            public static void messageSettings(){
            System.out.println("1.Set\n2.Common\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    set();
                    break;

                case 2:
                    common();
                    break;
                default:
                    System.out.print("You entered wrong option");
            }
            }
            public static void set(){
            System.out.println("1.Message centre number\n2.Message sent as\n3.Message validity\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Message centre number: ");
                    break;
                case 2:
                    System.out.print("Messages sent as");
                    break;
                case 3:
                    System.out.print("Message validity");
                    break;
                default:
                    System.out.print("you entered wrong option");
            }
            }
            public static void common(){
            System.out.println("1.Delivery reports\n2.Reply via same centre\n3.Character support\n");
            System.out.print("please enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Delivery report");
                    break;
                case 2:
                    System.out.print("Reply via same centre");
                    break;
                case 3:
                    System.out.print("Character support");
                    break;
                default:
                    System.out.print("you entered wrong option");

            }
            }
            public static void callRegister(){
            System.out.println("1.Missed calls\n2.Received calls\n3.Dialed numbers\n4.Erase recent call lists\n5.Show" +
                    "call duration\n6.Show call costs\n7.Call cost settings\n8.prepaid credit\n");
            System.out.print("Please enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Missed calls");
                    break;
                case 2:
                    System.out.print("Received calls");
                    break;
                case 3:
                    System.out.print("Dialed numbers");
                    break;
                case 4:
                    System.out.print("Erase recent call lists");
                    break;
                case 5:
                    showCallDuration();
                    break;
                case 6:
                    showCallCosts();
                    break;
                case 7:
                    callCostSettings();
                    break;
                case 8:
                    System.out.print("Prepaid credit");
                    break;
                default:
                    System.out.print("you entered wrong option");
            }
            }
            public static void showCallDuration(){
            System.out.println("1.Last Call duration\n2.All calls' duration\n3.Received calls' duration\n4.Dialled calls' " +
                    "duration\n5.Clear timers\n");
            System.out.print("Press an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Last call duration");
                    break;
                case 2:
                    System.out.print("All calls' duration");
                    break;
                case 3:
                    System.out.print("Received calls' duration");
                    break;
                case 4:
                    System.out.print("Dialled calls' duration");
                    break;
                case 5:
                    System.out.print("Clear timers");
                    break;
                default:
                    System.out.print("Invalid option entered");
            }
            }
            public static void showCallCosts(){
            System.out.println("1.Last call cost\n2.All calls' cost\n3.Clear counter\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Last call cost");
                    break;
                case 2:
                    System.out.print("All calls' cost");
                    break;
                case 3:
                    System.out.print("Clear counter");
                    break;
                default:
                    System.out.print("You entered wrong option");
            }
            }
            public static void callCostSettings(){
            System.out.println("1.Call cost limit\n2.Show cost in\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Call cost limit");
                    break;
                case 2:
                    System.out.print("Show cost in");
                    break;
                default:
                    System.out.print("You entered wrong option");
            }
            }
            public static void tones(){
            System.out.println("1.Ringing tones\n2.Ringing volume\n3.Incoming call alert\n4.Composer\n5.Message alert tone" +
                    "\n6.keypad tones\n7.Warning and game tones\n8.Vibrating alert\n9.Screen saver\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Ringing tone");
                    break;
                case 2:
                    System.out.print("Ringing volume");
                    break;
                case 3:
                    System.out.print("Incoming call alert");
                    break;
                case 4:
                    System.out.print("Composer");
                    break;
                case 5:
                    System.out.print("Message alert tone");
                    break;
                case 6:
                    System.out.print("Keypad tones");
                    break;
                case 7:
                    System.out.print("Warning and game tones");
                    break;
                case 8:
                    System.out.print("vibrating tones");
                    break;
                case 9:
                    System.out.print("Screen saver");
                    break;
                default:
                    System.out.print("You entered wrong option");
            }
            }
            public static void settings(){
            System.out.println("1.Call settings\n2.Phone settings\n3.Security settings\n4.Restore factory settings\n");
            System.out.print("Enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    callSettings();
                    break;
                case 2:
                    phoneSettings();
                    break;
                case 3:
                    securitySettings();
                    break;
                case 4:
                    System.out.print("Restore factory settings");
                    break;
                default:
                    System.out.print("You entered wrong option");

            }
            }
            public static void callSettings(){
            System.out.println("1.Automatic redial\n2.Speed dialling\n3.Call waiting options\n4.Own number sending\n" +
                    "5.Phone line in use\n6.Automatic answer\n");
            System.out.print("please enter an option: ");
            int option = input.nextInt();
            switch (option){
                case 1:
                    System.out.print("Automatic redial");
                    break;
                case 2:
                    System.out.print("Speed dialling");
                    break;
                case 3:
                    System.out.print("Call waiting options");
                    break;
                case 4:
                    System.out.print("Own number sending");
                    break;
                case 5:
                    System.out.print("phone line in use");
                    break;
                case 6:
                    System.out.print("Automatic answer");
                    break;
                default:
                    System.out.print("You entered wrong option");
            }
            }
            public static void phoneSettings(){
            System.out.println("1.Language\n2.Cell info display\n3.Welcome note\n4.Network selection\n5.Lights\n6.Confirm" +
                    "SIM service actions\n");
                System.out.print("Enter an option: ");
                int option = input.nextInt();
                switch (option){
                    case 1:
                        System.out.print("Language");
                        break;
                    case 2:
                        System.out.print("Cell info display");
                        break;
                    case 3:
                        System.out.print("Welcome note");
                        break;
                    case 4:
                        System.out.print("Network selection");
                        break;
                    case 5:
                        System.out.print("Lights");
                        break;
                    case 6:
                        System.out.print("Confirm SIM service actions");
                        break;
                    default:
                        System.out.print("You entered wrong option");
                }
            }
            public static void securitySettings(){
                System.out.println("1.PIN code request\n2.Call barring service\n3.Fixed dialing\n4.Closed user group\n5.Phone" +
                        "security\n6.Change access codes\n");
                System.out.print("Enter an option: ");
                int option = input.nextInt();
                switch (option){
                    case 1:
                        System.out.print("1.PIN code request");
                        break;
                    case 2:
                        System.out.print("Call barring service");
                        break;
                        case 3:
                        System.out.print("Fixed dialing");
                        break;
                        case 4:
                        System.out.print("Closed user group");
                        break;
                        case 5:
                        System.out.print("Phone security");
                        break;
                        case 6:
                        System.out.print("Change access codes");
                        break;
                    default:
                        System.out.print("You entered wrong option");
                }
            }
            public static void clock (){
            System.out.println("1.Alarm clock\n2.Clock settings\n3.Date setting\n4.Stopwatch\n5.Countdown timer\n6.Auto update" +
                    "of date and time\n");
                System.out.print("Enter an option: ");
                int option = input.nextInt();
                switch (option){
                    case 1:
                        System.out.print("Alarm clock");
                        break;
                        case 2:
                        System.out.print("Clock settings");
                        break;
                    case 3:
                        System.out.print("Date setting");
                        break;
                    case 4:
                        System.out.print("Stopwatch");
                        break;
                    case 5:
                        System.out.print("Countdown timer");
                        break;
                    case 6:
                        System.out.print("Auto update of date and time");
                        break;
                }
            }
}
