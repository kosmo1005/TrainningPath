public class ClassesAndObjects {
    public static void main(String[] args) {
        Cheloveki cheloveki1 = new Cheloveki();
        cheloveki1.name = "Ivan";
        cheloveki1.age = 66;
        System.out.println("Меня зовут "+cheloveki1.name+", "+"мне "+cheloveki1.age+" и я алкоголик.");
        Cheloveki cheloveki2 = new Cheloveki();
        cheloveki2.name = "Boris";
        cheloveki2.age = 74;
        System.out.println("Меня зовут "+cheloveki2.name+", "+"мне "+cheloveki2.age+" и я алкоголик.");
        cheloveki1.speak();
        cheloveki2.speak();
        for (int i=0; i<3; i++){
            System.out.println("Аплодисменты из зала");
        }
        int gift1 = cheloveki1.gift();
            System.out.println("Ведущий дарит "+cheloveki1.name+" "+gift1+" бутылок виски");
        int gift2 = cheloveki2.gift();
            System.out.println("Ведущий дарит "+cheloveki2.name+" "+gift2+" бутылок виски");
    }
    static class Cheloveki{
        String name;
        int age;
       void speak(){
           System.out.println(name+" говорит, что тот кому "+age+", виски греет душу");
       }
        int gift(){
            int gifts = age;
            return gifts;
        }
    }
    // Класс имеет:
    // 1. Данные (поля) (по аналогии с людьми: вес, рост, количество зубов).
    // 2. Действия (методы) (по аналогии с людьми: бегать, прыгать, спать до 12).

    // Метод можно создать внутри одного класса и вызывать его из другого класса.
}
