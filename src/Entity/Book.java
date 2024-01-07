package Entity;

public class Book {

    public Long id;
    public String title;

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
