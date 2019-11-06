


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author labraham
 */
public class Controlador {

    public static final int pensando = 0;
    public static final int hambriento = 1;
    public static final int comiendo = 2;
    public static final int satisfecho = 3;
    private int n;
    private int estado[];
    Main main;

    public Controlador(int n) {
        this.n = n;
        estado = new int[n];
    }

    public synchronized void tomarTenedores(int id) {
        estado[id] = hambriento;
        prueba(id);
        while (estado[id] != comiendo) {
            try {
                main.modelo.setValueAt("Esperando", id, 1);

                System.out.println("Filosofo " + id + " Esta esperando");
                main.filosofosStatus.get(id).setIcon(main.hambreImg);
                main.total =  main.total +1;
                main.progress.setValue(((main.total)*100)/(main.cxf));    
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }

    public synchronized void soltarTenedores(int id) {
        int izq, der;
        der = (id + 1) % n;
        izq = id - 1;
        if (izq < 0) {
            izq = n - 1;
        }
        main.tenedor(id, n);
        main.tenedor(der, n);
        
//        main.tenedor.get(id).setIcon(main.tenedorr);
//        main.tenedor.get(der).setIcon(main.tenedorr);
        estado[id] = pensando;
        main.modelo.setValueAt("Pensando", id, 1);
        main.filosofosStatus.get(id).setIcon(main.pensandoImg);
        prueba(izq);
        prueba(der);

    }
    

    public void prueba(int id) {
        int izq, der;
        der = (id + 1) % n;
        izq = id - 1;
        if (izq < 0) {
            izq = n - 1;
        }
        if (estado[id] == hambriento && estado[izq] != comiendo && estado[der] != comiendo) {
            main.tenedor.get(id).setIcon(null);
            main.tenedor.get(der).setIcon(null);
            estado[id] = comiendo;
            main.modelo.setValueAt("Comiendo", id, 1);
            main.filosofosStatus.get(id).setIcon(main.comiendoImg);
            notifyAll();
        }
    }

    public void Saciado(int id) {
        estado[id] = satisfecho;
        main.modelo.setValueAt("Satisfecho", id, 1);
    }

}
