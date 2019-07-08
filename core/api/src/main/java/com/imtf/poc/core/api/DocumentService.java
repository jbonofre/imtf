package com.imtf.poc.core.api;

import java.util.Map;

public interface DocumentService {

    void add(long id, String document);

    String get(long id);

    Map<Long, String> documents();

}
