public class Main {

    public static void main(String[] args) {
        System.out.println("Задача №1_________________________________________________________________________");
        int human1 = 18;
        if (human1 >= 18) {
            System.out.printf("«Если возраст человека равен %s он совешенолетний».\n", human1);
        }
        int human2 = 17;
        if (human2 < 18) {
            System.out.printf("«Если возраст человека равен %s он не достиг совершеннолетия, нужно немного подождать».\n", human2);
        }

        System.out.println("\nЗадача №2_________________________________________________________________________");
        int temperature1 = 3;
        if (temperature1 < 5) {
            System.out.printf("«На улице %s градусов, нужно надеть шапку».\n", temperature1);
        }
        int temperature2 = 6;
        if (temperature2 > 5) {
            System.out.printf("«На улице %s градусов, можно идти без шапки».\n", temperature2);
        }

        System.out.println("\nЗадача №3_________________________________________________________________________");

        int speed1 = 65;
        if (speed1 > 60) {
            System.out.printf("«Если скорость %s, то придется заплатить штраф».\n", speed1);

        }
        int speed2 = 55;
        if (speed2 < 60) {
            System.out.printf("«Если скорость %s, то можно ездить спокойно».\n", speed2);
        }

        System.out.println("\nЗадача №4_________________________________________________________________________");
        int person = 18;
        if (person > 24) {
            System.out.printf("«Если возраст человека равен %s, то ему пора ходить на работу».\n", person);
        } else if (person >= 2 && person <= 6) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в детский сад»».\n", person);
        } else if (person >= 7 && person <= 17) {
            System.out.printf("«Если возраст человека равен %s, то ему нужно ходить в школу».\n", person);
        } else if (person > 17 && person <= 24) {
            System.out.printf("«Если возраст человека равен %s, то его место в университете.».\n", person);
        }

        System.out.println("\nЗадача №5_________________________________________________________________________");
        int child = 14;
        if (child < 5) {
            System.out.printf("«Если возраст ребенка равен %s, то он не может кататься на аттракционе».\n", child);
        } else if (child >= 5 && child < 14) {
            System.out.printf("«Если возраст ребенка равен %s, то то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.».\n", child);
        } else if (child >= 14) {
            System.out.printf("«Если возраст ребенка равен %s, то он может кататься без сопровождения взрослого.».\n", child);
        }
        System.out.println("\nЗадача №6_________________________________________________________________________");
        int human = 103;
        if (human <= 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (human >= 61 && human <= 102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (human >= 103) {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("\nЗадача №7_________________________________________________________________________");
        int one = 1;
        int two = 2;
        int three = 3;

        if  (one < two || one< three ) {
            System.out.println("one меньше two");
        } else if (two < three) {
            System.out.println("two меньше three");
        }else if (three>two || three>one){
            System.out.println("three больше всех");
        }
    }
}