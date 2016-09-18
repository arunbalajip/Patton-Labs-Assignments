package abstractFactory;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("What File you want to create (Text/Image): ");
		String type = sc.next();
		AbstractFileFactory typeFactory = FactoryProducer.getFileFactory(type);
		if(type.equalsIgnoreCase("text")){
			System.out.print("Enter the File Type (Doc/PDF): ");
		}else{
			System.out.print("Enter the File Type (JPG/PNG): ");
		}
		String fileType = sc.next();
		iText text = typeFactory.getText(fileType);
		iImage image = typeFactory.getImage(fileType);
		System.out.print("Enter the File Name: ");
		String fileName = sc.next();
		if(text!=null){
			text.setFileName(fileName);
			System.out.println("File successfully created "+text.getFileName());
		}else if(image!=null){
			image.setFileName(fileName);
			System.out.println("File successfully created "+image.getFileName());
		}
	}

}
