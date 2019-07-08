package com.imtf.poc.core.impl;

import com.imtf.poc.core.api.DocumentService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DocumentServiceImpl implements DocumentService {

    private Map<Long, String> documents;

    @Activate
    public void setup() {
        this.documents = new HashMap<Long, String>();
    }

    @Override
    public void add(long id, String document) {
        this.documents.put(id, document);
    }

    @Override
    public String get(long id) {
        return this.documents.get(id);
    }

    @Override
    public Map<Long, String> documents() {
        return documents;
    }
}
