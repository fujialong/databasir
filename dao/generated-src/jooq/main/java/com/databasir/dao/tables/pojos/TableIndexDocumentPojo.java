/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.JSON;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableIndexDocumentPojo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer       id;
    private Integer       tableDocumentId;
    private Integer       databaseDocumentId;
    private String        name;
    private Boolean       isPrimary;
    private Boolean       isUnique;
    private JSON          columnNameArray;
    private LocalDateTime createAt;

    public TableIndexDocumentPojo() {}

    public TableIndexDocumentPojo(TableIndexDocumentPojo value) {
        this.id = value.id;
        this.tableDocumentId = value.tableDocumentId;
        this.databaseDocumentId = value.databaseDocumentId;
        this.name = value.name;
        this.isPrimary = value.isPrimary;
        this.isUnique = value.isUnique;
        this.columnNameArray = value.columnNameArray;
        this.createAt = value.createAt;
    }

    public TableIndexDocumentPojo(
        Integer       id,
        Integer       tableDocumentId,
        Integer       databaseDocumentId,
        String        name,
        Boolean       isPrimary,
        Boolean       isUnique,
        JSON          columnNameArray,
        LocalDateTime createAt
    ) {
        this.id = id;
        this.tableDocumentId = tableDocumentId;
        this.databaseDocumentId = databaseDocumentId;
        this.name = name;
        this.isPrimary = isPrimary;
        this.isUnique = isUnique;
        this.columnNameArray = columnNameArray;
        this.createAt = createAt;
    }

    /**
     * Getter for <code>databasir.table_index_document.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>databasir.table_index_document.id</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>databasir.table_index_document.table_document_id</code>.
     */
    public Integer getTableDocumentId() {
        return this.tableDocumentId;
    }

    /**
     * Setter for <code>databasir.table_index_document.table_document_id</code>.
     */
    public void setTableDocumentId(Integer tableDocumentId) {
        this.tableDocumentId = tableDocumentId;
    }

    /**
     * Getter for
     * <code>databasir.table_index_document.database_document_id</code>.
     */
    public Integer getDatabaseDocumentId() {
        return this.databaseDocumentId;
    }

    /**
     * Setter for
     * <code>databasir.table_index_document.database_document_id</code>.
     */
    public void setDatabaseDocumentId(Integer databaseDocumentId) {
        this.databaseDocumentId = databaseDocumentId;
    }

    /**
     * Getter for <code>databasir.table_index_document.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>databasir.table_index_document.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>databasir.table_index_document.is_primary</code>.
     */
    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * Setter for <code>databasir.table_index_document.is_primary</code>.
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * Getter for <code>databasir.table_index_document.is_unique</code>.
     */
    public Boolean getIsUnique() {
        return this.isUnique;
    }

    /**
     * Setter for <code>databasir.table_index_document.is_unique</code>.
     */
    public void setIsUnique(Boolean isUnique) {
        this.isUnique = isUnique;
    }

    /**
     * Getter for <code>databasir.table_index_document.column_name_array</code>.
     */
    public JSON getColumnNameArray() {
        return this.columnNameArray;
    }

    /**
     * Setter for <code>databasir.table_index_document.column_name_array</code>.
     */
    public void setColumnNameArray(JSON columnNameArray) {
        this.columnNameArray = columnNameArray;
    }

    /**
     * Getter for <code>databasir.table_index_document.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return this.createAt;
    }

    /**
     * Setter for <code>databasir.table_index_document.create_at</code>.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TableIndexDocumentPojo (");

        sb.append(id);
        sb.append(", ").append(tableDocumentId);
        sb.append(", ").append(databaseDocumentId);
        sb.append(", ").append(name);
        sb.append(", ").append(isPrimary);
        sb.append(", ").append(isUnique);
        sb.append(", ").append(columnNameArray);
        sb.append(", ").append(createAt);

        sb.append(")");
        return sb.toString();
    }
}
