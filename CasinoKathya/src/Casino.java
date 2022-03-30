
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gonzc
 */
public class Casino extends javax.swing.JFrame {
    ImagenFondo fondo = new ImagenFondo();
    //Hilos
    Hilo Hilo1 = new Hilo();
    Hilo Hilo2 = new Hilo();
    Hilo Hilo3 = new Hilo();
    boolean ganar = false;
    /**
     * Creates new form Casino
     */
    public Casino() {
       this.setContentPane(fondo);
       initComponents();
       Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
       int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
       int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
       this.setLocation(x, y);
       this.setTitle("Casino");
       this.setSize(715, 600);
       //icono del programa
       Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/9.png"));
       this.setIconImage(ico);
       //Imagenes de los personajes
       this.jLabel1.setText(" ");
       ImageIcon imagen = new ImageIcon("src/Imagenes/1.jpg");
       Icon icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel1.getWidth(),  this.jLabel1.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel1.setIcon(icono);
       this.jLabel2.setText(" ");
       imagen = new ImageIcon("src/Imagenes/2.jpg");
       icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel2.getWidth(),  this.jLabel2.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel2.setIcon(icono);
       this.jLabel3.setText(" ");
       imagen = new ImageIcon("src/Imagenes/3.jpg");
       icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel3.getWidth(),  this.jLabel3.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel3.setIcon(icono);
       //Titulo
       this.jLabel6.setText(" ");
       imagen = new ImageIcon("src/Imagenes/7.png");
       icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel6.getWidth(),  this.jLabel6.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel6.setIcon(icono);
       //Iconos de botones
       imagen = new ImageIcon("src/Imagenes/5.png");
       icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel4.getWidth(),  this.jLabel4.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel4.setIcon(icono);
       imagen = new ImageIcon("src/Imagenes/6.png");
       icono = new ImageIcon(imagen.getImage().getScaledInstance( this.jLabel5.getWidth(),  this.jLabel5.getHeight(), Image.SCALE_DEFAULT));
       this.jLabel5.setIcon(icono);
       //Hilos
       Hilo1.imagenActual = 1;
       Hilo2.imagenActual = 2;
       Hilo3.imagenActual = 3;
       Hilo1.label=1;
       Hilo2.label=2;
       Hilo3.label=3;
       Hilo1.start();
       Hilo2.start();
       Hilo3.start();
    }
     public class Hilo extends Thread{
        public int label;
        private boolean run = false;
        public int imagenActual;
        public void startRunning(){
           run = true;
        }
        public void stopRunning(){
            run = false;
        }
        public int getRandom(){
            int random = (int) (Math.random() * (3+1));
            return random;
        }
        @Override
        public void run(){
            ImageIcon imagen;
            while(label == 1){
                while(run){
                    if(this.getRandom()==1){
                        imagen = new ImageIcon("src/Imagenes/1.jpg");
                        imagenActual = 1;
                    }else if(this.getRandom() == 2){
                        imagen = new ImageIcon("src/Imagenes/2.jpg");
                        imagenActual = 2;
                    }else{
                        imagen = new ImageIcon("src/Imagenes/3.jpg");
                        imagenActual = 3;
                    } 
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance( jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                    jLabel1.setIcon(icono);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while(label == 2){
                while(run){
                    if(this.getRandom()==1){
                        imagen = new ImageIcon("src/Imagenes/1.jpg");
                        imagenActual = 1;
                    }else if(this.getRandom() == 2){
                        imagen = new ImageIcon("src/Imagenes/2.jpg");
                        imagenActual = 2;
                    }else{
                        imagen = new ImageIcon("src/Imagenes/3.jpg");
                        imagenActual = 3;
                    } 
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance( jLabel2.getWidth(), jLabel2.getHeight(), Image.SCALE_DEFAULT));
                    jLabel2.setIcon(icono);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            while(label == 3){
                while(run){
                    if(this.getRandom()==1){
                        imagen = new ImageIcon("src/Imagenes/1.jpg");
                        imagenActual = 1;
                    }else if(this.getRandom() == 2){
                        imagen = new ImageIcon("src/Imagenes/2.jpg");
                        imagenActual = 2;
                    }else{
                        imagen = new ImageIcon("src/Imagenes/3.jpg");
                        imagenActual = 3;
                    } 
                    Icon icono = new ImageIcon(imagen.getImage().getScaledInstance( jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_DEFAULT));
                    jLabel3.setIcon(icono);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Casino.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public void Ganaste(){
        UIManager.put("control", new Color(23, 33, 43));
        UIManager.put("text", new Color(255, 255, 255));
        UIManager.put("nimbusBase", new Color(23, 33, 43));
        ImageIcon imagen = new ImageIcon("src/Imagenes/8.png");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(90, 90, Image.SCALE_DEFAULT));
        String ms1= "<html><p style = \" font: 15px; \">Felicidades \n Has ganado";
        JOptionPane.showMessageDialog(null, ms1, " ",JOptionPane.PLAIN_MESSAGE, icono);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Iniciar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Violet");

        jLabel3.setText("Caitlyn");

        jLabel1.setText("Jinx");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Detener todos");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Detener");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Detener");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Corbel Light", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Detener");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Arcane");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Hilo1.startRunning();
        Hilo2.startRunning();
        Hilo3.startRunning();
        ganar = false;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Hilo1.stopRunning();
        if(!Hilo2.run && !Hilo3.run){
            if(Hilo1.imagenActual == Hilo2.imagenActual && Hilo1.imagenActual == Hilo3.imagenActual && !ganar){//si el mensaje de ganar ya se mostro no se vuelve a mostrar sobre la misma jugada
               this.Ganaste();
               ganar = true;//ya gano y se le desplego el mensaje de felicitaciones
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Hilo2.stopRunning();
        if(!Hilo1.run && !Hilo3.run){
            if(Hilo1.imagenActual == Hilo2.imagenActual && Hilo1.imagenActual == Hilo3.imagenActual && !ganar){
                this.Ganaste();
                ganar = true;
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Hilo3.stopRunning();
        if(!Hilo1.run && !Hilo2.run){
            if(Hilo1.imagenActual == Hilo2.imagenActual && Hilo1.imagenActual == Hilo3.imagenActual && !ganar){
                this.Ganaste();
                ganar = true;
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Hilo1.stopRunning();
        Hilo2.stopRunning();
        Hilo3.stopRunning();
        if(Hilo1.imagenActual == Hilo2.imagenActual && Hilo1.imagenActual == Hilo3.imagenActual && !ganar){
            this.Ganaste();
            ganar = true;
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
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Casino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Casino().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
    class ImagenFondo extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/4.jpg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
