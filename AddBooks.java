
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruvinya
 */
public class AddBooks extends javax.swing.JFrame {

    Connection  con  =  null;
    PreparedStatement  pst  =  null;
    
    
    public  void  clear(){
        jTextFieldBookID.setText(" ");
        jTextFieldBookName.setText(" ");
        jTextFieldPublisher.setText(" ");
        jTextFieldPublisherYear.setText(" ");
        jTextFieldPages.setText(" ");
        
    }
    /**
     * Creates new form AddBooks
     */
    public AddBooks() {
        initComponents();
        setSize(1079,730);
        setLocation(570,170);
        setResizable(false);
        showDate();
        showTime();
    }
    
        void showDate() {

        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jLabelDate.setText(s.format(d));

    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
                jLabelTime.setText(s.format(d));
            }

        }).start();

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAddBooks = new javax.swing.JLabel();
        jLabelBookID = new javax.swing.JLabel();
        jLabelBookName = new javax.swing.JLabel();
        jLabelPublisher = new javax.swing.JLabel();
        jLabelPublisherYear = new javax.swing.JLabel();
        jLabelPages = new javax.swing.JLabel();
        jTextFieldBookID = new javax.swing.JTextField();
        jTextFieldBookName = new javax.swing.JTextField();
        jTextFieldPublisher = new javax.swing.JTextField();
        jTextFieldPublisherYear = new javax.swing.JTextField();
        jTextFieldPages = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jLabelAddBooks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabelAddBooks.setForeground(new java.awt.Color(0, 204, 102));
        jLabelAddBooks.setText("ADD  BOOKS");

        jLabelBookID.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelBookID.setForeground(new java.awt.Color(51, 102, 255));
        jLabelBookID.setText("Book  ID");

        jLabelBookName.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelBookName.setForeground(new java.awt.Color(51, 102, 255));
        jLabelBookName.setText("Book  Name");

        jLabelPublisher.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelPublisher.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPublisher.setText("Publisher");

        jLabelPublisherYear.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelPublisherYear.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPublisherYear.setText("Publisher  Year");

        jLabelPages.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jLabelPages.setForeground(new java.awt.Color(51, 102, 255));
        jLabelPages.setText("Pages");

        jTextFieldBookID.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldBookID.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldBookName.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldBookName.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPublisher.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPublisher.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPublisherYear.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPublisherYear.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldPublisherYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPublisherYearActionPerformed(evt);
            }
        });

        jTextFieldPages.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTextFieldPages.setForeground(new java.awt.Color(102, 102, 102));

        jButtonAdd.setBackground(new java.awt.Color(102, 153, 255));
        jButtonAdd.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-create-40 (2).png"))); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(102, 153, 255));
        jButtonClear.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-erase-40.png"))); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-40.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelDate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 204, 102));
        jLabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTime.setText("Time");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unnamed (1).jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/giphy-preview.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabelAddBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(jLabelClose)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldPublisherYear, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelPages)
                                    .addComponent(jLabelBookName)
                                    .addComponent(jLabelBookID)
                                    .addComponent(jLabelPublisher)
                                    .addComponent(jLabelPublisherYear))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBookName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBookID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPublisher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPages, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(62, 62, 62)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAddBooks))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelClose))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBookID)
                            .addComponent(jTextFieldBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBookName)
                            .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPublisher)
                            .addComponent(jTextFieldPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPublisherYear)
                            .addComponent(jTextFieldPublisherYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPages))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonClear)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTime)
                    .addComponent(jLabelDate))
                .addContainerGap())
        );

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

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
         String bookID  =   jTextFieldBookID.getText();
        String  bookName  =   jTextFieldBookName.getText();
        String  publisher  =   jTextFieldPublisher.getText();
        String  publisherYear =   jTextFieldPublisherYear.getText();
        String  pages =   jTextFieldPages.getText();
        
        try{
            String query = "INSERT INTO  'book' ('bookID' , 'bookName' , 'publisher' , 'publisherYear' , 'pages') VALUES (?,?,?,?,?)";
            Class.forName("com.mysql.jdbc.Driver"); 
            con  =  DriverManager.getConnection("jdbc:mysql://localhost/lms","root"," ");
            pst  =   con.prepareStatement(query);
            pst.setString(1,bookID);
            pst.setString(2,bookName);
            pst.setString(3,publisher);
            pst.setString(4,publisherYear);
            pst.setString(5,pages);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully  Updated");
            
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       setVisible(false);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextFieldPublisherYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPublisherYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPublisherYearActionPerformed

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
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddBooks;
    private javax.swing.JLabel jLabelBookID;
    private javax.swing.JLabel jLabelBookName;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelPages;
    private javax.swing.JLabel jLabelPublisher;
    private javax.swing.JLabel jLabelPublisherYear;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBookID;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTextField jTextFieldPages;
    private javax.swing.JTextField jTextFieldPublisher;
    private javax.swing.JTextField jTextFieldPublisherYear;
    // End of variables declaration//GEN-END:variables
}
