/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package icaro.infraestructura.recursosOrganizacion.recursoTrazas.imp.gui;

import icaro.infraestructura.entidadesBasicas.comunicacion.EventoSimple;
import icaro.infraestructura.entidadesBasicas.comunicacion.MensajeSimple;
import icaro.infraestructura.recursosOrganizacion.recursoTrazas.imp.componentes.InfoTraza;

/**
 *
 * @author FGarijo
 */
public abstract class PanelTrazasAbstracto extends javax.swing.JFrame {
    private String titulo;
    private String contenido;

    /**
     * Creates new form PanelTrazasPadre
     */
    public PanelTrazasAbstracto() {
        initComponents();
    }
    
    public PanelTrazasAbstracto(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
    }
     public void cierraVentana(){
   	this.setVisible(false);
    }

        
    public void muestraInfoTraza(InfoTraza traza){
        //a implementar por los hijos
    }

        public void muestraMensajeEnviado(MensajeSimple traza){
            
        }
        public void muestraEventoEnviado(EventoSimple evento){
            
        }
        
        public void muestraMensajeRecibido(MensajeSimple traza){
            
        }
        public void muestraEventoRecibido( EventoSimple evento){
            
        }
        
        public void muestraTrazaEjecucionReglas( String  infoAtrazar){
            
        }
        public void muestraTrazaActivacionReglas( String  infoAtrazar){
            
        }
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
