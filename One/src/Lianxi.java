import javax.swing.JOptionPane; 
public class Lianxi 
{
	public static void main(string a[]);
	{
		String s=JOptionPane.showInputDialog("������Բ�İ뾶 ��");
		double r=Double.parseDouble(s);
		double S=r*r*3.1415926;
		double C=3.14*2*r;
		JOptionPane.showMessageDialog(null, "���Ϊ��"+S);
		JOptionPane.showMessageDialog(null, "�ܳ�Ϊ��"+C);
		
	}
}
