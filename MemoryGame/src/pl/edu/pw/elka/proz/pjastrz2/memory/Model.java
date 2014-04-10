package pl.edu.pw.elka.proz.pjastrz2.memory;

import java.awt.Color;
import java.util.Random;
/**
 * Klasa odpowiedzialna za implementacje modelu
 */
public class Model {
    
    Client myClient = new Client();
    Server myServer = new Server();

    boolean myturn=true;
    int mypoints=0;
    int hispoints=0;
    int clickNo=0;
    int lastHalfPair=-1;
    int lastnum=-1;
    int[] images_pair=new int[36];
    int[] images_x = new int[18];
    javax.swing.JButton[] buttonsArray = new javax.swing.JButton[36];

    /**
    * Losuje kolejnosc obrazkow ktore beda przydzielane. Nastepnie losowo dobiera miejsce w tablicy odpowiadajace plytce na planszy do obrazka.
    */
   protected void shuffle()
   {
        Random ran = new Random();

        for(int i=0; i<18;i++)
            images_x[i]=2;

        int tmp_int;

        for(int i=0;i<36;i++)
        {
            do tmp_int=ran.nextInt(18);
                while (images_x[tmp_int]==0);
            images_x[tmp_int]--;
            images_pair[i]=tmp_int;
        }
    }
    /**
     * Gdy spelnione warunki pozwala na sprawdzenie klikniecia i przekazuje true albo false do wlasciwego sprawdzenia
     *
     */
   protected boolean check(int numer)
   {
        if(buttonsArray[numer].getBackground()!=Color.white && buttonsArray[numer].isEnabled()==true)
        {
            if(clickNo==0)
                hide_icons();
            return true;
       }
        else
            return false;
   }
   /**
   * Ukrywa ikony dla planszy, odwracajac je do gory nogami.
   */
   protected void hide_icons()
    {
        int i=0;
        for(;i<36;i++)
            buttonsArray[i].setIcon(null);
    }

    Model()
    {
       shuffle();
    }

}
