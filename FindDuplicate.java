/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author:Alex Dodson
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

    public static void main(String[] args) {
		int[] Duplicate = new int[args.length];
        for(int k = 0;k<args.length; k++){
        Duplicate[k] = Integer.parseInt(args[k]);
        }
		int a = 0;
		for (int i = 0; i<Duplicate.length; i++){
			for (int j = i+1; j<Duplicate.length; j++){
				if((Duplicate[i] == Duplicate[j])&&(i !=j)){
					a = a+1;
				}
				}
			}
			boolean b = (a>0);
			System.out.println(b);
		}
	}
