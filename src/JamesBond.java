import javax.swing.JOptionPane;

public class JamesBond {

	int findCode(Vault V){
		for(int i=0; i<1000000;i++){
			boolean code = V.tryCode(i);
			if(code == true){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		JamesBond Bond = new JamesBond();
		Vault V = new Vault();
		int james = Bond.findCode(V);
		JOptionPane.showMessageDialog(null, james);
	}
	
}
