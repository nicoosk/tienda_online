package vista;

import controlador.ControladorPaneles;
import java.sql.Connection;

public class Menu extends javax.swing.JFrame implements ControladorPaneles{
    
    Connection c;
    public Menu(Connection c) {
        initComponents();
        this.c = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        des = new javax.swing.JLabel();
        desc = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        addcaButton = new javax.swing.JButton();
        addcaButton2 = new javax.swing.JButton();
        addcaButton4 = new javax.swing.JButton();
        addcaButton3 = new javax.swing.JButton();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        btncarrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));

        des.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        des.setText("Descuento del 15% sólo por hoy ");

        desc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        desc.setText("HZKML15");

        logo.setBackground(new java.awt.Color(204, 204, 204));
        logo.setText("logo");

        precio1.setText("9.990");

        addcaButton.setBackground(new java.awt.Color(0, 0, 0));
        addcaButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addcaButton.setForeground(new java.awt.Color(255, 255, 255));
        addcaButton.setText("Agregar al carrito ");
        addcaButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcaButtonActionPerformed(evt);
            }
        });

        addcaButton2.setBackground(new java.awt.Color(0, 0, 0));
        addcaButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addcaButton2.setForeground(new java.awt.Color(255, 255, 255));
        addcaButton2.setText("Agregar al carrito");
        addcaButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcaButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcaButton2ActionPerformed(evt);
            }
        });

        addcaButton4.setBackground(new java.awt.Color(0, 0, 0));
        addcaButton4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addcaButton4.setForeground(new java.awt.Color(255, 255, 255));
        addcaButton4.setText("Agregar al carrito");
        addcaButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcaButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcaButton4ActionPerformed(evt);
            }
        });

        addcaButton3.setBackground(new java.awt.Color(0, 0, 0));
        addcaButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addcaButton3.setForeground(new java.awt.Color(255, 255, 255));
        addcaButton3.setText("Agregar al carrito");
        addcaButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcaButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcaButton3ActionPerformed(evt);
            }
        });

        precio2.setText("6.990");

        precio3.setText("9.990");

        precio4.setText("4.550");

        img1.setBackground(new java.awt.Color(102, 51, 255));
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ropa.jpeg.png"))); // NOI18N

        btncarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.jpeg.png"))); // NOI18N
        btncarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(precio1)
                        .addGap(18, 18, 18)
                        .addComponent(addcaButton)
                        .addGap(60, 60, 60)
                        .addComponent(precio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addcaButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addcaButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncarrito))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(precio4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addcaButton4)))
                .addGap(29, 29, 29))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(des))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(img1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncarrito, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addcaButton3)
                        .addComponent(precio3)
                        .addComponent(addcaButton4)
                        .addComponent(precio4))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precio1)
                        .addComponent(addcaButton)
                        .addComponent(precio2)
                        .addComponent(addcaButton2)))
                .addGap(42, 42, 42)
                .addComponent(des, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addcaButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcaButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcaButton3ActionPerformed

    private void addcaButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcaButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcaButton4ActionPerformed

    private void addcaButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcaButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcaButton2ActionPerformed

    private void addcaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addcaButtonActionPerformed

    private void btncarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarritoActionPerformed
        this.refrescarPanel(new Carrito(c).getPanel(), bg);
    }//GEN-LAST:event_btncarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcaButton;
    private javax.swing.JButton addcaButton2;
    private javax.swing.JButton addcaButton3;
    private javax.swing.JButton addcaButton4;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btncarrito;
    private javax.swing.JLabel des;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public javax.swing.JPanel getPanel(){
        return bg;
    }
    
    @Override
    public void refrescarPanel(javax.swing.JPanel panel, javax.swing.JPanel bg){
        bg.removeAll();
        bg.add(panel);
        bg.revalidate();
        bg.repaint();
    }

}
