package AccessModifiers.One;
// Модификаторы доступа protected и private относятся
// только к классам-членам внутри непосредственно включающего объявления класса.
// К классам верхнего уровня недопустимо применять модификаторы доступа protected и private.

public class Protection_pri {
    // Объявляю внутренний класс private
    private class Protections_pri1 {
        int n = 1;
        private int n_pri = 2;
        protected int n_pro = 3;
        public int n_pub = 4;

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

}
