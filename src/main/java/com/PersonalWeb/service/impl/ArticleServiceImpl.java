package com.PersonalWeb.service.impl;

import com.PersonalWeb.entity.Article;
import com.PersonalWeb.mapper.ArticleMapper;
import com.PersonalWeb.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2023-11-06
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
