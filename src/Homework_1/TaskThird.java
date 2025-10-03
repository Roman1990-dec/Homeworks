package Homework_1;

public class TaskThird {
    public static void main(String[] args){
        //задаём значение переменной n
        int n=906;
        //вычисление 1,2 и 3 цифры в переменной n
        int sot=n/100; //получение сотни
        int des=(n%100)/10; //получение десятка
        int edin=n%10; //получение единицы
        //подсчет суммы цифр
        int sum=sot+des+edin;
        //выводим значение
        System.out.println("Если n="+n+" ,то сумма цифр числа n="+sum);
    }
}
