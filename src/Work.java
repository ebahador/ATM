import java.util.Scanner;

public class Work extends Bank {
    public static void main(String[] args) {
        float req;
        int pass, state = 0; // 1111
        Scanner inputname = new Scanner(System.in);
        Bank mellat = new Bank();
        Person Bahador = new Person("Bahador Eizadkhah", 123,78910, 10000);
        Person Pedram = new Person("Pedram Salimi", 234, 56789, 20000);
        System.out.println("Welcome to " + mellat.get_info_Bank());
        System.out.println("Enter Password: ");
        pass = inputname.nextInt();
        if (pass != 1111) {
            for (int c = 3; c > 0; c--) {
                System.out.println("Enter Password Again: ");
                pass = inputname.nextInt();
                if (pass == 1111)
                    break;
            }
        }


        while (state != 5) {
            System.out.println("1- Get info about yourself\n2- Balance Info\n3- Get money\n4- Transfer money\n5- Exit");
            state = inputname.nextInt();
            switch (state) {
                case 1:
                    Bahador.get_info_Person(Bahador);
                    break;
                case 2:
                    System.out.println("$" + mellat.show_money(Bahador) + "\n");
                    break;
                case 3:
                    System.out.println("How much money do you need?");
                    req = inputname.nextFloat();
                    mellat.get_money(Bahador, req);
                    break;
                case 4:
                    System.out.println("Source Acc number, Dest Acc number, Money to transfer.");
                    Scanner sr = new Scanner(System.in);
                    int s = sr.nextInt();
                    Scanner des = new Scanner(System.in);
                    int d = des.nextInt();
                    Scanner mn = new Scanner(System.in);
                    float mon = mn.nextFloat();
                    mellat.transfer_money(Bahador, Pedram, s, d, mon);
                    break;
                case 5:
                    break;
            }
        }
    }
}