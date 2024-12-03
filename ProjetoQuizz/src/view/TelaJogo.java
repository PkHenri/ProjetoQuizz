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
        JbAlternativa1.setText(alternativa[indicePergunta][0]);
        JbAlternativa2.setText(alternativa[indicePergunta][1]);
        JbAlternativa3.setText(alternativa[indicePergunta][2]);
        JbAlternativa4.setText(alternativa[indicePergunta][3]);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JlPergunta = new javax.swing.JLabel();
        JbAlternativa1 = new javax.swing.JButton();
        JbAlternativa2 = new javax.swing.JButton();
        JbAlternativa3 = new javax.swing.JButton();
        JbAlternativa4 = new javax.swing.JButton();
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
        setMaximumSize(new java.awt.Dimension(1324, 768));
        setMinimumSize(new java.awt.Dimension(1324, 768));
        setName("JfTelaJogo"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1324, 768));
        setResizable(false);
        setSize(new java.awt.Dimension(1324, 768));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1324, 768));

        JlPergunta.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        JlPergunta.setForeground(new java.awt.Color(255, 255, 255));
        JlPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JbAlternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlternativa1ActionPerformed(evt);
            }
        });

        JbAlternativa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlternativa2ActionPerformed(evt);
            }
        });

        JbAlternativa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlternativa3ActionPerformed(evt);
            }
        });

        JbAlternativa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlternativa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(527, 527, 527)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JbAlternativa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbAlternativa4, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(JbAlternativa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JbAlternativa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(471, 471, 471))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 1312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(JlPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(JbAlternativa1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JbAlternativa2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JbAlternativa3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JbAlternativa4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbAlternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlternativa4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbAlternativa4ActionPerformed

    private void JbAlternativa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlternativa3ActionPerformed
        
    }//GEN-LAST:event_JbAlternativa3ActionPerformed

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

    private void JbAlternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlternativa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbAlternativa1ActionPerformed

    private void JbAlternativa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlternativa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbAlternativa2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlternativa1;
    private javax.swing.JButton JbAlternativa2;
    private javax.swing.JButton JbAlternativa3;
    private javax.swing.JButton JbAlternativa4;
    private javax.swing.JLabel JlPergunta;
    private javax.swing.JMenu JmJogar;
    private javax.swing.JMenu JmQuemSomos;
    private javax.swing.JMenu JmSair;
    private javax.swing.JMenu JmTelaPrincipal;
    private javax.swing.JMenuItem JmiQuemSomos;
    private javax.swing.JMenuItem JmiSair;
    private javax.swing.JMenuItem JmiTelaPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static String[] Pergunta = {
        "Qual é o maior planeta do nosso sistema solar?",
        "Qual é a estrela mais próxima da Terra?",
        "O que ocorre quando a Lua está entre o Sol e a Terra, projetando sua sombra sobre a Terra?",
        "Qual é a galáxia onde se localiza a Via Láctea?",
        "Qual é o nome da primeira pessoa a pisar na Lua?",
        "O que são as estrelas cadentes?",
        "Qual é a principal função da Estação Espacial Internacional (ISS)?",
        "Qual é o nome da força que mantém os planetas em órbita ao redor do Sol?",
        "Qual é a maior lua do Sistema Solar?",
        "O que são os buracos negros?"
    };
    
    private static String[][] alternativa = {
        {"Marte", "Júpiter", "Saturno", "Netuno"},
        {"Sirius", "Betelgeuse", "Sol", "Proxima Centauri"},
        {"Eclipse lunar", "Eclipse solar", "Superlua", "Chuva de meteoros"},
        {"Andrômeda", "Grupo Local", "Virgem", "A Via Láctea não pertence a nenhuma galáxia"},
        {"Yuri Gagarin", "Neil Armstrong", "Alan Shepard", "Buzz Aldrin"},
        {"Estrelas que estão caindo", "Pequenos meteoros que se incendeiam ao entrar na atmosfera terrestre", "Planetas que mudam de órbita", "Buracos negros em formação"},
        {"Explorar outros planetas", "Servir como base para viagens espaciais tripuladas para outros sistemas solares", "Realizar pesquisas científicas em um ambiente de microgravidade", "Ser um ponto de observação para atividades militares"},
        {"Gravidade", "Magnetismo", "Força centrífuga", "Força nuclear"},
        {"Lua (da Terra)", "Ganimedes (de Júpiter)", "Titã (de Saturno)", "Tritão (de Netuno)"},
        {"Regiões do espaço onde a gravidade é tão forte que nada, nem mesmo a luz, pode escapar", "Estrelas que explodiram e se tornaram supernovas", "Nuvens de gás e poeira cósmica", "Túneis que conectam diferentes partes do universo"}
    };  
}
