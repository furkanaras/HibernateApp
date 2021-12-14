package dto;

import java.util.Date;

public class KullanıcıYorumlarıDto {
    private Long KullanıcıId;
    private String KullanıcıAdi;
    private String UrunAdi;
    private String Yorum;
    private Date YorumTarihi;

    public KullanıcıYorumlarıDto(){

    }

    public KullanıcıYorumlarıDto(Long kullanıcıId, String kullanıcıAdi, String urunAdi, String yorum, Date yorumTarihi) {
        KullanıcıId = kullanıcıId;
        KullanıcıAdi = kullanıcıAdi;
        UrunAdi = urunAdi;
        Yorum = yorum;
        YorumTarihi = yorumTarihi;
    }

    public Long getKullanıcıId() {
        return KullanıcıId;
    }

    public void setKullanıcıId(Long kullanıcıId) {
        KullanıcıId = kullanıcıId;
    }

    public String getKullanıcıAdi() {
        return KullanıcıAdi;
    }

    public void setKullanıcıAdi(String kullanıcıAdi) {
        KullanıcıAdi = kullanıcıAdi;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        UrunAdi = urunAdi;
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
        return "KullanıcıYorumlarıDto{" +
                "KullanıcıId=" + KullanıcıId +
                ", KullanıcıAdi='" + KullanıcıAdi + '\'' +
                ", UrunAdi='" + UrunAdi + '\'' +
                ", Yorum='" + Yorum + '\'' +
                ", YorumTarihi=" + YorumTarihi +
                '}';
    }
}
