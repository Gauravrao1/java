//Q-20 reverse  array using swap without creating new array
public class ArrayRotator  {
static  void swapinarr(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
static void printarry(int arr[]){
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"  ");
    }
    System.out.println();
    }


    static void reverseArry(int []arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            swapinarr(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverseArry(arr);

        printarry(arr);

    }
}
