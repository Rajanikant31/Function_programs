public class Multiplication_table {
    static void multiplication_table(int b)
    {

        for(int i =1; i<=10; i++) {


            System.out.format("%d X %d = %d \n", b, i, b*i);
        }

    }
    public static void pattern1(int n)
    {
        for(int i =1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int c=5, n=4;
        multiplication_table(c);
        pattern1(n);
    }
}
