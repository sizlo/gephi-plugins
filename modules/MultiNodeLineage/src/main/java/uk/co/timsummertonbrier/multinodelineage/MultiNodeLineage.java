package uk.co.timsummertonbrier.multinodelineage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.gephi.graph.api.GraphModel;
import org.gephi.statistics.spi.Statistics;

public class MultiNodeLineage implements Statistics {
    
    private List<String> originNodeIds = new ArrayList<>();
    
    @Override
    public void execute(GraphModel graphModel) {
        
    }
    
    @Override
    public String getReport() {
        return originNodeIds.stream().collect(Collectors.joining("\n"));
    }
    
    public void setOriginNodeIds(List<String> originNodeIds) {
        this.originNodeIds = originNodeIds;
    }
}