
public class NumberFamilies implements INumberFamily {

	public int[] GetPrimeNumbers(int maxNumber)
    {
        final int maxOrdinal = 30;
        int primeNumbers[] = new int[maxNumber + 1];
        int primeNumber;
        int initValue;
        boolean isPrimeNumber;
        int ordinal;
        int squareValue;
        int ordPosition = 0;
        int multNumbers[] = new int[maxOrdinal + 1];
        primeNumber = 1;
        initValue = 1;
        primeNumbers[1] = 2;
        ordinal = 2;
        squareValue = 9;

        while (initValue < maxNumber)
        {
            do
            {
                primeNumber += 2;
                if (primeNumber == squareValue)
                {
                    ordinal++;
                    squareValue = primeNumbers[ordinal] * primeNumbers[ordinal];
                    multNumbers[ordinal - 1] = primeNumber;
                }
                ordPosition = 2;
                isPrimeNumber = true;
                while (ordPosition < ordinal && isPrimeNumber)
                {
                    while (multNumbers[ordPosition] < primeNumber)
                        multNumbers[ordPosition] += primeNumbers[ordPosition] + primeNumbers[ordPosition];
                    if (multNumbers[ordPosition] == primeNumber)
                        isPrimeNumber = false;
                    ordPosition++;
                }
            } while (!isPrimeNumber);
            initValue++;
            primeNumbers[initValue] = primeNumber;
        }

        return primeNumbers;
    }
}
