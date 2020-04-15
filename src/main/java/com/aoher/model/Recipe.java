package com.aoher.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import static com.aoher.util.Constants.LOCAL_DATE_FORMAT;

@Entity
@Table(
        name = "recipes"
)
public class Recipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "rcpid",
            updatable = false,
            nullable = false
    )
    private Long rcpId;
    @NotNull
    @Column(
            name = "rcpname"
    )
    private String rcpName;
    @Lob
    @Column(
            name = "rcpingredientdescription"
    )
    private String rcpIngredientDescription;
    @Lob
    @Column(
            name = "rcpcookinginstruction"
    )
    private String rcpCookingInstruction;
    @Column(
            name = "rcpimagepath"
    )
    private String rcpImagePath;
    @Column(
            name = "rcpisvegetarian"
    )
    private Boolean rcpIsVegetarian;
    @Column(
            name = "rcpsuitablefor"
    )
    private PeopleGroup rcpSuitableFor;
    @Column(
            name = "rcpcreatedby",
            updatable = false
    )
    private Long rcpCreatedBy;
    @Column(
            name = "rcpcreatedat",
            updatable = false
    )
    @JsonFormat(
            pattern = "dd-MM-yyyy HH:mm"
    )
    @CreationTimestamp
    private LocalDateTime rcpCreatedAt;
    @Column(
            name = "rcpupdatedby"
    )
    private Long rcpUpdatedBy;
    @Column(
            name = "rcpupdatedat"
    )
    @JsonFormat(
            pattern = "dd-MM-yyyy HH:mm"
    )
    @UpdateTimestamp
    private LocalDateTime rcpUpdatedAt;
    @Column(
            name = "rcprowstate"
    )
    private Integer rcpRowState;

    public static Recipe.RecipeBuilder builder() {
        return new Recipe.RecipeBuilder();
    }

    public Long getRcpId() {
        return this.rcpId;
    }

    public String getRcpName() {
        return this.rcpName;
    }

    public String getRcpIngredientDescription() {
        return this.rcpIngredientDescription;
    }

    public String getRcpCookingInstruction() {
        return this.rcpCookingInstruction;
    }

    public String getRcpImagePath() {
        return this.rcpImagePath;
    }

    public Boolean getRcpIsVegetarian() {
        return this.rcpIsVegetarian;
    }

    public PeopleGroup getRcpSuitableFor() {
        return this.rcpSuitableFor;
    }

    public Long getRcpCreatedBy() {
        return this.rcpCreatedBy;
    }

    public LocalDateTime getRcpCreatedAt() {
        return this.rcpCreatedAt;
    }

    public Long getRcpUpdatedBy() {
        return this.rcpUpdatedBy;
    }

    public LocalDateTime getRcpUpdatedAt() {
        return this.rcpUpdatedAt;
    }

    public Integer getRcpRowState() {
        return this.rcpRowState;
    }

    public void setRcpId(final Long rcpId) {
        this.rcpId = rcpId;
    }

    public void setRcpName(final String rcpName) {
        this.rcpName = rcpName;
    }

    public void setRcpIngredientDescription(final String rcpIngredientDescription) {
        this.rcpIngredientDescription = rcpIngredientDescription;
    }

    public void setRcpCookingInstruction(final String rcpCookingInstruction) {
        this.rcpCookingInstruction = rcpCookingInstruction;
    }

    public void setRcpImagePath(final String rcpImagePath) {
        this.rcpImagePath = rcpImagePath;
    }

    public void setRcpIsVegetarian(final Boolean rcpIsVegetarian) {
        this.rcpIsVegetarian = rcpIsVegetarian;
    }

    public void setRcpSuitableFor(final PeopleGroup rcpSuitableFor) {
        this.rcpSuitableFor = rcpSuitableFor;
    }

    public void setRcpCreatedBy(final Long rcpCreatedBy) {
        this.rcpCreatedBy = rcpCreatedBy;
    }

    public void setRcpCreatedAt(final LocalDateTime rcpCreatedAt) {
        this.rcpCreatedAt = rcpCreatedAt;
    }

    public void setRcpUpdatedBy(final Long rcpUpdatedBy) {
        this.rcpUpdatedBy = rcpUpdatedBy;
    }

    public void setRcpUpdatedAt(final LocalDateTime rcpUpdatedAt) {
        this.rcpUpdatedAt = rcpUpdatedAt;
    }

    public void setRcpRowState(final Integer rcpRowState) {
        this.rcpRowState = rcpRowState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(rcpId, recipe.rcpId) &&
                Objects.equals(rcpName, recipe.rcpName) &&
                Objects.equals(rcpIngredientDescription, recipe.rcpIngredientDescription) &&
                Objects.equals(rcpCookingInstruction, recipe.rcpCookingInstruction) &&
                Objects.equals(rcpImagePath, recipe.rcpImagePath) &&
                Objects.equals(rcpIsVegetarian, recipe.rcpIsVegetarian) &&
                rcpSuitableFor == recipe.rcpSuitableFor &&
                Objects.equals(rcpCreatedBy, recipe.rcpCreatedBy) &&
                Objects.equals(rcpCreatedAt, recipe.rcpCreatedAt) &&
                Objects.equals(rcpUpdatedBy, recipe.rcpUpdatedBy) &&
                Objects.equals(rcpUpdatedAt, recipe.rcpUpdatedAt) &&
                Objects.equals(rcpRowState, recipe.rcpRowState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rcpId, rcpName, rcpIngredientDescription, rcpCookingInstruction, rcpImagePath, rcpIsVegetarian, rcpSuitableFor, rcpCreatedBy, rcpCreatedAt, rcpUpdatedBy, rcpUpdatedAt, rcpRowState);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "rcpId=" + rcpId +
                ", rcpName='" + rcpName + '\'' +
                ", rcpIngredientDescription='" + rcpIngredientDescription + '\'' +
                ", rcpCookingInstruction='" + rcpCookingInstruction + '\'' +
                ", rcpImagePath='" + rcpImagePath + '\'' +
                ", rcpIsVegetarian=" + rcpIsVegetarian +
                ", rcpSuitableFor=" + rcpSuitableFor +
                ", rcpCreatedBy=" + rcpCreatedBy +
                ", rcpCreatedAt=" + rcpCreatedAt +
                ", rcpUpdatedBy=" + rcpUpdatedBy +
                ", rcpUpdatedAt=" + rcpUpdatedAt +
                ", rcpRowState=" + rcpRowState +
                '}';
    }

    public Recipe(final Long rcpId, final String rcpName, final String rcpIngredientDescription, final String rcpCookingInstruction, final String rcpImagePath, final Boolean rcpIsVegetarian, final PeopleGroup rcpSuitableFor, final Long rcpCreatedBy, final LocalDateTime rcpCreatedAt, final Long rcpUpdatedBy, final LocalDateTime rcpUpdatedAt, final Integer rcpRowState) {
        this.rcpId = rcpId;
        this.rcpName = rcpName;
        this.rcpIngredientDescription = rcpIngredientDescription;
        this.rcpCookingInstruction = rcpCookingInstruction;
        this.rcpImagePath = rcpImagePath;
        this.rcpIsVegetarian = rcpIsVegetarian;
        this.rcpSuitableFor = rcpSuitableFor;
        this.rcpCreatedBy = rcpCreatedBy;
        this.rcpCreatedAt = rcpCreatedAt;
        this.rcpUpdatedBy = rcpUpdatedBy;
        this.rcpUpdatedAt = rcpUpdatedAt;
        this.rcpRowState = rcpRowState;
    }

    public Recipe() {
    }

    public static class RecipeBuilder {
        private Long rcpId;
        private String rcpName;
        private String rcpIngredientDescription;
        private String rcpCookingInstruction;
        private String rcpImagePath;
        private Boolean rcpIsVegetarian;
        private PeopleGroup rcpSuitableFor;
        private Long rcpCreatedBy;
        private LocalDateTime rcpCreatedAt;
        private Long rcpUpdatedBy;
        private LocalDateTime rcpUpdatedAt;
        private Integer rcpRowState;

        RecipeBuilder() {
        }

        public Recipe.RecipeBuilder rcpId(final Long rcpId) {
            this.rcpId = rcpId;
            return this;
        }

        public Recipe.RecipeBuilder rcpName(final String rcpName) {
            this.rcpName = rcpName;
            return this;
        }

        public Recipe.RecipeBuilder rcpIngredientDescription(final String rcpIngredientDescription) {
            this.rcpIngredientDescription = rcpIngredientDescription;
            return this;
        }

        public Recipe.RecipeBuilder rcpCookingInstruction(final String rcpCookingInstruction) {
            this.rcpCookingInstruction = rcpCookingInstruction;
            return this;
        }

        public Recipe.RecipeBuilder rcpImagePath(final String rcpImagePath) {
            this.rcpImagePath = rcpImagePath;
            return this;
        }

        public Recipe.RecipeBuilder rcpIsVegetarian(final Boolean rcpIsVegetarian) {
            this.rcpIsVegetarian = rcpIsVegetarian;
            return this;
        }

        public Recipe.RecipeBuilder rcpSuitableFor(final PeopleGroup rcpSuitableFor) {
            this.rcpSuitableFor = rcpSuitableFor;
            return this;
        }

        public Recipe.RecipeBuilder rcpCreatedBy(final Long rcpCreatedBy) {
            this.rcpCreatedBy = rcpCreatedBy;
            return this;
        }

        public Recipe.RecipeBuilder rcpCreatedAt(final LocalDateTime rcpCreatedAt) {
            this.rcpCreatedAt = rcpCreatedAt;
            return this;
        }

        public Recipe.RecipeBuilder rcpUpdatedBy(final Long rcpUpdatedBy) {
            this.rcpUpdatedBy = rcpUpdatedBy;
            return this;
        }

        public Recipe.RecipeBuilder rcpUpdatedAt(final LocalDateTime rcpUpdatedAt) {
            this.rcpUpdatedAt = rcpUpdatedAt;
            return this;
        }

        public Recipe.RecipeBuilder rcpRowState(final Integer rcpRowState) {
            this.rcpRowState = rcpRowState;
            return this;
        }

        public Recipe build() {
            return new Recipe(this.rcpId, this.rcpName, this.rcpIngredientDescription, this.rcpCookingInstruction, this.rcpImagePath, this.rcpIsVegetarian, this.rcpSuitableFor, this.rcpCreatedBy, this.rcpCreatedAt, this.rcpUpdatedBy, this.rcpUpdatedAt, this.rcpRowState);
        }

        public String toString() {
            return "Recipe.RecipeBuilder(rcpId=" + this.rcpId + ", rcpName=" + this.rcpName + ", rcpIngredientDescription=" + this.rcpIngredientDescription + ", rcpCookingInstruction=" + this.rcpCookingInstruction + ", rcpImagePath=" + this.rcpImagePath + ", rcpIsVegetarian=" + this.rcpIsVegetarian + ", rcpSuitableFor=" + this.rcpSuitableFor + ", rcpCreatedBy=" + this.rcpCreatedBy + ", rcpCreatedAt=" + this.rcpCreatedAt + ", rcpUpdatedBy=" + this.rcpUpdatedBy + ", rcpUpdatedAt=" + this.rcpUpdatedAt + ", rcpRowState=" + this.rcpRowState + ")";
        }
    }
}
