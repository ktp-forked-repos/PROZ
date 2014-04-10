package pl.edu.pw.elka.proz.pjastrz2.memory;

import java.awt.event.*;

/**
 * Klasa odpowiedzialna za implementacje kontrolera
 * Implementuje sluchaczy: connectButtonListener - dla przycisku polaczenia, shuffleButtonListener - dla losowania,
 * hostButtonListener - dla przycisku hostowania oraz 36 sluchaczy dla odpowiednich pol tile_N_Listener N={1,..,36}
 */
public class Controller
{
    View view;
    Model model;
    Client client = new Client();


    Controller(Model xModel, View xView)
    {
        view=xView;
        model=xModel;
           
        view.addConnectButtonListener(new connectButtonListener());
        view.addShuffleButtonListener(new shuffleButtonListener());
        view.addHostButtonListener(new hostButtonListener());
        view.addTile1Listener(new tile1Listener());
        view.addTile2Listener(new tile2Listener());
        view.addTile3Listener(new tile3Listener());
        view.addTile4Listener(new tile4Listener());
        view.addTile5Listener(new tile5Listener());
        view.addTile6Listener(new tile6Listener());
        view.addTile7Listener(new tile7Listener());
        view.addTile8Listener(new tile8Listener());
        view.addTile9Listener(new tile9Listener());
        view.addTile10Listener(new tile10Listener());
        view.addTile11Listener(new tile11Listener());
        view.addTile12Listener(new tile12Listener());
        view.addTile13Listener(new tile13Listener());
        view.addTile14Listener(new tile14Listener());
        view.addTile15Listener(new tile15Listener());
        view.addTile16Listener(new tile16Listener());
        view.addTile17Listener(new tile17Listener());
        view.addTile18Listener(new tile18Listener());
        view.addTile19Listener(new tile19Listener());
        view.addTile20Listener(new tile20Listener());
        view.addTile21Listener(new tile21Listener());
        view.addTile22Listener(new tile22Listener());
        view.addTile23Listener(new tile23Listener());
        view.addTile24Listener(new tile24Listener());
        view.addTile25Listener(new tile25Listener());
        view.addTile26Listener(new tile26Listener());
        view.addTile27Listener(new tile27Listener());
        view.addTile28Listener(new tile28Listener());
        view.addTile29Listener(new tile29Listener());
        view.addTile30Listener(new tile30Listener());
        view.addTile31Listener(new tile31Listener());
        view.addTile32Listener(new tile32Listener());
        view.addTile33Listener(new tile33Listener());
        view.addTile34Listener(new tile34Listener());
        view.addTile35Listener(new tile35Listener());
        view.addTile36Listener(new tile36Listener());
    }

    class connectButtonListener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
    {
        view.connect_it();}
    }
    class shuffleButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            view.shuffle();
        }
    }
    class hostButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            view.host_it();
        }
    }
    class tile1Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(0);
        }
    }
    class tile2Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(1);
        }
    }
    class tile3Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(2);
        }
    }
    class tile4Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(3);
        }
    }
    class tile5Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(4);
        }
    }
    class tile6Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(5);
        }
    }
    class tile7Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(6);
        }
    }
    class tile8Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(7);
        }
    }
    class tile9Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(8);
        }
    }
    class tile10Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(9);
        }
    }
    class tile11Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(10);
        }
    }
    class tile12Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(11);
        }
    }
    class tile13Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(12);
        }
    }
    class tile14Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(13);
        }
    }
    class tile15Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(14);
        }
    }
    class tile16Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(15);
        }
    }
    class tile17Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(16);
        }
    }
    class tile18Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(17);
        }
    }
    class tile19Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(18);
        }
    }
    class tile20Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(19);
        }
    }
    class tile21Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(20);
        }
    }
    class tile22Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(21);
        }
    }
    class tile23Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(22);
        }
    }
    class tile24Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(23);
        }
    }
    class tile25Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(24);
        }
    }
    class tile26Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(25);
        }
    }
    class tile27Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(26);
        }
    }
    class tile28Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(27);
        }
    }
    class tile29Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(28);
        }
    }
    class tile30Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(29);
        }
    }
    class tile31Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(30);
        }
    }
    class tile32Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(31);
        }
    }
    class tile33Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(32);
        }
    }
    class tile34Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(33);
        }
    }
    class tile35Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(34);
        }
    }
    class tile36Listener implements ActionListener
    {
    public void actionPerformed(ActionEvent e)
        {
            view.checkifok(35);
        }
    }
}