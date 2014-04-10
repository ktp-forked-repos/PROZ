package pl.edu.pw.elka.proz.pjastrz2.memory;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Klasa odpowiedzialna za implementacje widoku
 */
public class View extends JFrame implements Runnable
{

    private javax.swing.JButton connectButton;
    private javax.swing.JButton hostButton;
    private javax.swing.JLabel hostPortLabel;
    private javax.swing.JTextField hostPortTextField;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelMyPoints;
    private javax.swing.JLabel labelRemote;
    private javax.swing.JLabel labelHisPoints;
    private javax.swing.JLabel serverNameLabel;
    private javax.swing.JTextField serverNameTextField;
    private javax.swing.JLabel serverPortLabel;
    private javax.swing.JTextField serverPortTextField;
    private javax.swing.JButton shuffleButton;
    private javax.swing.JButton tile1;
    private javax.swing.JButton tile10;
    private javax.swing.JButton tile11;
    private javax.swing.JButton tile12;
    private javax.swing.JButton tile13;
    private javax.swing.JButton tile14;
    private javax.swing.JButton tile15;
    private javax.swing.JButton tile16;
    private javax.swing.JButton tile17;
    private javax.swing.JButton tile18;
    private javax.swing.JButton tile19;
    private javax.swing.JButton tile2;
    private javax.swing.JButton tile20;
    private javax.swing.JButton tile21;
    private javax.swing.JButton tile22;
    private javax.swing.JButton tile23;
    private javax.swing.JButton tile24;
    private javax.swing.JButton tile25;
    private javax.swing.JButton tile26;
    private javax.swing.JButton tile27;
    private javax.swing.JButton tile28;
    private javax.swing.JButton tile29;
    private javax.swing.JButton tile3;
    private javax.swing.JButton tile30;
    private javax.swing.JButton tile31;
    private javax.swing.JButton tile32;
    private javax.swing.JButton tile33;
    private javax.swing.JButton tile34;
    private javax.swing.JButton tile35;
    private javax.swing.JButton tile36;
    private javax.swing.JButton tile4;
    private javax.swing.JButton tile5;
    private javax.swing.JButton tile6;
    private javax.swing.JButton tile7;
    private javax.swing.JButton tile8;
    private javax.swing.JButton tile9;
    protected Dialog dialog;
    Thread runner;

    
    ImageIcon[] images = new ImageIcon[18];

    Model model;

    /**
    * Konstruktor widoku, incjalizuje komponenty, miesza plansze.
    */
    public View(Model xmodel)
    {
        model=xmodel;
        initComponents();
        shuffle();
        runner = new Thread(this, "asd");
        runner.start();   
      }

    void addConnectButtonListener(ActionListener cal)
    {
        connectButton.addActionListener(cal);
    }

    void addShuffleButtonListener(ActionListener cal)
    {
        shuffleButton.addActionListener(cal);
    }

    void addHostButtonListener(ActionListener cal)
    {
        hostButton.addActionListener(cal);
    }

