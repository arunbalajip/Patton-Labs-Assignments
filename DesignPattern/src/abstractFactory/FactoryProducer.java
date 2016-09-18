package abstractFactory;

public class FactoryProducer {
	public static AbstractFileFactory getFileFactory(String s) throws Exception{
		if(s.equalsIgnoreCase("text")){
			return new TextFactory();
		}else if(s.equalsIgnoreCase("image")){
			return new ImageFactory();
		}else{
			throw new Exception();
		}
	}
}
