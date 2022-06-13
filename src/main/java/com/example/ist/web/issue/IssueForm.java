package com.example.ist.web.issue;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class IssueForm {
    @NotBlank(message = "Can't be blank!")
    @Size(max=256, message = "Maximum size is 256!")
    private String summary;
    @NotBlank(message = "Can't be blank!")
    @Size(max=256, message = "Maximum size is 256!")
    private String description;

}
