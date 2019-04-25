package TCP_UDP_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
需求：建立文本文件数据


步骤：
1，建立服务
2，获取键盘服务端
3，将数据发给服务端
4，后去服务端返回大写数据
5，结束，关闭服务端
 */
public class TransTextDemo {
    public static void main(String[] args)throws Exception
    {
        Socket s = new Socket("10.85.15.27",10005);

        BufferedReader bufr =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufwOut=
                new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader bufIn =
                new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = null;

        while ((line = bufr.readLine())!=null)
        {
            if("over".equals(line))
                break;
            bufwOut.write(line);

            String str = bufIn.readLine();
            System.out.println("server:"+str);
        }
        s.close();
        bufr.close();
    }
}