     void addTile1Listener(ActionListener cal)
     {
         tile1.addActionListener(cal);
     }
     void addTile2Listener(ActionListener cal)
     {
         tile2.addActionListener(cal);
     }
     void addTile3Listener(ActionListener cal)
     {
         tile3.addActionListener(cal);
     }
     void addTile4Listener(ActionListener cal)
     {
         tile4.addActionListener(cal);
     }
     void addTile5Listener(ActionListener cal)
     {
         tile5.addActionListener(cal);
     }
     void addTile6Listener(ActionListener cal)
     {
         tile6.addActionListener(cal);
     }
     void addTile7Listener(ActionListener cal)
     {
         tile7.addActionListener(cal);
     }
     void addTile8Listener(ActionListener cal)
     {
         tile8.addActionListener(cal);
     }
     void addTile9Listener(ActionListener cal)
     {
         tile9.addActionListener(cal);
     }
     void addTile10Listener(ActionListener cal)
     {
         tile10.addActionListener(cal);
     }
     void addTile11Listener(ActionListener cal)
     {
         tile11.addActionListener(cal);
     }
     void addTile12Listener(ActionListener cal)
     {
         tile12.addActionListener(cal);
     }
     void addTile13Listener(ActionListener cal)
     {
         tile13.addActionListener(cal);
     }
     void addTile14Listener(ActionListener cal)
     {
         tile14.addActionListener(cal);
     }
     void addTile15Listener(ActionListener cal)
     {
         tile15.addActionListener(cal);
     }
     void addTile16Listener(ActionListener cal)
     {
         tile16.addActionListener(cal);
     }
     void addTile17Listener(ActionListener cal)
     {
         tile17.addActionListener(cal);
     }
     void addTile18Listener(ActionListener cal)
     {
         tile18.addActionListener(cal);
     }
     void addTile19Listener(ActionListener cal)
     {
         tile19.addActionListener(cal);
     }
     void addTile20Listener(ActionListener cal)
     {
         tile20.addActionListener(cal);
     }
     void addTile21Listener(ActionListener cal)
     {
         tile21.addActionListener(cal);
     }
     void addTile22Listener(ActionListener cal)
     {
         tile22.addActionListener(cal);
     }
     void addTile23Listener(ActionListener cal)
     {
         tile23.addActionListener(cal);
     }
     void addTile24Listener(ActionListener cal)
     {
         tile24.addActionListener(cal);
     }
     void addTile25Listener(ActionListener cal)
     {
         tile25.addActionListener(cal);
     }
     void addTile26Listener(ActionListener cal)
     {
         tile26.addActionListener(cal);
     }
     void addTile27Listener(ActionListener cal)
     {
         tile27.addActionListener(cal);
     }
     void addTile28Listener(ActionListener cal)
     {
         tile28.addActionListener(cal);
     }
     void addTile29Listener(ActionListener cal)
     {
         tile29.addActionListener(cal);
     }
     void addTile30Listener(ActionListener cal)
     {
         tile30.addActionListener(cal);
     }
     void addTile31Listener(ActionListener cal)
     {
         tile31.addActionListener(cal);
     }
     void addTile32Listener(ActionListener cal)
     {
         tile32.addActionListener(cal);
     }
     void addTile33Listener(ActionListener cal)
     {
         tile33.addActionListener(cal);
     }
     void addTile34Listener(ActionListener cal)
     {
         tile34.addActionListener(cal);
     }
     void addTile35Listener(ActionListener cal)
     {
         tile35.addActionListener(cal);
     }
     void addTile36Listener(ActionListener cal)
     {
         tile36.addActionListener(cal);
     }

    /**
    * Funkcja uruchomiona w wątku testuje czy gra została zakonczona i wyswietla informacje o wygranej.
    */
     public void run()
     {
         while(true){
                if(dialog==null && (model.mypoints+model.hispoints)==18){
                   dialog = new Dialog(this,model); dialog.setVisible(true); shuffle();}

         }
    }

