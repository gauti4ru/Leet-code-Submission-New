//Pascal Trinagle is based on nCr each position will be the valie of I=iCj where i is the row and J is the coloumn
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List< List< Integer > > generate(int numRows) {
        List< List< Integer > > mainList = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List< Integer > subList = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                //calculating iCj(nCR)=(n!/((n-r)!*r!))
                BigInteger value = (factorial(BigInteger.valueOf(i)).divide(factorial(BigInteger.valueOf(i - j)).multiply(factorial(BigInteger.valueOf(j)))));
                subList.add((value.intValue()));
            }
            mainList.add(subList);
        }
        return mainList;
    }

    public BigInteger factorial(BigInteger num) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(num) <= 0; i = i.add(BigInteger.ONE)) {
            result = result.multiply(i);
        }
        return result;
    }
}