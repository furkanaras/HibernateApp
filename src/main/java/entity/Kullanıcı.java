package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "KULLANICI")
public class Kullanıcı {

    @SequenceGenerator(name = "generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(length = 50, name = "ADI")
    private String adi;

    @Column(length = 50, name = "SOY_ADI")
    private String soyAdi;

    @Column(length = 50, name = "EMAIL")
    private String email;

    @Column(length = 15, name = "TELEFON_NO")
    private String telefonNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    @Override
    public String toString() {
        return "Kullanıcı{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyAdi='" + soyAdi + '\'' +
                ", email='" + email + '\'' +
                ", telefonNo='" + telefonNo +
                '}';
    }
}
