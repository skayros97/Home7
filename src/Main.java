public class Main {
    public static void main(String[] args){
        Phone phone1 = new Phone("375297016727", "Samsung", 0.4);
        Phone phone2 = new Phone("375448903759", "Nokia", 0.7);
        Phone phone3 = new Phone();
        phone3.number = "375256788967";
        phone3.model = "Xiaomi";
        phone3.weight = 0.4;

        System.out.println("Телефон 1: номер - " + phone1.number + ", модель - " + phone1.model + ", вес - " + phone1.weight);
        System.out.println("Телефон 2: номер - " + phone2.number + ", модель - " + phone2.model + ", вес - " + phone2.weight);
        System.out.println("Телефон 3: номер - " + phone3.number + ", модель - " + phone3.model + ", вес - " + phone3.weight);
        phone1.receiveCall("Анна");
        phone2.receiveCall("Петр", "555-4321");
        System.out.println("Номер телефона телефона 3: " + phone3.getNumber());
        Phone phone4 = new Phone(phone1);
        System.out.println("Телефон 4: номер - " + phone4.number + ", модель - " + phone4.model + ", вес - " + phone4.weight);

        phone2.sendMessage("375297016727", "375448903759", "375256788967");
    }
    }
