package abstractFactory;

public class WordDoc implements iText {
	private String filename;
	@Override
	public String getFileName() {
		// TODO Auto-generated method stub
		return filename+".doc";
	}

	@Override
	public void setFileName(String filename) {
		this.filename = filename;
		
	}

}
