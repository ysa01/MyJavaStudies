package interfaces;

public class Utils {
	// metoda static eklersek class� newlemeden direk methodu �a��rabiliriz customerServicedde oldu�u gibi
	public static void runLoggers(Logger[] loggers, String message) {
		for (Logger logger : loggers) {
			logger.log(message);
		}
	}
}
// Biz bu class� ba�ka yerde newlemek yerine neden metodlar�n� static yapm�yoruz ? 
// static method bir kere kullan�ld���nda bellekte yer tutar ve program sonlanana kadar bellekte kal�r. mesala m��teri ekleme i�lemi g�nde 1-2 defa olan bir i�lem bo� yere bellekte yer tutar buda sistemi yava�lat�r. onun i�in nesne s�n�flar�nda static genel kullan�lmaz.
// Javada �st classa static veremezsin ba�ka bir i� class a�arsan ona verebilirsin
