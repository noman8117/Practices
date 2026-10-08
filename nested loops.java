import java.util.Scanner;
/**
 * nested loops
 */
public class nested_loops {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int rows ;
    int columns;
    String symbol;
     System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();
    System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();
    System.out.print("Enter a symbol to use: ");
        symbol = scanner.next();
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=columns; j++){
            System.out.print(symbol);
        }
        System.out.println();
    }
    
    }
}