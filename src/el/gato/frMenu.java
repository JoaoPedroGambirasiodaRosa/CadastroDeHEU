/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package el.gato;

import javax.swing.JFrame;

/**
 *
 * @author s.lucas
 */
public class frMenu extends javax.swing.JFrame {

    /**
     * Creates new form frMenu
     */
    public frMenu() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(0, 102, 102));

        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        fileMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\register.png")); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Cadastro");

        openMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\hardware.png")); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Cadastro Hardware");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\User.png")); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Cadastro Usuário");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\exit.png")); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\consult.png")); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Consulta");

        cutMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\hardware.png")); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Hardware");
        editMenu.add(cutMenuItem);

        copyMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\User.png")); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Usuários");
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\help.png")); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Ajuda");

        aboutMenuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\s.lucas\\Downloads\\about.png")); // NOI18N
        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Sobre");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }                                            

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cadHardware cad = new cadHardware();
        desktopPane.add(cad);
        cad.setVisible(true);
    }                                            

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        cadUser cad = new cadUser();
        desktopPane.add(cad);
        cad.setVisible(true);    }                                            

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
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration                   

}
