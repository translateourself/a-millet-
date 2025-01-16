package com.milletmall.milletproduct.service.impl;

import com.milletmall.common.utils.R;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.milletmall.common.utils.PageUtils;
import com.milletmall.common.utils.Query;

import com.milletmall.milletproduct.dao.CategoryDao;
import com.milletmall.milletproduct.entity.CategoryEntity;
import com.milletmall.milletproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    @Override
    public List<CategoryEntity> listWithTree() {
        //1. query all category Entities
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //2.generate the parent-child tree structure
            //1)find the first category the query condition: the first parent_cid equals zero
        List<CategoryEntity> level1Menus = categoryEntities.stream().filter(
                (categoryEntity) -> categoryEntity.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildren(menu,categoryEntities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort() == null ? 0 :menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());


        //2)find the second category the query condition: the first parent_cid equals one


        return level1Menus;
    }

    /*
     * function To find children entity of root category in all categories
     *
     * @date 2025/1/16 22:42
     * @param root current category
     * @param categoryEntities  all category
     * @return CategoryEntity>
     */
    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            //1.find children category of current categoryEntity
            categoryEntity.setChildren(getChildren(categoryEntity, all));
            return categoryEntity;
        }).sorted(
                // sort categories
                (menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 :menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return children;

    }

}