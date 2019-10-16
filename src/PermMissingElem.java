import java.util.Arrays;

public class PermMissingElem {
    public int missingElem(int[] A) {
        int missing = 1;
        if (A.length == 0) {
            return missing;
        }
        Arrays.sort(A);
        //System.out.println(A.length);
        int j = 1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != j) {
                missing = j;
            }
            j++;
        }

        return missing;
    }
}
