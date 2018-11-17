package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtUserExample() {
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
     * ƽ̨
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andIsSuperIsNull() {
            addCriterion("is_super is null");
            return (Criteria) this;
        }

        public Criteria andIsSuperIsNotNull() {
            addCriterion("is_super is not null");
            return (Criteria) this;
        }

        public Criteria andIsSuperEqualTo(String value) {
            addCriterion("is_super =", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotEqualTo(String value) {
            addCriterion("is_super <>", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThan(String value) {
            addCriterion("is_super >", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperGreaterThanOrEqualTo(String value) {
            addCriterion("is_super >=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThan(String value) {
            addCriterion("is_super <", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLessThanOrEqualTo(String value) {
            addCriterion("is_super <=", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperLike(String value) {
            addCriterion("is_super like", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotLike(String value) {
            addCriterion("is_super not like", value, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperIn(List<String> values) {
            addCriterion("is_super in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotIn(List<String> values) {
            addCriterion("is_super not in", values, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperBetween(String value1, String value2) {
            addCriterion("is_super between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andIsSuperNotBetween(String value1, String value2) {
            addCriterion("is_super not between", value1, value2, "isSuper");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("user_status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("user_status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNull() {
            addCriterion("college_name is null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIsNotNull() {
            addCriterion("college_name is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeNameEqualTo(String value) {
            addCriterion("college_name =", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotEqualTo(String value) {
            addCriterion("college_name <>", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThan(String value) {
            addCriterion("college_name >", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("college_name >=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThan(String value) {
            addCriterion("college_name <", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLessThanOrEqualTo(String value) {
            addCriterion("college_name <=", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameLike(String value) {
            addCriterion("college_name like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotLike(String value) {
            addCriterion("college_name not like", value, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameIn(List<String> values) {
            addCriterion("college_name in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotIn(List<String> values) {
            addCriterion("college_name not in", values, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameBetween(String value1, String value2) {
            addCriterion("college_name between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCollegeNameNotBetween(String value1, String value2) {
            addCriterion("college_name not between", value1, value2, "collegeName");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdIsNull() {
            addCriterion("co_department_id is null");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdIsNotNull() {
            addCriterion("co_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdEqualTo(String value) {
            addCriterion("co_department_id =", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdNotEqualTo(String value) {
            addCriterion("co_department_id <>", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdGreaterThan(String value) {
            addCriterion("co_department_id >", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("co_department_id >=", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdLessThan(String value) {
            addCriterion("co_department_id <", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("co_department_id <=", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdLike(String value) {
            addCriterion("co_department_id like", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdNotLike(String value) {
            addCriterion("co_department_id not like", value, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdIn(List<String> values) {
            addCriterion("co_department_id in", values, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdNotIn(List<String> values) {
            addCriterion("co_department_id not in", values, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdBetween(String value1, String value2) {
            addCriterion("co_department_id between", value1, value2, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCoDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("co_department_id not between", value1, value2, "coDepartmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andCompusIdIsNull() {
            addCriterion("compus_id is null");
            return (Criteria) this;
        }

        public Criteria andCompusIdIsNotNull() {
            addCriterion("compus_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompusIdEqualTo(Integer value) {
            addCriterion("compus_id =", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdNotEqualTo(Integer value) {
            addCriterion("compus_id <>", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdGreaterThan(Integer value) {
            addCriterion("compus_id >", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("compus_id >=", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdLessThan(Integer value) {
            addCriterion("compus_id <", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdLessThanOrEqualTo(Integer value) {
            addCriterion("compus_id <=", value, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdIn(List<Integer> values) {
            addCriterion("compus_id in", values, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdNotIn(List<Integer> values) {
            addCriterion("compus_id not in", values, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdBetween(Integer value1, Integer value2) {
            addCriterion("compus_id between", value1, value2, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("compus_id not between", value1, value2, "compusId");
            return (Criteria) this;
        }

        public Criteria andCompusNameIsNull() {
            addCriterion("compus_name is null");
            return (Criteria) this;
        }

        public Criteria andCompusNameIsNotNull() {
            addCriterion("compus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompusNameEqualTo(String value) {
            addCriterion("compus_name =", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameNotEqualTo(String value) {
            addCriterion("compus_name <>", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameGreaterThan(String value) {
            addCriterion("compus_name >", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameGreaterThanOrEqualTo(String value) {
            addCriterion("compus_name >=", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameLessThan(String value) {
            addCriterion("compus_name <", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameLessThanOrEqualTo(String value) {
            addCriterion("compus_name <=", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameLike(String value) {
            addCriterion("compus_name like", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameNotLike(String value) {
            addCriterion("compus_name not like", value, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameIn(List<String> values) {
            addCriterion("compus_name in", values, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameNotIn(List<String> values) {
            addCriterion("compus_name not in", values, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameBetween(String value1, String value2) {
            addCriterion("compus_name between", value1, value2, "compusName");
            return (Criteria) this;
        }

        public Criteria andCompusNameNotBetween(String value1, String value2) {
            addCriterion("compus_name not between", value1, value2, "compusName");
            return (Criteria) this;
        }

        public Criteria andInstitueIdIsNull() {
            addCriterion("institue_id is null");
            return (Criteria) this;
        }

        public Criteria andInstitueIdIsNotNull() {
            addCriterion("institue_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstitueIdEqualTo(Integer value) {
            addCriterion("institue_id =", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdNotEqualTo(Integer value) {
            addCriterion("institue_id <>", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdGreaterThan(Integer value) {
            addCriterion("institue_id >", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("institue_id >=", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdLessThan(Integer value) {
            addCriterion("institue_id <", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdLessThanOrEqualTo(Integer value) {
            addCriterion("institue_id <=", value, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdIn(List<Integer> values) {
            addCriterion("institue_id in", values, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdNotIn(List<Integer> values) {
            addCriterion("institue_id not in", values, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdBetween(Integer value1, Integer value2) {
            addCriterion("institue_id between", value1, value2, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("institue_id not between", value1, value2, "institueId");
            return (Criteria) this;
        }

        public Criteria andInstitueNameIsNull() {
            addCriterion("institue_name is null");
            return (Criteria) this;
        }

        public Criteria andInstitueNameIsNotNull() {
            addCriterion("institue_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstitueNameEqualTo(String value) {
            addCriterion("institue_name =", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameNotEqualTo(String value) {
            addCriterion("institue_name <>", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameGreaterThan(String value) {
            addCriterion("institue_name >", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameGreaterThanOrEqualTo(String value) {
            addCriterion("institue_name >=", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameLessThan(String value) {
            addCriterion("institue_name <", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameLessThanOrEqualTo(String value) {
            addCriterion("institue_name <=", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameLike(String value) {
            addCriterion("institue_name like", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameNotLike(String value) {
            addCriterion("institue_name not like", value, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameIn(List<String> values) {
            addCriterion("institue_name in", values, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameNotIn(List<String> values) {
            addCriterion("institue_name not in", values, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameBetween(String value1, String value2) {
            addCriterion("institue_name between", value1, value2, "institueName");
            return (Criteria) this;
        }

        public Criteria andInstitueNameNotBetween(String value1, String value2) {
            addCriterion("institue_name not between", value1, value2, "institueName");
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

        public Criteria andAuditUseridIsNull() {
            addCriterion("audit_userid is null");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIsNotNull() {
            addCriterion("audit_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUseridEqualTo(Integer value) {
            addCriterion("audit_userid =", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotEqualTo(Integer value) {
            addCriterion("audit_userid <>", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThan(Integer value) {
            addCriterion("audit_userid >", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_userid >=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThan(Integer value) {
            addCriterion("audit_userid <", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThanOrEqualTo(Integer value) {
            addCriterion("audit_userid <=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIn(List<Integer> values) {
            addCriterion("audit_userid in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotIn(List<Integer> values) {
            addCriterion("audit_userid not in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridBetween(Integer value1, Integer value2) {
            addCriterion("audit_userid between", value1, value2, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_userid not between", value1, value2, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameIsNull() {
            addCriterion("audit_username is null");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameIsNotNull() {
            addCriterion("audit_username is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameEqualTo(String value) {
            addCriterion("audit_username =", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotEqualTo(String value) {
            addCriterion("audit_username <>", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameGreaterThan(String value) {
            addCriterion("audit_username >", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_username >=", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLessThan(String value) {
            addCriterion("audit_username <", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLessThanOrEqualTo(String value) {
            addCriterion("audit_username <=", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameLike(String value) {
            addCriterion("audit_username like", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotLike(String value) {
            addCriterion("audit_username not like", value, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameIn(List<String> values) {
            addCriterion("audit_username in", values, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotIn(List<String> values) {
            addCriterion("audit_username not in", values, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameBetween(String value1, String value2) {
            addCriterion("audit_username between", value1, value2, "auditUsername");
            return (Criteria) this;
        }

        public Criteria andAuditUsernameNotBetween(String value1, String value2) {
            addCriterion("audit_username not between", value1, value2, "auditUsername");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * ƽ̨
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