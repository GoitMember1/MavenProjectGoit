import com.google.gson.Gson;


public class Info {
    public static void main(String[] args) {
        String name = "Roman";
        String lastName = "Herashchenko";

        Person person = new Person(name, lastName);
        Gson gson = new Gson();
        String json = gson.toJson(person);

        System.out.println(json);
    }
}

class Person {
    String name;
    String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}