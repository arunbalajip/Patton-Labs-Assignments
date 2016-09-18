package abstractFactory;

public class JPG implements iImage{

	private String filename;
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return filename+".jpg";
	}

	@Override
	public void setFileName(String filename) {
		this.filename = filename;
		
	}


}
