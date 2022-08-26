import java.util.Scanner;
public class taskFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix = scan.nextInt();
          random random =new random() ;
          printArray printArray =new printArray() ;
          Move Move =new Move() ;
          matrixDecider matrixDecider = new matrixDecider() ;
          matrixSum matrixSum = new matrixSum() ;
          matrixNew matrixNew = new matrixNew() ;
          matrixChangeling matrixChangeling = new matrixChangeling() ;
          matrixDeterminant matrixDeterminant = new matrixDeterminant() ;
          averageMatrix averageMatrix = new averageMatrix() ;
          maxElementMatrix maxElementMatrix = new maxElementMatrix() ;
        int[][] array = new int[matrix][matrix];
        random.findRandom(array,matrix);
        printArray.findPrintArray(array);
       Move.moveToDown(array);
       printArray.findPrintArray(array);
        Move.moveToUp(array);
       printArray.findPrintArray(array);
       Move.moveToLeft(array);
        printArray.findPrintArray(array);
        Move.moveToRight(array);
        printArray.findPrintArray(array);
        matrixDecider.inDecrease(array);
        matrixSum.matrixSumFind(array,matrix);
        matrixNew.findNewMatrix(matrix);
      matrixChangeling.matrixChangeling90(array , matrix);
      matrixChangeling.matrixChangeling180(array ,matrix);
    matrixChangeling.matrixChangling270(array,matrix);
       matrixDeterminant.findMatrixDeterminant(array ,matrix);
        averageMatrix.findAverageMatrix(array,matrix);
      maxElementMatrix.findMaxElementMatrix(array,matrix);





    }

    }






