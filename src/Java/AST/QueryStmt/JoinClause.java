package Java.AST.QueryStmt;

import java.util.ArrayList;
import java.util.List;

public class JoinClause extends Statement{
    public List<FromItem> fromItems = new ArrayList<>();
    public List<JoinConstraint> joinConstraints = new ArrayList<>();
    public String joinOperator = null;
}
