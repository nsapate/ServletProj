package ninad.classes;

public class NumberConvertion {
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	public String convertBinary(String string){
		
		return Integer.toBinaryString(Integer.parseInt(string));
	}
	public String convertHexa(String string){
		
		return Integer.toHexString(Integer.parseInt(string));
	}
	
	public String convertOctal(String string){
		
		return Integer.toOctalString(Integer.parseInt(string));
	}
}
