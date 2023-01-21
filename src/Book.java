public abstract class Book {

    private String bookAuthor;
    private String bookName;
    private String bookLang;

    public void SetBookAuthor(String Author){
        this.bookAuthor = Author;
    }

    public void SetBookName(String Name){
        this.bookName = Name;
    }

    public void SetBookLang(String Lang ){
        this.bookLang = Lang ;
    }

    public String GetBookAuthor(){
        return bookAuthor;
    }

    public String GetBookName(){
        return bookName;
    }

    public String GetBookLang(){
        return bookLang;
    }
}
