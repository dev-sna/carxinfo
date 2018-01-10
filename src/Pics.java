import java.awt.Desktop;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Pics extends javax.swing.JFrame {

    
    
    public String Brand,Model,Year,Spec,Link;
    JFrame frame1=new JFrame();JFrame frame2=new JFrame();JFrame frame3=new JFrame();JFrame frame4=new JFrame();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    public Pics(String brand,String model,String year) {
        Brand=brand;Model=model;Year=year;
        initComponents();
        
    }
    public void Pict1(String imag){
       ImageIcon img1=new ImageIcon(Pics.class.getResource(imag)); 
       JLabel Label1 = new JLabel((Icon) img1);
       frame1.getContentPane().add(Label1);
       frame1.setSize(img1.getIconWidth(),img1.getIconHeight());
            int x = (screenSize.width - frame1.getSize().width)/2;
            int y = (screenSize.height - frame1.getSize().height)/2;
            frame1.setLocation(x, y);
    }
    public void Pict2(String imag){
        ImageIcon img2=new ImageIcon(Pics.class.getResource(imag));
        JLabel Label2 = new JLabel((Icon) img2);
        frame2.getContentPane().add(Label2);
        frame2.setSize(img2.getIconWidth(),img2.getIconHeight());
            int x = (screenSize.width - frame2.getSize().width)/2;
            int y = (screenSize.height - frame2.getSize().height)/2;
            frame2.setLocation(x, y);
    }
    public void Pict3(String imag){
        ImageIcon img3=new ImageIcon(Pics.class.getResource(imag));
        JLabel Label3 = new JLabel((Icon) img3);
        frame3.getContentPane().add(Label3);
        frame3.setSize(img3.getIconWidth(),img3.getIconHeight());
            int x = (screenSize.width - frame3.getSize().width)/2;
            int y = (screenSize.height - frame3.getSize().height)/2;
            frame3.setLocation(x, y);
    }
    public void Pict4(String imag){
        ImageIcon img4=new ImageIcon(Pics.class.getResource(imag));
        JLabel Label4 = new JLabel((Icon) img4);
        frame4.getContentPane().add(Label4);
        frame4.setSize(img4.getIconWidth(),img4.getIconHeight());
            int x = (screenSize.width - frame4.getSize().width)/2;
            int y = (screenSize.height - frame4.getSize().height)/2;
            frame4.setLocation(x, y);
    }
    
    public void file(String model)throws Exception{
        
FileInputStream fis1 = new FileInputStream(model);
DataInputStream dis1 = new DataInputStream(fis1);
Spec = dis1.readUTF();
    Specs.setText(Spec);
    }
    
    public void openWebpage() {
    try {
        Desktop.getDesktop().browse(new URL(Link).toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
private Pics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
        
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pic1 = new javax.swing.JLabel();
        Pic2 = new javax.swing.JLabel();
        Pic3 = new javax.swing.JLabel();
        Pic4 = new javax.swing.JLabel();
        Specs = new javax.swing.JLabel();
        PicsClose = new javax.swing.JLabel();
        Website = new javax.swing.JLabel();
        Pics_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 60, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setMinimumSize(new java.awt.Dimension(480, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 400));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        Pic1.setForeground(new java.awt.Color(255, 255, 255));
        Pic1.setMaximumSize(new java.awt.Dimension(80, 80));
        Pic1.setMinimumSize(new java.awt.Dimension(80, 80));
        Pic1.setPreferredSize(new java.awt.Dimension(80, 80));
        Pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pic1MouseClicked(evt);
            }
        });
        getContentPane().add(Pic1);
        Pic1.setBounds(135, 50, 60, 50);

        Pic2.setForeground(new java.awt.Color(255, 255, 255));
        Pic2.setMaximumSize(new java.awt.Dimension(80, 80));
        Pic2.setMinimumSize(new java.awt.Dimension(80, 80));
        Pic2.setPreferredSize(new java.awt.Dimension(80, 80));
        Pic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pic2MouseClicked(evt);
            }
        });
        getContentPane().add(Pic2);
        Pic2.setBounds(276, 50, 60, 50);

        Pic3.setForeground(new java.awt.Color(255, 255, 255));
        Pic3.setMaximumSize(new java.awt.Dimension(80, 80));
        Pic3.setMinimumSize(new java.awt.Dimension(80, 80));
        Pic3.setPreferredSize(new java.awt.Dimension(80, 80));
        Pic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pic3MouseClicked(evt);
            }
        });
        getContentPane().add(Pic3);
        Pic3.setBounds(135, 138, 60, 50);

        Pic4.setForeground(new java.awt.Color(255, 255, 255));
        Pic4.setMaximumSize(new java.awt.Dimension(80, 80));
        Pic4.setMinimumSize(new java.awt.Dimension(80, 80));
        Pic4.setPreferredSize(new java.awt.Dimension(80, 80));
        Pic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pic4MouseClicked(evt);
            }
        });
        getContentPane().add(Pic4);
        Pic4.setBounds(276, 138, 60, 50);

        Specs.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        Specs.setForeground(new java.awt.Color(255, 255, 255));
        Specs.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Specs);
        Specs.setBounds(25, 215, 430, 100);

        PicsClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PicsCloseMouseClicked(evt);
            }
        });
        getContentPane().add(PicsClose);
        PicsClose.setBounds(402, 30, 20, 20);

        Website.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WebsiteMouseClicked(evt);
            }
        });
        getContentPane().add(Website);
        Website.setBounds(160, 345, 160, 20);

        Pics_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Pics_bg.png"))); // NOI18N
        getContentPane().add(Pics_background);
        Pics_background.setBounds(0, 0, 480, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
//DAIHATSU
String[] boon06={"/Daihatsu/boon/2006/boon06.jpg","/Daihatsu/boon/2006/boon06back.jpg","/Daihatsu/boon/2006/boon06front.jpg","/Daihatsu/boon/2006/boon06side.jpg","boon06.txt"};
String[] boon07={"/Daihatsu/boon/2007/boon07.jpg","/Daihatsu/boon/2007/boon07back.jpg","/Daihatsu/boon/2007/boon07front.jpg","/Daihatsu/boon/2007/boon07side.jpg","boon07.txt"};
String[] boon13={"/Daihatsu/boon/2013/boon13.jpg","/Daihatsu/boon/2013/boon13back.jpg","/Daihatsu/boon/2013/boon13front.jpg","/Daihatsu/boon/2013/boon13side.jpg","boon13.txt"};
String[] boon14={"/Daihatsu/boon/2014/boon14.jpg","/Daihatsu/boon/2014/boon14back.jpg","/Daihatsu/boon/2014/boon14front.jpg","/Daihatsu/boon/2014/boon14side.jpg","boon14.txt"};

String[] charade84={"/Daihatsu/charade/1984/charade84.jpg","/Daihatsu/charade/1984/charade84back.jpg","/Daihatsu/charade/1984/charade84front.jpg","/Daihatsu/charade/1984/charade84side.jpg","charade84.txt"};
String[] charade86={"/Daihatsu/charade/1986/charade86.jpg","/Daihatsu/charade/1986/charade86back.jpg","/Daihatsu/charade/1986/charade86front.jpg","/Daihatsu/charade/1986/charade86side.jpg","charade86.txt"};
String[] charade87={"/Daihatsu/charade/1987/charade87.jpg","/Daihatsu/charade/1987/charade87back.jpg","/Daihatsu/charade/1987/charade87front.jpg","/Daihatsu/charade/1987/charade87side.jpg","charade87.txt"};
String[] charade88={"/Daihatsu/charade/1988/charade88.jpg","/Daihatsu/charade/1988/charade88back.jpg","/Daihatsu/charade/1988/charade88front.jpg","/Daihatsu/charade/1988/charade88side.jpg","charade88.txt"};

String[] cuore04={"/Daihatsu/cuore/2004/cuore04.jpg","/Daihatsu/cuore/2004/cuore04back.jpg","/Daihatsu/cuore/2004/cuore04front.jpg","/Daihatsu/cuore/2004/cuore04side.jpg","cuore04.txt"};
String[] cuore06={"/Daihatsu/cuore/2006/cuore06.jpg","/Daihatsu/cuore/2006/cuore06back.jpg","/Daihatsu/cuore/2006/cuore06front.jpg","/Daihatsu/cuore/2006/cuore06side.jpg","cuore06.txt"};
String[] cuore07={"/Daihatsu/cuore/2007/cuore07.jpg","/Daihatsu/cuore/2007/cuore07back.jpg","/Daihatsu/cuore/2007/cuore07front.jpg","/Daihatsu/cuore/2007/cuore07side.jpg","cuore07.txt"};
String[] cuore08={"/Daihatsu/cuore/2008/cuore08.jpg","/Daihatsu/cuore/2008/cuore08back.jpg","/Daihatsu/cuore/2008/cuore08front.jpg","/Daihatsu/cuore/2008/cuore08side.jpg","cuore08.txt"};

String[] mira09={"/Daihatsu/mira/2009/mira09.jpg","/Daihatsu/mira/2009/mira09back.jpg","/Daihatsu/mira/2009/mira09front.jpg","/Daihatsu/mira/2009/mira09side.jpg","mira09.txt"};
String[] mira12={"/Daihatsu/mira/2012/mira12.jpg","/Daihatsu/mira/2012/mira12back.jpg","/Daihatsu/mira/2012/mira12front.jpg","/Daihatsu/mira/2012/mira12side.jpg","mira12.txt"};
String[] mira13={"/Daihatsu/mira/2013/mira13.jpg","/Daihatsu/mira/2013/mira13back.jpg","/Daihatsu/mira/2013/mira13front.jpg","/Daihatsu/mira/2013/mira13side.jpg","mira13.txt"};
String[] mira14={"/Daihatsu/mira/2014/mira14.jpg","/Daihatsu/mira/2014/mira14back.jpg","/Daihatsu/mira/2014/mira14front.jpg","/Daihatsu/mira/2014/mira14side.jpg","mira14.txt"};

String[] move11={"/Daihatsu/move/2011/move11.jpg","/Daihatsu/move/2011/move11back.jpg","/Daihatsu/move/2011/move11front.jpg","/Daihatsu/move/2011/move11side.jpg","move11.txt"};
String[] move12={"/Daihatsu/move/2012/move12.jpg","/Daihatsu/move/2012/move12back.jpg","/Daihatsu/move/2012/move12front.jpg","/Daihatsu/move/2012/move12side.jpg","move12.txt"};
String[] move13={"/Daihatsu/move/2013/move13.jpg","/Daihatsu/move/2013/move13back.jpg","/Daihatsu/move/2013/move13front.jpg","/Daihatsu/move/2013/move13side.jpg","move13.txt"};
String[] move14={"/Daihatsu/move/2014/move14.jpg","/Daihatsu/move/2014/move14back.jpg","/Daihatsu/move/2014/move14front.jpg","/Daihatsu/move/2014/move14side.jpg","move14.txt"};

//HONDA
String[] accord02={"/Honda/accord/2002/accord02.jpg","/Honda/accord/2002/accord02back.jpg","/Honda/accord/2002/accord02front.jpg","/Honda/accord/2002/accord02side.jpg","accord02.txt"};
String[] accord04={"/Honda/accord/2004/accord04.jpg","/Honda/accord/2004/accord04back.jpg","/Honda/accord/2004/accord04front.jpg","/Honda/accord/2004/accord04side.jpg","accord04.txt"};
String[] accord05={"/Honda/accord/2005/accord05.jpg","/Honda/accord/2005/accord05back.jpg","/Honda/accord/2005/accord05front.jpg","/Honda/accord/2005/accord05side.jpg","accord05.txt"};
String[] accord07={"/Honda/accord/2007/accord07.jpg","/Honda/accord/2007/accord07back.jpg","/Honda/accord/2007/accord07front.jpg","/Honda/accord/2007/accord07side.jpg","accord07.txt"};

String[] city13={"/Honda/city/2013/city13.jpg","/Honda/city/2013/city13back.jpg","/Honda/city/2013/city13front.jpg","/Honda/city/2013/city13side.jpg","city13.txt"};
String[] city14={"/Honda/city/2014/city14.jpg","/Honda/city/2014/city14back.jpg","/Honda/city/2014/city14front.jpg","/Honda/city/2014/city14side.jpg","city14.txt"};
String[] city15={"/Honda/city/2015/city15.jpg","/Honda/city/2015/city15back.jpg","/Honda/city/2015/city15front.jpg","/Honda/city/2015/city15side.jpg","city15.txt"};
String[] city16={"/Honda/city/2016/city16.jpg","/Honda/city/2016/city16back.jpg","/Honda/city/2016/city16front.jpg","/Honda/city/2016/city16side.jpg","city16.txt"};

String[] civic05={"/Honda/civic/2005/civic05.jpg","/Honda/civic/2005/civic05back.jpg","/Honda/civic/2005/civic05front.jpg","/Honda/civic/2005/civic05side.jpg","civic05.txt"};
String[] civic11={"/Honda/civic/2011/civic11.jpg","/Honda/civic/2011/civic11back.jpg","/Honda/civic/2011/civic11front.jpg","/Honda/civic/2011/civic11side.jpg","civic11.txt"};
String[] civic15={"/Honda/civic/2015/civic15.jpg","/Honda/civic/2015/civic15back.jpg","/Honda/civic/2015/civic15front.jpg","/Honda/civic/2015/civic15side.jpg","civic15.txt"};
String[] civic16={"/Honda/civic/2016/civic16.jpg","/Honda/civic/2016/civic16back.jpg","/Honda/civic/2016/civic16front.jpg","/Honda/civic/2016/civic16side.jpg","civic16.txt"};

String[] fit13={"/Honda/fit/2013/fit13.jpg","/Honda/fit/2013/fit13back.jpg","/Honda/fit/2013/fit13front.jpg","/Honda/fit/2013/fit13side.jpg","fit13.txt"};
String[] fit14={"/Honda/fit/2014/fit14.jpg","/Honda/fit/2014/fit14back.jpg","/Honda/fit/2014/fit14front.jpg","/Honda/fit/2014/fit14side.jpg","fit14.txt"};
String[] fit15={"/Honda/fit/2015/fit15.jpg","/Honda/fit/2015/fit15back.jpg","/Honda/fit/2015/fit15front.jpg","/Honda/fit/2015/fit15side.jpg","fit15.txt"};
String[] fit16={"/Honda/fit/2016/fit16.jpg","/Honda/fit/2016/fit16back.jpg","/Honda/fit/2016/fit16front.jpg","/Honda/fit/2016/fit16side.jpg","fit16.txt"};

String[] vezel13={"/Honda/vezel/2013/vezel13.jpg","/Honda/vezel/2013/vezel13back.jpg","/Honda/vezel/2013/vezel13front.jpg","/Honda/vezel/2013/vezel13side.jpg","vezel13.txt"};
String[] vezel14={"/Honda/vezel/2014/vezel14.jpg","/Honda/vezel/2014/vezel14back.jpg","/Honda/vezel/2014/vezel14front.jpg","/Honda/vezel/2014/vezel14side.jpg","vezel14.txt"};
String[] vezel15={"/Honda/vezel/2013/vezel15.jpg","/Honda/vezel/2015/vezel15back.jpg","/Honda/vezel/2015/vezel15front.jpg","/Honda/vezel/2015/vezel15side.jpg","vezel15.txt"};
String[] vezel16={"/Honda/vezel/2013/vezel16.jpg","/Honda/vezel/2016/vezel16back.jpg","/Honda/vezel/2016/vezel16front.jpg","/Honda/vezel/2016/vezel16side.jpg","vezel16.txt"};

//SUZUKI
String[] alto13={"/Suzuki/alto/2013/alto13.jpg","/Suzuki/alto/2013/alto13back.jpg","/Suzuki/alto/2013/alto13front.jpg","/Suzuki/alto/2013/alto13side.jpg","alto13.txt"};
String[] alto14={"/Suzuki/alto/2014/alto14.jpg","/Suzuki/alto/2014/alto14back.jpg","/Suzuki/alto/2014/alto14front.jpg","/Suzuki/alto/2014/alto14side.jpg","alto14.txt"};
String[] alto15={"/Suzuki/alto/2015/alto15.jpg","/Suzuki/alto/2015/alto15back.jpg","/Suzuki/alto/2015/alto15front.jpg","/Suzuki/alto/2015/alto15side.jpg","alto15.txt"};
String[] alto16={"/Suzuki/alto/2016/alto16.jpg","/Suzuki/alto/2016/alto16back.jpg","/Suzuki/alto/2016/alto16front.jpg","/Suzuki/alto/2016/alto16side.jpg","alto16.txt"};

String[] cultus08={"/Suzuki/cultus/2008/cultus08.jpg","/Suzuki/cultus/2008/cultus08back.jpg","/Suzuki/cultus/2008/cultus08front.jpg","/Suzuki/cultus/2008/cultus08side.jpg","cultus08.txt"};
String[] cultus11={"/Suzuki/cultus/2011/cultus11.jpg","/Suzuki/cultus/2011/cultus11back.jpg","/Suzuki/cultus/2011/cultus11front.jpg","/Suzuki/cultus/2011/cultus11side.jpg","cultus11.txt"};
String[] cultus13={"/Suzuki/cultus/2013/cultus13.jpg","/Suzuki/cultus/2013/cultus13back.jpg","/Suzuki/cultus/2013/cultus13front.jpg","/Suzuki/cultus/2013/cultus13side.jpg","cultus13.txt"};
String[] cultus15={"/Suzuki/cultus/2015/cultus15.jpg","/Suzuki/cultus/2015/cultus15back.jpg","/Suzuki/cultus/2015/cultus15front.jpg","/Suzuki/cultus/2015/cultus15side.jpg","cultus15.txt"};

String[] liana06={"/Suzuki/liana/2006/liana06.jpg","/Suzuki/liana/2006/liana06back.jpg","/Suzuki/liana/2006/liana06front.jpg","/Suzuki/liana/2006/liana06side.jpg","liana06.txt"};
String[] liana07={"/Suzuki/liana/2007/liana07.jpg","/Suzuki/liana/2007/liana07back.jpg","/Suzuki/liana/2007/liana07front.jpg","/Suzuki/liana/2007/liana07side.jpg","liana07.txt"};
String[] liana08={"/Suzuki/liana/2008/liana08.jpg","/Suzuki/liana/2008/liana08back.jpg","/Suzuki/liana/2008/liana08front.jpg","/Suzuki/liana/2008/liana08side.jpg","liana08.txt"};
String[] liana10={"/Suzuki/liana/2010/liana10.jpg","/Suzuki/liana/2010/liana10back.jpg","/Suzuki/liana/2010/liana10front.jpg","/Suzuki/liana/2010/liana10side.jpg","liana10.txt"};

String[] mehran11={"/Suzuki/mehran/2011/mehran11.jpg","/Suzuki/mehran/2011/mehran11back.jpg","/Suzuki/mehran/2011/mehran11front.jpg","/Suzuki/mehran/2011/mehran11side.jpg","mehran11.txt"};
String[] mehran12={"/Suzuki/mehran/2012/mehran12.jpg","/Suzuki/mehran/2012/mehran12back.jpg","/Suzuki/mehran/2012/mehran12front.jpg","/Suzuki/mehran/2012/mehran12side.jpg","mehran12.txt"};
String[] mehran14={"/Suzuki/mehran/2014/mehran14.jpg","/Suzuki/mehran/2014/mehran14back.jpg","/Suzuki/mehran/2014/mehran14front.jpg","/Suzuki/mehran/2014/mehran14side.jpg","mehran14.txt"};
String[] mehran15={"/Suzuki/mehran/2015/mehran15.jpg","/Suzuki/mehran/2015/mehran15back.jpg","/Suzuki/mehran/2015/mehran15front.jpg","/Suzuki/mehran/2015/mehran15side.jpg","mehran15.txt"};

String[] swift13={"/Suzuki/swift/2013/swift13.jpg","/Suzuki/swift/2013/swift13back.jpg","/Suzuki/swift/2013/swift13front.jpg","/Suzuki/swift/2013/swift13side.jpg","swift13.txt"};
String[] swift14={"/Suzuki/swift/2014/swift14.jpg","/Suzuki/swift/2014/swift14back.jpg","/Suzuki/swift/2014/swift14front.jpg","/Suzuki/swift/2014/swift14side.jpg","swift14.txt"};
String[] swift15={"/Suzuki/swift/2015/swift15.jpg","/Suzuki/swift/2015/swift15back.jpg","/Suzuki/swift/2015/swift15front.jpg","/Suzuki/swift/2015/swift15side.jpg","swift15.txt"};
String[] swift16={"/Suzuki/swift/2016/swift16.jpg","/Suzuki/swift/2016/swift16back.jpg","/Suzuki/swift/2016/swift16front.jpg","/Suzuki/swift/2016/swift16side.jpg","swift16.txt"};

//TOYOTA
String[] corolla07={"/Toyota/corolla/2007/corolla07.jpg","/Toyota/corolla/2007/corolla07back.jpg","/Toyota/corolla/2007/corolla07front.jpg","/Toyota/corolla/2007/corolla07side.jpg","corolla07.txt"};
String[] corolla11={"/Toyota/corolla/2011/corolla11.jpg","/Toyota/corolla/2011/corolla11back.jpg","/Toyota/corolla/2011/corolla11front.jpg","/Toyota/corolla/2011/corolla11side.jpg","corolla11.txt"};
String[] corolla14={"/Toyota/corolla/2014/corolla14.jpg","/Toyota/corolla/2014/corolla14back.jpg","/Toyota/corolla/2014/corolla14front.jpg","/Toyota/corolla/2014/corolla14side.jpg","corolla14.txt"};
String[] corolla16={"/Toyota/corolla/2016/corolla16.jpg","/Toyota/corolla/2016/corolla16back.jpg","/Toyota/corolla/2016/corolla16front.jpg","/Toyota/corolla/2016/corolla16side.jpg","corolla16.txt"};

String[] passo07={"/Toyota/passo/2007/passo07.jpg","/Toyota/passo/2007/passo07back.jpg","/Toyota/passo/2007/passo07front.jpg","/Toyota/passo/2007/passo07side.jpg","passo07.txt"};
String[] passo10={"/Toyota/passo/2010/passo10.jpg","/Toyota/passo/2010/passo10back.jpg","/Toyota/passo/2010/passo10front.jpg","/Toyota/passo/2010/passo10side.jpg","passo10.txt"};
String[] passo12={"/Toyota/passo/2012/passo12.jpg","/Toyota/passo/2012/passo12back.jpg","/Toyota/passo/2012/passo12front.jpg","/Toyota/passo/2012/passo12side.jpg","passo12.txt"};
String[] passo15={"/Toyota/passo/2015/passo15.jpg","/Toyota/passo/2015/passo15back.jpg","/Toyota/passo/2015/passo15front.jpg","/Toyota/passo/2015/passo15side.jpg","passo15.txt"};

String[] prado05={"/Toyota/prado/2005/prado05.jpg","/Toyota/prado/2005/prado05back.jpg","/Toyota/prado/2005/prado05front.jpg","/Toyota/prado/2005/prado05side.jpg","prado05.txt"};
String[] prado08={"/Toyota/prado/2008/prado08.jpg","/Toyota/prado/2008/prado08back.jpg","/Toyota/prado/2008/prado08front.jpg","/Toyota/prado/2008/prado08side.jpg","prado08.txt"};
String[] prado11={"/Toyota/prado/2011/prado11.jpg","/Toyota/prado/2011/prado11back.jpg","/Toyota/prado/2011/prado11front.jpg","/Toyota/prado/2011/prado11side.jpg","prado11.txt"};
String[] prado13={"/Toyota/prado/2013/prado13.jpg","/Toyota/prado/2013/prado13back.jpg","/Toyota/prado/2013/prado13front.jpg","/Toyota/prado/2013/prado13side.jpg","prado13.txt"};

String[] prius07={"/Toyota/prius/2007/prius07.jpg","/Toyota/prius/2007/prius07back.jpg","/Toyota/prius/2007/prius07front.jpg","/Toyota/prius/2007/prius07side.jpg","prius07.txt"};
String[] prius10={"/Toyota/prius/2010/prius10.jpg","/Toyota/prius/2010/prius10back.jpg","/Toyota/prius/2010/prius10front.jpg","/Toyota/prius/2010/prius10side.jpg","prius10.txt"};
String[] prius11={"/Toyota/prius/2011/prius11.jpg","/Toyota/prius/2011/prius11back.jpg","/Toyota/prius/2011/prius11front.jpg","/Toyota/prius/2011/prius11side.jpg","prius11.txt"};
String[] prius13={"/Toyota/prius/2013/prius13.jpg","/Toyota/prius/2013/prius13back.jpg","/Toyota/prius/2013/prius13front.jpg","/Toyota/prius/2013/prius13side.jpg","prius13.txt"};

String[] vitz13={"/Toyota/vitz/2013/vitz13.jpg","/Toyota/vitz/2013/vitz13back.jpg","/Toyota/vitz/2013/vitz13front.jpg","/Toyota/vitz/2013/vitz13side.jpg","vitz13.txt"};
String[] vitz14={"/Toyota/vitz/2014/vitz14.jpg","/Toyota/vitz/2014/vitz14back.jpg","/Toyota/vitz/2014/vitz14front.jpg","/Toyota/vitz/2014/vitz14side.jpg","vitz14.txt"};
String[] vitz15={"/Toyota/vitz/2015/vitz15.jpg","/Toyota/vitz/2015/vitz15back.jpg","/Toyota/vitz/2015/vitz15front.jpg","/Toyota/vitz/2015/vitz15side.jpg","vitz15.txt"};
String[] vitz16={"/Toyota/vitz/2016/vitz16.jpg","/Toyota/vitz/2016/vitz16back.jpg","/Toyota/vitz/2016/vitz16front.jpg","/Toyota/vitz/2016/vitz16side.jpg","vitz16.txt"};

if(Model.equals("Boon")&&Year.equals("2006")){
   Pict1(boon07[0]);
   Pict2(boon07[1]);
   Pict3(boon07[2]);
   Pict4(boon07[3]);
   try {
                file(boon06[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_boon/yr_2006_2006/";
}
if(Model.equals("Boon")&&Year.equals("2007")){
   Pict1(boon07[0]);
   Pict2(boon07[1]);
   Pict3(boon07[2]);
   Pict4(boon07[3]); 
   try {
                file(boon07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_boon/yr_2007_2007/";
}
if(Model.equals("Boon")&&Year.equals("2013")){
   Pict1(boon13[0]);
   Pict2(boon13[1]);
   Pict3(boon13[2]);
   Pict4(boon13[3]);
   try {
                file(boon13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_boon/yr_2013_2013/";
}
if(Model.equals("Boon")&&Year.equals("2014")){
   Pict1(boon14[0]);
   Pict2(boon14[1]);
   Pict3(boon14[2]);
   Pict4(boon14[3]);
   try {
                file(boon14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_boon/yr_2014_2014/";
}
if(Model.equals("Charade")&&Year.equals("1984")){
   Pict1(charade84[0]);
   Pict2(charade84[1]);
   Pict3(charade84[2]);
   Pict4(charade84[3]);
   try {
                file(charade84[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_charade/yr_1984_1984/";
}
if(Model.equals("Charade")&&Year.equals("1986")){
   Pict1(charade86[0]);
   Pict2(charade86[1]);
   Pict3(charade86[2]);
   Pict4(charade86[3]);
   try {
                file(charade86[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_charade/yr_1987_1986/";
}
if(Model.equals("Charade")&&Year.equals("1987")){
   Pict1(charade87[0]);
   Pict2(charade87[1]);
   Pict3(charade87[2]);
   Pict4(charade87[3]);
   try {
                file(charade87[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_charade/yr_1987_1987/";
}
if(Model.equals("Charade")&&Year.equals("1988")){
   Pict1(charade88[0]);
   Pict2(charade88[1]);
   Pict3(charade88[2]);
   Pict4(charade88[3]);
   try {
                file(charade88[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_charade/yr_1988_1988/";
}
if(Model.equals("Cuore")&&Year.equals("2004")){
   Pict1(cuore04[0]);
   Pict2(cuore04[1]);
   Pict3(cuore04[2]);
   Pict4(cuore04[3]);
   try {
                file(cuore04[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_cuore/yr_2004_2004/";
}
if(Model.equals("Cuore")&&Year.equals("2006")){
   Pict1(cuore06[0]);
   Pict2(cuore06[1]);
   Pict3(cuore06[2]);
   Pict4(cuore06[3]);
   try {
                file(cuore06[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_cuore/yr_2006_2006/";
}
if(Model.equals("Cuore")&&Year.equals("2007")){
   Pict1(cuore07[0]);
   Pict2(cuore07[1]);
   Pict3(cuore07[2]);
   Pict4(cuore07[3]);
   try {
                file(cuore07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_cuore/yr_2007_2007/";
}
if(Model.equals("Cuore")&&Year.equals("2008")){
   Pict1(cuore08[0]);
   Pict2(cuore08[1]);
   Pict3(cuore08[2]);
   Pict4(cuore08[3]);
   try {
                file(cuore08[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_cuore/yr_2008_2008/";
}
if(Model.equals("Mira")&&Year.equals("2009")){
   Pict1(mira09[0]);
   Pict2(mira09[1]);
   Pict3(mira09[2]);
   Pict4(mira09[3]);
   try {
                file(mira09[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_mira/yr_2009_2009/";
}
if(Model.equals("Mira")&&Year.equals("2012")){
   Pict1(mira12[0]);
   Pict2(mira12[1]);
   Pict3(mira12[2]);
   Pict4(mira12[3]);
   try {
                file(mira12[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_mira/yr_2012_2012/";
}
if(Model.equals("Mira")&&Year.equals("2013")){
   Pict1(mira13[0]);
   Pict2(mira13[1]);
   Pict3(mira13[2]);
   Pict4(mira13[3]);
   try {
                file(mira13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_mira/yr_2013_2013/";
}
if(Model.equals("Mira")&&Year.equals("2014")){
   Pict1(mira14[0]);
   Pict2(mira14[1]);
   Pict3(mira14[2]);
   Pict4(mira14[3]);
   try {
                file(mira14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_mira/yr_2014_2014/";
}
if(Model.equals("Move")&&Year.equals("2011")){
   Pict1(move11[0]);
   Pict2(move11[1]);
   Pict3(move11[2]);
   Pict4(move11[3]);
   try {
                file(move11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_move/yr_2011_2011/";
}
if(Model.equals("Move")&&Year.equals("2012")){
   Pict1(move12[0]);
   Pict2(move12[1]);
   Pict3(move12[2]);
   Pict4(move12[3]);
   try {
                file(move12[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_move/yr_2012_2012/";
}
if(Model.equals("Move")&&Year.equals("2013")){
   Pict1(move13[0]);
   Pict2(move13[1]);
   Pict3(move13[2]);
   Pict4(move13[3]);
   try {
                file(move13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_move/yr_2013_2013/";
}
if(Model.equals("Move")&&Year.equals("2014")){
   Pict1(move14[0]);
   Pict2(move14[1]);
   Pict3(move14[2]);
   Pict4(move14[3]);
   try {
                file(move14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_daihatsu/md_move/yr_2014_2014/";
}
if(Model.equals("Accord")&&Year.equals("2002")){
   Pict1(accord02[0]);
   Pict2(accord02[1]);
   Pict3(accord02[2]);
   Pict4(accord02[3]);
   try {
                file(accord02[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_accord/yr_2002_2002/";
}
if(Model.equals("Accord")&&Year.equals("2004")){
   Pict1(accord04[0]);
   Pict2(accord04[1]);
   Pict3(accord04[2]);
   Pict4(accord04[3]);
   try {
                file(accord04[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_accord/yr_2004_2004/";
}
if(Model.equals("Accord")&&Year.equals("2005")){
   Pict1(accord05[0]);
   Pict2(accord05[1]);
   Pict3(accord05[2]);
   Pict4(accord05[3]);
   try {
                file(accord05[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_accord/yr_2005_2005/";
}
if(Model.equals("Accord")&&Year.equals("2007")){
   Pict1(accord07[0]);
   Pict2(accord07[1]);
   Pict3(accord07[2]);
   Pict4(accord07[3]);
   try {
                file(accord07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_accord/yr_2007_2007/";
}
if(Model.equals("City")&&Year.equals("2013")){
   Pict1(city13[0]);
   Pict2(city13[1]);
   Pict3(city13[2]);
   Pict4(city13[3]);
   try {
                file(city13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_city/yr_2013_2013/";
}
if(Model.equals("City")&&Year.equals("2014")){
   Pict1(city14[0]);
   Pict2(city14[1]);
   Pict3(city14[2]);
   Pict4(city14[3]);
   try {
                file(city14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_city/yr_2014_2014/";
}
if(Model.equals("City")&&Year.equals("2015")){    
   Pict1(city15[0]);
   Pict2(city15[1]);
   Pict3(city15[2]);
   Pict4(city15[3]);
   try {
                file(city15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_city/yr_2015_2015/";
}
if(Model.equals("City")&&Year.equals("2016")){
   Pict1(city16[0]);
   Pict2(city16[1]);
   Pict3(city16[2]);
   Pict4(city16[3]);
   try {
                file(city16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_city/yr_2016_2016/";
}
if(Model.equals("Civic")&&Year.equals("2005")){
   Pict1(civic05[0]);
   Pict2(civic05[1]);
   Pict3(civic05[2]);
   Pict4(civic05[3]);
   try {
                file(civic05[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_civic/yr_2005_2005/";
}

if(Model.equals("Civic")&&Year.equals("2011")){
   Pict1(civic11[0]);
   Pict2(civic11[1]);
   Pict3(civic11[2]);
   Pict4(civic11[3]);
   try {
                file(civic11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_civic/yr_2011_2011/";
}
if(Model.equals("Civic")&&Year.equals("2015")){
   Pict1(civic15[0]);
   Pict2(civic15[1]);
   Pict3(civic15[2]);
   Pict4(civic15[3]);
   try {
                file(civic15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_civic/yr_2015_2015/";
}
if(Model.equals("Civic")&&Year.equals("2016")){
   Pict1(civic16[0]);
   Pict2(civic16[1]);
   Pict3(civic16[2]);
   Pict4(civic16[3]);
   try {
                file(civic16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_civic/yr_2016_2016/";
}
if(Model.equals("Fit")&&Year.equals("2013")){
   Pict1(fit13[0]);
   Pict2(fit13[1]);
   Pict3(fit13[2]);
   Pict4(fit13[3]);
   try {
        file(fit13[4]);
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
 Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_fit/yr_2013_2013/";  
}

if(Model.equals("Fit")&&Year.equals("2014")){
   Pict1(fit14[0]);
   Pict2(fit14[1]);
   Pict3(fit14[2]);
   Pict4(fit14[3]);
   try {
                file(fit14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_fit/yr_2014_2014/";
}
if(Model.equals("Fit")&&Year.equals("2015")){
   Pict1(fit15[0]);
   Pict2(fit15[1]);
   Pict3(fit15[2]);
   Pict4(fit15[3]);
   try {
                file(fit15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_fit/yr_2015_2015/";
}
if(Model.equals("Fit")&&Year.equals("2016")){
   Pict1(fit16[0]);
   Pict2(fit16[1]);
   Pict3(fit16[2]);
   Pict4(fit16[3]);
   try {
                file(fit16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_fit/yr_2016_2016/";
}
if(Model.equals("Vezel")&&Year.equals("2013")){
   Pict1(vezel13[0]);
   Pict2(vezel13[1]);
   Pict3(vezel13[2]);
   Pict4(vezel13[3]);
   try {
                file(vezel13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_vezel/yr_2013_2013/";
}
if(Model.equals("Vezel")&&Year.equals("2014")){
   Pict1(vezel14[0]);
   Pict2(vezel14[1]);
   Pict3(vezel14[2]);
   Pict4(vezel14[3]);
   try {
                file(vezel14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_vezel/yr_2014_2014/";
}
if(Model.equals("Vezel")&&Year.equals("2015")){
   Pict1(vezel15[0]);
   Pict2(vezel15[1]);
   Pict3(vezel15[2]);
   Pict4(vezel15[3]);
   try {
                file(vezel15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_vezel/yr_2015_2015/";
}
if(Model.equals("Vezel")&&Year.equals("2016")){
   Pict1(vezel16[0]);
   Pict2(vezel16[1]);
   Pict3(vezel16[2]);
   Pict4(vezel16[3]);
   try {
                file(vezel16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_honda/md_vezel/yr_2016_2016/";
}
if(Model.equals("Alto")&&Year.equals("2013")){
   Pict1(alto13[0]);
   Pict2(alto13[1]);
   Pict3(alto13[2]);
   Pict4(alto13[3]);
   try {
                file(alto13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_alto/yr_2013_2013/";
}
if(Model.equals("Alto")&&Year.equals("2014")){
   Pict1(alto14[0]);
   Pict2(alto14[1]);
   Pict3(alto14[2]);
   Pict4(alto14[3]);
   try {
                file(alto14[4]);    
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_alto/yr_2014_2014/";
}
if(Model.equals("Alto")&&Year.equals("2015")){
   Pict1(alto15[0]);
   Pict2(alto15[1]);
   Pict3(alto15[2]);
   Pict4(alto15[3]);
   try {
                file(alto15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_alto/yr_2015_2015/";
}
if(Model.equals("Alto")&&Year.equals("2016")){
   Pict1(alto16[0]);
   Pict2(alto16[1]);
   Pict3(alto16[2]);
   Pict4(alto16[3]);
   try {
                file(alto16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_alto/yr_2016_2016/";
}
if(Model.equals("Cultus")&&Year.equals("2008")){
   Pict1(cultus08[0]);
   Pict2(cultus08[1]);
   Pict3(cultus08[2]);
   Pict4(cultus08[3]);
   try {
                file(cultus08[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_cultus/yr_2008_2008/";
}
if(Model.equals("Cultus")&&Year.equals("2011")){
   Pict1(cultus11[0]);
   Pict2(cultus11[1]);
   Pict3(cultus11[2]);
   Pict4(cultus11[3]);
   try {
                file(cultus11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_cultus/yr_2011_2011/";
}
if(Model.equals("Cultus")&&Year.equals("2013")){
   Pict1(cultus13[0]);
   Pict2(cultus13[1]);
   Pict3(cultus13[2]);
   Pict4(cultus13[3]);
   try {
                file(cultus13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_cultus/yr_2013_2013/";
}
if(Model.equals("Cultus")&&Year.equals("2015")){
   Pict1(cultus15[0]);
   Pict2(cultus15[1]);
   Pict3(cultus15[2]);
   Pict4(cultus15[3]);
   try {
                file(cultus15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_cultus/yr_2015_2015/";
}
if(Model.equals("Liana")&&Year.equals("2006")){
   Pict1(liana06[0]);
   Pict2(liana06[1]);
   Pict3(liana06[2]);
   Pict4(liana06[3]);
   try {
                file(liana06[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_liana/yr_2006_2006/";
}
if(Model.equals("Liana")&&Year.equals("2007")){
   Pict1(liana07[0]);
   Pict2(liana07[1]);
   Pict3(liana07[2]);
   Pict4(liana07[3]);
   try {
                file(liana07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_liana/yr_2007_2007/";
}
if(Model.equals("Liana")&&Year.equals("2008")){
   Pict1(liana08[0]);
   Pict2(liana08[1]);
   Pict3(liana08[2]);
   Pict4(liana08[3]);
   try {
                file(liana08[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_liana/yr_2008_2008/";
}
if(Model.equals("Liana")&&Year.equals("2010")){
   Pict1(liana10[0]);
   Pict2(liana10[1]);
   Pict3(liana10[2]);
   Pict4(liana10[3]);
   try {
                file(liana10[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_liana/yr_2010_2010/";
}
if(Model.equals("Mehran")&&Year.equals("2011")){
   Pict1(mehran11[0]);
   Pict2(mehran11[1]);
   Pict3(mehran11[2]);
   Pict4(mehran11[3]);
   try {
                file(mehran11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_mehran/yr_2011_2011/";
}
if(Model.equals("Mehran")&&Year.equals("2012")){
   Pict1(mehran12[0]);
   Pict2(mehran12[1]);
   Pict3(mehran12[2]);
   Pict4(mehran12[3]);
   try {
                file(mehran12[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_mehran/yr_2012_2012/";
}
if(Model.equals("Mehran")&&Year.equals("2014")){
   Pict1(mehran14[0]);
   Pict2(mehran14[1]);
   Pict3(mehran14[2]);
   Pict4(mehran14[3]);
   try {
                file(mehran14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_mehran/yr_2014_2014/";
}
if(Model.equals("Mehran")&&Year.equals("2015")){
   Pict1(mehran15[0]);
   Pict2(mehran15[1]);
   Pict3(mehran15[2]);
   Pict4(mehran15[3]);
   try {
                file(mehran15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_mehran/yr_2015_2015/";
}
if(Model.equals("Swift")&&Year.equals("2013")){
   Pict1(swift13[0]);
   Pict2(swift13[1]);
   Pict3(swift13[2]);
   Pict4(swift13[3]);
   try {
                file(swift13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_swift/yr_2013_2013/";
}
if(Model.equals("Swift")&&Year.equals("2014")){
   Pict1(swift14[0]);
   Pict2(swift14[1]);
   Pict3(swift14[2]);
   Pict4(swift14[3]);
   try {
                file(swift14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_swift/yr_2014_2014/";
}
if(Model.equals("Swift")&&Year.equals("2015")){
   Pict1(swift15[0]);
   Pict2(swift15[1]);
   Pict3(swift15[2]);
   Pict4(swift15[3]);
   try {
                file(swift15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_swift/yr_2015_2015/";
}
if(Model.equals("Swift")&&Year.equals("2016")){
   Pict1(swift16[0]);
   Pict2(swift16[1]);
   Pict3(swift16[2]);
   Pict4(swift16[3]);
   try {
                file(swift16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_suzuki/md_swift/yr_2016_2016/";
}
if(Model.equals("Corolla")&&Year.equals("2007")){
   Pict1(corolla07[0]);
   Pict2(corolla07[1]);
   Pict3(corolla07[2]);
   Pict4(corolla07[3]);
   try {
                file(corolla07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_corolla/yr_2007_2007/";
}
if(Model.equals("Corolla")&&Year.equals("2011")){
   Pict1(corolla11[0]);
   Pict2(corolla11[1]);
   Pict3(corolla11[2]);
   Pict4(corolla11[3]);
   try {
                file(corolla11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_corolla/yr_2011_2011/";
}
if(Model.equals("Corolla")&&Year.equals("2014")){
   Pict1(corolla14[0]);
   Pict2(corolla14[1]);
   Pict3(corolla14[2]);
   Pict4(corolla14[3]);
   try {
                file(corolla14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_corolla/yr_2014_2014/";
}
if(Model.equals("Corolla")&&Year.equals("2016")){
   Pict1(corolla16[0]);
   Pict2(corolla16[1]);
   Pict3(corolla16[2]);
   Pict4(corolla16[3]);
   try {
                file(corolla16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_corolla/yr_2016_2016/";
}
if(Model.equals("Passo")&&Year.equals("2007")){
   Pict1(passo07[0]);
   Pict2(passo07[1]);
   Pict3(passo07[2]);
   Pict4(passo07[3]);
   try {
                file(passo07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_passo/yr_2007_2007/";
}

if(Model.equals("Passo")&&Year.equals("2010")){
   Pict1(passo10[0]);
   Pict2(passo10[1]);
   Pict3(passo10[2]);
   Pict4(passo10[3]);
   try {
                file(passo10[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_passo/yr_2010_2010/";
}
if(Model.equals("Passo")&&Year.equals("2012")){
   Pict1(passo12[0]);
   Pict2(passo12[1]);
   Pict3(passo12[2]);
   Pict4(passo12[3]);
   try {
                file(passo12[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_passo/yr_2012_2012/";
}
if(Model.equals("Passo")&&Year.equals("2015")){
   Pict1(passo15[0]);
   Pict2(passo15[1]);
   Pict3(passo15[2]);
   Pict4(passo15[3]);
   try {
                file(passo15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_passo/yr_2015_2015/";
}
if(Model.equals("Prado")&&Year.equals("2005")){
   Pict1(prado05[0]);
   Pict2(prado05[1]);
   Pict3(prado05[2]);
   Pict4(prado05[3]);
   try {
                file(prado05[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prado/yr_2005_2005/";
}
if(Model.equals("Prado")&&Year.equals("2008")){
   Pict1(prado08[0]);
   Pict2(prado08[1]);
   Pict3(prado08[2]);
   Pict4(prado08[3]);
   try {
                file(prado08[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prado/yr_2008_2008/";
}
if(Model.equals("Prado")&&Year.equals("2011")){
   Pict1(prado11[0]);
   Pict2(prado11[1]);
   Pict3(prado11[2]);
   Pict4(prado11[3]);
   try {
                file(prado11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prado/yr_2011_2011/";
}
if(Model.equals("Prado")&&Year.equals("2013")){
   Pict1(prado13[0]);
   Pict2(prado13[1]);
   Pict3(prado13[2]);
   Pict4(prado13[3]);
   try {
                file(prado13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prado/yr_2013_2013/";
}
if(Model.equals("Prius")&&Year.equals("2007")){
   Pict1(prius07[0]);
   Pict2(prius07[1]);
   Pict3(prius07[2]);
   Pict4(prius07[3]);
   try {
                file(prius07[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prius/yr_2007_2007/";
}
if(Model.equals("Prius")&&Year.equals("2010")){
   Pict1(prius10[0]);
   Pict2(prius10[1]);
   Pict3(prius10[2]);
   Pict4(prius10[3]);
   try {
                file(prius10[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prius/yr_2010_2010/";
}
if(Model.equals("Prius")&&Year.equals("2011")){
   Pict1(prius11[0]);
   Pict2(prius11[1]);
   Pict3(prius11[2]);
   Pict4(prius11[3]);
   try {
                file(prius11[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prius/yr_2011_2011/";
}
if(Model.equals("Prius")&&Year.equals("2013")){
   Pict1(prius13[0]);
   Pict2(prius13[1]);
   Pict3(prius13[2]);
   Pict4(prius13[3]);
   try {
                file(prius13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_prius/yr_2013_2013/";
}
if(Model.equals("Vitz")&&Year.equals("2013")){
   Pict1(vitz13[0]);
   Pict2(vitz13[1]);
   Pict3(vitz13[2]);
   Pict4(vitz13[3]);
   try {
                file(vitz13[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_vitz/yr_2013_2013/";
}
if(Model.equals("Vitz")&&Year.equals("2014")){
   Pict1(vitz14[0]);
   Pict2(vitz14[1]);
   Pict3(vitz14[2]);
   Pict4(vitz14[3]);
   try {
                file(vitz14[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_vitz/yr_2014_2014/";
}
if(Model.equals("Vitz")&&Year.equals("2015")){
   Pict1(vitz15[0]);
   Pict2(vitz15[1]);
   Pict3(vitz15[2]);
   Pict4(vitz15[3]);
   try {
                file(vitz15[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_vitz/yr_2015_2015/";
}
if(Model.equals("Vitz")&&Year.equals("2016")){
   Pict1(vitz16[0]);
   Pict2(vitz16[1]);
   Pict3(vitz16[2]);
   Pict4(vitz16[3]);
   try {
                file(vitz16[4]);
                
            } catch (Exception ex) {
                Logger.getLogger(Pics.class.getName()).log(Level.SEVERE, null, ex);
            }
   Link="https://www.pakwheels.com/used-cars/search/-/mk_toyota/md_vitz/yr_2016_2016/";
}
    }//GEN-LAST:event_formWindowActivated

    private void PicsCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PicsCloseMouseClicked
      WindowEvent close=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
      Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
    }//GEN-LAST:event_PicsCloseMouseClicked

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        frame1.setVisible(false);
        frame2.setVisible(false);
        frame3.setVisible(false);
        frame4.setVisible(false);
    }//GEN-LAST:event_formMouseMoved

    private void WebsiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WebsiteMouseClicked
        openWebpage();
    }//GEN-LAST:event_WebsiteMouseClicked

    private void Pic1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pic1MouseClicked
        frame1.setVisible(true);
    }//GEN-LAST:event_Pic1MouseClicked

    private void Pic2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pic2MouseClicked
        frame2.setVisible(true);
    }//GEN-LAST:event_Pic2MouseClicked

    private void Pic3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pic3MouseClicked
        frame3.setVisible(true);
    }//GEN-LAST:event_Pic3MouseClicked

    private void Pic4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pic4MouseClicked
        frame4.setVisible(true);
    }//GEN-LAST:event_Pic4MouseClicked

    
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
            java.util.logging.Logger.getLogger(Pics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pic1;
    private javax.swing.JLabel Pic2;
    private javax.swing.JLabel Pic3;
    private javax.swing.JLabel Pic4;
    private javax.swing.JLabel PicsClose;
    private javax.swing.JLabel Pics_background;
    private javax.swing.JLabel Specs;
    private javax.swing.JLabel Website;
    // End of variables declaration//GEN-END:variables
}
