package seed.seyfer.Lynda2011.files;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author seyfer
 */
public class CopyFile {

    public static void main(String[] args) {

    }

    public void copyWithLangIo() {
        InputStream in = null;
        OutputStream out = null;
        try {
            File f1 = new File("src/tmp/test.txt");
            File f2 = new File("src/tmp/target.txt");

            in = new FileInputStream(f1);
            out = new FileOutputStream(f2);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            System.out.println("File copied!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void copyWithFileUtils() {
        try {
            File f1 = new File("src/tmp/test.txt");
            File f2 = new File("src/tmp/target.txt");

            FileUtils.copyFile(f1, f2);

            System.out.println("File copied!");
        } catch (IOException ex) {
            Logger.getLogger(CopyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
