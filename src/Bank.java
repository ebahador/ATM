public class Bank {
    Bank() {
    }

    void get_money(Person person, float money) {
        if (person.Credit <= money)
            System.out.println("Your money is lower than your request.");
        else
            person.Credit -= money;
    }
    public float get_credit(Person person){
        return person.Credit;
    }

    void transfer_money(Person person1, Person person2,
                        int SourceAccNo, int DestAccNo, float money) {
        if (person1.AccNo == SourceAccNo && person2.AccNo == DestAccNo) {
            if (money >= person1.Credit)
                System.out.println("Your money is lower than your request!");
            else {
                person1.Credit -= money;
                person2.Credit += money;
            }
            System.out.println("Mission Complete: " + Math.random() * 100);
        } else
            System.out.println("Mission failed!");
        System.out.println(person1.Credit);
        System.out.println(person2.Credit);
    }

    float show_money(Person person) {
        return (person.Credit);
    }


    String get_info_Bank() {
        String name = "Mellat";
        String branch = "Padegan";
        return name + "\n" + branch;
    }
}