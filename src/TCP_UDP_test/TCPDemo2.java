package TCP_UDP_test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
演示TCP的传输的客户端和服务端的互访

需求：客户端给服务端发送数据，服务端收到后，给客户端反馈信息

 客户端：
 1，建立socket服务。指定要连接主机和端口
 2，获取socket流中的输出流。将数据写到该流中
 */
public class TCPDemo2 {
    public static void main(String[] args) throws Exception
    {
        Socket s = new Socket("10.85.15.27",10004);

        OutputStream out = s.getOutputStream();

        out.write("服务端，你好".getBytes());

        InputStream in = s.getInputStream();

        byte[] buf = new byte[1024];

        int len = in.read(buf);

        System.out.println(new String(buf,0,len));

        s.close();


    }

}
