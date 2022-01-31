package intro;

public class Main {

	public static void main(String[] args) {
String denemeYazdir="Nasýlsýn Kardeþim Napýyosun ?";
System.out.println(denemeYazdir);

String[] krediler=
		{
	"Hizli Kredi",
	"Ticari Kredi",
	"Nizami Kredi",
	"Konut Kredisi",
	"Ýhtiyaç Kredisi"
		};
for(String kredi:krediler)
{
	System.out.println(kredi);
	}
for(int i=0;i<krediler.length;i++)
{
System.out.println(krediler[i] );	   
	}
int sayi1=3;
int sayi2=4;
sayi1=sayi2;
sayi2=10;
System.out.println(sayi1);

int[] sayilar1= {1,2,3,4,5};
int[] sayilar2= {10,20,30,40,50};
sayilar1=sayilar2;
sayilar2[0]=100;
System.out.println(sayilar1[0]);
	}

}
