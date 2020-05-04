package mini;

import java.io.IOException;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public abstract class ExtServlet {
    protected abstract void doGet(Request request, Response response) throws IOException;

    protected abstract void doPost(Request request, Response response) throws IOException;

    public void service(Request request, Response response) throws IOException {
        String method = request.getMethod();
        if ("get".equalsIgnoreCase(method)) {
            doGet(request, response);
        } else if ("post".equalsIgnoreCase(method)) {
            doPost(request, response);
        } else {
            throw new IllegalArgumentException("request method is null");
        }
    }

}
