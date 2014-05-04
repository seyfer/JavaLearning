package seed.seyfer.Lynda2011.files;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author seyfer
 */
public class ReadNetworkFile {

    URL url;
    private StringBuilder sb;

    public ReadNetworkFile() {

    }

    public void get() {
        this.get(null);
    }

    /**
     *
     * @param url
     */
    public void get(String url) {
        try {
            if (url == null) {
                this.url = new URL("http://seyferseed.ru/feed");
            } else {
                this.url = new URL(url);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadNetworkFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        InputStream stream = null;
        try {
            stream = this.url.openStream();

            BufferedInputStream buf = new BufferedInputStream(stream);

            this.sb = new StringBuilder();

            while (true) {
                int data = 0;

                data = buf.read();

                if (data == -1) {
                    break;
                } else {
                    this.sb.append((char) data);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadNetworkFile.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(sb);
    }

}
