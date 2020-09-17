package com.wno704.designpattern.j2ee.compositeentity.compositeentity;

import com.wno704.designpattern.j2ee.compositeentity.coarsegrained.CoarseGrainedObject;

public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }

}
