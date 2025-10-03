package Homework_1;

public class TaskFifth {
    public static void main(String[] args){
        //задаём значение переменных q и w (натуральные числа)
        int q=6;
        int w=5;
        //проверка деления на 0
        if (w==0){
            System.out.println("Ошибка: Деление на 0");
            return;
        }
        //расчет результата деления q на w с остатком
        int result=q/w; //целое число без остатка
        int ostat=q%w;  //остаток
        //вывод результата
        System.out.println("Если q="+q+" и w="+w+" то q/w="+result+" и "+ostat+" в остатке");

    }
}
