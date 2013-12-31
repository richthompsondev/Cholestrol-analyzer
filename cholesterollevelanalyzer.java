import java.awt.*;
import java.awt.event.*;
class cholesterollevel implements ActionListener
{
    Frame f;
    Label l1,l2,l3,l4,l5,title;
    TextField tf1,tf2,tf3,tf4;
    Button b;
    cholesterollevel()
    {//initializing the components
        f=new Frame("Cholesterol Test Analyzer GUI");
        title=new Label("Cholesterol Test Analyzer GUI");
        l1=new Label("Enter the total cholesterol in mg/dL");
        l2=new Label("Enter the ldl cholesterol in mg/dL");
        l3=new Label("Enter the hdl cholesterol in mg/dL");
        l4=new Label("Enter the triglycerides in mg/dL");
        l5=new Label();
        b=new Button("Submit Results");
        tf1=new TextField();
        tf2=new TextField();
        tf3=new TextField();
        tf4=new TextField();
        //calling the appropriate functions
        boundSetter();
        fontSetter();
        b.addActionListener(this);//linking Button to ActionListener
        f.setVisible(true);//setting visibility of Frame
        f.setLayout(null);//setting Layout of Frame
        //calling the appropriate function
        addComponents();
        
        
    }
    void addComponents()
    {//to add the various components to the container f
         f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(title);
        f.add(b);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
    }
    
    void fontSetter()
    {//to set the font style,font weight, font size of each component
    title.setFont(new Font("Arial", Font.BOLD, 30));
      l1.setFont(new Font("Arial", Font.PLAIN, 22));
      tf1.setFont(new Font("Arial", Font.PLAIN, 22));
      l2.setFont(new Font("Arial", Font.PLAIN, 22));
      tf2.setFont(new Font("Arial", Font.PLAIN, 22));
      l3.setFont(new Font("Arial", Font.PLAIN, 22));
      tf3.setFont(new Font("Arial", Font.PLAIN, 22));
      l4.setFont(new Font("Arial", Font.PLAIN, 22));
      tf4.setFont(new Font("Arial", Font.PLAIN, 22));
      l5.setFont(new Font("Arial", Font.PLAIN, 22));
      b.setFont(new Font("Arial", Font.BOLD, 25));
    }
    void boundSetter()
    {//to set the bounds of each component
         f.setSize(1000,900);
      title.setBounds(300,50,900,30); 
      l1.setBounds(50,100,500,50);
      tf1.setBounds(600,100,200,50);
      l2.setBounds(50,170,500,50);
      tf2.setBounds(600,170,200,50);
      l3.setBounds(50,240,500,50);
      tf3.setBounds(600,240,200,50);
      l4.setBounds(50,310,500,50);
      tf4.setBounds(600,310,200,50);
      b.setBounds(350,380,200,50);
      l5.setBounds(250,500,500,50);
        b.setBackground(Color.PINK);
    }
    
    public void actionPerformed(ActionEvent e)
    {//fetching data from the TextFields
        String total=tf1.getText();
        String ldl=tf2.getText();
        String hdl=tf3.getText();
        String tri=tf4.getText();
        //converting the data fetched to float
        float total_cholesterol=Float.parseFloat(total);
        float ldl_cholesterol=Float.parseFloat(ldl);
        float hdl_cholesterol=Float.parseFloat(hdl);
        float triglycerides=Float.parseFloat(tri);
        //interpreting the cholesterol test values
        if(total_cholesterol<200 && ldl_cholesterol<130 && hdl_cholesterol>50 && triglycerides<200)
        l5.setText("Ideal Level of cholesterol");
        else if((total_cholesterol>=200 && total_cholesterol<=239) && (ldl_cholesterol>=130 && ldl_cholesterol<=159) && (hdl_cholesterol>=40 && hdl_cholesterol<=49) && (triglycerides>200 && triglycerides<=399))
        l5.setText("Borderline High Level of Cholesterol detected");
        else
        l5.setText("High Levels of Cholesterol detected");
        
        
    }
    
    void main()
    {//invoking the constructor
        cholesterollevel c=new cholesterollevel();
    }
}
