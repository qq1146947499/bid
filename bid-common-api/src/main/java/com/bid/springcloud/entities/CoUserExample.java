package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-11-15
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNull() {
            addCriterion("user_account is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountIsNotNull() {
            addCriterion("user_account is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountEqualTo(String value) {
            addCriterion("user_account =", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotEqualTo(String value) {
            addCriterion("user_account <>", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThan(String value) {
            addCriterion("user_account >", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountGreaterThanOrEqualTo(String value) {
            addCriterion("user_account >=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThan(String value) {
            addCriterion("user_account <", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLessThanOrEqualTo(String value) {
            addCriterion("user_account <=", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountLike(String value) {
            addCriterion("user_account like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotLike(String value) {
            addCriterion("user_account not like", value, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountIn(List<String> values) {
            addCriterion("user_account in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotIn(List<String> values) {
            addCriterion("user_account not in", values, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountBetween(String value1, String value2) {
            addCriterion("user_account between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserAccountNotBetween(String value1, String value2) {
            addCriterion("user_account not between", value1, value2, "userAccount");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNull() {
            addCriterion("user_pass is null");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNotNull() {
            addCriterion("user_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassEqualTo(String value) {
            addCriterion("user_pass =", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("user_pass <>", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("user_pass >", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("user_pass >=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThan(String value) {
            addCriterion("user_pass <", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("user_pass <=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLike(String value) {
            addCriterion("user_pass like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotLike(String value) {
            addCriterion("user_pass not like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassIn(List<String> values) {
            addCriterion("user_pass in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("user_pass not in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("user_pass between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("user_pass not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("office_phone is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("office_phone =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("office_phone <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("office_phone >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("office_phone >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("office_phone <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("office_phone <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("office_phone like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("office_phone not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("office_phone in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("office_phone not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("office_phone between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("office_phone not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNull() {
            addCriterion("person_phone is null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIsNotNull() {
            addCriterion("person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneEqualTo(String value) {
            addCriterion("person_phone =", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotEqualTo(String value) {
            addCriterion("person_phone <>", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThan(String value) {
            addCriterion("person_phone >", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("person_phone >=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThan(String value) {
            addCriterion("person_phone <", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("person_phone <=", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneLike(String value) {
            addCriterion("person_phone like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotLike(String value) {
            addCriterion("person_phone not like", value, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneIn(List<String> values) {
            addCriterion("person_phone in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotIn(List<String> values) {
            addCriterion("person_phone not in", values, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneBetween(String value1, String value2) {
            addCriterion("person_phone between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("person_phone not between", value1, value2, "personPhone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNull() {
            addCriterion("last_logintime is null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIsNotNull() {
            addCriterion("last_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeEqualTo(Date value) {
            addCriterion("last_logintime =", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotEqualTo(Date value) {
            addCriterion("last_logintime <>", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThan(Date value) {
            addCriterion("last_logintime >", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_logintime >=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThan(Date value) {
            addCriterion("last_logintime <", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("last_logintime <=", value, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeIn(List<Date> values) {
            addCriterion("last_logintime in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotIn(List<Date> values) {
            addCriterion("last_logintime not in", values, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeBetween(Date value1, Date value2) {
            addCriterion("last_logintime between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andLastLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("last_logintime not between", value1, value2, "lastLogintime");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(String value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(String value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(String value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(String value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLike(String value) {
            addCriterion("college_id like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotLike(String value) {
            addCriterion("college_id not like", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<String> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<String> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(String value1, String value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(String value1, String value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("department_id like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("department_id not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNull() {
            addCriterion("auditor_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIsNotNull() {
            addCriterion("auditor_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeEqualTo(Date value) {
            addCriterion("auditor_time =", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotEqualTo(Date value) {
            addCriterion("auditor_time <>", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThan(Date value) {
            addCriterion("auditor_time >", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditor_time >=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThan(Date value) {
            addCriterion("auditor_time <", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeLessThanOrEqualTo(Date value) {
            addCriterion("auditor_time <=", value, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeIn(List<Date> values) {
            addCriterion("auditor_time in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotIn(List<Date> values) {
            addCriterion("auditor_time not in", values, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeBetween(Date value1, Date value2) {
            addCriterion("auditor_time between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andAuditorTimeNotBetween(Date value1, Date value2) {
            addCriterion("auditor_time not between", value1, value2, "auditorTime");
            return (Criteria) this;
        }

        public Criteria andApplyPrivIsNull() {
            addCriterion("apply_priv is null");
            return (Criteria) this;
        }

        public Criteria andApplyPrivIsNotNull() {
            addCriterion("apply_priv is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPrivEqualTo(String value) {
            addCriterion("apply_priv =", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivNotEqualTo(String value) {
            addCriterion("apply_priv <>", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivGreaterThan(String value) {
            addCriterion("apply_priv >", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivGreaterThanOrEqualTo(String value) {
            addCriterion("apply_priv >=", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivLessThan(String value) {
            addCriterion("apply_priv <", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivLessThanOrEqualTo(String value) {
            addCriterion("apply_priv <=", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivLike(String value) {
            addCriterion("apply_priv like", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivNotLike(String value) {
            addCriterion("apply_priv not like", value, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivIn(List<String> values) {
            addCriterion("apply_priv in", values, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivNotIn(List<String> values) {
            addCriterion("apply_priv not in", values, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivBetween(String value1, String value2) {
            addCriterion("apply_priv between", value1, value2, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyPrivNotBetween(String value1, String value2) {
            addCriterion("apply_priv not between", value1, value2, "applyPriv");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfIsNull() {
            addCriterion("apply_oneself is null");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfIsNotNull() {
            addCriterion("apply_oneself is not null");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfEqualTo(String value) {
            addCriterion("apply_oneself =", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfNotEqualTo(String value) {
            addCriterion("apply_oneself <>", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfGreaterThan(String value) {
            addCriterion("apply_oneself >", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfGreaterThanOrEqualTo(String value) {
            addCriterion("apply_oneself >=", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfLessThan(String value) {
            addCriterion("apply_oneself <", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfLessThanOrEqualTo(String value) {
            addCriterion("apply_oneself <=", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfLike(String value) {
            addCriterion("apply_oneself like", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfNotLike(String value) {
            addCriterion("apply_oneself not like", value, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfIn(List<String> values) {
            addCriterion("apply_oneself in", values, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfNotIn(List<String> values) {
            addCriterion("apply_oneself not in", values, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfBetween(String value1, String value2) {
            addCriterion("apply_oneself between", value1, value2, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andApplyOneselfNotBetween(String value1, String value2) {
            addCriterion("apply_oneself not between", value1, value2, "applyOneself");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNull() {
            addCriterion("create_userid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIsNotNull() {
            addCriterion("create_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUseridEqualTo(String value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(String value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(String value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(String value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(String value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLike(String value) {
            addCriterion("create_userid like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotLike(String value) {
            addCriterion("create_userid not like", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<String> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<String> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(String value1, String value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(String value1, String value2) {
            addCriterion("create_userid not between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameIsNull() {
            addCriterion("create_username is null");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameIsNotNull() {
            addCriterion("create_username is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameEqualTo(String value) {
            addCriterion("create_username =", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameNotEqualTo(String value) {
            addCriterion("create_username <>", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameGreaterThan(String value) {
            addCriterion("create_username >", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("create_username >=", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameLessThan(String value) {
            addCriterion("create_username <", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameLessThanOrEqualTo(String value) {
            addCriterion("create_username <=", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameLike(String value) {
            addCriterion("create_username like", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameNotLike(String value) {
            addCriterion("create_username not like", value, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameIn(List<String> values) {
            addCriterion("create_username in", values, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameNotIn(List<String> values) {
            addCriterion("create_username not in", values, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameBetween(String value1, String value2) {
            addCriterion("create_username between", value1, value2, "createUsername");
            return (Criteria) this;
        }

        public Criteria andCreateUsernameNotBetween(String value1, String value2) {
            addCriterion("create_username not between", value1, value2, "createUsername");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterIsNull() {
            addCriterion("is_dx_center is null");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterIsNotNull() {
            addCriterion("is_dx_center is not null");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterEqualTo(String value) {
            addCriterion("is_dx_center =", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterNotEqualTo(String value) {
            addCriterion("is_dx_center <>", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterGreaterThan(String value) {
            addCriterion("is_dx_center >", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterGreaterThanOrEqualTo(String value) {
            addCriterion("is_dx_center >=", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterLessThan(String value) {
            addCriterion("is_dx_center <", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterLessThanOrEqualTo(String value) {
            addCriterion("is_dx_center <=", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterLike(String value) {
            addCriterion("is_dx_center like", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterNotLike(String value) {
            addCriterion("is_dx_center not like", value, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterIn(List<String> values) {
            addCriterion("is_dx_center in", values, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterNotIn(List<String> values) {
            addCriterion("is_dx_center not in", values, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterBetween(String value1, String value2) {
            addCriterion("is_dx_center between", value1, value2, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCenterNotBetween(String value1, String value2) {
            addCriterion("is_dx_center not between", value1, value2, "isDxCenter");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeIsNull() {
            addCriterion("is_dx_college is null");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeIsNotNull() {
            addCriterion("is_dx_college is not null");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeEqualTo(String value) {
            addCriterion("is_dx_college =", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeNotEqualTo(String value) {
            addCriterion("is_dx_college <>", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeGreaterThan(String value) {
            addCriterion("is_dx_college >", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("is_dx_college >=", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeLessThan(String value) {
            addCriterion("is_dx_college <", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeLessThanOrEqualTo(String value) {
            addCriterion("is_dx_college <=", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeLike(String value) {
            addCriterion("is_dx_college like", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeNotLike(String value) {
            addCriterion("is_dx_college not like", value, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeIn(List<String> values) {
            addCriterion("is_dx_college in", values, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeNotIn(List<String> values) {
            addCriterion("is_dx_college not in", values, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeBetween(String value1, String value2) {
            addCriterion("is_dx_college between", value1, value2, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andIsDxCollegeNotBetween(String value1, String value2) {
            addCriterion("is_dx_college not between", value1, value2, "isDxCollege");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(String value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(String value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(String value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(String value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLike(String value) {
            addCriterion("last_update_time like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotLike(String value) {
            addCriterion("last_update_time not like", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<String> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<String> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(String value1, String value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridIsNull() {
            addCriterion("last_update_userid is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridIsNotNull() {
            addCriterion("last_update_userid is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridEqualTo(String value) {
            addCriterion("last_update_userid =", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridNotEqualTo(String value) {
            addCriterion("last_update_userid <>", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridGreaterThan(String value) {
            addCriterion("last_update_userid >", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_userid >=", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridLessThan(String value) {
            addCriterion("last_update_userid <", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridLessThanOrEqualTo(String value) {
            addCriterion("last_update_userid <=", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridLike(String value) {
            addCriterion("last_update_userid like", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridNotLike(String value) {
            addCriterion("last_update_userid not like", value, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridIn(List<String> values) {
            addCriterion("last_update_userid in", values, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridNotIn(List<String> values) {
            addCriterion("last_update_userid not in", values, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridBetween(String value1, String value2) {
            addCriterion("last_update_userid between", value1, value2, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUseridNotBetween(String value1, String value2) {
            addCriterion("last_update_userid not between", value1, value2, "lastUpdateUserid");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameIsNull() {
            addCriterion("last_update_username is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameIsNotNull() {
            addCriterion("last_update_username is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameEqualTo(String value) {
            addCriterion("last_update_username =", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameNotEqualTo(String value) {
            addCriterion("last_update_username <>", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameGreaterThan(String value) {
            addCriterion("last_update_username >", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("last_update_username >=", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameLessThan(String value) {
            addCriterion("last_update_username <", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameLessThanOrEqualTo(String value) {
            addCriterion("last_update_username <=", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameLike(String value) {
            addCriterion("last_update_username like", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameNotLike(String value) {
            addCriterion("last_update_username not like", value, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameIn(List<String> values) {
            addCriterion("last_update_username in", values, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameNotIn(List<String> values) {
            addCriterion("last_update_username not in", values, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameBetween(String value1, String value2) {
            addCriterion("last_update_username between", value1, value2, "lastUpdateUsername");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUsernameNotBetween(String value1, String value2) {
            addCriterion("last_update_username not between", value1, value2, "lastUpdateUsername");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2018-11-15
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}