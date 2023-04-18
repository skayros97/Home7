public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Phone(Phone phone) {
        this(phone.number, phone.model, phone.weight);
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber)
    {
        System.out.println("Звонит " + name + ", номер телефона: " + callerNumber);
    }

    public String getNumber()
    {
        return number;
    }

    public void sendMessage(String... numbers)
    {
        System.out.print("Отправить сообщение на номера: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
