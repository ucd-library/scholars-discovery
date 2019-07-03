package edu.tamu.scholars.middleware.discovery.model.generated.organization;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonInclude;
import edu.tamu.scholars.middleware.discovery.model.generated.AbstractNestedDocument;
import io.leangen.graphql.annotations.types.GraphQLType;
import java.lang.String;

/**
 * This file is automatically generated on compile.
 *
 * Do not modify this file -- YOUR CHANGES WILL BE ERASED!
 */
@GraphQLType(
    name = "OrganizationAwardsGrant"
)
@JsonInclude(NON_EMPTY)
public class AwardsGrant extends AbstractNestedDocument {
  private static final long serialVersionUID = -539299191L;

  private String date;

  public AwardsGrant() {
    super();
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }
}