import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
class Main {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  WebDriver driver = new ChromeDriver();
    	  driver.get("https://www.cricbuzz.com/");
    	  try
    	  {
    	  driver.wait(1000);
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println(e);
    	  }
    	  //driver.findElement(By.xpath("//*[@id=\"sports-app\"]/div/div[3]/div/div/table/tbody/tr[1]/td[1]/div/div/div/table/tr[3]/td[2]"));
    	  String ans=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[1]/a/div/div/div[1]")).getText();
    	  String ans1=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[1]/a/div/div/div[2]")).getText();
    	  String ans2=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[1]/a/div/div/div[3]")).getText();
          String ans3=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[2]/div/div/a[1]/div[1]")).getText();
          String ans4=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[2]/div/div/a[1]/div[2]")).getText();
          String ans5=driver.findElement(By.xpath("//*[@id=\"hm-scag-mtch-blk\"]/ul/li[2]/div/div/a[1]/div[3]")).getText();
          System.out.println(ans+"    "+ans1+"\n"+ans2);
          System.out.println();
          System.out.println(ans3+"    "+ans4+"\n"+ans5);
          int f=sc.nextInt();
          while(f>0)
          {
        	  String buff=sc.nextLine();
        	  String p=sc.nextLine();
        	  player(p);
        	  f=sc.nextInt();
          }
      }
      public static void player(String n)
      {
    	  WebDriver dr=new ChromeDriver();
    	  String url="https://www.google.com/search?q="+n+" stats";
    	  dr.get( url);
    	  String m=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[2]")).getText();
    	  String in=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[3]")).getText();
    	  String no=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[4]")).getText();
    	  String runs=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[5]")).getText();
    	  String hs=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[6]")).getText();
    	  String avg=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[7]")).getText();
    	  String bf=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[8]")).getText();
    	  String sr=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[9]")).getText();
    	  String cent=dr.findElement(By.xpath("//*[@id=\"kp-wp-tab-default_tab:kc:/sports/pro_athlete:stats\"]/div[1]/div/div/div[2]/div/div/div/div/div/stats-table[1]/div/table/tbody/tr[3]/td[10]")).getText();
    	  System.out.println(n+" Test Stats:");
    	  System.out.println("Matches :"+m);
    	  System.out.println("Innings :"+in);
    	  System.out.println("Not Outs:"+no);
    	  System.out.println("Runs :"+runs);
    	  System.out.println("High Score:"+hs);
    	  System.out.println("Average :"+avg);
    	  System.out.println("Balls faced :"+bf);
    	  System.out.println("Strike Rate :"+sr);
    	  System.out.println("Centuries :"+cent);
      }
}
