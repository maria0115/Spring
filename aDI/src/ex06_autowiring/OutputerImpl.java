package ex06_autowiring;

import java.io.FileWriter;

public class OutputerImpl implements Outputer {

	String path;
	
	public void setPath(String path)
	{
		this.path=path;
	}
	@Override
	public void write(String message) throws Exception {
		

		FileWriter f = new FileWriter(path);

		f.write(message);	//어떤 메세지가 들어오면 파일에다가 저장한다는 얘기
		
		

		f.close();
	}

}
