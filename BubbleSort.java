public class BubbleSort {
    static void bubble(int []arr){
        int i,j,temp, n = arr.length;
          boolean swap;
        for(i =0;i<n-1;i++ ){
            swap = false;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    swap = true;

                }
               
            }
            if(swap==false) break;

            
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String[] args) {
        int[] arr={ 5,7,9,15,32,2};

        bubble(arr);


    }
}
