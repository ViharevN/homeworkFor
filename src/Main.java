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
            if (ageOne >=7&&ageOne<18)
            {
            System.out.println("ребенок ходит в школу");
            } else if (ageOne >= 18&&ageOne<24) {
                System.out.println("человек уже закончил школу и может отправляться в университет");
            } else if (ageOne >=24) {
                System.out.println("человек окончил университет и ему пора искать первую работу");
            }


    }
}