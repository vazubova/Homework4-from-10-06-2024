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


        }

    }


