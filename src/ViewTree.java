public class ViewTree {
    public static void view(Person root, int space){
        String line = "_".repeat(space);
        System.out.println(line + root.GetName());

        for (Person a: root.getListName()){
            view(a, space + 1);
        }
    }

    public static void bookView(Person root){
        System.out.println("Library name: " + root.PersLibr.LibraryName);

        for (LibraryBooks a: root.PersLibr.listBook){
            System.out.println(a.bAuthor + " " + a.bName + " " + a.bLang);
        }
    }

    public static void petView(Person root){
        System.out.println("Pet: " + root.PersPet.AnimalNick);

        for (AnimalsPets anim: root.PersPet.listPet){
            System.out.println(anim.pNickname + " " + anim.pBreed + " " + anim.pAge);
        }
    }

}
