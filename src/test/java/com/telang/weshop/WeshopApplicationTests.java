package com.telang.weshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.telang.weshop.dao.ProductMapper;
import com.telang.weshop.entity.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeshopApplicationTests {

    // 定义一个产品对象
    @Autowired
    private ProductMapper prod;
    @Autowired
    private TestRestTemplate restTemplate;

//    @Autowired
//    private MyRestController myRestController;
    
    // 注入Spring 工厂
    @Autowired
    private WebApplicationContext wac;
   //伪造mvc环境
    private MockMvc mockMvc;
    @Before
    public void setup(){
      mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Test
    public void whenXXXXSuccess() throws Exception {
      //模拟发送请求
        Product Pro = restTemplate.getForObject("/api/v1/get/product/id?id=1", Product.class);
        System.out.println(Pro.toString());

//        Product user = this.myRestController.getUser(1L);
//        System.out.println(user.toString());
    }
    /***
     * 测试插入数据接口类是否正常。
     */
    @Test
    public void InsertProductTest() {
        Product product = new Product();
        product.setTitle("小水杯");
        product.setPrice(77.0);
        int result = prod.insertSelective(product);
        // 断言结果等于1，不等于1则抛出异常，并给出错误提示。
        Assert.assertEquals("失败了：结果不等于1: ", 1, result);
        // 断言结果不是1，是1则抛出异常，并给出错误提示。
        Assert.assertNotEquals("失败了：结果等于1", 1, result);
        // 断言结果不为空
        Assert.assertNotNull("预判失误：运行结果为空", result);
        // 断言结果为空
        Assert.assertNull(("预判失误：运行结果不为空,结果为：" + result), result);
    }

}
