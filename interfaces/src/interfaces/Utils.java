package interfaces;

public class Utils {
	// metoda static eklersek classý newlemeden direk methodu çaðýrabiliriz customerServicedde olduðu gibi
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
// Biz bu classý baþka yerde newlemek yerine neden metodlarýný static yapmýyoruz ? 
// static method bir kere kullanýldýðýnda bellekte yer tutar ve program sonlanana kadar bellekte kalýr. mesala müþteri ekleme iþlemi günde 1-2 defa olan bir iþlem boþ yere bellekte yer tutar buda sistemi yavaþlatýr. onun için nesne sýnýflarýnda static genel kullanýlmaz.
// Javada üst classa static veremezsin baþka bir iç class açarsan ona verebilirsin
