public class toString {
    public static void main(String[] args) {
        Human h1 = new Human("Archi",66);
        System.out.println(h1);
    }
}
    class Human{
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+","+age;
    }
}


