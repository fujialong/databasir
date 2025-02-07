/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private String        name;
    private String        description;
    private Boolean       deleted;
    private LocalDateTime updateAt;
    private LocalDateTime createAt;

    public GroupPojo() {}

    public GroupPojo(GroupPojo value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.deleted = value.deleted;
        this.updateAt = value.updateAt;
        this.createAt = value.createAt;
    }

    public GroupPojo(
        Integer       id,
        String        name,
        String        description,
        Boolean       deleted,
        LocalDateTime updateAt,
        LocalDateTime createAt
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.deleted = deleted;
        this.updateAt = updateAt;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>databasir.group.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>databasir.group.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>databasir.group.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>databasir.group.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>databasir.group.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>databasir.group.description</code>.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for <code>databasir.group.deleted</code>.
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * Setter for <code>databasir.group.deleted</code>.
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for <code>databasir.group.update_at</code>.
     */
    public LocalDateTime getUpdateAt() {
        return this.updateAt;
    }

    /**
     * Setter for <code>databasir.group.update_at</code>.
     */
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * Getter for <code>databasir.group.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>databasir.group.create_at</code>.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GroupPojo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(deleted);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
