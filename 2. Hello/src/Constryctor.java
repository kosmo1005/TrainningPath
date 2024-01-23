public class Constryctor {
    public static void main(String[] args) {
        Human h1 = new Human("Анатолий",68);
        h1.setAge(15);
        Human h2 = new Human("Виктор",27);
        h1.getAllFields();
        h2.getAllFields();
        h1.chisloSotrudniki();

    }
    static class Human{
        private String name;
        private int age;
        private static int sotrudniki;

        public Human (){
            System.out.println("Первый конструктор");
        }
        public Human (String name){
            System.out.println("Второй конструктор");
            this.name = name;
        }
        public Human (String name, int age){
            this.name = name;
            this.age = age;
            sotrudniki++;
        }
        public void setName (String name) {this.name = name;}
        public void setAge (int age) {this.age = age;}
        public void getAllFields(){
            System.out.println(name+","+age);
        }
        public void chisloSotrudniki (){
            System.out.println("Всего сотрудников "+sotrudniki);
        }

    }
}
