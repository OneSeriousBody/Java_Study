package mini;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author CoderWZT
 * @Create on 2020/5/4.
 */
public class Response {
    private OutputStream outputStream;

    public Response(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void write(String content) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("HTTP/1.1 200 OK\n").append("Content-Type: text/html\n").append("\r\n")
                .append("<html><body>").append(content).append("</body></html>");
        this.outputStream.write(stringBuffer.toString().getBytes());
        this.outputStream.flush();
        this.outputStream.close();
    }

}