//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");//Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + " " + age + "," + " " + "то он совершеннолетний.");
        } else {
            System.out.println("Усли возраст человека равен" + " " + age + "," + "то он не достиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println();
        System.out.println("Задание 2");//Задание 2
        int temperature = 5;
        if (temperature <= 5) {
            System.out.println("На улице" + " " + temperature + " " + "градусов,нужно надеть шапку.");
        } else {
            System.out.println("На улице" + " " + temperature + " " + "градусов,можно идти без шапки.");
        }
        System.out.println();
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость" + " " + speed + "," + "то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость" + " " + speed + "," + "то можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задание 4");
        int year = 24;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен" + " " + year + "," + "то ему нужно ходить в детский сад.");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен" + " " + year + "," + "то ему нужно ходить в школу.");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен" + " " + year + "," + "то его место в университете.");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен" + " " + year + "," + "то ему пора ходить на работу.");
        }
        System.out.println();
        System.out.println("Задание 5");
        int ageKid = 2;
        if (ageKid <5){
            System.out.println("Если возраст ребенка равен"+" "+ ageKid +","+"то ему нельзя кататься на аттракционе.");
        }
        if (ageKid >5 && ageKid <=14){
            System.out.println("Если возраст ребенка равен"+" "+ ageKid +","+"то ему можно кататься на аттракционе в сопровождении.");
        }
        if (ageKid>14){
            System.out.println("Если возраст ребенка равен"+" "+ ageKid +","+"то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
        System.out.println();
        System.out.println("Задание 6");
        int passengers=70;
        int totalPassengers=102;
        int seatingPassengers=60;
        if (passengers<seatingPassengers){
            System.out.println("В вагоне есть свободные сидячие места");
        }else if (passengers<totalPassengers){
            System.out.println("В вагоне есть свободные стоячие места");
        }else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();
        System.out.println("Задание 7");
        int one=11;
        int two=6;
        int three=3;
        if (one>two && one>three){
            System.out.println("Наибольшее число:"+" "+one);
        }else if (two>one && two>three){
            System.out.println("Наибольшее число:"+" "+two);
        }else {
            System.out.println("Наибольшее число:"+" "+three);
        }



    }
}