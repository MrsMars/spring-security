package com.aoher.model;

/** Defines the no of people the recipe is suitable for. */
public enum PeopleGroup {
    LESSTHANFIVE(0),
    FIVETOTEN(1),
    MORETHANTEN(2);

    private int groupId;

    PeopleGroup(int groupId) {
        this.groupId = groupId;
    }

    /** @return the ageGroupId */
    public int getGroupId() {
        return groupId;
    }

    public String getGroupDescription() {
        switch (this) {
            case LESSTHANFIVE:
                return "< 5";
            case FIVETOTEN:
                return "5 - 10";
            case MORETHANTEN:
                return "> 10";
            default:
                return "-";
        }
    }
}