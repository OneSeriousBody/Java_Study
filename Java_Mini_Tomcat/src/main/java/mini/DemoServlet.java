package mini;

import java.io.IOException;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public class DemoServlet extends ExtServlet {

    @Override
    protected void doGet(Request request, Response response) throws IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(Request request, Response response) throws IOException {
        String id = request.getRequestParam("id");
        response.write("Hello World! id is:" + id);
    }

}