package com.manabie.todo.model.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.manabie.todo.entity.Todo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserTodoResponse implements Serializable {

    private static final long serialVersionUID = -4516672169828022295L;

    @SerializedName("id")
    @JsonProperty("id")
    @ApiModelProperty(example = "3d7a2dc5-e8b3-48c2-8e3d-b1ed7882a082")
    private String id = UUID.randomUUID().toString();

    @ApiModelProperty()
    @JsonProperty("maximum_task_per_day")
    @SerializedName("maximum_task_per_day")
    private Integer maximumTaskPerDay;

    @ApiModelProperty(example = "f667cfa2-5b51-4266-afde-8a5963ec7d2a")
    @JsonProperty("user_id")
    @SerializedName("user_id")
    private String createUserId;
}
