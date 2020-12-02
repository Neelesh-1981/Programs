import java.lang.Math;  
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Matrix
{
public static void main(String []args){
       
        int row=4, column=3;
        double upperbound=4.3;
       
        int[][] result = generateRandomMatrix(row, column, upperbound);
       
        writeMatrix(result);
     }
     
     public static int[][] generateRandomMatrix(int row, int column, double upperbound){
       
         int[][] array = new int[row][column];
         
         if(upperbound<1)
          upperbound=10;
         
        for(int i=0; i<row; i++)
          for(int j=0; j<column; j++){
              if(Math.random()<=0.2)
                  array[i][j]=0;
              else if(Math.random()<=0.6)
                  array[i][j]=(int)(Math.random() * (upperbound - 1 + 1) + 1) ;
              else if(Math.random()<=1.0)
                  array[i][j]=(int)((-1)*(Math.random() * (upperbound - 1 + 1) + 1));
          }
         
          for(int i=0; i<row; i++){
          for(int j=0; j<column; j++)
              System.out.print(array[i][j]+" ");
            System.out.println();
          }
         
        return array;
           
     }
     
      public static void writeMatrix(int[][] result) throws FileNotFoundException {
          PrintWriter outputFile = new PrintWriter("C:\\Users\\Mona\\Desktop\\randomMatrix.csv");
         
          for(int i=0; i<result.length; i++)
            for(int j=0; j<result[i].length; j++)
              outputFile.println(result[i][j]);
             
          outputFile.close();    
      }
}
