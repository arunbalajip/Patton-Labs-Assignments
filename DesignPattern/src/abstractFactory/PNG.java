package abstractFactory;

public class PNG implements iImage{

	private String filename;
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return filename+".png";
	}

	@Override
	public void setFileName(String filename) {
		this.filename = filename;
		
	}


}
