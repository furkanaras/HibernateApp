package uygulamalar;

import dto.UrunDetayDto;
import dto.YorumSayısıDto;
import entityservice.YorumEntityService;

import java.util.List;

public class YorumSayisiApp {
    //this app list all comment number of products with yorumsayisidto.
    public static void main(String[] args) {
        YorumEntityService service = new YorumEntityService();
        List<YorumSayısıDto> yorumList = service.findCommentNumberOfAllProducts();

        for (YorumSayısıDto yorumSayısıDto : yorumList) {
            System.out.println(yorumSayısıDto);
        }
    }
}
