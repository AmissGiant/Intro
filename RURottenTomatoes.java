/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:Alex Dodson
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		int movie = Integer.parseInt(args[0]);
        int rev = Integer.parseInt(args[1]);
        int total = 0;
        int max = 0;
        int a = 2;
        int f = 0;
        int [][] array = new int[movie][rev];
        for (int i=0; i<movie; i++){
            for (int j=0; j<rev; j++){
                array[i][j] = Integer.parseInt(args[a]);
                a++;
            }
        }
        for(int i = 0; i < rev; i++){
            total = 0;
            for (int j=0; j<movie; j++){
            total += array[j][i];
        }
        if (total>max){
            max = total;
            f = i;
        }
      }  System.out.println(f);
	}
}
