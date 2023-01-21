import java.util.ArrayList;
import java.util.Set;

public class Person extends Human{

    public Library PersLibr;
    public Pet PersPet;

    public Person(String Name, String Sex, int Age, String persLibr, String persPet){
        SetName(Name);
        SetSex(Sex);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
        this.PersPet = new Pet(persPet);
    }

    ArrayList<Person> listName = new ArrayList<>();
    public void AddName(Person person){
        listName.add(person);
    }

    public ArrayList<Person> getListName(){
        return listName;
    }

    public void Voice(){
        String name = GetName();
        System.out.println("My name " + name);
    }

}
