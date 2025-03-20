
public class main {

    public static void main(String[] args) {
        System.out.println("0529");

//        2d array

        int two_dimensional_array[][]=new int[4][5];
        for (int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                two_dimensional_array[i][j]=(int)(Math.random()*100);
            }
        }

        for(int a[]:two_dimensional_array)
        {
            for(int i=0;i<5;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }



    }
}