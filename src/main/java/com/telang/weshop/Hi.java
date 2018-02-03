package com.telang.weshop;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class Hi {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 处理异常的方法
     * 
     * @param req
     * @param e
     */
    @ExceptionHandler(value = Exception.class)
    public void getException(HttpServletRequest req, Exception e) {
        logger.error("捕获到一个全局异常！" + e.getMessage());
    }

    /**
     * 会抛出异常的方法
     * 
     * @return
     */
    @RequestMapping("/getNum")
    public int numCont() {
        return 100 / 0;
    }

    @RequestMapping("/log")
    public Object writeLog() {
        logger.trace("这是一个trace 跟踪级别的日志");
        logger.debug("这是一个debug 调试级别的日志");
        logger.info("这是一个info 消息级别的日志");
        logger.warn("这是一个warn 警告级别的日志");
        logger.error("这是一个error 错误级别的日志");
        return "Hi";
    }

    /**
     * 访问数据库
     */
    //
    // public void db() {
    // Connection conn = null;
    // Statement stmt = null;
    // try {
    // // 注册 JDBC 驱动
    // Class.forName("com.mysql.jdbc.Driver");
    //
    // // 打开链接
    // System.out.println("连接数据库...");
    // conn = DriverManager.getConnection(DB_URL, USER, PASS);
    //
    // // 执行查询
    // System.out.println(" 实例化Statement对...");
    // stmt = conn.createStatement();
    // String sql;
    // sql = "SELECT id, name, url FROM websites";
    // ResultSet rs = stmt.executeQuery(sql);
    //
    // // 展开结果集数据库
    // while (rs.next()) {
    // // 通过字段检索
    // int id = rs.getInt("id");
    // String name = rs.getString("name");
    // String url = rs.getString("url");
    //
    // // 输出数据
    // System.out.print("ID: " + id);
    // System.out.print(", 站点名称: " + name);
    // System.out.print(", 站点 URL: " + url);
    // System.out.print("\n");
    // }
    // // 完成后关闭
    // rs.close();
    // stmt.close();
    // conn.close();
    // } catch (SQLException se) {
    // // 处理 JDBC 错误
    // se.printStackTrace();
    // } catch (Exception e) {
    // // 处理 Class.forName 错误
    // e.printStackTrace();
    // } finally {
    // // 关闭资源
    // try {
    // if (stmt != null)
    // stmt.close();
    // } catch (SQLException se2) {
    // } // 什么都不做
    // try {
    // if (conn != null)
    // conn.close();
    // } catch (SQLException se) {
    // se.printStackTrace();
    // }
    // }
    // System.out.println("Goodbye!");
    // }

}
