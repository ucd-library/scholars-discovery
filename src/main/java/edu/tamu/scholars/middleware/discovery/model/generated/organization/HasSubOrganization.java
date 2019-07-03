package edu.tamu.scholars.middleware.discovery.model.generated.organization;

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
    name = "OrganizationHasSubOrganization"
)
@JsonInclude(NON_EMPTY)
public class HasSubOrganization extends AbstractNestedDocument {
  private static final long serialVersionUID = 144474806L;

  public HasSubOrganization() {
    super();
  }
}