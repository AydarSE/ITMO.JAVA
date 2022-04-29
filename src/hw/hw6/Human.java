package hw.hw6;

public abstract class Human {

    private String lastName;
    private String firstName;

    public Human(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public abstract String allInfo();


}
