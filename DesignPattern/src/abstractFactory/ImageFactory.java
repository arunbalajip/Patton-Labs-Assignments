package abstractFactory;

import java.nio.file.FileSystemException;

public class ImageFactory extends AbstractFileFactory{

	public iImage getImage(String s) throws FileSystemException {
		if(s.equalsIgnoreCase("png")){
			return new PNG();
		}else if(s.equalsIgnoreCase("jpg")){
			return new JPG();
		}else{
			throw new FileSystemException(s);
		}
	}

	@Override
	public iText getText(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
