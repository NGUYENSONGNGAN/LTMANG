/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class sever extends javax.swing.JFrame {

    /**
     * Creates new form sever
     */
    public sever() {
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

        label1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Settext = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        keytext = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Gettext = new javax.swing.JTextArea();
        GiaiMa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("Thuật toán mã hóa và giải mã Vigenere");

        jLabel4.setText("Cipher text");

        Settext.setColumns(20);
        Settext.setRows(5);
        jScrollPane2.setViewportView(Settext);

        jLabel3.setText("Key");

        jScrollPane3.setViewportView(keytext);

        jLabel2.setText("Plaint text");

        Gettext.setColumns(20);
        Gettext.setRows(5);
        jScrollPane1.setViewportView(Gettext);

        GiaiMa.setText("^ Dencytp ^");
        GiaiMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaiMaActionPerformed(evt);
            }
        });

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(GiaiMa)
                .addGap(112, 112, 112)
                .addComponent(jButton1)
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GiaiMa)
                    .addComponent(jButton1))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GiaiMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaiMaActionPerformed

        int rowsize = 26;
        int columnsize = 26;
        int vigneretable[][] = new int [26][26];
        for(int rows =0;rows < rowsize;rows++)
        {
            for(int column = 0;column < columnsize;column++)
            {
                vigneretable[rows][column]= (rows+column)%26;
            }
        }
        try
        {
            System.out.println("Enter the cipher text");
            String cipher = Settext.getText();
            System.out.println("Enter the key: ");
            String keychar = keytext.getText();
            keychar = keychar.toUpperCase();
            String plaint = "";
            int keyindex = 0;
            for( int index = 0;index < cipher.length();index++)
            {
                char pChar = cipher.charAt(index);
                int asciiVal = (int) pChar;
                if(pChar == ' ')
                {
                    plaint +=pChar;
                    continue;
                }
                if(asciiVal < 65 || asciiVal > 90)
                {
                    plaint += pChar;
                    continue;
                }
                int basicPlaintTextValue = ((int)pChar)-65;
                char kChar = keychar.charAt(keyindex);
                int basicKeyValue = ((int)kChar)-65;
                for(int i=0;i<columnsize;i++)
                {
                    if(vigneretable[basicKeyValue][i] == basicPlaintTextValue)
                    {
                        char potcChar = (char)(vigneretable[basicKeyValue][i]+65);
                        char potpChar = (char) (i+65);
                        plaint +=potpChar;
                    }
                }
                keyindex++;
                if(keyindex == keychar.length())
                {
                    keyindex = 0;
                }
            }
            System.out.println("plaint text is "+plaint);
            Gettext.setText(plaint.toUpperCase());
            Settext.setText(cipher.toUpperCase());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Key phải là chữ!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_GiaiMaActionPerformed
  public static void main(String args[])throws SocketException, IOException {
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
            java.util.logging.Logger.getLogger(sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sever.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//hienthiraoa
        sever server = new sever();
       
              
        server.setVisible(true);
         
        
        /* Create and display the form */
         DatagramSocket sc = new DatagramSocket(7777);
        System.out.println("Server đã sẵn sàng!!!");
        // tạo 2 mảng byte để nhận dữ liệu
        byte soa[] = new byte[256];
        byte sob[] = new byte[256];
        // tạo 2 biến chiều dài để nhận dữ liệu
        int len1 = soa.length;
        int len2 = sob.length;
        
        // datagrampacket nhận dữ liệu
        DatagramPacket soanhan = new DatagramPacket(soa, len1);
        sc.receive(soanhan);
        DatagramPacket sobnhan = new DatagramPacket(sob, len2);
        sc.receive(sobnhan);
         // tạo 2 biến string để đọc dữ liệu nhận sang string
       
       String ssa,ssb;
       ssa = (new String(soanhan.getData(), 0, len1)).trim();
       ssb = (new String(sobnhan.getData(), 0, len2)).trim();
       server.setTextCP(ssb);
       server.setTextCP2(ssa);
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        char[] ch = Gettext.getText().toCharArray();
        int max=0;
	int dem=1;
      //  string a = a[0];
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==ch[i+1])
		{
			dem++;
				if(dem>max)
				{
					max=dem;
				}
                 }
        }
        int solan= max;
        System.out.println(solan);
        String chuoisolan = String.valueOf(solan);
        byte[] mangsolan = new byte[256];
        mangsolan = chuoisolan.getBytes();
        // DatagramPacket guichuoi = new DatagramPacket(mangsolan, mangsolan.length, 
           //    soanhan.getAddress(), soanhan.getPort());
//        sc.send(guitong);
//        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    
    public void setTextCP(String text){
        Settext.setText(text);
    }
     public void setTextCP2(String text){
        keytext.setText(text);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Gettext;
    private javax.swing.JButton GiaiMa;
    private javax.swing.JTextArea Settext;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane keytext;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
