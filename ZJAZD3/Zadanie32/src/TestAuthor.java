public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Jan", "Kowalski", 30);
        System.out.println("Name: " + author.getName()); // powinno wyświetlić "Name: Jan"
        System.out.println("Surname: " + author.getSurname()); // powinno wyświetlić "Surname: Kowalski"
        System.out.println("Age: " + author.getAge()); // powinno wyświetlić "Age: 30"
        System.out.println(author); // powinno wyświetlić "Jan Kowalski (30)"
        author.setSurname("Nowak");
        System.out.println("Surname: " + author.getSurname()); // powinno wyświetlić "Surname: Nowak"
    }
}
