package uygulamalar;

import dto.KullanıcıYorumlarıDto;
import dto.UrunYorumDto;
import entityservice.YorumEntityService;
import java.util.List;

public class KullanıcıYorumApp {
    public static void main(String[] args) {
        //this app list all comments with KullanıcıYorumDto by kullanıcı id.
        YorumEntityService service = new YorumEntityService();
        List<KullanıcıYorumlarıDto> kullanıcıList = service.findAllCommentsOfUser(2L);

        for (KullanıcıYorumlarıDto kullanıcıYorumlarıDto : kullanıcıList) {
            System.out.println(kullanıcıYorumlarıDto);
        }
    }
}
