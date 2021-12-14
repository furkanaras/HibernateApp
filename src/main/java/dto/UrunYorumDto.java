package dto;

import java.math.BigDecimal;
import java.util.Date;

public class UrunYorumDto {

    private String UrunAdi;
    private String KategoriAdi;
    private BigDecimal Fiyat;
    private String KullanıcıAdi;
    private String KullanıcıSoyadi;
    private String KullanıcıEmail;
    private String KullanıcıTelefon;
    private String Yorum;
    private Date YorumTarihi;

    public UrunYorumDto(){

    }
    public UrunYorumDto(String urunAdi, String kategoriAdi, BigDecimal fiyat, String kullanıcıAdi, String kullanıcıSoyadi,
                        String kullanıcıEmail, String kullanıcıTelefon, String yorum, Date yorumTarihi) {
        UrunAdi = urunAdi;
        KategoriAdi = kategoriAdi;
        Fiyat = fiyat;
        KullanıcıAdi = kullanıcıAdi;
        KullanıcıSoyadi = kullanıcıSoyadi;
        KullanıcıEmail = kullanıcıEmail;
        KullanıcıTelefon = kullanıcıTelefon;
        Yorum = yorum;
        YorumTarihi = yorumTarihi;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        UrunAdi = urunAdi;
    }

    public String getKategoriAdi() {
        return KategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        KategoriAdi = kategoriAdi;
    }

    public BigDecimal getFiyat() {
        return Fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        Fiyat = fiyat;
    }

    public String getKullanıcıAdi() {
        return KullanıcıAdi;
    }

    public void setKullanıcıAdi(String kullanıcıAdi) {
        KullanıcıAdi = kullanıcıAdi;
    }

    public String getKullanıcıSoyadi() {
        return KullanıcıSoyadi;
    }

    public void setKullanıcıSoyadi(String kullanıcıSoyadi) {
        KullanıcıSoyadi = kullanıcıSoyadi;
    }

    public String getKullanıcıEmail() {
        return KullanıcıEmail;
    }

    public void setKullanıcıEmail(String kullanıcıEmail) {
        KullanıcıEmail = kullanıcıEmail;
    }

    public String getKullanıcıTelefon() {
        return KullanıcıTelefon;
    }

    public void setKullanıcıTelefon(String kullanıcıTelefon) {
        KullanıcıTelefon = kullanıcıTelefon;
    }

    public String getYorum() {
        return Yorum;
    }

    public void setYorum(String yorum) {
        Yorum = yorum;
    }

    public Date getYorumTarihi() {
        return YorumTarihi;
    }

    public void setYorumTarihi(Date yorumTarihi) {
        YorumTarihi = yorumTarihi;
    }

    @Override
    public String toString() {
        return "UrunYorumDto{" +
                "UrunAdi='" + UrunAdi + '\'' +
                ", KategoriAdi='" + KategoriAdi + '\'' +
                ", Fiyat=" + Fiyat +
                ", KullanıcıAdi='" + KullanıcıAdi + '\'' +
                ", KullanıcıSoyadi='" + KullanıcıSoyadi + '\'' +
                ", KullanıcıEmail='" + KullanıcıEmail + '\'' +
                ", KullanıcıTelefon='" + KullanıcıTelefon + '\'' +
                ", Yorum='" + Yorum + '\'' +
                ", YorumTarihi=" + YorumTarihi +
                '}';
    }
}
