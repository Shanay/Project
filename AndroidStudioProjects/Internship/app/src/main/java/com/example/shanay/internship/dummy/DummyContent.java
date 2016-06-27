package com.example.shanay.internship.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        addItem(new DummyItem("1", "Company Website", "http://www.simsononline.com/"));
        addItem(new DummyItem("2", "Insurance Companies Near You", "https://www.google.co.in/maps/search/insurance+companies+near+me/"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class DummyItem {
        public final String id;
        public final String itemName;
        public final String url;

        public DummyItem(String id, String itemName, String url) {
            this.id = id;
            this.itemName = itemName;
            this.url = url;
        }

        @Override
        public String toString() {
            return itemName;
        }
    }

}