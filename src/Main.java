/*К задачам из предыдущего дз добавить абстракции. т е на этом дз нужно
гарантированно продумать иерархию компонент и взаимодействия их
между собой.
Обеспечить переход от использования явных классов в сторону
использования абстрактных типов. Т е работаем не с:
- конкретным экземпляром генеалогического древа, а с интерфейсом
“ генеалогическое древо”
- конкретным экземпляром котика, а с интерфейсом “котик”, лучше
уйти от взаимодействия с конкретными питомцами и повысить
уровень абстракции до взаимодействия с котиком, собачкой или
хомяком т е с интерфейсом “животное”
Предложить любопытный сценарий - что если внезапно котик пропал, и
на его место хозяин хочет поставить хомячка. Т е прямая отсылка к
внедрению и инверсии зависимостей.*/

public class Main {
    public static void main(String[] args) {

        Person father = new Person("John", "Male", 42, "lib1", "Dog");
        Person son = new Person("David", "Male", 15, "lib2", "Cat");
        Person daughter = new Person("Martha", "Female", 20, "lib3", "None");
        Person granddaughter = new Person("Lena", "Female", 3, "None", "Hamster");

        father.AddName(son);
        father.AddName(daughter);
        daughter.AddName(granddaughter);

        father.PersLibr.AddBook("Pushkin", "Poems", "RU");
        father.PersLibr.AddBook("Yesenin", "Poems", "RU");
        son.PersLibr.AddBook("Karl Marx", "Capital", "RU");
        daughter.PersLibr.AddBook("Tolkien", "Hobbit", "ENG");

        father.PersPet.AddAnimal("Snoopy", "Beagle", 5);
        son.PersPet.AddAnimal("Pharaoh", "Sphinx", 9);
        granddaughter.PersPet.AddAnimal("Rambo", "HamsterSuperMutant", 1);

        System.out.println("=".repeat(17));
        ViewTree.view(father, 0);

        System.out.println("=".repeat(17));
        father.Voice();

        System.out.println("=".repeat(17));
        ViewTree.bookView(father);
        ViewTree.bookView(son);
        ViewTree.bookView(daughter);
        ViewTree.bookView(granddaughter);

        System.out.println("=".repeat(17));
        ViewTree.petView(father);
        ViewTree.petView(son);
        ViewTree.petView(daughter);
        ViewTree.petView(granddaughter);
    }

}