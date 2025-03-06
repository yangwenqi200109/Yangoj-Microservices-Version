package com.ywq.yangojbackendcommon.common;

import lombok.Data;
import com.ywq.yangojbackendcommon.constant.CommonConstant;

/**
 * 分页请求
 *
 * @author <a href="https://github.com/liywq">程序员杨文琦</a>
 * @from <a href="https://ywq.icu">作者杨文琦</a>
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private long current = 1;

    /**
     * 页面大小
     */
    private long pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认升序）
     */
    private String sortOrder = CommonConstant.SORT_ORDER_ASC;
}
