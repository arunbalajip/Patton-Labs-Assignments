package abstractFactory;

import java.nio.file.FileSystemException;

public abstract class AbstractFileFactory {
	 public abstract iText getText(String s) throws FileSystemException;
	 public abstract iImage getImage(String s) throws FileSystemException;
}
