public class Arrays {
    public static void main (String[] args){
        int a = 10; //римитивный тип данных. Переменная а имеет значение 10.
        int[] b = new int[5]; // массив. Переменная b ссылается на массив с количеством ячеек 5
        int[] sosedi = {7,14,22,15,1,77};
        System.out.println(sosedi [5]);
        int[] shishki = new int[10];
        for (int r=0; r<shishki.length;r++) {
            shishki[r] = r * 10;
            System.out.println(shishki[r]);
        }
    }
}
