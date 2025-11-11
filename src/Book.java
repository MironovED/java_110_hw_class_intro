public class Book {
    public String tittle;
    public int releaseYear;
    public Author author;
    public int pages;

    Book(String tittle, int releaseYear, Author author, int pages) {
        this.tittle = tittle;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (tittle.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = (int) Math.floor(Math.sqrt(author.rating) * 3 * pages);
        if (price < 250) {
            price = 250;
        }
        return price;
    }
}
