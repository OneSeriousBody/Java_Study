package mini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public class Request {

    private String url;

    private String method;

    private Map<String, String> paramMap = new HashMap<String, String>();

    public Request(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String[] methodAndUrl = bufferedReader.readLine().split(" ");
        this.method = methodAndUrl[0];
        int indexOf = methodAndUrl[1].indexOf("?");
        if (indexOf != -1) {
            this.url = methodAndUrl[1].substring(0, indexOf);
            ResoveParams(methodAndUrl[1].substring(indexOf + 1));
        } else {
            this.url = methodAndUrl[1];
        }
    }

    public String getRequestParam(String key) {
        return paramMap.get(key);
    }

    private void ResoveParams(String str) {
        String[] params = str.split("&");
        for (String p : params) {
            String[] split = p.split("=");
            if (split[0] != null) {
                paramMap.put(split[0], split[1]);
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}