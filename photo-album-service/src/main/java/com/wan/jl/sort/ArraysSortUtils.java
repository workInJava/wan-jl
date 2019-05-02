package com.wan.jl.sort;

public class ArraysSortUtils {



    public static void main(String[] args){
        int[] a = {3,5,8,1,76,21,23,45,67,12,11};
       // bubbleSort(a);
        quickSort(a, 0, a.length-1);
        for(int aa : a)
            System.out.print(aa+",");
    }


    //冒泡排序
    public static void bubbleSort(int[] a){
        int temp;
        int size = a.length;
        for(int i=1;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
//            for(int aa : a)
//                System.out.print(aa+",");
//            System.out.println();
        }
    }

    //快速排序
    public static void quickSort(int[] arr, int start, int end) {
        if (end <= start) {
            return;
        }
        int low = start;
        int high = end;
        int pivot = arr[low];
        while (low < high) {

            while (low < high && arr[high] >= pivot) {
                high--;
            }

            arr[low] = arr[high]; // 将小于 pivot 的数放在地位
            while (low < high && arr[low] <= pivot) {
                low++;
            }

            arr[high] = arr[low]; // 将大于 pivot 的数放在高位
        }

        arr[low] = pivot;
        quickSort(arr, start, low - 1); // 递归排序左半部分
        quickSort(arr, low + 1, end); // 递归排序右半部分
    }



}
