package org.dal.rbchacks.isans_program.api.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "Funder")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funder {
    @Id
    private String id;
    @Indexed(unique = true)
    private String nameOfEntity;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date startDate;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm")
    private Date endDate;
    private Boolean isForever;
}
