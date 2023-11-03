package com.example.demo.filters;
import com.example.demo.item.Item;

public interface SearchFilter {
    boolean match(Item item);
}
