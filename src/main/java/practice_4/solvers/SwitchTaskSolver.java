package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
//        Проверка метода по определению дня недели
//        System.out.println(checkDayOfWeek(5));
//        System.out.println(checkDayOfWeek(1));
//        System.out.println(checkDayOfWeek(52));

//        Проверка метода по описанию сезона
        System.out.println(describeSeason(Season.SUMMER));
        System.out.println(describeSeason(Season.WINTER));
    }


    public static String checkDayOfWeek(int day) {
        String dayName ="";

        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неизвестный день недели";
        }

        return dayName;
    }

    public static String describeSeason(Season season){
String description = "";

        switch (season){
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case SPRING -> description = "Весна - всё цветёт.";
            case AUTUMN -> description = "Осень - время перемен.";
        }
        return description;
    }
}
