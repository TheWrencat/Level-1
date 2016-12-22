import javax.swing.JOptionPane;

public class Vault {

	int secretCode =  610205;
	
	boolean tryCode(int code){
		if(code==secretCode){
			return true;
			
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Vault V = new Vault();
		boolean test = V.tryCode(61025);
		if(test==true){
			JOptionPane.showMessageDialog(null, "Yay");
			
		}
		
	}
	
}
