package edu.tamu.scholars.middleware.export.service;

import java.util.List;

import org.springframework.data.solr.core.query.result.Cursor;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import edu.tamu.scholars.middleware.discovery.model.AbstractSolrDocument;
import edu.tamu.scholars.middleware.export.argument.Export;
import edu.tamu.scholars.middleware.export.exception.UnsupportedExporterTypeException;

public interface Exporter {

    public String type();

    public String contentDisposition(String filename);

    public String contentType();

    default public <D extends AbstractSolrDocument> StreamingResponseBody streamSolrResponse(Cursor<D> cursor, List<Export> export) {
        throw new UnsupportedExporterTypeException(String.format("%s exporter does not support export field exports", type()));
    }

    default public <D extends AbstractSolrDocument> StreamingResponseBody streamSolrResponse(Cursor<D> cursor, String template) {
        throw new UnsupportedExporterTypeException(String.format("%s exporter does not support results templated exports", type()));
    }

    default public <D extends AbstractSolrDocument> StreamingResponseBody streamIndividual(D entity) {
        throw new UnsupportedExporterTypeException(String.format("%s exporter does not support individual templated exports", type()));
    }

}
