package AccessModifiers.Two;
// Доступ в классе-наследнике к членам класса родителя (public) из другого пакета.
// Требует импорта из другого пакета.
import AccessModifiers.One.Protection_pub;

// Все переменные недоступны, кроме переменной, объявленной public.
// Все методы, кроме метода, объявленного private, можно переопределить.
// Все методы, кроме метода, объявленного public, недоступны здесь.

public class ExtendsProtections_pub2 extends Protection_pub {

    // Метод с доступом по умолчанию НЕ переопределяется, т.к. его не видно из другого пакета
    void Protection () {
        System.out.println("Вызван метод без модификатра (по умолчанию) из пакета Two (class ExtendsProtection_pub2), который не получилось переопределить");
        System.out.println("Не удалось отобразить int n, поскольку переменная с модификатором доступа по умолчанию доступна только в рамках пакета");
        System.out.println("Не удалось отобразить private int n_pri, поскольку переменная с модификатором доступа private доступна только в рамках класса");
        System.out.println("Отобразить protected int:" + n_pro); // Видно в пакете
        System.out.println("Отобразить public int:" + n_pub); // Видно везде
    }
    // Метод с доступом public переопределяется
    public void Protection_pub () {
        System.out.println("Вызван переопределенный метод с доступом public из пакета Two (class ExtendsProtection_pub2)");
        System.out.println("Не удалось отобразить int n, поскольку переменная с модификатором доступа по умолчанию доступна только в рамках пакета");
        System.out.println("Не удалось отобразить private int n_pri, поскольку переменная с модификатором доступа private доступна только в рамках класса");
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    // Метод с доступом private НЕ переопределяется
    private void Protection_pri (){
        System.out.println("Вызван метод с доступом private из пакета One (class ExtendsProtection), который не получилось переопределить");
        System.out.println("Не удалось отобразить int n, поскольку переменная с модификатором доступа по умолчанию доступна только в рамках пакета");
        System.out.println("Не удалось отобразить private int n_pri, поскольку переменная с модификатором доступа private доступна только в рамках класса");
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    // Метод с доступом protected переопределяется в данном пакете
    protected void Protection_pro (){
        System.out.println("Вызван переопределенный метод с доступом protected из пакета One (class ExtendsProtection)");
        System.out.println("Не удалось отобразить int n, поскольку переменная с модификатором доступа по умолчанию доступна только в рамках пакета");
        System.out.println("Не удалось отобразить private int n_pri, поскольку переменная с модификатором доступа private доступна только в рамках класса");
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
/*
    public static void main(String[] args) {
        ExtendsProtections_pub2 ivi = new ExtendsProtections_pub2();
        ivi.Protection();
        ivi.Protection_pub();
        ivi.Protection_pri();
        ivi.Protection_pro();
        ivi.n_pub = 10;
        ivi.n_pro = 20;
        System.out.println(ivi.n_pub+ ivi.n_pro);
    }*/

    /*public static void main(String[] args) {
        Protection_pub protection = new Protection_pub();
        protection.n = 8; НЕ ВЫЗЫВАЕТСЯ
        protection.n_pub = 9; вызывается
        protection.n_pri = 9; НЕ ВЫЗЫВАЕТСЯ
        protection.n_pro = 9; НЕ ВЫЗЫВАЕТСЯ
        protection.Protection(); НЕ ВЫЗЫВАЕТСЯ
        protection.Protection_pub(); вызывается
        protection.Protection_pro(); НЕ ВЫЗЫВАЕТСЯ
        protection.Protection_pri(); НЕ ВЫЗЫВАЕТСЯ
     */
    }
