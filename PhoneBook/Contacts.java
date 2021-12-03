
package practica;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author hirca
 */
public class Contacts extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public Contacts() {
        initComponents();
        table_display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_first = new javax.swing.JTextField();
        txt_last = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel1.setText("Contacts");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Contact", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Mobile");

        txt_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstActionPerformed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_last, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26))
        );

        jTable1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "lLast Name", "Mobile"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con1; ////cream un obiect de tip Connection folosit pt realizarea conexiunii cu baza de date
    PreparedStatement insert; //cream un obiect de tip PreparedStatement pentru a stoca si executa o comanda SQL
    
    //functie folosita pentru a afisa contactele adaugate in baza de date
    private void table_display(){
        
        int c;
        try {
            //realizarea conexiunii cu baza de date
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/agenda_telefonica","root","");

            //executarea comenzii SQL de selectare a datelor din baza de date; data returnata este salvata
            //intr-un tabel, numit resultset; acest resultset pointeaza catre randul curent al datei
            insert = con1.prepareStatement("select * from contacts");
            ResultSet rs = insert.executeQuery();

            //declaram un obiect de tip ResultSetMetaData pentru a obtine mai multe informatii despre data curenta
            ResultSetMetaData rsmd = rs.getMetaData();

            //salvam numarul de coloane intr-o variabila de tip int
            c = rsmd.getColumnCount();
            
            //initializam un obiect de tip DefaultTableModel care foloseste un vector de vectori pentru a salva
            //informatiile introduse in baza de date
            DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(rs.next()){
                Vector v1 = new Vector();
                
                for(int i = 1; i <= c; i++){
                    v1.add(rs.getString("id"));
                    v1.add(rs.getString("first_name"));
                    v1.add(rs.getString("last_name"));
                    v1.add(rs.getString("mobile"));
                }
                df.addRow(v1);
            }
      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Stocam valorile introduse in campurile de text in niste variabile de tip STRING
        String first = txt_first.getText();
        String last = txt_last.getText();
        String mobile = txt_mobile.getText();
        

        
        try {
            //realizarea conexiunii cu baza de date
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/agenda_telefonica","root","");

            //executarea comenzii SQL de inserare in baza de date; id-ul se autoincrementeaza, deci nu mai este nevoie sa fie pus
            insert = con1.prepareStatement("insert into contacts(first_name,last_name,mobile)values(?,?,?)");

            //datele salvate mai sus se introduc in array la pozitia corespunzatoare si se adauga in baza de date
            insert.setString(1,first);
            insert.setString(2,last);
            insert.setString(3, mobile);
            insert.executeUpdate();
            
            //adaugarea unui message box pt confirmarea contactului adaugat
            JOptionPane.showMessageDialog(this, "Contact Added Successfully");

            //functia care afiseaza baza de date dupa INSERARE
            table_display();
            
            //dupa ce contactul este adaugat, datele din campurile de text se sterg automat pt a introduce 
            //un contact nou, iar cursorul va fi pus automat pe primul camp
            txt_first.setText("");
            txt_last.setText("");
            txt_mobile.setText("");
            txt_first.requestFocus();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_firstActionPerformed(java.awt.event.ActionEvent evt){}

    //functie care afiseaza informatia inapoi in campurile de text cand este selectat un anumit rand
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selected_index = jTable1.getSelectedRow(); //salvam indexul randului selectat
        
        //afisam pentru fiecare camp informatia corespunzatoare de la indexul selectat
        txt_first.setText(df.getValueAt(selected_index, 1).toString());
        txt_last.setText(df.getValueAt(selected_index, 2).toString());
        txt_mobile.setText(df.getValueAt(selected_index, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //initializam un obiect de tip DefaultTableModel care foloseste un vector de vectori pentru a salva
        //informatiile introduse in baza de date
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selected_index = jTable1.getSelectedRow(); //salvam indexul randului selectat
        
        try {
            //salvam id-ul datei respective din baza de date intr-o variabila de tip int
            int id = Integer.parseInt(df.getValueAt(selected_index, 0).toString());

            //Stocam valorile introduse in campurile de text in niste variabile de tip STRING
            String first = txt_first.getText();
            String last = txt_last.getText();
            String mobile = txt_mobile.getText();
        
            //realizarea conexiunii cu baza de date
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/agenda_telefonica","root","");

            //executarea comenzii SQL de update a datelor
            insert = con1.prepareStatement("update contacts set first_name = ?, last_name = ?, mobile = ? where id = ?");
            
            //datele salvate mai sus se introduc in array la pozitia corespunzatoare si se adauga in baza de date
            insert.setString(1,first);
            insert.setString(2,last);
            insert.setString(3, mobile);
            insert.setInt(4, id);
            insert.executeUpdate();
            
            //afisarea unui message box de confirmare a editarii reusite a contactului
            JOptionPane.showMessageDialog(this, "Contact Updated Successfully");
            //afisarea bazei de date dupa UPDATE
            table_display();
            
            //dupa ce contactul este adaugat, datele din campurile de text se sterg automat pt a introduce 
            //un contact nou, iar cursorul va fi pus automat pe primul camp
            txt_first.setText("");
            txt_last.setText("");
            txt_mobile.setText("");
            txt_first.requestFocus();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //initializam un obiect de tip DefaultTableModel care foloseste un vector de vectori pentru a salva
        //informatiile introduse in baza de date
        DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
        int selected_index = jTable1.getSelectedRow(); //salvam indexul randului selectat
        
        try {
            //salvam id-ul datei respective din baza de date intr-o variabila de tip int
            int id = Integer.parseInt(df.getValueAt(selected_index, 0).toString());

            //folosim un dialog de confirmare pt stergerea datei
            int dialog_result = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this contact?", "Warning", JOptionPane.YES_NO_OPTION);
            
            //daca optiunea este "YES" atunci se executa stergerea
            if(dialog_result == JOptionPane.YES_OPTION){
                //realizarea conexiunii cu baza de date
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/agenda_telefonica","root","");

                //executarea comenzii SQL de stergere a contactului din baza de date de la id-ul corespunzator
                insert = con1.prepareStatement("delete from contacts where id = ?");
                insert.setInt(1, id);
                insert.executeUpdate();
                
                //afisam un message box pentru a avea confirmarea ca s-a sters contactul respectiv
                JOptionPane.showMessageDialog(this, "Contact Deleted Successfully");

                //afisarea bazei de date dupa stergere
                table_display();
            
                //dupa ce contactul este adaugat, datele din campurile de text se sterg automat pt a introduce 
                //un contact nou, iar cursorul va fi pus automat pe primul camp
                txt_first.setText("");
                txt_last.setText("");
                txt_mobile.setText("");
                txt_first.requestFocus();
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(Contacts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contacts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_first;
    private javax.swing.JTextField txt_last;
    private javax.swing.JTextField txt_mobile;
    // End of variables declaration//GEN-END:variables
}
