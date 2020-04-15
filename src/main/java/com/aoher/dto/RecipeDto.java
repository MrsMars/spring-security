package com.aoher.dto;

import com.aoher.model.PeopleGroup;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;

import static com.aoher.util.Constants.LOCAL_DATE_FORMAT;

/**
 * DTO for modelmapper of Recipe
 */
@Data
@ApiModel
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecipeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "The database generated recipe ID")
    private Long rcpId;

    @ApiModelProperty(value = "The recipe name", required = true)
    @NotNull
    private String rcpName;

    @ApiModelProperty(value = "The recipe ingredient description")
    private String rcpIngredientDescription;

    @ApiModelProperty(value = "The recipe cooking instruction")
    private String rcpCookingInstruction;

    @ApiModelProperty(value = "The recipe image path")
    private String rcpImagePath;

    @ApiModelProperty(value = "Is the recipe vegetarian")
    private Boolean rcpIsVegetarian;

    @ApiModelProperty(value = "The database generated product ID",
            allowableValues = "LESSTHANFIVE,FIVETOTEN,MORETHANTEN")
    private PeopleGroup rcpSuitableFor;

    @ApiModelProperty(value = "The user who created the recipe")
    private Long rcpCreatedBy;

    @ApiModelProperty(value = "Time at which recipe was created")
    @JsonFormat(pattern = LOCAL_DATE_FORMAT)
    private LocalDateTime rcpCreatedAt;

    @ApiModelProperty(value = "The user who updated the recipe")
    private Long rcpUpdatedBy;

    @ApiModelProperty(value = "Time at which recipe was updated")
    @JsonFormat(pattern = LOCAL_DATE_FORMAT)
    private LocalDateTime rcpUpdatedAt;

    @ApiModelProperty(value = "If -1 consider  this  recipe deleted", allowableValues = "1,-1")
    private Integer rcpRowState;

}
