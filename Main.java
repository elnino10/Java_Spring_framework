public class Main {
    public static void main() {
        User user = new User("Chimsodimma", "1999-03-18");
        Book book = new Book("Things fall apart", "Chinua Achebe", 240);
        AudioBook audio = new AudioBook("Audio book", "Tyler perry", 15000, "Michelle Obama");
        Ebook ebook = new Ebook("My ebook", "Joe Nwata", 289, "pdf");

        user.borrow(book);
        user.borrow(audio);
        user.borrow(ebook);
        user.setName("Chimsodimma Egboka");

        System.out.printf(
                "\n%s was born on %s, which means that he is %s years old.\n",
                user.name(), user.birthDate(), user.getAge());
        System.out.printf("The books he borrowed are %d in number.\n", user.booksCount());
        System.out.printf("My audio book's voice over is '%s'\n", audio.getVoiceOver());
        System.out.printf("The e-book has %d pages\n", ebook.getPages());
    }
}