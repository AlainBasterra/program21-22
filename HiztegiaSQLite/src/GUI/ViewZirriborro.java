/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author basterra.alain
 */
public class ViewZirriborro {
     public static ViewZirriborro viewaSortuBistaratu() {
        ViewZirriborro v = new ViewZirriborro();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
            }
        });
        return v;
    }   
}
