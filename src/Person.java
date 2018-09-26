public class Person {
    Person() {
    }

    Person(String name, long id, int accNo, float cr) {
        Name = name;
        Id = id;
        Credit = cr;
        AccNo = accNo;
    }

    private String Name;
    private long Id;
    float Credit;
    int AccNo;
    protected int getAccNo(Person p){
        return p.AccNo;
    }
    void get_info_Person(Person p) {
        System.out.println("name: " + p.Name +
                "\n id: " + p.Id +
                "\n Credit: " + p.Credit);
    }
}
