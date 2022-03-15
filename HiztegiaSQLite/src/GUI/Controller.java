/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;

/**
 *
 * @author basterra.alain
 */
public class Controller implements ActionListener {
    private Model model;
    private ViewZirriborro view;
    public Controller(Model model, ViewZirriborro view) {
        this.model = model;
        this.view = view;
        anadirActionListener(this);       
    }    
    private void anadirActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonGehitu.addActionListener(listener);        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
//        switch (actionCommand) {
//            case "GEHITU":
