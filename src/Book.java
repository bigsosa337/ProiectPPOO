public class Book {
    private String id;
    private String title;
    private String author;
    private String publishYear;
    private String status;

    private String genre;

    public Book() {
    }

    public Book(String id, String title, String author, String publishYear, String status, String genre){
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.status = status;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String author) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear='" + publishYear + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
