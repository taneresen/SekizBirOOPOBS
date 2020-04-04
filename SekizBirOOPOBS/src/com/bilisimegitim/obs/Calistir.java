package com.bilisimegitim.obs;

public class Calistir {

	public static void main(String[] args) {
		
		
		Ogrenci ogr1 = new Ogrenci();
		ogr1.setAd("Bora");
		System.out.println(ogr1.getAd()+"-"+ogr1.getKatkiPayi());
		
		Ogrenci ogr2 = new Ogrenci(2,"Erman","Toroglu",2500);
		
		System.out.println(ogr2.getOgrenciBilgisi());

	}

}
