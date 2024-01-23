package AccessModifiers.One;
// Доступ в другом классе к членам класса (без модификатора доступа) в рамках одного пакета.
// Доступны все переменные, кроме переменной, объявленной private.
// Все методы, кроме метода, объявленного private, можно вызвать отсюда.
class SomeProtection {

    /* Метод не наследуется, поскольку данный клас не потомок класса Protection.
          следовательно, этот метод не может обратиться к переменным, которых нет в этом классе.
       Данный метод в классе Protection не имеет ключ слова static, по этому его можно вызвать только через объект.

    void Protection (){
        System.out.println("Вызван метод из пакета One (class Protection) без модификатра (по умолчанию)");
        System.out.println("Отобразить int:" + n);
        System.out.println("Отобразить private int:" + n_pri);
        System.out.println("Отобразить protected int:" + n_pro);
        System.out.println("Отобразить public int:" + n_pub);}
    */
    // Вызываю переменные и методы через объект.
    /* public static void main(String[] args) {
        Protection protection = new Protection();
        protection.n = 5;
        protection.n_pub = 6;
        protection.n_pro = 7;
        //protection.n_pri = 8; НЕ ВЫЗЫВАЕТСЯ
        protection.Protection();
        protection.Protection_pub();
        protection.Protection_pro();
        //protection.Protection_pri(); НЕ ВЫЗЫВАЕТСЯ
    }
     */
}
