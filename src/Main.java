
public class Main {

	public static void main(String args[]) {
        final int limit = 1000;
        final int rows = 50;
        final int cols = 4;
    
        NumberFamilies operationClass = new NumberFamilies();
        PrintService printService = new PrintService();
    
        printService.PrintConsole(operationClass.GetPrimeNumbers(limit), limit, rows, cols);
    }
    
}
