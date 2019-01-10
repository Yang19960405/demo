import javax.swing.JOptionPane; 
public class Lianxi 
{
	public static void main(string a[]);
	{
		String s=JOptionPane.showInputDialog("请输入圆的半径 ：");
		double r=Double.parseDouble(s);
		double S=r*r*3.1415926;
		double C=3.14*2*r;
		JOptionPane.showMessageDialog(null, "面积为："+S);
		JOptionPane.showMessageDialog(null, "周长为："+C);
		
	}
}
