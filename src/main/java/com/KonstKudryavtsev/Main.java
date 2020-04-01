package com.KonstKudryavtsev;

/*
Дан пустой массив из 15 элементов. На вход подаются 15 различных чисел, каждое из которых больше 15.
Нужно заполнить массив по следующему алгоритму: взять значение входного числа по модулю 15 и положить
в ячейку массива с соответствующим номером. В случае, если ячейка занята, положить в ячейку
с номером i + 3 (где i – изначально получившийся номер ячейки).
Так до тех пор, пока не удастся положить число в массив. В случае зацикливания кинуть исключение.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        checkArraySize(args);
        FillArrayClass.fillArray(tryParse(args));
    }

    private static void checkArraySize(String[] args) {
        if (args.length != 15) {
            System.out.println("Please, run the program with 15 numbers separated by spaces!");
            System.exit(-1);
        }
    }

    private static long[] tryParse(String[] args) {
        long parsedLong = 0L;
        long []arr = new long[15];
        int i = 0;
        for (String s: args) {
            try {
                parsedLong = Long.parseLong(s);
                if (parsedLong <= 15) {
                    System.out.println("At least one of the numbers is less or equal to 15!");
                }
                arr[i++] = parsedLong;
            } catch (NumberFormatException e){
                System.out.println("Please, run the program with correct arguments!");
                System.exit(-1);
            }
        }
        return arr;
    }
}
