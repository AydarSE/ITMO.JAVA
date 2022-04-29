package hw.hw6;

public class Client extends Human {

    private final String bankName;

    public Client(String lastName, String firstName, String bankName) {
        super(lastName, firstName);
        this.bankName = bankName;
    }

    @Override
    public String allInfo() {
        return "Имя клиента:"+getFirstName()+"\nФамилия клиента:"+getLastName()+"\nБанк:"+bankName;
    }
}
