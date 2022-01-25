/*
 * This file is generated by jOOQ.
 */
package com.databasir.dao.tables.records;


import com.databasir.dao.tables.User;
import com.databasir.dao.tables.pojos.UserPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record9<Integer, String, String, String, String, String, Boolean, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>databasir.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>databasir.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>databasir.user.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>databasir.user.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>databasir.user.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>databasir.user.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>databasir.user.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>databasir.user.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>databasir.user.nickname</code>.
     */
    public void setNickname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>databasir.user.nickname</code>.
     */
    public String getNickname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>databasir.user.avatar</code>.
     */
    public void setAvatar(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>databasir.user.avatar</code>.
     */
    public String getAvatar() {
        return (String) get(5);
    }

    /**
     * Setter for <code>databasir.user.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>databasir.user.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>databasir.user.update_at</code>.
     */
    public void setUpdateAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>databasir.user.update_at</code>.
     */
    public LocalDateTime getUpdateAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>databasir.user.create_at</code>.
     */
    public void setCreateAt(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>databasir.user.create_at</code>.
     */
    public LocalDateTime getCreateAt() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, String, Boolean, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, String, String, String, Boolean, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.EMAIL;
    }

    @Override
    public Field<String> field3() {
        return User.USER.USERNAME;
    }

    @Override
    public Field<String> field4() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<String> field5() {
        return User.USER.NICKNAME;
    }

    @Override
    public Field<String> field6() {
        return User.USER.AVATAR;
    }

    @Override
    public Field<Boolean> field7() {
        return User.USER.ENABLED;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return User.USER.UPDATE_AT;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return User.USER.CREATE_AT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public String component3() {
        return getUsername();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public String component5() {
        return getNickname();
    }

    @Override
    public String component6() {
        return getAvatar();
    }

    @Override
    public Boolean component7() {
        return getEnabled();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdateAt();
    }

    @Override
    public LocalDateTime component9() {
        return getCreateAt();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public String value3() {
        return getUsername();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public String value5() {
        return getNickname();
    }

    @Override
    public String value6() {
        return getAvatar();
    }

    @Override
    public Boolean value7() {
        return getEnabled();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdateAt();
    }

    @Override
    public LocalDateTime value9() {
        return getCreateAt();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setNickname(value);
        return this;
    }

    @Override
    public UserRecord value6(String value) {
        setAvatar(value);
        return this;
    }

    @Override
    public UserRecord value7(Boolean value) {
        setEnabled(value);
        return this;
    }

    @Override
    public UserRecord value8(LocalDateTime value) {
        setUpdateAt(value);
        return this;
    }

    @Override
    public UserRecord value9(LocalDateTime value) {
        setCreateAt(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String email, String username, String password, String nickname, String avatar, Boolean enabled, LocalDateTime updateAt, LocalDateTime createAt) {
        super(User.USER);

        setId(id);
        setEmail(email);
        setUsername(username);
        setPassword(password);
        setNickname(nickname);
        setAvatar(avatar);
        setEnabled(enabled);
        setUpdateAt(updateAt);
        setCreateAt(createAt);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(UserPojo value) {
        super(User.USER);

        if (value != null) {
            setId(value.getId());
            setEmail(value.getEmail());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setNickname(value.getNickname());
            setAvatar(value.getAvatar());
            setEnabled(value.getEnabled());
            setUpdateAt(value.getUpdateAt());
            setCreateAt(value.getCreateAt());
        }
    }
}