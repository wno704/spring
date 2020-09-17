package com.wno704.designpattern.j2ee.interceptingfilter.manager;

import com.wno704.designpattern.j2ee.interceptingfilter.chain.FilterChain;
import com.wno704.designpattern.j2ee.interceptingfilter.filter.Filter;
import com.wno704.designpattern.j2ee.interceptingfilter.target.Target;

public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
