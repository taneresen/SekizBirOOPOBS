package com.bilisimegitim.obs;

public class Ogrenci {
	
	private int no;
	private String ad;
	private String soyad;
	private double katkiPayi;
	
	//Constructor (Donus tipi olmayan metoda denir.)
	public Ogrenci() // Metod gibi gözükür ancak bu metod degil.Donus tipi yok ve class ile ayni adi tasir.
					// Bunu kullanma amacimiz degiskenlerin ilk degerlerini vermektir.
	{
		no = 0;
		ad = "";
		soyad="";
		katkiPayi=0.0;
	}
	
	//Constructor Parametreli Yukleyecegiz Busefer
	public Ogrenci(int no, String ad, String soyad, double katkiPayi) {
		this.no = no; // This parametre adlari ayni olunca karismasin diye yapilmistir.
		this.ad = ad;
		this.soyad = soyad;
		this.katkiPayi = katkiPayi;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public double getKatkiPayi() {
		return katkiPayi;
	}
	public void setKatkiPayi(double katkiPayi) {
		this.katkiPayi = katkiPayi;
	}

	
	public String getOgrenciBilgisi() {
		return getNo()+" "+getAd()+" "+getSoyad()+" "+getKatkiPayi();
	}
	
	


	

}
