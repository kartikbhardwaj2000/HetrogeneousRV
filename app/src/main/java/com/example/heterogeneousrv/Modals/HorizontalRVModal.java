package com.example.heterogeneousrv.Modals;

import java.util.ArrayList;

public class HorizontalRVModal {

    ArrayList<HorizontalModal> data;

    public ArrayList<HorizontalModal> getData() {
        return data;
    }

    public void setData(ArrayList<HorizontalModal> data) {
        this.data = data;
    }

    public HorizontalRVModal(ArrayList<HorizontalModal> data) {
        this.data = data;
    }
}
