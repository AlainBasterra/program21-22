/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import pkg1.Model;
import pkg1.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;
    private ArrayList<Terminoa> aukerak;
    private int zuzena;// Aldagai hau jokoan erabiltzen dut. Gordetzen du lortutako terminoen listatik (hitzakAukeratu() metodoa erabili ondoren) zein izango den erantzun zuzena.
    private int okerra1;
    private int okerra2;
    private int bizitzak;
    private int puntuazioa;

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
        //Jokoarentzako botoiak
        view.jButtonBidali.addActionListener(listener);
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
                model.terminoaEzabatu(Integer.parseInt(view.jTextFieldHitzaEzabatuID.getText()));
                view.jTableTerminoenTabla.setModel(new TerminoakTableModel(model.terminoakArrayListera()));
                break;
            case "LISTA":
                view.Lista.setSize(371, 550);
                view.Lista.setVisible(true);
                view.Lista.setResizable(false);
                view.jTableTerminoenTabla.setModel(new TerminoakTableModel(model.terminoakArrayListera()));
                break;
            case "JOKOA":
                view.Jokoa.setSize(460, 360);
                view.Jokoa.setVisible(true);
                view.Jokoa.setResizable(false);
                view.jTextFieldErantzuna.setText("");
                bizitzak = 3;
                puntuazioa = 0;
                view.jLabelBizitzak.setText(String.valueOf(bizitzak));
                view.jLabelPuntuazioa.setText(String.valueOf(puntuazioa));
                aukerak = model.hitzakAukeratu();
                zuzena = model.erantzunZuzena();
                if (zuzena == 0) {
                    okerra1 = 1;
                    okerra2 = 2;
                } else if (zuzena == 1) {
                    okerra1 = 0;
                    okerra2 = 2;
                } else {
                    okerra1 = 0;
                    okerra2 = 1;
                }
                view.jLabelHitzaGazteleraz.setText(model.hitzaGazteleraz(aukerak, zuzena));
                if (zuzena == 0) {
                    view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, zuzena));
                    view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra1));
                    view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                } else if (zuzena == 1) {
                    view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                    view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, zuzena));
                    view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                } else {
                    view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                    view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra2));
                    view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, zuzena));
                }
                break;
            case "BIDALI":
                if (view.jTextFieldErantzuna.getText().equals("")){
                    System.out.println("Erantzuna hutsik dago!");
                    break;
                }
                if (model.konprobatu(aukerak, zuzena, view.jTextFieldErantzuna.getText())) {
                    puntuazioa++;
                    view.jLabelBizitzak.setText(String.valueOf(bizitzak));
                    view.jLabelPuntuazioa.setText(String.valueOf(puntuazioa));
                    view.jTextFieldErantzuna.setText("");
                    aukerak = model.hitzakAukeratu();
                    zuzena = model.erantzunZuzena();
                    if (zuzena == 0) {
                        okerra1 = 1;
                        okerra2 = 2;
                    } else if (zuzena == 1) {
                        okerra1 = 0;
                        okerra2 = 2;
                    } else {
                        okerra1 = 0;
                        okerra2 = 1;
                    }
                    view.jLabelHitzaGazteleraz.setText(model.hitzaGazteleraz(aukerak, zuzena));
                    if (zuzena == 0) {
                        view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, zuzena));
                        view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra1));
                        view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                    } else if (zuzena == 1) {
                        view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                        view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, zuzena));
                        view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                    } else {
                        view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                        view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra2));
                        view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, zuzena));
                    }
                } else {
                    bizitzak--;
                    if (bizitzak == 0) { // Jokoa galtzen denean egin behar duena
                        view.Puntuazioa.setSize(201, 100);
                        view.Puntuazioa.setVisible(true);
                        view.Puntuazioa.setResizable(false);
                        view.jLabelAmaierakoPuntuazioa.setText(String.valueOf(puntuazioa));
                        bizitzak = 3;
                        puntuazioa = 0;
                        view.jLabelBizitzak.setText(String.valueOf(bizitzak));
                        view.jLabelPuntuazioa.setText(String.valueOf(puntuazioa));
                        view.jTextFieldErantzuna.setText("");
                        aukerak = model.hitzakAukeratu();
                        zuzena = model.erantzunZuzena();
                        if (zuzena == 0) {
                            okerra1 = 1;
                            okerra2 = 2;
                        } else if (zuzena == 1) {
                            okerra1 = 0;
                            okerra2 = 2;
                        } else {
                            okerra1 = 0;
                            okerra2 = 1;
                        }
                        view.jLabelHitzaGazteleraz.setText(model.hitzaGazteleraz(aukerak, zuzena));
                        if (zuzena == 0) {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, zuzena));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                        } else if (zuzena == 1) {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, zuzena));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                        } else {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra2));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, zuzena));
                        }
                    } else {

                        view.jLabelBizitzak.setText(String.valueOf(bizitzak));
                        view.jLabelPuntuazioa.setText(String.valueOf(puntuazioa));
                        view.jTextFieldErantzuna.setText("");
                        aukerak = model.hitzakAukeratu();
                        zuzena = model.erantzunZuzena();
                        if (zuzena == 0) {
                            okerra1 = 1;
                            okerra2 = 2;
                        } else if (zuzena == 1) {
                            okerra1 = 0;
                            okerra2 = 2;
                        } else {
                            okerra1 = 0;
                            okerra2 = 1;
                        }
                        view.jLabelHitzaGazteleraz.setText(model.hitzaGazteleraz(aukerak, zuzena));
                        if (zuzena == 0) {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, zuzena));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                        } else if (zuzena == 1) {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, zuzena));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, okerra2));
                        } else {
                            view.jLabelHitzaEuskaraz1.setText(model.hitzaEuskaraz(aukerak, okerra1));
                            view.jLabelHitzaEuskaraz2.setText(model.hitzaEuskaraz(aukerak, okerra2));
                            view.jLabelHitzaEuskaraz3.setText(model.hitzaEuskaraz(aukerak, zuzena));
                        }
                    }
                }
        }
    }
}
