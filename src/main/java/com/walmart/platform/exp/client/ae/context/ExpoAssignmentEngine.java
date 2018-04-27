package com.walmart.platform.exp.client.ae.context;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;
import com.walmart.platform.exp.client.ae.metadata.model.ExpoAssignmentMetadata;

public class ExpoAssignmentEngine implements IExpoAssignmentEngine{
    
    @SuppressWarnings("serial")
    public Optional<AssignmentTreatment> getAssignmentTreatment(ExpoAssignmentMetadata expoAssignmentMetadata, String cid) throws Exception {        
        AssignmentTreatment treatment = new AssignmentTreatment();
        treatment.setAssignments("var1|var3");
        Map<String, String> map = new HashMap<String,String>()
                {
                    {
                        put("color","blue");
                        put("size","10");
                        put("unknown","default");
                    }
                };
        treatment.setTreatments(map);
        
        AssignmentTreatment other = new AssignmentTreatment();
        other.setAssignments("var2|var4");
        Map<String, String> otherMap = new HashMap<String,String>()
                {
                    {
                        put("size","100");
                        put("unknown","default");
                    }
                };
        other.setTreatments(otherMap);
        return "dle".equalsIgnoreCase(cid) ? Optional.of(treatment) : 
            "other".equalsIgnoreCase(cid) ? Optional.of(other) : Optional.ofNullable(new AssignmentTreatment());
    }

}
