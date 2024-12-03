package view;

import java.util.Random;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {

    public TelaJogo() {
        initComponents();
        mostrarPergunta();
    }

    
    
    //Função que Exibe Uma Nova Pergunta e Alternativas
    private void mostrarPergunta(){
        int indicePergunta = new Random().nextInt(Pergunta.length);
        
        //Exibir  a Pergunta no JLabel
        JlPergunta.setText(Pergunta[indicePergunta]);
        
        //Exibir as Alternativas nos botões

    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JlPergunta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmJogar = new javax.swing.JMenu();
        JmQuemSomos = new javax.swing.JMenu();
        JmiQuemSomos = new javax.swing.JMenuItem();
        JmTelaPrincipal = new javax.swing.JMenu();
        JmiTelaPrincipal = new javax.swing.JMenuItem();
        JmSair = new javax.swing.JMenu();
        JmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TelaJogo");
        setMaximumSize(new java.awt.Dimension(900, 600));
        setMinimumSize(new java.awt.Dimension(900, 600));
        setName("JfTelaJogo"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        JlPergunta.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JlPergunta.setForeground(new java.awt.Color(255, 255, 255));
        JlPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(JlPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(260, 260, 260))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(477, 477, 477))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(JlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        JlPergunta.getAccessibleContext().setAccessibleName("Pergunta");

        JmJogar.setText("Jogar");
        jMenuBar1.add(JmJogar);

        JmQuemSomos.setText("Quem Somos");

        JmiQuemSomos.setText("Quem Somos");
        JmiQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiQuemSomosActionPerformed(evt);
            }
        });
        JmQuemSomos.add(JmiQuemSomos);

        jMenuBar1.add(JmQuemSomos);

        JmTelaPrincipal.setText("Tela Principal");

        JmiTelaPrincipal.setText("Tela Principal");
        JmiTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiTelaPrincipalActionPerformed(evt);
            }
        });
        JmTelaPrincipal.add(JmiTelaPrincipal);

        jMenuBar1.add(JmTelaPrincipal);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JmiTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiTelaPrincipalActionPerformed
        TelaPrincipal obj = new TelaPrincipal();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JmiTelaPrincipalActionPerformed

    private void JmiQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiQuemSomosActionPerformed
        TelaQuemSomos obj = new TelaQuemSomos();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JmiQuemSomosActionPerformed

    private void JmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Deseja Encerrar?",
        "Fechar", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_JmiSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlPergunta;
    private javax.swing.JMenu JmJogar;
    private javax.swing.JMenu JmQuemSomos;
    private javax.swing.JMenu JmSair;
    private javax.swing.JMenu JmTelaPrincipal;
    private javax.swing.JMenuItem JmiQuemSomos;
    private javax.swing.JMenuItem JmiSair;
    private javax.swing.JMenuItem JmiTelaPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static String[] Pergunta = {
        "aaaaaaaaaaaaaaaaaaaaaa",
        "bbbbbbbbbbbbbbbbbbbbbb",
        "cccccccccccccccccccccc"  
    };
}
