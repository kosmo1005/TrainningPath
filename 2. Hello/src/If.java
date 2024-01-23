public class If {
    public static void main(String[] args) {
        /* if это условие. Если условие true, то выполняется тело метода. Если условие if false,
        *то выполняется тело else
        */
        if (5==4){
            System.out.println("Воют рыжие коты");
        } else {
            System.out.println("Воют чёрные коты");
        }
        for (int a = 1;a<8;a++){
            if (a<=4){
                System.out.println("В "+a+" день весны "+"воют рыжие коты");
            } else if (a>4){
                System.out.println("В "+a+" день весны "+"Воют чёрные коты");
            }
        }
    }
}
