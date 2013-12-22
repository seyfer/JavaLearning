package seed.seyfer.Lynda2011.Helpers;

import java.io.*;

/**
 *
 * @author seyfer
 */
public class InputHelper {

    /**
     * get command line input
     *
     * @param promt
     * @return
     */
    public static String getInput(String promt)
    {
        if (promt.length() == 0) {
            return "";
        }

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print(promt);
        System.out.flush();

        try {
            return stdin.readLine();
        }
        catch (IOException e) {
            return "Error " + e.getMessage();
        }

    }

}
