package com.shubham.app.structural.adapter;

import com.shubham.app.structural.adapter.entity.Pen;
import com.shubham.app.structural.adapter.entity.PilotPen;

public class PenAdapter implements Pen {

    private PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String content) {
        pilotPen.mark(content);
    }
}
