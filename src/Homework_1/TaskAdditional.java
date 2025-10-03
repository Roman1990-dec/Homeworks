package Homework_1;

// Программа, которая меняет местами значения целочисленных переменных a и b
public class TaskAdditional {
    public static void main(String[] args){
        //задаём значение переменных a и b
        int a=128;
        int b=1;
        System.out.println("Первоначальные значения переменных a="+a+" b="+b);
        //меняем значения местами без временной переменной
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Измененные значения переменных a="+a+" b="+b);
    }
}
