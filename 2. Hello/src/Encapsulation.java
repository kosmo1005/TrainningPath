public class Encapsulation {
    public static void main(String[] args) {
        //(код для вывода в интерфейс)"Анкета для вступления в армию бабок воителей."
        BabkiVoiteli babki  = new BabkiVoiteli();
        //(код для вывода в интерфейс)"Заполните Ваше имя."
        babki.setname("Нина");
        //(код для вывода в интерфейс)"Укажите ваше любимое оружие."
        babki.setweapon("Грозовой молот");
        //(код для вывода в интерфейс)"Укажите вашу основную магическую способность."
        babki.setmagicPower("Чёрный вой опустошения");
        System.out.println("Имя: "+babki.getname());
        System.out.println("Оружие: "+babki.getweapon());
        System.out.println("Способность: "+babki.getmagicPower());
    }
}
class BabkiVoiteli {
    private String name;
    private String weapon;
    private String magicPower;
    public void setname(String name){
        if(name.isEmpty()) {
            System.out.println("Такого имени не существует");
        }else{this.name = name;}
    }
    public String getname(){return name;}
    public void setweapon(String weapon){if(weapon.isEmpty()){
        System.out.println("Недопустимое оружие");}else {this.weapon = weapon;}}
    public String getweapon(){return weapon;}
    public void setmagicPower(String magicPower){if(magicPower.isEmpty()){
        System.out.println("Недопустимая магия");}else{this.magicPower = magicPower;}}
    public String getmagicPower(){return magicPower;}
    }


