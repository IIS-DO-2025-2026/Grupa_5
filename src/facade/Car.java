package facade;

public class Car {
	private int remoteCode = 1234;
	private String carKey = "šara";
	private boolean isRanining = false;
	private boolean previousState = true; // radio
	
	public int getRemoteCode() {
		return remoteCode;
	}
	
	public String getCarKey() {
		return carKey;
	}
	
	public boolean isRanining() {
		return isRanining;
	}
	
	public boolean isPreviousState() {
		return previousState;
	}
	
	

}
