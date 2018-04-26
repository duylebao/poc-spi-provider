package com.walmart.platform.exp.client.ae.context;

import com.walmart.platform.exp.client.ae.context.model.AssignmentTreatment;

public class AssignmentTransformation implements IPostAssignment{

    public void execute(AssignmentTreatment treatment, Context ctx) {
        String assignments = "xpa=" + (treatment.getAssignments() == null ? "" : treatment.getAssignments());
        treatment.setAssignments( assignments );
    }

}