    /**
    * Inicjalizuje komponenty nadajac im cechy jak rozmiar, etykiety, polozenie
    */
    private void initComponents()
    {
        serverNameLabel = new javax.swing.JLabel();
        serverNameTextField = new javax.swing.JTextField();
        serverPortLabel = new javax.swing.JLabel();
        serverPortTextField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        tile1 = new javax.swing.JButton();
        tile2 = new javax.swing.JButton();
        tile3 = new javax.swing.JButton();
        tile4 = new javax.swing.JButton();
        tile5 = new javax.swing.JButton();
        tile6 = new javax.swing.JButton();
        tile7 = new javax.swing.JButton();
        tile8 = new javax.swing.JButton();
        tile9 = new javax.swing.JButton();
        tile10 = new javax.swing.JButton();
        tile11 = new javax.swing.JButton();
        tile12 = new javax.swing.JButton();
        tile13 = new javax.swing.JButton();
        tile14 = new javax.swing.JButton();
        tile15 = new javax.swing.JButton();
        tile16 = new javax.swing.JButton();
        tile17 = new javax.swing.JButton();
        tile18 = new javax.swing.JButton();
        tile19 = new javax.swing.JButton();
        tile20 = new javax.swing.JButton();
        tile21 = new javax.swing.JButton();
        tile22 = new javax.swing.JButton();
        tile23 = new javax.swing.JButton();
        tile24 = new javax.swing.JButton();
        tile25 = new javax.swing.JButton();
        tile26 = new javax.swing.JButton();
        tile27 = new javax.swing.JButton();
        tile28 = new javax.swing.JButton();
        tile29 = new javax.swing.JButton();
        tile30 = new javax.swing.JButton();
        tile31 = new javax.swing.JButton();
        tile32 = new javax.swing.JButton();
        tile33 = new javax.swing.JButton();
        tile34 = new javax.swing.JButton();
        tile35 = new javax.swing.JButton();
        tile36 = new javax.swing.JButton();

        model.buttonsArray[0]=tile1;
        model.buttonsArray[1]=tile2;
        model.buttonsArray[2]=tile3;
        model.buttonsArray[3]=tile4;
        model.buttonsArray[4]=tile5;
        model.buttonsArray[5]=tile6;
        model.buttonsArray[6]=tile7;
        model.buttonsArray[7]=tile8;
        model.buttonsArray[8]=tile9;
        model.buttonsArray[9]=tile10;
        model.buttonsArray[10]=tile11;
        model.buttonsArray[11]=tile12;
        model.buttonsArray[12]=tile13;
        model.buttonsArray[13]=tile14;
        model.buttonsArray[14]=tile15;
        model.buttonsArray[15]=tile16;
        model.buttonsArray[16]=tile17;
        model.buttonsArray[17]=tile18;
        model.buttonsArray[18]=tile19;
        model.buttonsArray[19]=tile20;
        model.buttonsArray[20]=tile21;
        model.buttonsArray[21]=tile22;
        model.buttonsArray[22]=tile23;
        model.buttonsArray[23]=tile24;
        model.buttonsArray[24]=tile25;
        model.buttonsArray[25]=tile26;
        model.buttonsArray[26]=tile27;
        model.buttonsArray[27]=tile28;
        model.buttonsArray[28]=tile29;
        model.buttonsArray[29]=tile30;
        model.buttonsArray[30]=tile31;
        model.buttonsArray[31]=tile32;
        model.buttonsArray[32]=tile33;
        model.buttonsArray[33]=tile34;
        model.buttonsArray[34]=tile35;
        model.buttonsArray[35]=tile36;

        ImageIcon icon1 = new ImageIcon("img/1.png");
        ImageIcon icon2 = new ImageIcon("img/2.png");
        ImageIcon icon3 = new ImageIcon("img/3.png");
        ImageIcon icon4 = new ImageIcon("img/4.png");
        ImageIcon icon5 = new ImageIcon("img/5.png");
        ImageIcon icon6 = new ImageIcon("img/6.png");
        ImageIcon icon7 = new ImageIcon("img/7.png");
        ImageIcon icon8 = new ImageIcon("img/8.png");
        ImageIcon icon9 = new ImageIcon("img/9.png");
        ImageIcon icon10 = new ImageIcon("img/10.png");
        ImageIcon icon11 = new ImageIcon("img/11.png");
        ImageIcon icon12 = new ImageIcon("img/12.png");
        ImageIcon icon13 = new ImageIcon("img/13.png");
        ImageIcon icon14 = new ImageIcon("img/14.png");
        ImageIcon icon15 = new ImageIcon("img/15.png");
        ImageIcon icon16 = new ImageIcon("img/16.png");
        ImageIcon icon17 = new ImageIcon("img/17.png");
        ImageIcon icon18 = new ImageIcon("img/18.png");

        images[0] = icon1;
        images[1] = icon2;
        images[2] = icon3;
        images[3] = icon4;
        images[4] = icon5;
        images[5] = icon6;
        images[6] = icon7;
        images[7] = icon8;
        images[8] = icon9;
        images[9] = icon10;
        images[10] = icon11;
        images[11] = icon12;
        images[12] = icon13;
        images[13] = icon14;
        images[14] = icon15;
        images[15] = icon16;
        images[16] = icon17;
        images[17] = icon18;

        shuffleButton = new javax.swing.JButton();
        labelRemote = new javax.swing.JLabel();
        labelHisPoints = new javax.swing.JLabel();
        labelLocal = new javax.swing.JLabel();
        labelMyPoints = new javax.swing.JLabel();
        hostButton = new javax.swing.JButton();
        hostPortLabel = new javax.swing.JLabel();
        hostPortTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MemoryGame - Piotr Jastrzębski 4I1");
        setResizable(false);

        serverNameLabel.setText("server name:");

        serverNameTextField.setText("localhost");

        serverPortLabel.setText("server port:");

        serverPortTextField.setText("9999");

        connectButton.setText("Connect");

        shuffleButton.setText("Shuffle");

        labelRemote.setText("Remote:");

        labelHisPoints.setText("0");

        labelLocal.setText("Local:");

        labelMyPoints.setText("0");

        hostButton.setText("Host");

        hostPortLabel.setText("host on port:");

        hostPortTextField.setText("9999");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tile20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tile26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(tile35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelRemote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelHisPoints)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelLocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMyPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tile28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shuffleButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(serverNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serverNameTextField)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serverPortLabel)
                                    .addComponent(hostPortLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hostPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hostButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(connectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverPortLabel)
                    .addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverNameLabel)
                    .addComponent(serverNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostPortLabel)
                    .addComponent(hostPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tile32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRemote)
                    .addComponent(labelHisPoints)
                    .addComponent(labelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMyPoints)
                    .addComponent(shuffleButton))
                .addContainerGap())
        );

        pack();
    }

    /**
    *Odwraca karty na planszy do góry nogami.
    */


    protected boolean checkifok(int numer)
    {
        if(model.check(numer)==true)
        {
            
            if(model.lastnum!=numer || model.clickNo!=1){
                model.clickNo++;
                if(model.clickNo==1)
                    model.lastHalfPair=model.images_pair[numer];
                else{
                    if(model.lastHalfPair==model.images_pair[numer]){
                        model.clickNo=0;
                        model.buttonsArray[numer].setBackground(Color.white);
                        model.buttonsArray[model.lastnum].setBackground(Color.white);
                        if(model.myturn==true){
                            model.mypoints++;
                            labelMyPoints.setText(Integer.toString(model.mypoints));
                            labelRemote.setForeground(null);
                            labelLocal.setForeground(Color.red);
                        }
                         else{
                            model.hispoints++;
                            labelHisPoints.setText(Integer.toString(model.hispoints));
                            labelRemote.setForeground(Color.red);
                            labelLocal.setForeground(null);
                         }
                        model.lastnum = numer;
                        model.buttonsArray[numer].setIcon(images[model.images_pair[numer]]);
                        return true;
                    }
                    else{
                        model.clickNo=0;
                        if(model.myturn==true){
                            model.myturn=false;
                            labelRemote.setForeground(Color.red);
                            labelLocal.setForeground(null);
                        }
                        else{
                            model.myturn=true;
                            labelRemote.setForeground(null);
                            labelLocal.setForeground(Color.red);
                        }
                    }
                }
            }
            model.buttonsArray[numer].setIcon(images[model.images_pair[numer]]);
            model.lastnum=numer;
        }
        return false;
    }

    /**
    * Uruchamia serwer słuchający na porcie wyspecyfikowanym przez pole tekstowe
    */
    protected void host_it()
    {
        if(hostButton.isEnabled()==true){
            Server myServer = new Server();

        myServer.port=Integer.parseInt(hostPortTextField.getText());
        try
        {
            myServer.start();
            connectButton.setEnabled(false);
            serverNameTextField.setEnabled(false);
            serverPortLabel.setEnabled(false);
            serverNameLabel.setEnabled(false);
            serverPortTextField.setEnabled(false);
            setTitle("MemoryGame - Piotr Jastrzębski 4I1 - server");
        } catch (Exception ex)
        {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    /**
    * Nawiazuje polaczenie z serwerem wyspecyfikowanym jako adres:port podany w polach.
    */
    protected void connect_it(){
        if(connectButton.isEnabled()==true){
            Client myClient = new Client();
            myClient.ip=serverNameTextField.getText();
            myClient.port=Integer.parseInt(serverPortTextField.getText());
        try
        {
            myClient.run();
            hostButton.setEnabled(false);
            hostPortTextField.setEnabled(false);
            hostPortLabel.setEnabled(false);
            setTitle("MemoryGame - Piotr Jastrzębski 4I1 - client");
        } catch (Exception ex)
        {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }

    /**
    * Ustawia punkty lokalnego i aktualizuje etykiete.
    */
    protected void setMyPoints(int p)
    {
            model.mypoints=p;
            labelMyPoints.setText(Integer.toString(model.mypoints));
    }

    /**
    * Ustawia punkty gracza zdalnego i aktualizuje etykiete.
    */
    protected void setHisPoints(int p)
    {
        model.hispoints=p;
        labelHisPoints.setText(Integer.toString(model.hispoints));
    }

    /**
    * Zeruje wartosci w modelu tworzac czysta plansze, z zerowym stanem kont punktowych
    */
    protected void reset()
    {
        model.myturn=true;
        model.mypoints=0;
        model.hispoints=0;
        model.clickNo=0;
        model.lastHalfPair=-1;
        model.lastnum=-1;
        labelMyPoints.setText("0");
        labelHisPoints.setText("0");
        labelRemote.setForeground(null);
        labelLocal.setForeground(Color.red);

        for(int i=0;i<36;i++)
            model.buttonsArray[i].setBackground(null);
    }

    /**
     * Wykonuje procedure mieszania z modelu, zeruje stan gry i odwraca nieodwrócone ikony
     */
    protected void shuffle()
    {
        model.shuffle();
        reset();
        model.hide_icons();
    }
}

class Dialog extends JDialog
    {
        /**
        *Okienko z informacja o wyniku i koncu gry
        */
        public Dialog(JFrame owner,final Model model)
        {
            super(owner,"Koniec gry", true);
            JLabel txt = new JLabel( "<html><h1>Ukończyłeś grę!</h1></html>");
            JLabel txt2 = new JLabel( "Local points "+model.mypoints+"   :   "+model.hispoints+" Remote points");

            txt.setHorizontalAlignment(SwingConstants.CENTER);
            add(txt , BorderLayout.NORTH);
            txt2.setHorizontalAlignment(SwingConstants.CENTER);
            add(txt2 , BorderLayout.CENTER);

            JButton ok = new JButton("Ok");
            ok.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        dispose();
                    }
                }
            );
            JPanel panel = new JPanel();
            panel.add(ok);
            add(panel, BorderLayout.SOUTH);
            setSize(300, 200);
        }
    }
