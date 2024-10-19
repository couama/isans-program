package org.dal.rbchacks.isans_program.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dal.rbchacks.isans_program.api.helper.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.List;


@Document(collection = "Program")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Program {
    @Id
    private String id;
    private String name;
    private String description;
    private String deliveryMethod;
    private String status;
    private List<Funder> funders;
    private Date endDate;
    private List<Team> team;
    private  List<Location>geographicAvailability;
    private String literacyRequirement;
    private Date dateOfBirth; // to calculate Age Targeting
    private String genderTargeting;
    //Staff Member // no need saving this if we could integrate it to thier active directory
    private List<ImmigrantType> eligibility;

}