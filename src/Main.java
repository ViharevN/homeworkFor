public class Main {
    public static void main(String[] args) {
        //задание 1
        int age = 18;

        if (age >= 18) {
            System.out.println("поздравляем с совершеннолетием");
        }
        else {
            System.out.println("совершеннолетие еще не наступило и нужно еще немного подождать");
        }
        //задание 2

        int ageOne = 7;
            if (ageOne >=7 && ageOne<18)
            {
            System.out.println("ребенок ходит в школу");
            } else if (ageOne >= 18&&ageOne<24) {
                System.out.println("человек уже закончил школу и может отправляться в университет");
            } else if (ageOne >=24) {
                System.out.println("человек окончил университет и ему пора искать первую работу");
            }
        //задание 3

        int places = 60;
        int humansPlacesSits = 60;//люди на сидячие места
        int humans = 102;
        int placesStand = humans-places;
        int humansPlacesStand = 42;//люди на стоячие места
        if (humansPlacesSits > places ) {
            System.out.println("сидячие места отсутствуют");
        } else if (humansPlacesSits <= places) {
            System.out.println("места еще есть");
        }
        if (humansPlacesStand >placesStand) {
            System.out.println("стоячих мест нет");
        } else if (humansPlacesStand <= placesStand) {
            System.out.println("стоячие места еще есть");
        }
        //домашнее задание 3
        //задание 1

        int ageHuman = 18;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("нужно ходить в школу");
        } else if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("место человека в университете");
        } else if (ageHuman >= 24) {
            System.out.println("человеку пора ходить на работу");
        }
        //домашнее задание 3
        //задание 2

        int ageChild = 7;
        if (ageChild < 5) {
            System.out.println("ребенок не может кататься на аттракционе");
        } else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("ребенок может кататься на аттракционе в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (ageChild >= 14) {
            System.out.println("ребенок может кататься без сопровождения взрослого");
        }
        //домашнее задание 3
        //задание 3

        int one = 111112;
        int two = 12;
        int free = 3443;

        if (one > two && one > free) {
            System.out.println(one);
        } else if (two > one && two >free) {
            System.out.println(two);
        } else if (free > one && free >two) {
            System.out.println(free);
        }


    }
}