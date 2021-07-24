/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
//import java.security.InvalidKeyException;
//import java.security.NoSuchAlgorithmException;
//import java.util.Base64;
//import javax.crypto.BadPaddingException;
//import javax.crypto.Cipher;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author PC
 */
public class Server {
     public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket sc = new DatagramSocket(7777);
        System.out.println("Server đã sẵn sàng!!!");
        // tạo 2 mảng byte để nhận dữ liệu
        byte soa[] = new byte[256];
        byte sob[] = new byte[256];
        // tạo 2 biến chiều dài để nhận dữ liệu
        int len1 = soa.length;
        int len2 = sob.length;
        
        // datagrampacket nhận dữ liệu
        DatagramPacket soanhan = new DatagramPacket(soa, len1);
        sc.receive(soanhan);
        DatagramPacket sobnhan = new DatagramPacket(sob, len2);
        sc.receive(sobnhan);
         // tạo 2 biến string để đọc dữ liệu nhận sang string
       
       String ssa,ssb;
       ssa = (new String(soanhan.getData(), 0, len1)).trim();
       ssb = (new String(sobnhan.getData(), 0, len2)).trim();
       
        System.out.println("du lieu " + ssa);
        System.out.println("du lieu " + ssb);
     }
}
