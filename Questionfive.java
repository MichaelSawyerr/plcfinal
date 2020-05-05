public class QuestionFive {
    public static void main(String[] args) {
        int j;

        int [][]x = {
        {1, 4, 3} ,   
        {6, 3, 1} ,
        {0, 0, 0} };

            for (int i =0; i<= 3 ;i++) {
                for (j=0;j<3;) {
                    if(x[i][j]==0)
                    j++;
                else
                    break;
                        }
        if(j==3) {
            System.out.println("First all Zero row is : "+ (i+1));
        break;
        }
    }
 
  
    } 
    
}