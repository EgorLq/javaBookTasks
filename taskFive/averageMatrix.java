public class averageMatrix {
    void findAverageMatrix(int matrix[][], int size) {
        double sum =0 ;
        double avg=0 ;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sum += matrix[i][j];
                avg=sum/size ;
            }
        }
        System.out.println("построим матрицу вычитая из неё средне арифметическое ");
        for(int[]x:matrix){
            for(int z:x){
                System.out.print(z-avg+"  ");
            }
            System.out.println();
        }

    }
}
