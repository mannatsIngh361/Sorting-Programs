public class Selection{
    static void selecsort(int [] arr){
        int n = arr.length;
        for(int i =0; i<n-1;i++){
            int minIndex= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex])
                    minIndex =j;
                
            }
            int temp =arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]= temp;
            
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
        public static void main(String[] args) {
            int[] arr = {18,88,32,41,4,5,66,19};
            selecsort(arr);
        }
    }



