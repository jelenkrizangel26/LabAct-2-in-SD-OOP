public class fibonacciSeries{
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;

        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + ", ");

            //for next terms
            int tn = t1 + t2;
            t1 = t2;
            t2 = tn;
        }
    }
}