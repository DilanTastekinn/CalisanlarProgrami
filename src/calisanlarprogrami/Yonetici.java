/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calisanlarprogrami;

/**
 *
 * @author dilan
 */
public class Yonetici extends Calisan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı : " + sorumlu_kisi_sayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd() + "çalışanlara" + zamMiktari + "kadar zam yapıyor...");
    }
    
}
