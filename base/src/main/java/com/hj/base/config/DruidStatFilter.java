package com.hj.base.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by JianHuangsh on 2017/10/25.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")// 忽略资源
})
public class DruidStatFilter extends WebStatFilter {

}
