package dto;

import java.math.BigDecimal;

public class YorumSayısıDto {
    private Long UrunId;
    private String UrunAdi;
    private BigDecimal Fiyat;
    private Long YorumSayisi;

    public YorumSayısıDto(){

    }
    public YorumSayısıDto(Long urunId, String urunAdi, BigDecimal fiyat, Long yorumSayisi) {
        UrunId = urunId;
        UrunAdi = urunAdi;
        Fiyat = fiyat;
        YorumSayisi = yorumSayisi;
    }

    public Long getUrunId() {
        return UrunId;
    }

    public void setUrunId(Long urunId) {
        UrunId = urunId;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        UrunAdi = urunAdi;
    }

    public BigDecimal getFiyat() {
        return Fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        Fiyat = fiyat;
    }

    public Long getYorumSayisi() {
        return YorumSayisi;
    }

    public void setYorumSayisi(Long yorumSayisi) {
        YorumSayisi = yorumSayisi;
    }

    @Override
    public String toString() {
        return "YorumSayısıDto{" +
                "UrunId=" + UrunId +
                ", UrunAdi='" + UrunAdi + '\'' +
                ", Fiyat=" + Fiyat +
                ", YorumSayisi=" + YorumSayisi +
                '}';
    }
}
