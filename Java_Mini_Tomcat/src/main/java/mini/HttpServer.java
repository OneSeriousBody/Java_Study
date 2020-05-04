package mini;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public class HttpServer {
    private int port;

    public HttpServer(int port) {
        this.port = port;
    }

    public void start() {
        ServerSocket serverSocket = null;
        try {
            System.out.println("服务启动中,端口：" + port);
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket accept = serverSocket.accept();
                Request request = new Request(accept.getInputStream());
                Response response = new Response(accept.getOutputStream());
                new DemoServlet().service(request, response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}