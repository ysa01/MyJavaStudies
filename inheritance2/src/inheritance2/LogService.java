package inheritance2;

public class LogService {
	public void log(int logType) {
		if(logType == 1) {
		System.out.println("veri taban�na logland�.");
		}else if(logType == 2) {
			System.out.println("File logland�.");
		}else if(logType == 3) {
			System.out.println("File logland�.");
		}
	}
}


//1-database e logla
//2-File a logla
//3-Email a logla