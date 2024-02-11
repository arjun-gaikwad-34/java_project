package Entity;

import java.util.Random;

public class Book {

    generateRandomId();


}

public Book(String title, String author, String description, String publisher, LocalDateTime publishedDate) {
    this.title = title;
    this.author = author;
    this.description = description;
    this.publisher = publisher;
    this.publishedDate = publishedDate;
    generateRandomId();
}

private void generateRandomId() {
    // Generate a 5-digit alphanumeric code
    int length = 5;
    String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    StringBuilder idBuilder = new StringBuilder();

    for (int i = 0; i < length; i++) {
        char randomChar = alphanumeric.charAt(random.nextInt(alphanumeric.length()));
        idBuilder.append(randomChar);
    }

    this.id = Long.valueOf(idBuilder.toString());
}


private void generateRandomId() {
    // Generate a 5-digit alphanumeric code
    int length = 5;
    String alphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    StringBuilder idBuilder = new StringBuilder();

    for (int i = 0; i < length; i++) {
        char randomChar = alphanumeric.charAt(random.nextInt(alphanumeric.length()));
        idBuilder.append(randomChar);
    }

    this.id = Long.valueOf(idBuilder.toString());
}
