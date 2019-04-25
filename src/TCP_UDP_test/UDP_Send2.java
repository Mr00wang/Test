package TCP_UDP_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Send2 {
    public static void main(String[] args) throws Exception
    {
        DatagramSocket ds = new DatagramSocket();

        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

        String line = null;

        while((line=bufr.readLine())!=null)
        {
            if("886".equals(line))
                break;
            byte[] buf = line.getBytes();

            DatagramPacket dp = new DatagramPacket(buf,buf.length, InetAddress.getByName("10.85.15.27"),10001);

            ds.send(dp);
        }
        ds.close();
    }
}
