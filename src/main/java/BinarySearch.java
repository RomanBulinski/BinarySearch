
public class BinarySearch {

    public boolean binarySearch(  int[] arr, int number  ){

        int start =0;
        int end = arr.length-1;

        if( arr.length == 1 && arr[start] == number )
            return true;

        while (start+1 < end) {

            if( arr[start]==number)
                return true;
            if( arr[end]==number)
                return true;

            int midle = (end-start) /2 + start;

            if( arr[midle]==number){
                return true;
            }else{
                if( number < arr[midle] ){
                    end = midle;
                }
                if( number > arr[midle] ){
                    start = midle;
                }
            }
        }
        return false;
    }


}
