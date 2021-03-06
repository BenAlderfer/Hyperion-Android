package com.willowtreeapps.hyperion.attr.support.v7;

import android.support.annotation.NonNull;
import android.support.v7.widget.SearchView;

import com.google.auto.service.AutoService;
import com.willowtreeapps.hyperion.attr.ViewAttribute;
import com.willowtreeapps.hyperion.attr.collectors.TypedAttributeCollector;
import com.willowtreeapps.hyperion.plugin.v1.AttributeTranslator;

import java.util.ArrayList;
import java.util.List;

@AutoService(TypedAttributeCollector.class)
public class SearchViewAttributeCollector extends TypedAttributeCollector<SearchView> {

    public SearchViewAttributeCollector() {
        super(SearchView.class);
    }

    @NonNull
    @Override
    public List<ViewAttribute> collect(SearchView view, AttributeTranslator attributeTranslator) {
        List<ViewAttribute> attributes = new ArrayList<>();
        // TODO fill
        return attributes;
    }
}