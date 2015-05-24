/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 04-mar-2010, 17:19:51
 */

package icaro.aplicaciones.recursos.interfazChatUsuario.imp.gui;

import icaro.aplicaciones.recursos.visualizacionAcceso.imp.swing.VentanaEstandar;
import icaro.aplicaciones.recursos.interfazChatUsuario.imp.ClaseGeneradoraInterfazChatUsuario;
import icaro.aplicaciones.recursos.interfazChatUsuario.imp.NotificacionesEventosVisAccesoAlta;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco J Garijo
 */
public class PanelChatUsuario extends VentanaEstandar {
    private static final long serialVersionUID = 1L;

			/**
			 * @uml.property  name="usoAgente"
			 * @uml.associationEnd  multiplicity="(1 1)"
			 */
    private NotificacionesEventosVisAccesoAlta usoAgente; //comunicacion con el agente (control)

    /** Creates new form NewJFrame */
    public PanelChatUsuario() {
        initComponents();
    }

    public PanelChatUsuario(NotificacionesEventosVisAccesoAlta notifEventos) {
//        usoAgente = new NotificacionesEventosRecurso(visualizador);
	usoAgente = notifEventos;
        initComponents();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAcceder = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        textoUsr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        scrollPane1 = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Acceso");

        botonAcceder.setText("Desconectar");
        botonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccederActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(textoUsr))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAcceder)
                        .addGap(153, 153, 153)
                        .addComponent(botonSalir)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAcceder)
                    .addComponent(botonSalir))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccederActionPerformed
       String usr = textoUsr.getText();
//		        String pwd = textoPwd.getText();
//		    	if((usr.equals(""))||(pwd.equals("")))
//		    		usoAgente.getVisualizador().mostrarMensajeError("Acceso no Valido", "Verifique que ha introducido un nombre de usuario y una clave correcta");
		    	JOptionPane.showMessageDialog(this,"Verifique que ha introducido un nombre de usuario y una clave correcta","Acceso no Valido",JOptionPane.ERROR_MESSAGE);
//                        else
//		    		usoAgente.peticionAutentificacion(textoUsr.getText(),textoPwd.getText());
    }//GEN-LAST:event_botonAccederActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       usoAgente.peticionCierreSistema();
    }//GEN-LAST:event_botonSalirActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelChatUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcceder;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JTextField textoUsr;
    // End of variables declaration//GEN-END:variables

}
