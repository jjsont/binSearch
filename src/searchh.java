public class searchh {

    public static int binSearch(int num, int[] arr) {
        int min=0;
        int max= arr.length-1;
        int guess= min+max/2;
        boolean yes= false;

        while(yes) {
            if(num != guess && num < guess) {
                max=guess;
                guess= min+guess/2;
            }
            else if (num != guess && num >guess) {
                min= guess;
                guess=min + guess/2;
            }
        }
        return guess;
    }
}
