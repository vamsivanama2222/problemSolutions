package Basic_Problems;


import java.io.*;
import java.util.*;

public class Utopian_Tree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int h=1;
        if(n>=1)
         h=h+1;
        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                h=h+1;
            }
            else
            {
                h=h*2;
            }
        }

        return h;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
