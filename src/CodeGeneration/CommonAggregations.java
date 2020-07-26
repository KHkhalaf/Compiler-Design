package CodeGeneration;

import java.util.Comparator;
import java.util.List;

public final class CommonAggregations {
    public double Sum(List<Double> numbers){
        return numbers.
                stream().
                mapToDouble(Double::doubleValue)
                .sum();
    }

    public double Max(List<Double> numbers){
        return numbers.stream().max(Comparator.comparing(v -> v.doubleValue())).get();
    }

    public double Min(List<Double> numbers){
        return numbers.stream().min(Comparator.comparing(v -> v.doubleValue())).get();
    }

    public double Count(List<Double> numbers){
        return numbers.stream().count();
    }

    public double Avg(List<Double> numbers){
        return numbers.stream().mapToDouble(d -> d).average().orElse(0.1);
    }

    private static volatile CommonAggregations myCommonAggregator;

    private CommonAggregations(){
        if (myCommonAggregator != null) {
            throw new IllegalStateException("CommonAggregations object is already created!");
        }
    }

    public static CommonAggregations getCommonAggregations() {
        if(myCommonAggregator == null){
            synchronized(CommonAggregations.class) {
                if (myCommonAggregator == null) {
                    myCommonAggregator = new CommonAggregations();
                }
            }
        }
        return myCommonAggregator;
    }
}
