public class Main {
    public static void main(String[] args) {
        Author authorKing = new Author("Stiven", "King", 3);
        Author authorRolling = new Author("Juan", "Rolling", 1);
        Author authorSmith = new Author("Jon", "Smith", 9);

        Book firstBook = new Book("The Best trip", 2012, authorKing, 891);
        Book secondBook = new Book("The Last of Us", 2000, authorSmith, 1);
        Book thirdBook = new Book("Harry Potter", 1999, authorRolling, 579);

        checkBook(firstBook, "trip");
        checkBook(secondBook, "big");
        checkBook(thirdBook, "Harry");
    }

    public static void checkBook(Book book, String word) {
        System.out.println("Книга " + book.title);
        System.out.println("Оценочная стоимость: " + book.estimatePrice());
        if (book.isBig()) {
            System.out.println("В ней больше 500 страниц");
        } else {
            System.out.println("Она не большая, меньше 500 страниц");
        }
        System.out.println("Содержит ли слово " + word + "?");
        System.out.println(book.matches(word));
        System.out.println();
    }
}