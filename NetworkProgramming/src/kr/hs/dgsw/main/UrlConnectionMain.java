package kr.hs.dgsw.main;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnectionMain {
    public static void main (String[] args) {
        try {
            URL url = new URL("http://google.com:80");
//            URLConnection uc = url.openConnection();
//            InputStream input = uc.getInputStream();
//            InputStreamReader inReader = new InputStreamReader(input);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
