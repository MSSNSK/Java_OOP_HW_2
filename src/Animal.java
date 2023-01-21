public abstract class Animal {

    private String petNickname;
    private String petBreed;
    private int petAge;

    public void SetNickname(String petNick){
        this.petNickname = petNick;
    }
    public void SetBred(String petBreed){
        this.petBreed = petBreed;
    }

    public void SetAge(int petAge){
        this.petAge = petAge;
    }

    public String GetNickname(){
        return petNickname;
    }

    public String GetBreed(){
        return petBreed;
    }

    public int GetAge(){
        return petAge;
    }
}
