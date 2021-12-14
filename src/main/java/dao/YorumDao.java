package dao;

import base.BaseDao;
import dto.KullanıcıYorumlarıDto;
import dto.UrunDetayDto;
import dto.UrunYorumDto;
import dto.YorumSayısıDto;
import entity.Urun;
import entity.UrunYorum;
import org.hibernate.query.Query;

import java.util.List;

public class YorumDao extends BaseDao {

    //list all comments of a product by id.
    public List<UrunYorumDto> findAllCommentsOfProduct(Long id) {

        String sql = " select " +
                " new dto.UrunYorumDto( urun.adi, urun.kategori.adi, urun.fiyat, urunYorum.kullanıcı.adi, urunYorum.kullanıcı.soyAdi, urunYorum.kullanıcı.email, urunYorum.kullanıcı.telefonNo, urunYorum.yorum, urunYorum.yorumTarihi) " +
                " from UrunYorum urunYorum " +
                " left join Urun urun  on urunYorum.urun.id = urun.id " +
                " where urunYorum.urun.id = :id ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }

    public List<YorumSayısıDto> findCommentNumberOfAllProducts(){

        String sql = " select " +
                " new dto.YorumSayısıDto( urun.id, urun.adi, urun.fiyat, count(urunYorum.id))" +
                " from UrunYorum urunYorum " +
                " left join Urun urun  on urunYorum.urun.id = urun.id "+
                " group by urun.id";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }

    public List<KullanıcıYorumlarıDto> findAllCommentsOfUser(Long id){
        String sql = " select " +
                " new dto.KullanıcıYorumlarıDto(kullanıcı.id, kullanıcı.adi, urunYorum.urun.adi, urunYorum.yorum, urunYorum.yorumTarihi)" +
                " from UrunYorum urunYorum " +
                " left join Kullanıcı kullanıcı  on urunYorum.kullanıcı.id = kullanıcı.id "+
                " where urunYorum.kullanıcı.id = :id ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return query.list();
    }
}
