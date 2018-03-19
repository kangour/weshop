package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.CategoryMapper;
import com.telang.weshop.entity.Category;

/***
 * 购物车相关api
 * 
 */
@RestController
public class CategoryApi {
    // 定义一个接口类对象
    @Autowired
    private CategoryMapper category;

    /***
     * 通过id获取信息
     * 
     * @param id
     * @return 
     */

    @RequestMapping(value = "/api/v1/get/category/id", method = RequestMethod.GET)
    public Category GetCategoryById(@RequestParam(value = "id", required = false) Integer id) {

        return category.selectByPrimaryKey(id);
    }

    /***
     * 根据用户名 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/category/all", method = RequestMethod.GET)
    public Category[] GetAllCategory() {

        return category.selectAll();
    }

    /***
     * 根据id修改信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/category/id", method = RequestMethod.PATCH)
    public int PatchCategoryById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "father_category_id", required = false) Integer father_category_id) {
        if (id == null) {
            return 0;
        }
        Category ca = new Category();

        ca.setId(id);
        ca.setName(name);
        ca.setFatherCategoryId(father_category_id);
        
        return category.updateByPrimaryKeySelective(ca);
    }

    /***
     * 根据id删除
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/category/id", method = RequestMethod.DELETE)
    public int DeleteCategoryById(@RequestParam("id") Integer id) {

        return category.deleteByPrimaryKey(id);
    }

    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/category/a", method = RequestMethod.POST)
    public int PostCategory(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "father_category_id", required = false) Integer father_category_id) {

        Category ca = new Category();

        ca.setId(id);
        ca.setName(name);
        ca.setFatherCategoryId(father_category_id);
        
        return category.insertSelective(ca);
    }

}
