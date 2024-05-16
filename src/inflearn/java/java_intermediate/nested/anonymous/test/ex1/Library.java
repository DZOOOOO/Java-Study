package inflearn.java.java_intermediate.nested.anonymous.test.ex1;

public class Library {

    private final Book[] books;

    private static class Book {
        private final String bookName;
        private final String author;

        public Book(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthor() {
            return author;
        }
    }

    public Library(int len) {
        this.books = new Book[len];
    }

    public void addBook(String bookName, String author) {
        if (books[books.length - 1] != null) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book(bookName, author);
                break;
            }
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.getBookName() + ", 저자: " + book.getAuthor());
        }
    }
}
