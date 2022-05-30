package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Category;

/**
 * @author hcnwang3
 * @date 2022/5/30 12:50 AM
 */
public interface CategoryService extends IService<Category> {

    /**
     * 新增分类
     * @param category
     */
    public void saveCategory(Category category);

}
