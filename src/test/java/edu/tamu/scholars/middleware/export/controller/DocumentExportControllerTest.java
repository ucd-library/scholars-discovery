package edu.tamu.scholars.middleware.export.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;

import edu.tamu.scholars.middleware.discovery.model.Document;

public class DocumentExportControllerTest extends AbstractSolrDocumentExportControllerTest<Document> {

    @Value("classpath:mock/discovery/documents")
    private Resource mocksDirectory;

    @Override
    protected Resource getMocksDirectory() {
        return mocksDirectory;
    }

    @Override
    protected Class<?> getType() {
        return Document.class;
    }

    @Override
    protected String getPath() {
        return "/individual";
    }

}
