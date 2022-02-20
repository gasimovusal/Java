package practicequestionsession.practice03;

public class Q04 {

    public static void main(String[] args) {

        int arr[] = {3, 1, 7, 9, 4, 23, 12};

        //print just last two elements -- use continue

        for(int i=0; i< arr.length; i++){

            if(i<arr.length-2){
                continue; //skipping all the other option after reaching arr.length-2
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //print first 3 element and use break keyword

        for (int i=0; i< arr.length; i++){
            if(i>2){
                break;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //print the elements from index 2 to 4 ==>
        for(int i=0; i<arr.length; i++){
            if(i<2){
                continue;
            }
            if(i>4){
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
