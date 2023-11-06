package com.PersonalWeb.service.impl;

import com.PersonalWeb.entity.Comment;
import com.PersonalWeb.mapper.CommentMapper;
import com.PersonalWeb.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
