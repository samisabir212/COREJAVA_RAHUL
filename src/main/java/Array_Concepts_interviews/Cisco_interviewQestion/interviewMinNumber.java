package Array_Concepts_interviews.Cisco_interviewQestion;

/**
 * Created by sami on 10/5/17.
 */
public class interviewMinNumber {


    public static void main(String[] args) {


        /*
        * print a matrix thats 3x3
        * 2 4 5
        * 3 4 7
        * 1 2 9
        *
        * */

        int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};



        for (int i = 0; i < 3; i++) {

            for (int j=0; j< 3;j++) {

                System.out.println(abc[i][j]);
            }
        }


    }
}
