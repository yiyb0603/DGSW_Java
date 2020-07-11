package kr.hs.dgsw.main.d0609;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class URITest {
    private static void showURIInfo(URI uri) {
        System.out.println("URI info");
        System.out.println("uri scheme: " + uri.getScheme());
        System.out.println("uri host: " + uri.getHost());
        System.out.println("url path : " + uri.getPath());
        System.out.println("uri fragment: " + uri.getFragment());
        System.out.println("uri port: " + uri.getPort());
        System.out.println("uri query:" + uri.getQuery());
        System.out.println("uri auth:" + uri.getAuthority());
        System.out.println("uri user info:" + uri.getUserInfo());
    }

    private static void showURLInfo(URL url) {
        System.out.println("URL info");
        System.out.println("url scheme: " + url.getProtocol());
        System.out.println("url host: " + url.getHost());
        System.out.println("url path : " + url.getPath());
        System.out.println("url port: " + url.getPort());
        System.out.println("url query:" + url.getQuery());
        System.out.println("url auth:" + url.getAuthority());
        System.out.println("url user info:" + url.getUserInfo());
    }

    public static void main(String[] args) {
        URI uri;
        URL url;

        try {
            uri = new URI("https://search.naver.com/search.naver?sm=top_sug.pre&fbm=1&acr=1&acq=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84&qdt=0&ie=utf8&query=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90");
            showURIInfo(uri);
            url = new URL("https://search.naver.com/search.naver?sm=top_sug.pre&fbm=1&acr=1&acq=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84&qdt=0&ie=utf8&query=%EB%8C%80%EA%B5%AC%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%96%B4%EA%B3%A0%EB%93%B1%ED%95%99%EA%B5%90");
            showURLInfo(url);
        } catch (URISyntaxException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}