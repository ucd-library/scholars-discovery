package edu.tamu.scholars.middleware.discovery.service.export;

import org.springframework.data.solr.core.query.result.Cursor;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import edu.tamu.scholars.middleware.discovery.model.AbstractSolrDocument;

public interface Exporter {

    public String type();

    public String contentDisposition();

    public String contentType();

    public <D extends AbstractSolrDocument> StreamingResponseBody streamSolrResponse(Cursor<D> cursor, Export export);

}