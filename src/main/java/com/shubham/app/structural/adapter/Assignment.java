package com.shubham.app.structural.adapter;

import com.shubham.app.structural.adapter.entity.Pen;

public class Assignment {

    private Pen pen;

    public void writeAssignment(String content) {
        pen.write(content);
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
