package com.KonstKudryavtsev;

/*
Дан пустой массив из 15 элементов. На вход подаются 15 различных чисел, каждое из которых больше 15.
Нужно заполнить массив по следующему алгоритму: взять значение входного числа по модулю 15 и положить
в ячейку массива с соответствующим номером. В случае, если ячейка занята, положить в ячейку
с номером i + 3 (где i – изначально получившийся номер ячейки).
Так до тех пор, пока не удастся положить число в массив. В случае зацикливания кинуть исключение.
 */

public class FillArrayClass {

    public static long[] fillArray(long[] arr) throws Exception{

        long []resultArr = new long[15];
        int cellNum = 0;
        int zeroOccupied = 0;

        for (int i = 0; i < 15; i++) {

            cellNum = (int) (arr[i] % 15);

            if (cellNum == 0 ) {
                if (zeroOccupied == 1)
                    throw new Exception();
                zeroOccupied = 1;
                continue;
            }

            tryNextCell(resultArr, cellNum);

            resultArr[cellNum] = cellNum;
        }
        return resultArr;
    }

    private static void tryNextCell(long[] resultArr, int cellNum) throws Exception{

            if (cellNum > 14) {
                throw new Exception();
            }
            if (resultArr[cellNum] != 0) {   // ячейка занята
                cellNum += 3;
                tryNextCell(resultArr, cellNum);
            }
            else resultArr[cellNum] = cellNum;


    }
}
