/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg1.Model;
import pkg1.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;
    private int id;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        //Menuko aukerak, irten-ek ez du behar listenerra
        view.jButtonGehitu.addActionListener(listener);
        view.jButtonEzabatu.addActionListener(listener);
        view.jButtonLista.addActionListener(listener);
        view.jButtonJokoa.addActionListener(listener);
        //Gehitu JDialog-eko botoiak
        view.jButtonHizkiaGehitu.addActionListener(listener);
        //Ezabatu JDialog-eko botoiak
        view.jButtonHitzaEzabatu.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "GEHITU":
                view.Gehitu.setSize(410, 220);
                view.Gehitu.setVisible(true);
                view.Gehitu.setResizable(false);
                
                break;
            case "HITZA GEHITU":
                Terminoa t = new Terminoa(0, view.jTextFieldHitzaEuskaraz.getText(), view.jTextFieldHitzaGazteleraz.getText());
                model.terminoaGehitu(t);
                view.jTableTerminoenTabla.setModel(new TerminoakTableModel(model.terminoakArrayListera()));
                break;
            case "EZABATU":
                view.Ezabatu.setSize(428, 164);
                view.Ezabatu.setVisible(true);
                view.Ezabatu.setResizable(false);
                
                break;
            case "HITZA EZABATU":
                id = Integer.parseInt(view.jTextFieldHitzaEzabatuID.getText());
                model.terminoaEzabatu(id);
                view.jTableTerminoenTabla.setModel(new TerminoakTableModel(model.terminoakArrayListera()));
                break;
            case "LISTA":
                view.Lista.setSize(371, 550);
                view.Lista.setVisible(true);
                view.Lista.setResizable(false);
                view.jTableTerminoenTabla.setModel(new TerminoakTableModel(model.terminoakArrayListera()));

        }
    }
}
