import java.util.ArrayList;

class AnimalsPets {
    public String pNickname;
    public String pBreed;
    public int pAge;
}

public class Pet extends Animal{

    public String AnimalNick;

    public Pet(String animalNick){
        this.AnimalNick = animalNick;
    }

    ArrayList<AnimalsPets> listPet = new ArrayList<>();
    public void AddAnimal(String petNickname, String petBreed, int petAge){
        AnimalsPets anim = new AnimalsPets();
        SetNickname(petNickname);
        SetBred(petBreed);
        SetAge(petAge);

        anim.pNickname = GetNickname();
        anim.pBreed = GetBreed();
        anim.pAge = GetAge();

        listPet.add(anim);
    }

    public ArrayList<AnimalsPets> getAnimalList(){
        return listPet;
    }
}
