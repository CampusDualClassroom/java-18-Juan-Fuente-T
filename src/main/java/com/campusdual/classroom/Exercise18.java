package com.campusdual.classroom;

import static com.campusdual.util.Utils.integer;

public class Exercise18 {

    public static void main(String[] args) {
        int arrySize = integer("Introduce un numero ");

        int[] intArray = createAndInitializeArray(arrySize);

        showInlineArray(intArray);
    }

    public static int[] createAndInitializeArray(int num) {
        int[] intArray = new int[num];
        for (int i = 0; i < num; i++) {
            intArray[i] = i + 1;
        }
        return intArray;
    }

    public static void showInlineArray(int[] intArray) {
//		StringJoiner joiner = new StringJoiner(" ");
////		for (int num: intArray) {
////			joiner.add(String.valueOf(num));
////		}
//		System.out.print(joiner);
        StringBuilder builder = new StringBuilder();
        for (int num : intArray) {
            builder.append(num);
            builder.append(" ");
        }
        builder.delete(builder.length() - 1, builder.length());
        System.out.println(builder);
    }
}

