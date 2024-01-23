
public class Main {
    public static void main(String[] args) {
        String hello = "Hello world, I love you? 50 rmm50 ggg ; 666  ffsfs";

        String string = "";
        String regex = "[^a-zA-Z]+";
        String[] words = hello.split(regex);
        String lastElement = words[words.length - 1];
        for (String word : words){
            string = string + word.replaceAll(regex,"");
            if (word != lastElement) string = string +  "\n";
        }
        System.out.println(string);
        System.out.println("саша");

    }
}