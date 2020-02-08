package com.example.demo.databinding;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {

        BindData binddata = (BindData)getValue();

        return binddata.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new BindData(Integer.parseInt(text)));
    }
}
