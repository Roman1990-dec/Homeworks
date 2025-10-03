package Homework_1;

public class TaskFourth {
    public static void main(String[] args) {
        //задаём значение переменной n (вещественное число с ненулевой дробной частью)
        double n = 8.5;
        //округление числа n до ближайшего целого
        long rounded = Math.round(n);
        //выводим результат округления
        System.out.println("Значение переменной n=" + n);
        System.out.println("Тогда округленное значение для n будет=" + rounded);
        }
}
