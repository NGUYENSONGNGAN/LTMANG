
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.io.IOException;
//import java.net.DatagramSocket;
import java.net.InetAddress;
//import java.net.SocketException;
//import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//import java.net.SocketException;
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 *
 */

/**
 *
 * @author SV
 */
public class bai2 extends javax.swing.JFrame {
   // private  byte [] mess=new byte[1000000000];
    /** Creates new form */
    public bai2() {
        initComponents();
  
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Gettext = new javax.swing.JTextArea();
        MaHoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Settext = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        keytext = new javax.swing.JTextPane();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Gettext.setColumns(20);
        Gettext.setRows(5);
        jScrollPane1.setViewportView(Gettext);

        MaHoa.setText("v Encytp v");
        MaHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaHoaActionPerformed(evt);
            }
        });

        Settext.setColumns(20);
        Settext.setRows(5);
        jScrollPane2.setViewportView(Settext);

        jScrollPane3.setViewportView(keytext);

        label1.setText("Thu???t to??n m?? h??a v?? gi???i m?? Vigenere");

        jLabel2.setText("Plaint text");

        jLabel3.setText("Key");

        jLabel4.setText("Cipher text");

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("S??? l???n xu???t hi???n nhi???u nh???t : ");

        jLabel6.setText("K?? t??? xu???t hi???n nhi???u nh???t l?? :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MaHoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label1)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel7)))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHoa)
                    .addComponent(jButton1))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private char mahoa(char ch, int key)
    {
        if(Character.isLetter(ch))
        {
            ch = (char)('A'+(Character.toUpperCase(ch)-'A'+key)%26);
        }
        return ch;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            // TODO add your handling code here:
            DatagramSocket clientsocket = new DatagramSocket();
            
            System.out.println("k???t n???i server");
            // khai b??o 2 m???ng a v?? b ????? ch??a d??? li???u g???i l??n server
            byte[] manga = keytext.getText().getBytes();
            byte[] mangb = Settext.getText().getBytes();
            
            InetAddress diachi = InetAddress.getByName("localhost");
            
            int port = 7777;
            
            DatagramPacket guia = new DatagramPacket(manga, manga.length, diachi, port);
            clientsocket.send(guia);
            
            DatagramPacket guib = new DatagramPacket(mangb, mangb.length, diachi, port);
            clientsocket.send(guib);
            
        } catch (Exception ex) {
            Logger.getLogger(bai2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MaHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaHoaActionPerformed
        // TODO add your handling code here:

        int rowsize = 26;
        int columnsize = 26;
        int vigneretable[][] = new int [26][26];
        for(int rows =0;rows < rowsize ; rows++ )
        {
            for(int column = 0;column < columnsize;column++)
            {
                vigneretable[rows][column]= (rows+column)%26;
            }
        }
        try
        {
            System.out.println("Enter the plainttext");
            String plaint = Gettext.getText();
            plaint = plaint.toUpperCase();
            System.out.println("Enter the key: ");
            String keychar = keytext.getText();
            keychar = keychar.toUpperCase();
            String cipher = "";
            int keyindex = 0;
            for( int index = 0;index < plaint.length();index++)
            {
                char pChar = plaint.charAt(index);
                int asciiVal = (int) pChar;
                if(pChar == ' ')
                {
                    cipher +=pChar;
                    continue;
                }
                if(asciiVal < 65 || asciiVal > 90)
                {
                    cipher += pChar;
                    continue;
                }
                int basicPlaintTextValue = ((int)pChar)-65;
                char kChar = keychar.charAt(keyindex);
                int basicKeyValue = ((int)kChar)-65;
                int tableEntry = vigneretable[basicPlaintTextValue][basicKeyValue];
                char cChar = (char) (tableEntry + 65);
                cipher += cChar;
                keyindex++;
                if(keyindex == keychar.length())
                {
                    keyindex = 0;
                }
            }
            System.out.println("Cipher text is "+cipher);
            Settext.setText(cipher.toUpperCase());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Key ph???i l?? ch???!");
        }

    }//GEN-LAST:event_MaHoaActionPerformed
 
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Gettext;
    private javax.swing.JButton MaHoa;
    private javax.swing.JTextArea Settext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane keytext;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables

}
