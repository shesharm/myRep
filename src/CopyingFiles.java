import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;




public class CopyingFiles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
	// 1st way -Using TestNG 
		
/*		InputStream Source = new FileInputStream("C:/Sample/myprog.txt");
		File Dest = new File("C:/Sample/sample.txt");
		
		Files.copyFile(Source, Dest);*/
		
	//2nd Way -using java 7 Files
/*		File Source = new File("C:/Sample/myprog.txt");
		File Dest = new File("C:/Sample/sample.txt");
		Files.copy(Source, Dest);
		*/
		
		
		
		//3rd way of doing this
		InputStream is =null;
		OutputStream os = null;
		File Source = new File("C:/Sample/myprog.txt");
		File Dest = new File("C:/Sample/sample.txt");
		
		try{
		is = new FileInputStream(Source);
		os = new FileOutputStream(Dest);
		
		byte[] buffer = new byte[1024];
		int length;
		while((length=is.read(buffer))>0){
			os.write(buffer);
		}
		}finally{
			is.close();
			os.close();
		}
		
		

	}

}
