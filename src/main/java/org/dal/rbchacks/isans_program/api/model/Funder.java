package org.dal.rbchacks.isans_program.api.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "Funder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funder {
    @Id
    private String id;
    private String nameOfEntity;
    private Date startDate;
    private Date endDate;
    private Boolean isForever;
}
