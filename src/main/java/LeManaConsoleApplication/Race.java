package LeManaConsoleApplication;

//Класс "Гонка":
class Race {
    //Параметры "Лидер гонки" и "Дистанция":
    private String leaderName = "";
    private int distance = 0;

    //Метод определяющий нового лидера:
    public void updateLeader(Car car) {
        final int HOURS_PER_DAY = 24;//Константа "Время (24)".
        int distance = HOURS_PER_DAY * car.getSpeed(); // Вычисляем дистанцию.

        if (distance > this.distance) { // Если дистанция больше, чем у лидера.
            leaderName = car.getName();
            this.distance = distance;
        } else if (distance==this.distance) { // Если дистанция у участников гонки равна.
            leaderName= "Будет известна, после просмотра ФотоФиниша";
        }
    }
    //Возвращаем имя лидера:
    public String getLeaderName() {
        return leaderName;
    }
}
