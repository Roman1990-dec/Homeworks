package Homework_1;

public class TaskSecond {
    public static void main(String[] args){
        //задаём переменную n
        int n=69;
        //вычисление первой и второй цифры в числе
        int first=n/10; //определяем первую цифру
        int second=n%10; //определяем вторую цифру
        //подсчет суммы цифр
        int sum=first+second;
        //выводим значение
        System.out.println("Если n="+n+" ,то сумма цифр числа n="+sum);
    }
}
