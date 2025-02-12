/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables;


import com.databasir.dao.Databasir;
import com.databasir.dao.Keys;
import com.databasir.dao.tables.records.LoginRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Login extends TableImpl<LoginRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>databasir.login</code>
     */
    public static final Login LOGIN = new Login();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoginRecord> getRecordType() {
        return LoginRecord.class;
    }

    /**
     * The column <code>databasir.login.id</code>.
     */
    public final TableField<LoginRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>databasir.login.user_id</code>.
     */
    public final TableField<LoginRecord, Integer> USER_ID = createField(DSL.name("user_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>databasir.login.access_token</code>.
     */
    public final TableField<LoginRecord, String> ACCESS_TOKEN = createField(DSL.name("access_token"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>databasir.login.refresh_token</code>.
     */
    public final TableField<LoginRecord, String> REFRESH_TOKEN = createField(DSL.name("refresh_token"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>databasir.login.access_token_expire_at</code>.
     */
    public final TableField<LoginRecord, LocalDateTime> ACCESS_TOKEN_EXPIRE_AT = createField(DSL.name("access_token_expire_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>databasir.login.refresh_token_expire_at</code>.
     */
    public final TableField<LoginRecord, LocalDateTime> REFRESH_TOKEN_EXPIRE_AT = createField(DSL.name("refresh_token_expire_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>databasir.login.update_at</code>.
     */
    public final TableField<LoginRecord, LocalDateTime> UPDATE_AT = createField(DSL.name("update_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>databasir.login.create_at</code>.
     */
    public final TableField<LoginRecord, LocalDateTime> CREATE_AT = createField(DSL.name("create_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private Login(Name alias, Table<LoginRecord> aliased) {
        this(alias, aliased, null);
    }

    private Login(Name alias, Table<LoginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>databasir.login</code> table reference
     */
    public Login(String alias) {
        this(DSL.name(alias), LOGIN);
    }

    /**
     * Create an aliased <code>databasir.login</code> table reference
     */
    public Login(Name alias) {
        this(alias, LOGIN);
    }

    /**
     * Create a <code>databasir.login</code> table reference
     */
    public Login() {
        this(DSL.name("login"), null);
    }

    public <O extends Record> Login(Table<O> child, ForeignKey<O, LoginRecord> key) {
        super(child, key, LOGIN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Databasir.DATABASIR;
    }

    @Override
    public Identity<LoginRecord, Integer> getIdentity() {
        return (Identity<LoginRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<LoginRecord> getPrimaryKey() {
        return Keys.KEY_LOGIN_PRIMARY;
    }

    @Override
    public List<UniqueKey<LoginRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_LOGIN_UK_USER_ID);
    }

    @Override
    public Login as(String alias) {
        return new Login(DSL.name(alias), this);
    }

    @Override
    public Login as(Name alias) {
        return new Login(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Login rename(String name) {
        return new Login(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Login rename(Name name) {
        return new Login(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, String, String, LocalDateTime, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
