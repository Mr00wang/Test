package TCP_UDP_test;

import java.net.InetAddress;

public class IPDemo {
    public static void main(String[] args) throws Exception
    {
        InetAddress i = InetAddress.getLocalHost();
        System.out.println(i.toString());
        System.out.println("adress:"+i.getHostAddress());
        System.out.println("name:"+i.getHostName());

        InetAddress ia = InetAddress.getByName("www.baidu.com");
        System.out.println("adress:"+ia.getHostAddress());
        System.out.println("name:"+ia.getHostName());
        System.out.println("sort:"+ia.getAllByName("www.baidu.com"));
    }
}
