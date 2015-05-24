/*
 * Descripción: Implementa el envío entre agentes.
 */
package icaro.aplicaciones.agentes.AgenteAplicacionX.tareas;


import icaro.infraestructura.entidadesBasicas.comunicacion.MensajeSimple;
import icaro.infraestructura.entidadesBasicas.procesadorCognitivo.TareaSincrona;
import icaro.infraestructura.entidadesBasicas.interfaces.*;
/**
 *
 * @author Javier Longo
 */
public class EnviMens extends TareaSincrona  {
    @Override
	public void ejecutar(Object... params)  {
           
        String nomb = this.getIdentAgente();
        System.out.println("Nombre del agente: " +nomb);
                MensajeSimple mens = new MensajeSimple();
            mens.setEmisor("AgenteAplicacionX");
            mens.setReceptor("AgenteAplicacionDialogoCitas1");
            mens.setContenido("a");            
            // getAgente() método de la clase Tarea
            // que devuelve agente congnitivo.
            // aceptaMensaje() es un método de la
            // clase AgenteCognitivo.
            // Ver ProcesadorItems.
            this.getAgente().aceptaMensaje(mens);
           
       }
}



    

