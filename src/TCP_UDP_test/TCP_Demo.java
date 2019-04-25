package TCP_UDP_test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
演示TCP传输

1，TCP分客户端和服务端
2，客户端对应的对象是Socket
    服务端对应的对象是ServerSocket

  客户端：
  通过查阅socket对象发现该对象建立时，就可以去连接指定主机
  因为TCP是面向连接的。所以在建立socket服务时，
  就要有服务端存在，并连接成功。成功通路后，在该通道进行数据的传输

  需求：给服务端发送给一个文本数据

  步骤：
  1，创建Socket服务。并指定要连接的主机和端口
 */
public class  TCP_Demo {
    public static void main(String[] args) throws Exception
    {
        //创建客户端的socket服务。指定目的主机和端口
        Socket s = new Socket("10.85.15.27",10003);

        //为了发送数据，应该获取socket流中的输出流
        OutputStream out = s.getOutputStream();
        out.write("TCP ge men lai le".getBytes());
        s.close();
    }
}