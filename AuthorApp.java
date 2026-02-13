class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return String.format("Author[name=%s,email=%s,gender=%s]", this.name, this.email, this.gender);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }
}

public class AuthorApp {
    public static void main(String[] args) {
        Author osman = new Author("Richard Osman", "noone@nowhere.com", 'm');

        System.out.println(osman); // Test toString()
        osman.setEmail("osman@murderclub.com"); // Test setter
        System.out.println("name is: " + osman.getName()); // Test getter
        System.out.println("email is: " + osman.getEmail()); // Test getter
        System.out.println("gender is: " + osman.getGender()); // Test getter
    }
}