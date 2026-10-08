/**
 * 2D_arrays
 */
public class twoD_arrays {
    public static void main(String[] args) {
    String[][] cars={
        {"Volvo", "BMW", "Ford", "Mazda"},
        {"Volvo", "BMW", "Ford", "Mazda"},
        {"Volvo", "BMW", "Ford", "Mazda"}
    };
    for(int i=0; i<cars.length; i++){
        for(int j=0; j<cars[i].length; j++){
            System.out.print(cars[i][j] + " ");
        }
        System.out.println();
    }
}
}