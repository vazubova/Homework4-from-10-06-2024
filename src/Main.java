import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int age = 19;

        if (age  >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        else {

            System.out.println("Если возраст человека равен " + age +  ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 2;

        if (temperature < 5 ) {

            System.out.println("На улице холодно, нужно надеть шапку");

        }

        else {
            System.out.println("Сегодня тепло, можно идти без шапки");

        }

        int speed = 59;

        if (speed > 60) {

            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }

        else {

            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int years = 3;

        if (years >= 2 && years <= 6) {

            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
        }

        if (years >= 7 && years <= 18) {

            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
        }

        if (years >= 18 && years <= 24) {

            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
        }

        if (years > 24) {

            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
        }


        }

    }


