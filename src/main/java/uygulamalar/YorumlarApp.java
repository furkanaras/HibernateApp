package uygulamalar;

import dto.UrunDetayDto;
import dto.UrunYorumDto;
import entityservice.UrunEntityService;
import entityservice.YorumEntityService;

import java.util.List;

public class YorumlarApp {
    public static void main(String[] args) {
        //this app list all comments with urunyorumdto by urun id.
        YorumEntityService service = new YorumEntityService();
        List<UrunYorumDto> yorumList = service.findAllCommentsOfProduct(2L);

        for (UrunYorumDto urunYorumDto : yorumList) {
            System.out.println(urunYorumDto);
        }
    }
}
