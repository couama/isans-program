package org.dal.rbchacks.isans_program.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ImmigrantType")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImmigrantType {
@Id
    private String id;
    @Indexed(unique = true)
    private String typeName;
    private String status;

}
