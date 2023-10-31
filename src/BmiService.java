public class BmiService {

    public double calculate(int weightInKg, double heightInMeters) {
        // Описание класса: тип возвращаемых данных, название команды, в скобках данные, кот. надо ввести.
        // В фиг скобках вводми код функции предполагая,что ее данные универсальные и уже введены.

        double bmi = weightInKg / heightInMeters / heightInMeters;   // Действия кот. выполняет функция.

        return (int) bmi; // Возврат типа и значения данных на выход (результата работы кода программы).
        // Передаем не переменную, а ЕЕ ЗНАЧЕНИЕ.
    }
}


//  public int calculate(int price) {
//     return price / 20;
// }
//}
