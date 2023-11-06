package com.PersonalWeb.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2023-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AdType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 广告类型id
     */
    private String adTypeId;

    /**
     * 广告类型名称
     */
    private String adTypeTitle;

    /**
     * 广告标识(首页广告、内容页广告)
     */
    private String adTypeTag;

    /**
     * 广告类型排序、越小越靠前
     */
    private Integer adTypeSort;

    /**
     * 广告添加时间
     */
    private LocalDateTime adTypeAddTime;


}
