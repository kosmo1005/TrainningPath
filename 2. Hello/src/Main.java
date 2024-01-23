public class Main {
    public static void main(String[] args) {
        GetSet girl1 = new GetSet("Маша", 25);
        GetSet girl2 = girl1.setAge(45);
        System.out.println(girl1.getAge());
        System.out.println(girl2.getAge());

    }




}
