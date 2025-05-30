package org.example.api.models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data

@Builder
public class Student {
    private String name;
    private int grade;
    @SerializedName("_id")
    private String id;

}
