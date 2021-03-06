package dbconsole;

import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
public class Console_View extends Frame implements ActionListener,WindowListener{
	public Console_View(){
		addWindowListener(this);
		setTitle("Graph");
		int id,sintyou;
		String nitiji;
		ResultSet rs;
		MySQL mysql=new MySQL();
		rs=mysql.selectAll();
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		try{

			while(rs.next()){
				            
			                id = rs.getInt("id");
			                nitiji = rs.getString("nitiji");
			                sintyou = rs.getInt("sintyou");
			                System.out.println("ID：" + id);
			                System.out.println("nitiji：" + nitiji);
			                System.out.println("sintyou：" + sintyou);
			                data.addValue(sintyou,"身長",nitiji);
							
			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		
		
		
		
	    JFreeChart chart = 
	      ChartFactory.createLineChart("身長伸び率",
	    		                       "年度",
	                                   "身長",
	                                   data,
	                                   PlotOrientation.VERTICAL,
	                                   true,
	                                   false,
	                                   false);

	    ChartPanel cpanel = new ChartPanel(chart);
	    add(cpanel, BorderLayout.CENTER);


	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
	System.exit(0);	
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

	}
	






