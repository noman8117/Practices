public class oopday2 {

     public static void main(String[] args) {

        int [][]arr=new int[3][4];
        int [][]arr2 = {
                {1,2,3},
                {12,23,45,56},
                {123,234,345,456,789}
        };

       for (int i =0;i<arr2.length;i++){

           for (int j = 0 ; j<arr2[i].length;j++ ){

               System.out.print(arr2[i][j] + " ");
           }
           System.out.println();

       }
        printing_2dArray(arr2);

        int summation = sumof2dArray(arr2);

        System.out.println("Sum of the 2D Array = "+ summation);

    }

    public  static  int sumof2dArray(int a[][]){

        int sum =0;

        for (int i =0;i<a.length;i++){
            for (int j = 0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }

        return sum;

    }

    public static void printing_2dArray(int a[][]){


        for(int i = 0 ; i < a.length; i++){
            for (int j = 0 ; j < a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
    }
