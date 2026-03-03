package com.example.tickets;

public class TicketService {

    public IncidentTicket createTicket(String id,
                                       String reporterEmail,
                                       String title) {

        return new IncidentTicket.Builder(id, reporterEmail, title)
                .priority("MEDIUM")
                .source("CLI")
                .customerVisible(false)
                .addTag("NEW")
                .build();
    }

    public IncidentTicket escalateToCritical(IncidentTicket oldTicket) {

        return new IncidentTicket.Builder(
                oldTicket.getId(),
                oldTicket.getReporterEmail(),
                oldTicket.getTitle()
        )
                .description(oldTicket.getDescription())
                .assigneeEmail(oldTicket.getAssigneeEmail())
                .customerVisible(oldTicket.isCustomerVisible())
                .slaMinutes(oldTicket.getSlaMinutes())
                .source(oldTicket.getSource())
                .priority("CRITICAL")
                .tags(oldTicket.getTags())
                .addTag("ESCALATED")
                .build();
    }

    public IncidentTicket assign(IncidentTicket oldTicket,
                                 String assigneeEmail) {

        if (assigneeEmail != null && !assigneeEmail.contains("@")) {
            throw new IllegalArgumentException("assigneeEmail invalid");
        }

        return new IncidentTicket.Builder(
                oldTicket.getId(),
                oldTicket.getReporterEmail(),
                oldTicket.getTitle()
        )
                .description(oldTicket.getDescription())
                .priority(oldTicket.getPriority())
                .tags(oldTicket.getTags())
                .customerVisible(oldTicket.isCustomerVisible())
                .slaMinutes(oldTicket.getSlaMinutes())
                .source(oldTicket.getSource())
                .assigneeEmail(assigneeEmail)
                .build();
    }
}