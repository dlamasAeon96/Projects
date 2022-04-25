import java.io.*;
import java.net.*;
public class Server {
    public static String isPrime(int num) {
        if(num<2) {
            return "No";
        } double i=2;
        while(true) {
            if (i < num) {
                if (num % i == 0) {
                    var no = "No"; return no;
                } i++;
            } else { break;
            }
        } return "Yes";
    }
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(8080);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            int num = (int)dis.readInt();dout.writeUTF(isPrime(num));dout.flush();dout.close();
            ss.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}