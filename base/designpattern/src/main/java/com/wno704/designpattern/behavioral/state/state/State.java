package com.wno704.designpattern.behavioral.state.state;

import com.wno704.designpattern.behavioral.state.context.Context;

public interface State {
    public void doAction(Context context);
}
