package bai_tap_tuan_31;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("nhap do dai mang: ");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("phan tu thu " + i + ": ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        arr = bubbleSort(arr);

        System.out.println();
        int column = n;
        int row = arr[n - 1];
        int[][] a = new int[column][row];
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            // tim uoc cua arr[i]
            int[] temp = FindU(arr[i]);


            a[i][0] = arr[i];

            for (int j = 0; j < temp.length; j++) {


                for (int z = 0; z < i; z++) {

                    if (arr[z] == temp[j]) {
                        a[i][index] = arr[z];
                        index++;
                    }

                }

            }
            index = 1;
        }
        for (int i = 0; i < column; i++) {
            System.out.println("uoc thuc su " + a[i][0] +":");
            int count = -1;
            for (int j = 1; j < row; j++) {
               if(a[i][j] != 0){

                   System.out.print(a[i][j] + " ");
               }else{
                   count++;
               }
               if(count == (row-2)) {
                   System.out.println("null");
               }
            }
            count = -1;
            System.out.println();
        }
     }
	public static int[] FindU(int a) {
        int[] temp = new int[a];
        int z = 0;
        for (int i = 1, j = 0; i < a; i++) {
            if (a % i == 0) {
                temp[j++] = i;
            }
            z = j;
        }
        int[] answer = new int[z];
        for (int i = 0; i < z; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }



	
        

}
