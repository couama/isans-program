package org.dal.rbchacks.isans_program.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dal.rbchacks.isans_program.api.helper.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Location")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
@Id
    private String id;
    @Indexed(unique = true)
    private String location;
    private String status;
}
