public class GetSet {

    private final String name;
    private final int age;

    public GetSet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public GetSet setName(String name) {
        return new GetSet(name, age);
    }

    public int getAge() {
        return age;
    }

    public GetSet setAge(int age) {
        return new GetSet(name, age);
    }

}
