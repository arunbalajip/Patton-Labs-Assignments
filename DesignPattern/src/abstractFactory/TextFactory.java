package abstractFactory;

import java.nio.file.FileSystemException;

public class TextFactory extends AbstractFileFactory{
	@Override
	public iText getText(String s) throws FileSystemException {
		if(s.equalsIgnoreCase("doc")){
			return new WordDoc();
		}else if(s.equalsIgnoreCase("pdf")){
			return new PDF();
		}else{
			throw new FileSystemException(s);
		}
	}


	@Override
	public iImage getImage(String s) throws FileSystemException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
