public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService(); //В классе создана лок. переменная servise и создаем ноывый
        // объект, в котором будут только относящиеся к нему данные


       int weightInKg = 98; // Вводимые входные данные
       double heightInMeters = 1.87; // Вводимые входные данные
       double bmi = service.calculate(weightInKg, heightInMeters); // Тип и имя выходной переменной,
        //  имя сервиса и имена входных данных.

        System.out.println();
        System.out.println("Ваш индекс " + bmi ); // Вывод результата в терминал

    }
}
