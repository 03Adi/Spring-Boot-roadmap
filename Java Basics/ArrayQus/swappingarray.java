// //Without built-in method

// package ArrayQus;

// class swappingarray{
//     public static void main(String[] arg){

//         int arr[]={1,2,3,4,5};

//         System.out.println("Before Swapping: ");
//         printArray(arr);

//         int index1=0; //1st element in arr
//         int index2=3; //4th element in arr

//         int temp=arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]= temp;

//         System.out.println("After swapping: ");
//         printArray(arr);
//     }
//     public static void printArray(int arr[]){
//         for(int num:arr){
//             System.out.print(num+ " ");
//         }
//         System.out.println();
//     }
// }

////swapping of array using built-in method

// package ArrayQus;
// import java.util.*;

// class swappingarray{
//     public static void main(String[] arg){

//         Integer arr[] = {1,2,3,4,5};

//         System.out.println("Before Swapping: " + Arrays.toString(arr));

//         //array as a list leke usko collection swap method se swap kr lenge
//         List<Integer> list =Arrays.asList(arr);
//         Collections.swap(list,1,4);

//         System.out.println("After swapping: " + Arrays.toString(arr));

//     }
// }