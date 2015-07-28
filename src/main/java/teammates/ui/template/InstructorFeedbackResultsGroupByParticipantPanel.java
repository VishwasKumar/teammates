package teammates.ui.template;

import java.util.List;
import java.util.Map;

import teammates.common.datatransfer.FeedbackResponseAttributes;

/**
 * Data model for the giver panel in InstructorFeedbackResults for Giver > Recipient > Question,
 * and for the recipient panel in Recipient > Giver > Question 
 * 
 */
public class InstructorFeedbackResultsGroupByParticipantPanel extends InstructorFeedbackResultsParticipantPanel {
   private Map<String, InstructorFeedbackResultsModerationButton> moderationButtons;
   private List<FeedbackResponseAttributes> responses;
    
}
