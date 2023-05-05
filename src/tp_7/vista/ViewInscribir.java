/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_7.vista;

import java.util.Iterator;
import tp_7.entidades.Alumno;
import tp_7.entidades.Materia;

/**
 *
 * @author julie
 */
public class ViewInscribir extends javax.swing.JPanel {

    /**
     * Creates new form ViewInscribir
     */
    public ViewInscribir() {
        initComponents();
        setSize(592,429);
        jComboBox_alumnos.removeAllItems();
        jComboBox_materias.removeAllItems();
         for(Alumno a:Colegio.alumnos.values()){
            jComboBox_alumnos.addItem(a.getApellido()+" "+a.getNombre()+"("+a.getLegajo()+")");
            //apellido nombre (numeroLegajo)
        }
        for(Materia  m:Colegio.materias.values()){
             jComboBox_materias.addItem(m.getNombre()+"("+m.getIdMateria()+")");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_materias = new javax.swing.JComboBox<>();
        jComboBox_alumnos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Formulario de inscripción");
        add(jLabel1);
        jLabel1.setBounds(171, 29, 251, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("ELIJA UNA MATERIA:");
        add(jLabel2);
        jLabel2.setBounds(70, 120, 160, 23);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("ELIJA UN ALUMNO:");
        add(jLabel3);
        jLabel3.setBounds(70, 200, 150, 23);

        jComboBox_materias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox_materias);
        jComboBox_materias.setBounds(230, 120, 180, 30);

        jComboBox_alumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox_alumnos);
        jComboBox_alumnos.setBounds(220, 200, 190, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton1.setText("Inscribir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(380, 380, 100, 29);

        jButton2.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jButton2.setText("Salir");
        add(jButton2);
        jButton2.setBounds(490, 380, 80, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s=(String)jComboBox_alumnos.getSelectedItem();
       String []arr=s.split("[(||)]");
       int key=Integer.parseInt(arr[1]);
       Alumno a=Colegio.alumnos.get(key);
        System.out.println(key);
       String s2=(String)jComboBox_materias.getSelectedItem();
       String []arr2=s2.split("[(||)]");
       int key2=Integer.parseInt(arr2[1]);
        System.out.println(key2);
        a.agregarMateria(Colegio.materias.get(key2));
        Colegio.alumnos.put(key, a);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_alumnos;
    private javax.swing.JComboBox<String> jComboBox_materias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
