package echoquery.sql.joins;

import com.facebook.presto.sql.tree.Relation;

public interface JoinRecipe {
  public boolean isValid();
  public Relation render();
  public String getComparisonPrefix(int index);
  public String getAggregationPrefix();
}
