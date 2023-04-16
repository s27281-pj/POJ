public class Main {
    public static void main(String[] args) {
        Author author = new Author("John", "Doe", 35);
        System.out.println("Author name: " + author.getName());
        System.out.println("Author surname: " + author.getSurname());
        System.out.println("Author age: " + author.getAge());
        System.out.println("Author info: " + author.toString());
        author.setSurname("Smith");
        author.setAge(40);
        System.out.println("Author updated info: " + author.toString());
    }
}
