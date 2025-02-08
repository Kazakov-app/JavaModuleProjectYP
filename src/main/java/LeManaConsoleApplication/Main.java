package LeManaConsoleApplication;
//Импорт класса Scanner:
import java.util.Scanner;

//Главный класс:
public class Main {
    //Главный метод:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        //Ввод данных участников гонки:
        inputScannerDataRace(scanner, race);
        //Результат:
        resultTheFasterCar(race, scanner);
    }

    private static void inputScannerDataRace(Scanner scanner, Race race) {
        for (int i = 1; i <= 3; i++) {
            String carName = "";
            int speed = 0;
            // Ввод названия автомобиля:
            carName = inputScannerCarName(carName, i, scanner);
            // Ввод скорости автомобиля:
            speed = inputScannerSpeed(i, scanner);
            // Создаем объект Car и обновляем лидера:
            updateLeaderRace(carName, speed, race);
        }
    }

    private static String inputScannerCarName(String carName, int i, Scanner scanner) {
        while (carName.isEmpty()) {
            System.out.print("Введите название машины №" + i + ": ");
            carName = scanner.nextLine().trim(); // Удаляем пробелы в начале и в конце.
            //Проверка на правильность ввода данных:
            if (carName.isEmpty()) {
                System.out.println(
                        "Название автомобиля не может быть пустым. Пожалуйста, введите название.");
            }
        }
        return carName;
    }

    private static int inputScannerSpeed(int i, Scanner scanner) {
        int speed;
        while (true) {
            System.out.print("Введите скорость машины №" + i + ": ");
            try {
                speed = scanner.nextInt();
                scanner.nextLine();
                if (speed >= 0 && speed <= 250) {
                    break; // Выходим из цикла, если скорость валидна.
                //Проверка на правильность ввода данных:
                } else {
                    System.out.println("Неправильная скорость. Введите скорость от 0 до 250.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Неправильный формат скорости. Введите целое число.");
                scanner.nextLine();
            }
        }
        return speed;
    }

    private static void updateLeaderRace(String carName, int speed, Race race) {
        Car car = new Car(carName, speed);
        race.updateLeader(car);
        System.out.println();
    }

    private static void resultTheFasterCar(Race race, Scanner scanner) {
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
        scanner.close();
    }
}