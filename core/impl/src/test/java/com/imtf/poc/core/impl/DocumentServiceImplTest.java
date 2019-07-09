package com.imtf.poc.core.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DocumentServiceImplTest {

    private DocumentServiceImpl documentService;

    @Before
    public void setup() {
        documentService = new DocumentServiceImpl();
        documentService.setup();
    }

    @Test
    public void testDocumentService() throws Exception {
        documentService.add(1L, "Test");
        Assert.assertEquals(1, documentService.documents().size());
        Assert.assertEquals("Test", documentService.get(1));
    }

}
