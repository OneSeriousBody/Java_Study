package mini;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public class App {
    public static void main(String[] args) {
        new HttpServer(8765).start();
        //浏览器访问 localhost:8765/demo?id=123
    }
}