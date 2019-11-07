/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author labraham
 */
public class filosofo extends Thread  {

    private int id;
    private Controlador controlador;
    private int nComidas;
    private int num;
    Main main;
    public filosofo(int id, Controlador c, int nume) {
        this.id = id;
        controlador = c;
        nComidas = 0;
        num = nume;

    }

    public void pensando() {
        System.out.println("Filosofo " + id + " pensando");
        main.filosofosStatus.get(id).setIcon(main.pensandoImg);
        try {
            Thread.sleep((int) (Math.random()*8000+5000));                
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void comer() {
        nComidas++;
        System.out.println("Filosofo " + id + " comiendo -> Numero comida: " + nComidas);
        try {
            Thread.sleep((int) (Math.random() * 5000 + 5000) );
        } catch (Exception e) {
            System.out.println(e);
        }        
    }

    public void run() {
        do { 
            main.total =  main.total +1;
            main.progress.setValue(((main.total)*100)/(main.cxf)); 
            pensando();
            main.total =  main.total +1;
            main.progress.setValue(((main.total)*100)/(main.cxf)); 
            controlador.tomarTenedores(id);
            main.total =  main.total +1;
            main.progress.setValue(((main.total)*100)/(main.cxf)); 
            comer();
            main.total =  main.total +1;
            main.progress.setValue(((main.total)*100)/(main.cxf)); 
            controlador.soltarTenedores(id); 
            main.modelo.setValueAt((main.numRand-nComidas), id, 2);
            main.total =  main.total +1;
            main.progress.setValue(((main.total)*100)/(main.cxf));            
        } while (nComidas< num);
        System.out.println("Filosofo "+id+" Saciado");
        main.filosofosStatus.get(id).setIcon(main.saciadoImg);
        controlador.Saciado(id);   
        main.progress.setValue(100);
        System.out.println("Total " + main.total + "cx: " + main.cxf);
    }

}
























