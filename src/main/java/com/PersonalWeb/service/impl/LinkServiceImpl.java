package com.PersonalWeb.service.impl;

import com.PersonalWeb.entity.Link;
import com.PersonalWeb.mapper.LinkMapper;
import com.PersonalWeb.service.ILinkService;
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
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
