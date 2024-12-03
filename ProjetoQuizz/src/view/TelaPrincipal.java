package view;

import javax.swing.JOptionPane;


public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JbIniciar = new javax.swing.JButton();
        JbQuemSomos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmJogar = new javax.swing.JMenu();
        JmiJogar = new javax.swing.JMenuItem();
        JmQuemSomos = new javax.swing.JMenu();
        JmiQuemSomos = new javax.swing.JMenuItem();
        JmiTelaPrincipal = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        JmSair = new javax.swing.JMenu();
        JmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quizz Game");
        setMaximumSize(new java.awt.Dimension(1324, 768));
        setMinimumSize(new java.awt.Dimension(1324, 768));
        setName("JframeTelaPrincipal"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1324, 768));

        JpPrincipal.setBackground(new java.awt.Color(0, 153, 204));
        JpPrincipal.setMaximumSize(new java.awt.Dimension(900, 600));
        JpPrincipal.setMinimumSize(new java.awt.Dimension(900, 600));
        JpPrincipal.setName("JpPrincipal"); // NOI18N
        JpPrincipal.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/laikaAPW.png"))); // NOI18N

        JbIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iniciar1.png"))); // NOI18N
        JbIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbIniciarActionPerformed(evt);
            }
        });

        JbQuemSomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quemsomos1.png"))); // NOI18N
        JbQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbQuemSomosActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/NomeQuizz1.png"))); // NOI18N

        javax.swing.GroupLayout JpPrincipalLayout = new javax.swing.GroupLayout(JpPrincipal);
        JpPrincipal.setLayout(JpPrincipalLayout);
        JpPrincipalLayout.setHorizontalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpPrincipalLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JbIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JbQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        JpPrincipalLayout.setVerticalGroup(
            JpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPrincipalLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(JbQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );

        JmJogar.setText("Jogar");

        JmiJogar.setText("Jogar");
        JmiJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiJogarActionPerformed(evt);
            }
        });
        JmJogar.add(JmiJogar);

        jMenuBar1.add(JmJogar);

        JmQuemSomos.setText("Quem Somos");
        JmQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmQuemSomosActionPerformed(evt);
            }
        });

        JmiQuemSomos.setText("Quem Somos");
        JmiQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiQuemSomosActionPerformed(evt);
            }
        });
        JmQuemSomos.add(JmiQuemSomos);

        jMenuBar1.add(JmQuemSomos);

        JmiTelaPrincipal.setText("Tela Principal");

        jMenuItem3.setText("Tela Principal");
        JmiTelaPrincipal.add(jMenuItem3);

        jMenuBar1.add(JmiTelaPrincipal);

        JmSair.setText("Sair");

        JmiSair.setText("Sair");
        JmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiSairActionPerformed(evt);
            }
        });
        JmSair.add(JmiSair);

        jMenuBar1.add(JmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1324, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbIniciarActionPerformed
        TelaJogo obj = new TelaJogo();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbIniciarActionPerformed

    private void JmQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmQuemSomosActionPerformed

    }//GEN-LAST:event_JmQuemSomosActionPerformed

    private void JmiQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiQuemSomosActionPerformed
        TelaQuemSomos obj = new TelaQuemSomos();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JmiQuemSomosActionPerformed

    private void JbQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbQuemSomosActionPerformed
        TelaQuemSomos obj = new TelaQuemSomos();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JbQuemSomosActionPerformed

    private void JmiJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiJogarActionPerformed
        TelaJogo obj = new TelaJogo();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JmiJogarActionPerformed

    private void JmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Deseja Encerrar?",
        "Fechar", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_JmiSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbIniciar;
    private javax.swing.JButton JbQuemSomos;
    private javax.swing.JMenu JmJogar;
    private javax.swing.JMenu JmQuemSomos;
    private javax.swing.JMenu JmSair;
    private javax.swing.JMenuItem JmiJogar;
    private javax.swing.JMenuItem JmiQuemSomos;
    private javax.swing.JMenuItem JmiSair;
    private javax.swing.JMenu JmiTelaPrincipal;
    private javax.swing.JPanel JpPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
