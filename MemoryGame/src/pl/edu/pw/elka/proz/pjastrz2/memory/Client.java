package pl.edu.pw.elka.proz.pjastrz2.memory;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Klasa odpowiedzialna za implementacje czesci klienckiej w lacznosci sieciowej
 */
class Client
{
    String ip;
    int port;
    private Socket socket;
    InetSocketAddress address;
    DataOutputStream out;
    OutputStream out_sock;

    /**
    *Uruchamia klienta - stan obecny umozliwia nadanie wiadomosci oraz zwrot informacji o ustanowieniu polaczenia
    */
    protected  void run()
    {
        try
        {
            PrintStream myPrintStream = null;
            socket = new Socket();
            address = new InetSocketAddress(ip, port);
            socket.connect(address);
            System.out.println("Polaczenie nawiazane");
            
            out_sock = socket.getOutputStream();
            out = new DataOutputStream(out_sock);
            send(11);
            send(12);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    protected  void send(int x)
    {
        try
        {
            out.writeInt(x);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
