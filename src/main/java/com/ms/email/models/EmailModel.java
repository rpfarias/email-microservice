package com.ms.email.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;

    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;

    @JsonFormat(pattern = "dd/MM/yyyy hh:mm")
    private LocalDateTime sendDateEmail;

    private StatusEmail statusEmail;
}
