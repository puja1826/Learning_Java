package OOPS_Encapsulation;

public class Page {
	private String title;
	private String header;
	private int timeOut;
	private boolean isExpired;

	public Page() {

	}

	public Page(String title, String header, int timeOut, boolean isExpired) {
		this.title = title;
		this.header = header;
		this.timeOut = timeOut;
		this.isExpired = isExpired;
	}

	// setter and getter public methods:

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

}

