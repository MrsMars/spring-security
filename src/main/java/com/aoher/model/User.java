package com.aoher.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(
        name = "users"
)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "usrid",
            updatable = false,
            nullable = false
    )
    private Long usrId;
    @NotNull
    @NotEmpty
    @Column(
            name = "usrname",
            nullable = false
    )
    private String usrName;
    @NotNull
    @NotEmpty
    @Column(
            name = "usrloginid",
            unique = true,
            nullable = false
    )
    private String usrLoginId;
    @NotNull
    @NotEmpty
    @Column(
            name = "usrpassword",
            nullable = false
    )
    private String usrPassword;
    @Column(
            name = "usrisadmin"
    )
    private Boolean usrIsAdmin;
    @Column(
            name = "usrrowstate"
    )
    private Integer usrRowState;

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public Long getUsrId() {
        return this.usrId;
    }

    public String getUsrName() {
        return this.usrName;
    }

    public String getUsrLoginId() {
        return this.usrLoginId;
    }

    public String getUsrPassword() {
        return this.usrPassword;
    }

    public Boolean getUsrIsAdmin() {
        return this.usrIsAdmin;
    }

    public Integer getUsrRowState() {
        return this.usrRowState;
    }

    public void setUsrId(final Long usrId) {
        this.usrId = usrId;
    }

    public void setUsrName(final String usrName) {
        this.usrName = usrName;
    }

    public void setUsrLoginId(final String usrLoginId) {
        this.usrLoginId = usrLoginId;
    }

    public void setUsrPassword(final String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public void setUsrIsAdmin(final Boolean usrIsAdmin) {
        this.usrIsAdmin = usrIsAdmin;
    }

    public void setUsrRowState(final Integer usrRowState) {
        this.usrRowState = usrRowState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(usrId, user.usrId) &&
                Objects.equals(usrName, user.usrName) &&
                Objects.equals(usrLoginId, user.usrLoginId) &&
                Objects.equals(usrPassword, user.usrPassword) &&
                Objects.equals(usrIsAdmin, user.usrIsAdmin) &&
                Objects.equals(usrRowState, user.usrRowState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usrId, usrName, usrLoginId, usrPassword, usrIsAdmin, usrRowState);
    }

    @Override
    public String toString() {
        return "User{" +
                "usrId=" + usrId +
                ", usrName='" + usrName + '\'' +
                ", usrLoginId='" + usrLoginId + '\'' +
                ", usrPassword='" + usrPassword + '\'' +
                ", usrIsAdmin=" + usrIsAdmin +
                ", usrRowState=" + usrRowState +
                '}';
    }

    public User(final Long usrId, final String usrName, final String usrLoginId, final String usrPassword, final Boolean usrIsAdmin, final Integer usrRowState) {
        this.usrId = usrId;
        this.usrName = usrName;
        this.usrLoginId = usrLoginId;
        this.usrPassword = usrPassword;
        this.usrIsAdmin = usrIsAdmin;
        this.usrRowState = usrRowState;
    }

    public User() {
    }

    public static class UserBuilder {
        private Long usrId;
        private String usrName;
        private String usrLoginId;
        private String usrPassword;
        private Boolean usrIsAdmin;
        private Integer usrRowState;

        UserBuilder() {
        }

        public User.UserBuilder usrId(final Long usrId) {
            this.usrId = usrId;
            return this;
        }

        public User.UserBuilder usrName(final String usrName) {
            this.usrName = usrName;
            return this;
        }

        public User.UserBuilder usrLoginId(final String usrLoginId) {
            this.usrLoginId = usrLoginId;
            return this;
        }

        public User.UserBuilder usrPassword(final String usrPassword) {
            this.usrPassword = usrPassword;
            return this;
        }

        public User.UserBuilder usrIsAdmin(final Boolean usrIsAdmin) {
            this.usrIsAdmin = usrIsAdmin;
            return this;
        }

        public User.UserBuilder usrRowState(final Integer usrRowState) {
            this.usrRowState = usrRowState;
            return this;
        }

        public User build() {
            return new User(this.usrId, this.usrName, this.usrLoginId, this.usrPassword, this.usrIsAdmin, this.usrRowState);
        }

        public String toString() {
            return "User.UserBuilder(usrId=" + this.usrId + ", usrName=" + this.usrName + ", usrLoginId=" + this.usrLoginId + ", usrPassword=" + this.usrPassword + ", usrIsAdmin=" + this.usrIsAdmin + ", usrRowState=" + this.usrRowState + ")";
        }
    }
}
