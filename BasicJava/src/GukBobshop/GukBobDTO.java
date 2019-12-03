package GukBobshop;

public class GukBobDTO {
	String id = "";
	String pw = "";
	String pNum = "";
	int pointOut = 0;
	int pointIn = 0;
	int pointStack = 0;
	public GukBobDTO(String id, String pw, String pNum, int pointOut, int pointIn, int pointStack) {
		super();
		this.id = id;
		this.pw = pw;
		this.pNum = pNum;
		this.pointOut = pointOut;
		this.pointIn = pointIn;
		this.pointStack = pointStack;
	}
	public GukBobDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public GukBobDTO(String id, int pointIn) {
		super();
		this.id = id;
		this.pointIn = pointIn;
	}
	
}
