public class Main {
    String str;

    private Main() {
        this.str = "This is the string";
    }

    public static void main(String[] arg) {
        //Hello string = new Hello();
        //OddOccurrencesInArray oddNumber = new OddOccurrencesInArray();
        //System.out.println(oddNumber.OddOccurrenc());
        //System.out.println(A[0]);
        //CyclicRotation rotation = new CyclicRotation();
        //int[] A = {0,0,0};
        //int k = 1;
        //rotation.watch(A, k);
        //int[] finalArray = ;
        //System.out.println(Arrays.toString(rotation.rotation(A, k)));
        //FrogJmp jmp = new FrogJmp();
        //PermMissingElem missing = new PermMissingElem();
        //TapeEquilibrium equilibrium = new TapeEquilibrium();
        //PermCheck check = new PermCheck();
        //int[] A = new int[]{};
        //FrogRiverOne jmp = new FrogRiverOne();
        //MissingInteger missingInteger = new MissingInteger();
        //int[] A = new int[]{1, 3, 6, 4, 1, 2};
        /*GenomicRangeQuery range = new GenomicRangeQuery();
        String str = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};*/
        MinAvgTwoSlice avg = new MinAvgTwoSlice();
        int[] A = {4,2,2,5,1,5,8};
        System.out.println(avg.minAvg(A));
    }
}
