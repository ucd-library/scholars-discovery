package edu.tamu.scholars.middleware.discovery.model.generated.document;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "DocumentSubjectArea"
)
@JsonInclude(NON_EMPTY)
public class SubjectArea extends AbstractNestedDocument {
  private static final long serialVersionUID = -434021308L;

  public SubjectArea() {
    super();
  }
}