public class diamondPattern {

    public static void main(String args[])
    {
        int n = 7;
        int m = n/2;
        int s=1;

        for (int i=1;i<= n;i++)
        {
            for (int j=1;j<=m;j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * s - 1; k++){
                System.out.print("*");
            }

            if( i<=n/2){
                m--;
                s++;
            }else{
                m++;
                s--;
            }
            System.out.println("");
        }
    }
}
