package GukBobshop;

public class GukBobDAO {
	public int point(GukBobDTO gbd) {
		
		String id ="admin";
		
		
		String pw = "1234";
		int result =0;
		if(id.equals("admin")&&pw.equals("1234")) {
			result = 1;
			
		}
		return result;
	}
}
