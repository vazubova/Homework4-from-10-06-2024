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

        int childAge = 3;

        if ( childAge < 5) {

            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе");
        }

        if ( childAge >= 5 && childAge < 14) {

            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }

        if ( childAge >= 14 ) {

            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого");
        }

        int countOfPeople = 103;

        if ( countOfPeople < 60) {

            System.out.println("Есть сидячие места в вагоне");
        }

        else if (countOfPeople >= 60 && countOfPeople < 102) {

            System.out.println("В вагоне есть стоячие места");
        }

        else {

            System.out.println("В вагоне нет мест");
        }




        }

    }


