/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wagonstack;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author seanb
 */
public class WagonGUI extends javax.swing.JFrame {

//   private ArrayList<Wagon> stack;
//    private ArrayList<MyStack> stack;
    MyStack stack = new MyStack();
    
    public WagonGUI() {
        initComponents();
       // stack = new ArrayList<>();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        addTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        removeBTN = new javax.swing.JButton();
        numOfWagonBTN = new javax.swing.JButton();
        firstWagonBTN = new javax.swing.JButton();
        removeAllBTN = new javax.swing.JButton();
        listProBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        exitBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setText("Wagon GUI");

        jLabel1.setText("Add Product to the Wagon");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        removeBTN.setText("Remove");
        removeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBTNActionPerformed(evt);
            }
        });

        numOfWagonBTN.setText("Number of Wagons");
        numOfWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOfWagonBTNActionPerformed(evt);
            }
        });

        firstWagonBTN.setText("First Wagon");
        firstWagonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstWagonBTNActionPerformed(evt);
            }
        });

        removeAllBTN.setText("Remove ALL Wagons");
        removeAllBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAllBTNActionPerformed(evt);
            }
        });

        listProBTN.setText("List Products");
        listProBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(titleLBL))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(addBTN))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(removeBTN)
                                .addGap(31, 31, 31)
                                .addComponent(numOfWagonBTN))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(firstWagonBTN)
                                .addGap(18, 18, 18)
                                .addComponent(removeAllBTN))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(listProBTN)))
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitBTN)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBTN)
                .addGap(42, 42, 42)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBTN)
                    .addComponent(numOfWagonBTN))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstWagonBTN)
                    .addComponent(removeAllBTN))
                .addGap(18, 18, 18)
                .addComponent(listProBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBTN)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        
        
        if(stack.size() > 4){
           JOptionPane.showMessageDialog(null, "TOO MANY WAGONS ON THE TRAIN\nREMOVE A WAGON TO ADD MORE");
        }else{
        stack.push(addTF.getText());
        int i = stack.size() - 1;
        
        JOptionPane.showMessageDialog(null, addTF.getText() + " has been added to the Wagon!");
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void removeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBTNActionPerformed
       displayTA.setText("");
        if(stack.isEmpty()){
           JOptionPane.showMessageDialog(null, "Wagon is Empty");
       }
       displayTA.append(stack.peek().toString());
        stack.pop();
            
        
    }//GEN-LAST:event_removeBTNActionPerformed

    private void numOfWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOfWagonBTNActionPerformed
        displayTA.setText("");
        displayTA.append("Number of Wagons is " + stack.size());
    }//GEN-LAST:event_numOfWagonBTNActionPerformed

    private void firstWagonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstWagonBTNActionPerformed
        displayTA.setText("");
        displayTA.append(stack.lastIndex().toString());
    }//GEN-LAST:event_firstWagonBTNActionPerformed

    private void removeAllBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAllBTNActionPerformed
        
        stack.EmptyAll();
    }//GEN-LAST:event_removeAllBTNActionPerformed

    private void listProBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProBTNActionPerformed
        displayTA.setText("");
        displayTA.append(stack.displayStack().toString());
    }//GEN-LAST:event_listProBTNActionPerformed

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
            java.util.logging.Logger.getLogger(WagonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WagonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WagonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WagonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WagonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField addTF;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton firstWagonBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listProBTN;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton numOfWagonBTN;
    private javax.swing.JButton removeAllBTN;
    private javax.swing.JButton removeBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
