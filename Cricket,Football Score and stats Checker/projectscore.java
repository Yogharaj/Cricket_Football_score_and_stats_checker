import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class projectscore{
  public static void main(String[] args) {
    JFrame jf1= new JFrame("Score Engine - Home");
    JButton jb1= new JButton("Cricket Score");
    jb1.setBounds(50, 50, 300, 50);
    JButton jb2= new JButton("Football Score");
    jb2.setBounds(50, 150, 300, 50);
    jf1.add(jb1);
    jf1.add(jb2);
    jb1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame j1= new JFrame("Cricket Score");
        JLabel jl1= new JLabel("Enter Player Name : ");
        jl1.setBounds(50, 150, 150, 35);
        j1.add(jl1);
        JTextField jt1= new JTextField();
        jt1.setBounds(200,150,200,35);
        j1.add(jt1);

        JButton jb2= new JButton("Score");
        jb2.setBounds(50, 50, 100, 50);
        JButton jb3= new JButton("Display Stats");
        jb3.setBounds(400, 150, 150, 35);
        jb2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            JFrame jf2 = new JFrame("Score - Tab");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
            WebDriver driver = new ChromeDriver();
      	  driver.get("https://www.cricbuzz.com/");
      	  try
      	  {
      	     driver.wait(1000);
      	  }
      	  catch(Exception e1)
      	  {
      		  System.out.println(e1);
      	  }
      	  //driver.findElement(By.xpath("//*[@id=\"sports-app\"]/div/div[3]/div/div/table/tbody/tr[1]/td[1]/div/div/div/table/tr[3]/td[2]"));
      	  String ans=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[1]/a/div/div/div[1]")).getText();
      	  String ans1=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[1]/a/div/div/div[2]")).getText();
      	  String ans2=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[1]/a/div/div/div[3]")).getText();
            String ans3=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a/div/div/div[1]")).getText();
            String ans4=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a/div/div/div[2]")).getText();
            String ans5=driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div/div[2]/ul/li[2]/a/div/div/div[3]")).getText();
            JLabel l1=new JLabel(ans);
            l1.setBounds(100,100,200,35);
            JLabel l2=new JLabel(ans1);
            l2.setBounds(350,100,200,35);
            JLabel l3=new JLabel(ans2);
            l3.setBounds(100,150,200,35);
            jf2.add(l1);jf2.add(l2);jf2.add(l3);
            JLabel l4=new JLabel(ans3);
            l4.setBounds(100,300,200,35);
            JLabel l5=new JLabel(ans4);
            l5.setBounds(350,300,200,35);
            JLabel l6=new JLabel(ans5);
            l6.setBounds(100,350,200,35);
            jf2.add(l4);jf2.add(l5);jf2.add(l6);
            jf2.setLayout(null);
            jf2.setSize(800, 800);
            jf2.setVisible(true);
          }
        });
        jb3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            JFrame jf2 = new JFrame("Player Stats - Tab");
            String n=jt1.getText();
            WebDriver dr=new ChromeDriver();
      	  String url="https://www.google.com/search?q="+n+" stats";
      	  dr.get( url);
      	  String m=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[2]")).getText();
      	  String in=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[3]")).getText();
      	  String no=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[4]")).getText();
      	  String runs=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[5]")).getText();
      	  String hs=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[6]")).getText();
      	  String avg=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[7]")).getText();
      	  String bf=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[8]")).getText();
      	  String sr=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[9]")).getText();
      	  String cent=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[10]")).getText();
      	  JLabel q=new JLabel(n+" Test Match Stats:");
      	  q.setBounds(100,50,200,35);
      	  JLabel a=new JLabel("Matches :"+m);
      	  a.setBounds(100,100,200,35);
      	  JLabel b=new JLabel("Innings :"+in);
      	  b.setBounds(100,150,200,35);
      	  JLabel c=new JLabel("Not Outs:"+no);
      	  c.setBounds(100,200,200,35);
      	  JLabel d=new JLabel("Runs :"+runs);
      	  d.setBounds(100,250,200,35);
      	  JLabel e2=new JLabel("High Score:"+hs);
      	  e2.setBounds(100,300,200,35);
      	  JLabel f=new JLabel("Average :"+avg);
      	  f.setBounds(100,350,200,35);
      	  JLabel g=new JLabel("Balls Faced:"+bf);
      	  g.setBounds(100,400,200,35);
      	  JLabel h=new JLabel("Strike Rate:"+sr);
      	  h.setBounds(100,450,200,35);
      	  JLabel i=new JLabel("Centuries:"+cent);
      	  i.setBounds(100,500,200,35);
      	  jf2.add(q);jf2.add(a);jf2.add(b);jf2.add(c);jf2.add(d);jf2.add(e2);jf2.add(f);jf2.add(g); jf2.add(h);jf2.add(i);
      	  try
      	  {
      		  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogha","root","Yogha@025@04");
      		  Statement st=conn.createStatement();
      		  String s="INSERT INTO project VALUES('"+n+"','"+m+"','"+in+"','"+no+"','"+runs+"','"+hs+"','"+avg+"','"+bf+"','"+sr+"','"+cent+"')";
      		  st.executeUpdate(s);
      	  }
      	  catch(Exception e23)
      	  {
      		  System.out.println(e23);
      	  }
            jf2.setLayout(null);
            jf2.setSize(800, 800);
            jf2.setVisible(true);
          }
        });
        j1.add(jb2);
        j1.add(jb3);

        j1.setLayout(null);
        j1.setSize(800, 800);
        j1.setVisible(true);
      }
    }
    );
    jb2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFrame j1= new JFrame("Cricket Score");
        JLabel jl1= new JLabel("Enter Player Name : ");
        jl1.setBounds(50, 150, 150, 35);
        j1.add(jl1);
        JTextField jt1= new JTextField();
        jt1.setBounds(200,150,200,35);
        j1.add(jt1);
        JButton jb3= new JButton("Display Stats");
        jb3.setBounds(400, 150, 150, 35);
        jb2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            JFrame jf2 = new JFrame("Score - Tab");
            jf2.setLayout(null);
            jf2.setSize(800, 800);
            jf2.setVisible(true);
          }
        });
        jb3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            JFrame jf2 = new JFrame("Player Stats - Tab");
            WebDriver dr=new ChromeDriver();
            String n=jt1.getText();
            dr.get("https://www.google.com/search?q="+n+" stats");
            String m=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/g-tabbed-carousel/span/span/g-flippy-carousel/div/div/ol/li[1]/span/div/span/div/div/stats-table[1]/div/table/tbody/tr[3]/td[2]/div")).getText();
            String goals=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/g-tabbed-carousel/span/span/g-flippy-carousel/div/div/ol/li[1]/span/div/span/div/div/stats-table[1]/div/table/tbody/tr[3]/td[3]/div")).getText();
            String assist=dr.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[3]/div[1]/div/div/div[2]/div/div/div/div/g-tabbed-carousel/span/span/g-flippy-carousel/div/div/ol/li[1]/span/div/span/div/div/stats-table[1]/div/table/tbody/tr[3]/td[4]/div")).getText();
            JLabel l1=new JLabel(n+" Football stats:");
            l1.setBounds(100,50,200,35);
            JLabel l2=new JLabel("Matches :"+m);
            l2.setBounds(100,100,200,35);
            JLabel l3=new JLabel("Goals :"+goals);
            l3.setBounds(100,150,200,35);
            JLabel l4=new JLabel("Assists :"+assist);
            l4.setBounds(100,200,200,35);
            jf2.add(l1);jf2.add(l2);jf2.add(l3);jf2.add(l4);
            try
            {
            	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/yogha","root","Yogha@025@04");
            	Statement st=conn.createStatement();
            	String s="INSERT INTO football VALUES('"+n+"','"+m+"','"+goals+"','"+assist+"')";
            	st.executeUpdate(s);
            }
            catch(Exception e67)
            {
            	System.out.println(e67);
            }
            jf2.setLayout(null);
            jf2.setSize(800, 800);
            jf2.setVisible(true);
          }
        });
        j1.add(jb3);

        j1.setLayout(null);
        j1.setSize(800, 800);
        j1.setVisible(true);
      }
    });
    jf1.setLayout(null);
    jf1.setSize(800, 800);
    jf1.setVisible(true);
  }
}
