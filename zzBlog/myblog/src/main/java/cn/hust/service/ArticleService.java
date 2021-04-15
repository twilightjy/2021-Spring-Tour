package cn.hust.service;


import cn.hust.dto.ArchiveDTO;
import cn.hust.dto.PageDTO;
import cn.hust.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author zz
 * @since 2021-04-13
 */
public interface ArticleService extends IService<Article> {

    /**
     * 查询文章归档
     *
     * @param current 当前页码
     * @return 文章
     */
    PageDTO<ArchiveDTO> listArchives(Long current);


}
