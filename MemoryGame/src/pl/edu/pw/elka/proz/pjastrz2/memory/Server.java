package pl.edu.pw.elka.proz.pjastrz2.memory;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
*Klasa odpowiedzialna za implementacje czesci serwerowej w lacznosci sieciowej
*/
public class Server extends Thread{
    int port;
    ServerSocket server_socket;
    Socket socket;
    Model model;
    View view;

    /**
    *Uruchamia serwer. Stan obecny umozliwia uruchomienie i nasluch oraz odebranie np. liczby, oraz zgłoszenie odebrania.
    */
    public void run()
    {
        try
        {
            server_socket = new ServerSocket(port);
            socket = server_socket.accept();

            int mypoints, hispoints, oldmypoints=0, oldhispoints=0;
            DataInputStream in;
            InputStream in_sock;
            in_sock = socket.getInputStream();
            in = new DataInputStream ( in_sock );
            mypoints = in.readInt();
            hispoints = in.readInt();
            System.out.println("Odebrano: " + hispoints + " / " + mypoints);
         }
        catch (IOException ex)
        {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
