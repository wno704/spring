package com.wno704.shiro.server;

import com.wno704.shiro.model.UserOnline;

import java.util.List;

public interface SessionService {
    List<UserOnline> list();
    boolean forceLogout(String sessionId);
}
