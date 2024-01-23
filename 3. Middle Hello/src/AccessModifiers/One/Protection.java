package AccessModifiers.One;
// В первом пакете создаем класс Protection с доступом по умолчанию
class Protection {
    // Создаем переменные со всеми модификаторами доступа
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    // Создаем методы со всеми модификаторами доступа
    void Protection (){
        System.out.println("Вызван метод из пакета One (class Protection) без модификатра (по умолчанию)");
        System.out.println("Отобразить int:" + n);
        System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    public void Protection_pub (){
        System.out.println("Вызван метод из пакета One (class Protection) с модификатором public");
        System.out.println("Отобразить int:" + n);
        System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    private void Protection_pri (){
        System.out.println("Вызван метод из пакета One (class Protection) с модификатором private");
        System.out.println("Отобразить int:" + n);
        System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    protected void Protection_pro (){
        System.out.println("Вызван метод из пакета One (class Protection) с модификатором protected");
        System.out.println("Отобразить int:" + n);
        System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
}
