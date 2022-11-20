public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Oliver Twist", "Charles Dikens", -7);
        System.out.println(b1);
        System.out.println ("Book name: " + b1.getName () ) ;
        System.out.println ("Book author: " + b1.getAuthor ());
        System.out.println ("Book pages: " + b1.getNumberOfPages () ) ;

        Word w1 = new Word("ליבי", "libi");
        System.out.println(w1);
        System.out.println ("Hebrew: " + w1.getHebrew () ) ;
        System.out.println ("English: " + w1.getEnglish ());
    }
}