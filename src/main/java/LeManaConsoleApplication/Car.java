package LeManaConsoleApplication;

//Класс "Автомобиль":
class Car {
    //Параметры "Название автомобиля" и "Скорость":
    String name;
    int speed;

    //Конструктор:
    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    //Геттеры:
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
}
