package abstractFactory;

public class PDF implements iText{
	private String filename;
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return filename+".pdf";
	}

	@Override
	public void setFileName(String filename) {
		this.filename = filename;
		
	}


}
