package com.bbblog.service;

import com.bbblog.entity.es.EsBlog;
import com.bbblog.entity.User;
import com.bbblog.vo.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EsBlogService {
    void removeEsBlog(String id);

    EsBlog updateEsBlog(EsBlog esBlog);

    EsBlog getEsBlogByBlogId(Long blogId);

    Page<EsBlog> listNewestEsBlogs(String keyword, Pageable pageable);

    Page<EsBlog> listHottestEsBlogs(String keyword, Pageable pageable);

    Page<EsBlog> listEsBlogs(Pageable pageable);

    List<EsBlog> listTop5NewestEsBlogs();

    List<EsBlog> listTop5HottestEsBlogs();

    List<TagVO> listTop30Tags();

    List<User> listTop12Users();
}
