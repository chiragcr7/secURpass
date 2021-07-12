import javax.swing.*;
import java.awt.*;
public class SplashScreen {
    JFrame frame;
    JLabel text=new JLabel("secURpass");
    JLabel text2=new JLabel("Team: Dynamic Developers");
    JProgressBar progressBar=new JProgressBar();
    JLabel message=new JLabel();   
    SplashScreen()
    {
        createGUI();
        addText();
        addProgressBar();
        addMessage();
        addTitle();
        runningPBar();
    }
    public void createGUI(){
        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        frame.setVisible(true);
    }

    
    public void addText()
    {
        text.setFont(new Font("arial",Font.BOLD,65));
        text.setBounds(130,100,600,60);
        text.setForeground(Color.WHITE);
        frame.add(text);
    }
    public void addTitle()
    {
        text2.setFont(new Font("arial",Font.BOLD,17));
        text2.setBounds(20,370,400,20);
        text2.setForeground(Color.white);
        frame.add(text2);
    }

    public void addMessage()
    {
        message.setBounds(230,320,200,40);
        message.setForeground(Color.BLACK);
        message.setFont(new Font("arial",Font.BOLD,15));
        frame.add(message);
    }
    public void addProgressBar(){
        progressBar.setBounds(100,280,400,30);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.BLACK);
        progressBar.setForeground(Color.GREEN);
        progressBar.setValue(0);
        frame.add(progressBar);
    }
    public void runningPBar(){
        int i=0;//Creating an integer variable and initializing it to 0

        while( i<=100)
        {
            try{
                Thread.sleep(40);   //Pausing execution for 50 milliseconds
                progressBar.setValue(i);    //Setting value of Progress Bar
                message.setText("LOADING....(" + (i) + "%)");   
                i++;
                if(i==100)
                    frame.dispose();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}