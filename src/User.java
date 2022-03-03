public class User {
    String name;
    String sename;
    int age;

    public User(String sename, String name, int age) {
        this.age=age;
        this.name=name;
        this.sename=sename;

    }
    public String toString()
    {
        return "ФИО: " + sename + " " + name + ", " + age + "г.";
    }

}
