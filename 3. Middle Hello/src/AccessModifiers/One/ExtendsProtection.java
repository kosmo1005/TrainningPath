package AccessModifiers.One;
// Доступ в классе-наследнике к членам класса родителя (без модификатора доступа) в рамках одного пакета.
// Доступны все переменные, кроме переменной, объявленной private.
// Все методы, кроме метода, объявленного private, можно переопределить.
// Все методы, кроме метода, объявленного private, можно вызвать отсюда.
class ExtendsProtection extends Protection {
    // Метод с доступом по умолчанию переопределяется
    void Protection () {
        System.out.println("Вызван метод без модификатра (по умолчанию) из пакета One (class ExtendsProtection)");
        System.out.println("Отобразить int:" + n); // Видно внутри пакета
        //System.out.println("Отобразить private int:" + n_pri);
        //Здесь нельзя вывести переменную n_pri, поскольку она объевлена private в другом классе.
        System.out.println("Отобразить protected int:" + n_pro); // Видно в пакете
        System.out.println("Отобразить public int:" + n_pub); // Видно везде
    }
    // Метод с доступом public переопределяется
    public void Protection_pub () {
        System.out.println("Вызван переопределенный метод с доступом public из пакета One (class ExtendsProtection)");
        System.out.println("Отобразить int:" + n);
        //System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    // Метод с доступом private НЕ переопределяется
    private void Protection_pri (){
        System.out.println("Вызван метод с доступом private из пакета One (class ExtendsProtection), который не получилось переопределить");
        System.out.println("Отобразить int:" + n);
        //System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }
    // Метод с доступом protected переопределяется в данном пакете
    protected void Protection_pro (){
        System.out.println("Вызван переопределенный метод с доступом protected из пакета One (class ExtendsProtection)");
        System.out.println("Отобразить int:" + n);
        //System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить private int не удалось, т.к. она не доступна за пределами своего класса");
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);
    }

    /* public static void main(String[] args) {
        Protection protection = new Protection();
        protection.Protection(); вызывается
        protection.Protection_pub(); вызывается
        protection.Protection_pro(); вызывается
        //protection.Protection_pri(); НЕ ВЫЗЫВАЕТСЯ
     */
    }
