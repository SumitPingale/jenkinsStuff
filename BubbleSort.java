

public class BubbleSort {

    public static void main(String args[]){

        int [] intArray = {1 ,3,5,2,4,6,7,8};

        for(int lastIndex = intArray.length -1 ; lastIndex > 0 ; lastIndex--){
            for(int i =0 ;i<intArray.length-1;i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray,i ,i+1);
                }
            }

        }
        for(int i =0 ;i<intArray.length;i++){
          System.out.print(intArray[i]);
        }

    }

    private static void swap(int[] intArray, int i, int j) {
        if(intArray[i]==intArray[j]){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j]= temp;
    }
}
