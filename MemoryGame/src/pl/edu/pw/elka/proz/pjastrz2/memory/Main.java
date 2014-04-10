package pl.edu.pw.elka.proz.pjastrz2.memory;

/**
 * Klasa glowna uruchamiajaca MVC
 */
public class Main {

    public static void main(String[] args) {

        Model myModel = new Model();
        View myView = new View(myModel);   
        Controller myController = new Controller(myModel, myView);

        myView.setVisible(true);
        

    }
    
}
