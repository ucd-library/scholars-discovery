package edu.tamu.scholars.middleware.graphql.model.person;

import edu.tamu.scholars.middleware.graphql.model.person.PositionOrganizationParent;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.graphql.model.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;
import java.util.List;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "PersonPositionOrganization"
)
@JsonInclude(NON_EMPTY)
public class PositionOrganization extends AbstractNestedDocument {
  private static final long serialVersionUID = -913043057L;

  private String label;

  private List<PositionOrganizationParent> parent;

  public PositionOrganization() {
    super();
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<PositionOrganizationParent> getParent() {
    return parent;
  }

  public void setParent(List<PositionOrganizationParent> parent) {
    this.parent = parent;
  }
}