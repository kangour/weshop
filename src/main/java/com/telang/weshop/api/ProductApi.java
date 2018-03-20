package com.telang.weshop.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.telang.weshop.dao.ProductMapper;
import com.telang.weshop.entity.Product;
import com.telang.weshop.entity.ProductDetail;

/***
 * 产品相关api
 * 
 */
@RestController
public class ProductApi {
    // 定义一个接口类对象
    @Autowired
    private ProductMapper prod;

    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/product/a", method = RequestMethod.POST)
    public int PostProduct(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "price", required = false) Double price,
            @RequestParam(value = "main_image", required = false) Integer main_image,
            @RequestParam(value = "stock", required = false) Integer stock,
            @RequestParam(value = "shelves", required = false) Integer shelves,
            @RequestParam(value = "sales_num", required = false) Integer sales_num,
            @RequestParam(value = "collection_num", required = false) Integer collection_num,
            @RequestParam(value = "sort_whight", required = false) Integer sort_whight,
            @RequestParam(value = "categories", required = false) Integer categories) {

        Product pr = new Product();

        pr.setId(id);
        pr.setTitle(title);
        pr.setPrice(price);
        pr.setMainImage(main_image);
        pr.setStock(stock);
        pr.setShelves(shelves);
        pr.setSalesNum(sales_num);
        pr.setCollectionNum(collection_num);
        pr.setSortWhight(sort_whight);
        pr.setCategories(categories);
        return prod.insertSelective(pr);
    }

    /***
     * 根据id删除
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/product/id", method = RequestMethod.DELETE)
    public int DeleteProductById(@RequestParam("id") Integer id) {

        return prod.deleteByPrimaryKey(id);
    }

    /***
     * 通过id获取信息
     * 
     * @param id
     * @return
     */

    @RequestMapping(value = "/api/v1/get/product/id", method = RequestMethod.GET)
    public Product GetProductById(@RequestParam(value = "id", required = false) Integer id) {

        return prod.selectByPrimaryKey(id);
    }

    /***
     * 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/product/all", method = RequestMethod.GET)
    public Product[] GetAllProduct() {

        return prod.selectAll();
    }

    /***
     * 根据产品id查询详细信息（包括图片地址和分类名）
     * 
     * @param id
     * @return
     */

    @RequestMapping(value = "/api/v1/get/product/id/detail", method = RequestMethod.GET)
    public ProductDetail selectDetailById(@RequestParam(value = "id", required = false) Integer id) {

        return prod.selectDetailById(id);
    }

    /***
     * 查询所有商品详细信息（包括图片地址和分类名）
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/product/all/detail", method = RequestMethod.GET)
    public ProductDetail[] selectDetailAll() {
        
        // 使用这种分页的方式，查询的语句必须跟在这句后边，否则会有线程安全问题
        // PageHelper.startPage(2, 20);
        return prod.selectDetailAll();
    }

    /***
     * 根据关键字查询商品详情
     * 
     * @param id
     * @return
     */

    @RequestMapping(value = "/api/v1/get/product/key", method = RequestMethod.GET)
    public ProductDetail[] selectByKey(@RequestParam(value = "key", required = false) String key) {

        return prod.selectDetailByKey(key);
    }

    /***
     * 根据id修改信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/product/id", method = RequestMethod.PATCH)
    public int PatchProductById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "price", required = false) Double price,
            @RequestParam(value = "main_image", required = false) Integer main_image,
            @RequestParam(value = "stock", required = false) Integer stock,
            @RequestParam(value = "shelves", required = false) Integer shelves,
            @RequestParam(value = "sales_num", required = false) Integer sales_num,
            @RequestParam(value = "collection_num", required = false) Integer collection_num,
            @RequestParam(value = "sort_whight", required = false) Integer sort_whight,
            @RequestParam(value = "categories", required = false) Integer categories) {

        Product pr = new Product();

        pr.setId(id);
        pr.setTitle(title);
        pr.setPrice(price);
        pr.setMainImage(main_image);
        pr.setStock(stock);
        pr.setShelves(shelves);
        pr.setSalesNum(sales_num);
        pr.setCollectionNum(collection_num);
        pr.setSortWhight(sort_whight);
        pr.setCategories(categories);
        return prod.updateByPrimaryKeySelective(pr);
    }

}
