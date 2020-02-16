
public class PrintService implements IPrintService {

	public void PrintConsole(int[] numbers, int totalRows, int maxRows, int maxCols) {
        int pageNumber;
        int pageOffset;
        int rowOffset;
        int colIndex;
        pageNumber = 1;
        pageOffset = 1;
        while (pageOffset <= totalRows)
        {
            System.out.print("The First " + Integer.toString(totalRows) + " Prime Numbers === Page " + Integer.toString(pageNumber));
            System.out.println("\n");

            for (rowOffset = pageOffset; rowOffset <= pageOffset + maxRows - 1; rowOffset++)
            {
                for (colIndex = 0; colIndex <= maxCols - 1; colIndex++)
                    if (rowOffset + colIndex * maxCols <= totalRows)
                         System.out.printf("%10d", numbers[rowOffset + colIndex * maxRows]);
                System.out.println();
            }
            System.out.println("\f");
            pageNumber++;
            pageOffset += maxRows * maxCols;
        }
    }
}
