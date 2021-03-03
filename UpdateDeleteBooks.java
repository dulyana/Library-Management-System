
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class UpdateDeleteBooks extends javax.swing.JFrame {
    
     public  void  clear(){
        
        jTextFieldBookID.setEditable(true);
        jTextFieldBookName.setText(" ");
        jTextFieldPublisher.setText(" ");
        jTextFieldPublisherYear.setText(" ");
        jTextFieldPages.setText(" ");
        
    }

    /**
     * Creates new form UpdateDeleteBooks
     */
    public UpdateDeleteBooks() {
        initComponents();
        setSize(1079,730);
        setLocation(570,170);
        setResizable(false);
        showDate();
        showTime();
    }
    
        void showDate() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        jLabelDate.setText(s.format(d));

    }

    void showTime() {

        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                Date d = new Date();
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
        jLabelUpdateDeleteBooks = new javax.swing.JLabel();
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
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelUpdateDeleteBooks.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabelUpdateDeleteBooks.setForeground(new java.awt.Color(0, 204, 102));
        jLabelUpdateDeleteBooks.setText("UPDATE  AND  DELETE  BOOKS");

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

        jTextFieldBookID.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldBookID.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldBookName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldBookName.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPublisher.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldPublisher.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPublisherYear.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldPublisherYear.setForeground(new java.awt.Color(102, 102, 102));

        jTextFieldPages.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextFieldPages.setForeground(new java.awt.Color(102, 102, 102));

        jButtonUpdate.setBackground(new java.awt.Color(102, 153, 255));
        jButtonUpdate.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-available-updates-40 (1).png"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(102, 153, 255));
        jButtonDelete.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-40.png"))); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
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

        jButtonSearch.setBackground(new java.awt.Color(102, 153, 255));
        jButtonSearch.setFont(new java.awt.Font("Dubai", 0, 20)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-30 (1).png"))); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-window-40.png"))); // NOI18N
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unnamed (1).jpg"))); // NOI18N

        jLabelDate.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelDate.setForeground(new java.awt.Color(0, 204, 102));
        jLabelDate.setText("Date");

        jLabelTime.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(0, 204, 102));
        jLabelTime.setText("Time");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abbook.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPublisher)
                    .addComponent(jLabelPublisherYear)
                    .addComponent(jLabelPages)
                    .addComponent(jLabelBookName)
                    .addComponent(jLabelBookID)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jTextFieldPublisher)
                            .addComponent(jTextFieldPublisherYear)
                            .addComponent(jTextFieldPages))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelUpdateDeleteBooks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabelClose)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabelUpdateDeleteBooks))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabelClose)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBookID)
                            .addComponent(jTextFieldBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelBookName)
                                    .addComponent(jTextFieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPublisher)
                                    .addComponent(jTextFieldPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPublisherYear)
                                    .addComponent(jTextFieldPublisherYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelPages)
                                    .addComponent(jTextFieldPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonClear)
                            .addComponent(jButtonUpdate))
                        .addGap(69, 69, 69)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelTime))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        String bookID  =   jTextFieldBookID.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/librarysystem" ,"root" ," ");
            Statement st = con.createStatement();
            ResultSet  rs  = st.executeQuery("select  *from  book  where bookID= ' "+bookID+" ' ");
            if(rs.first())
            {
                 jTextFieldBookID.setEditable(false);
                 jTextFieldBookName.setText(rs.getString(2));
                 jTextFieldPublisher.setText(rs.getString(3));
                 jTextFieldPublisherYear.setText(rs.getString(4));
                 jTextFieldPages.setText(rs.getString(5));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Book  does  not  Exist");
                clear( );
            }
        }
        catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
       String  bookID  =  jTextFieldBookID.getText( );
       String  bookName  =   jTextFieldBookName.getText( );
       String  publisher  =   jTextFieldPublisher.getText( );
       String  publisherYear  =  jTextFieldPublisherYear.getText( );
       String  pages  =  jTextFieldPages.getText( );
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/librarysystem" ,"root" ," ");
            PreparedStatement  pst  =  con.prepareStatement("update  book  set bookName=?,publisher=?,publisherYear=?,pages=? where bookID=?");
            pst.setString(1,bookName);
            pst.setString(2,publisher);
            pst.setString(3,publisherYear);
            pst.setString(4,pages);
            pst.setString(5,bookID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully  Updated");
            clear();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        String  bookID  = jTextFieldBookID.getText();
       
       try
       {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/librarysystem" ,"root" ," ");
            Statement st = con.createStatement();
            st.executeUpdate("delete  from  book  where  bookID = ' "+bookID+" ' ");
            JOptionPane.showMessageDialog(null, "Successfully  Deleted");
            clear();
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,e);
       }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
       clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
       setVisible(false);
    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateDeleteBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBookID;
    private javax.swing.JLabel jLabelBookName;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelPages;
    private javax.swing.JLabel jLabelPublisher;
    private javax.swing.JLabel jLabelPublisherYear;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelUpdateDeleteBooks;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBookID;
    private javax.swing.JTextField jTextFieldBookName;
    private javax.swing.JTextField jTextFieldPages;
    private javax.swing.JTextField jTextFieldPublisher;
    private javax.swing.JTextField jTextFieldPublisherYear;
    // End of variables declaration//GEN-END:variables
}
