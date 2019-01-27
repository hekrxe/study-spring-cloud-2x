package com.zuul.filter.server.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * Created by tanhuayou on 2019/01/27
 */
@Component
public class FirstPreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否需要执行此filter
     *
     * @return true 执行
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 此filter的业务逻辑
     */
    @Override
    public Object run() {
        System.out.println("这是第一个自定义的filter!");
        return null;
    }
}
