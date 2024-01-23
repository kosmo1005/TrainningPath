package AccessModifiers.One;

//public class ExtendsProtection_pri extends Protection_pri1
//не получается унаследоваться от приватногоь вложенного класса

//Пробуем получить переменные и методы из приватного класса через внешний класс
public class ExtendsProtection_pri extends Protection_pri {
    ExtendsProtection_pri ivi = new ExtendsProtection_pri();
    //ivi.n = 8;
    //ivi.Protection
    // Невозможно получить переменные и методы из вложенного приватного класса
}
