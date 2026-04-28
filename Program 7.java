import java.util.*;

class Array1D {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();

        System.out.print("Array: ");
        for(int i:arr)
            System.out.print(i+" ");

        System.out.print("\nReverse: ");
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}