package vista;

import controlador.ControladorPaneles;

public class Menu extends javax.swing.JFrame implements ControladorPaneles{
    
    public Menu() {
        initComponents();
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
        BttonCart = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        addcaButton = new javax.swing.JButton();
        addcaButton2 = new javax.swing.JButton();
        addcaButton4 = new javax.swing.JButton();
        addcaButton3 = new javax.swing.JButton();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
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

        BttonCart.setBackground(new java.awt.Color(204, 204, 204));
        BttonCart.setText("carrito");

        precio1.setText("precio");

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

        precio2.setText("precio");

        precio3.setText("precio");

        precio4.setText("precio");

        img4.setBackground(new java.awt.Color(102, 51, 255));
        img4.setText("imagen 4");

        img3.setBackground(new java.awt.Color(102, 51, 255));
        img3.setText("imagen 3");

        img2.setBackground(new java.awt.Color(102, 51, 255));
        img2.setText("imagen 2");

        img1.setBackground(new java.awt.Color(102, 51, 255));
        img1.setText("imagen 1");

        btncarrito.setText("carrito");
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
                        .addGap(85, 85, 85)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(precio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addcaButton))
                            .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(precio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addcaButton2))
                            .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(addcaButton3))
                                    .addComponent(precio3))
                                .addGap(44, 44, 44)
                                .addComponent(precio4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addcaButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(btncarrito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BttonCart)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(des))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttonCart)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncarrito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precio2)
                        .addComponent(addcaButton2)
                        .addComponent(addcaButton3)
                        .addComponent(precio3)
                        .addComponent(addcaButton4)
                        .addComponent(precio4))
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(precio1)
                        .addComponent(addcaButton)))
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
        this.refrescarPanel(new Carrito().getPanel(), bg);
    }//GEN-LAST:event_btncarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BttonCart;
    private javax.swing.JButton addcaButton;
    private javax.swing.JButton addcaButton2;
    private javax.swing.JButton addcaButton3;
    private javax.swing.JButton addcaButton4;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btncarrito;
    private javax.swing.JLabel des;
    private javax.swing.JLabel desc;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
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