package hw.hw6;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Галиев", "Айдар", "Сбербанк");
        BankEmployee employee = new BankEmployee("Иванов", "Иван", "Сбербанк");
        System.out.println("-----------Клиент----------");
        System.out.println(client.getFirstName());
        System.out.println(client.getLastName());
        System.out.println(client.allInfo());
        System.out.println("-----------Работник--------");
        System.out.println(employee.allInfo());


    }


}


