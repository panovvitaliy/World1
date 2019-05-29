import First.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        First.Greeting greating = new First.Greeting();
        First.LocalDate localDate = new First.LocalDate();

        System.out.println(greating.sayHello());
        System.out.println(LocalDate.checkDate());

    }
}
