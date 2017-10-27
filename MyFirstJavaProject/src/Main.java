import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact contact1 = new Contact();
        contact1.name = "Olivier";
        contact1.phoneNumber = "0682448412";
        myContactManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Katoun";
        contact2.phoneNumber = "miaoumiaoumiaou";
        myContactManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Tiffany";
        contact3.phoneNumber = "0621110251";
        myContactManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Jane";
        contact4.phoneNumber = "0622244766";
        myContactManager.addContact(contact4);

        Contact myCurrentContact = myContactManager.searchContact("Katoun");
        System.out.println(myCurrentContact.phoneNumber);

        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        System.out.println("Enter your grade: ");
        Scanner scanner2 = new Scanner(System.in);
        int grade = scanner2.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }

    }
}
