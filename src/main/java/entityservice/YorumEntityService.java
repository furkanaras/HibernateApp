package entityservice;

import dao.YorumDao;
import dto.KullanıcıYorumlarıDto;
import dto.UrunDetayDto;
import dto.UrunYorumDto;
import dto.YorumSayısıDto;

import java.util.List;


public class YorumEntityService {
    private YorumDao yorumDao;

    public YorumEntityService() {
        yorumDao = new YorumDao();
    }
    public List<UrunYorumDto> findAllCommentsOfProduct(Long id) {
        return yorumDao.findAllCommentsOfProduct(id);
    }

    public List<YorumSayısıDto> findCommentNumberOfAllProducts(){
        return yorumDao.findCommentNumberOfAllProducts();
    }
    public List<KullanıcıYorumlarıDto> findAllCommentsOfUser(Long id){
        return yorumDao.findAllCommentsOfUser(id);
    }
}
