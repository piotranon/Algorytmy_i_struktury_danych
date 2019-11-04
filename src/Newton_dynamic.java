public class Newton_dynamic {
    //1 dla k=0 || k=n
    // n-1 k-1 )+(n-1 k) dla 0<k<n




    public static void main(String[] args){

        int n=4;
        int k=3;

        int wyniki[][] =new int[n+1][k+1];

        for(int i=0;i<=n;i++)
        {
            //System.out.println("a");
            for(int j=0;j<=k;j++)
            {
                //System.out.println("b");
                if(i==0)
                {
                    //System.out.println("1");
                    wyniki[i][j]=1;
                }else if(i==j)
                {
                    //System.out.println("2");
                    wyniki[i][j]=1;
                }else if(j>i){
                    //System.out.println("3");
                    wyniki[i][j]=wyniki[i-1][j-1]+wyniki[i][j-1];
                }
            }
        }

        for(int i=0;i<=n;i++)
        {
            System.out.print("{");
            for(int j=0;j<=k;j++)
            {
                System.out.print(wyniki[i][j]+",");
            }
            System.out.print("}");
            System.out.println();
        }
        System.out.println(wyniki[n][k]);
    }
}
