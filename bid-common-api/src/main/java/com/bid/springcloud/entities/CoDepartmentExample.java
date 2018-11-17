package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoDepartmentExample() {
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

        public Criteria andCpCollegeIdIsNull() {
            addCriterion("cp__college_id is null");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdIsNotNull() {
            addCriterion("cp__college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdEqualTo(Integer value) {
            addCriterion("cp__college_id =", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdNotEqualTo(Integer value) {
            addCriterion("cp__college_id <>", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdGreaterThan(Integer value) {
            addCriterion("cp__college_id >", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cp__college_id >=", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdLessThan(Integer value) {
            addCriterion("cp__college_id <", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cp__college_id <=", value, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdIn(List<Integer> values) {
            addCriterion("cp__college_id in", values, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdNotIn(List<Integer> values) {
            addCriterion("cp__college_id not in", values, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("cp__college_id between", value1, value2, "cpCollegeId");
            return (Criteria) this;
        }

        public Criteria andCpCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cp__college_id not between", value1, value2, "cpCollegeId");
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

        public Criteria andIsDxCenter3IsNull() {
            addCriterion("is_dx_center3 is null");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3IsNotNull() {
            addCriterion("is_dx_center3 is not null");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3EqualTo(String value) {
            addCriterion("is_dx_center3 =", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3NotEqualTo(String value) {
            addCriterion("is_dx_center3 <>", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3GreaterThan(String value) {
            addCriterion("is_dx_center3 >", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3GreaterThanOrEqualTo(String value) {
            addCriterion("is_dx_center3 >=", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3LessThan(String value) {
            addCriterion("is_dx_center3 <", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3LessThanOrEqualTo(String value) {
            addCriterion("is_dx_center3 <=", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3Like(String value) {
            addCriterion("is_dx_center3 like", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3NotLike(String value) {
            addCriterion("is_dx_center3 not like", value, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3In(List<String> values) {
            addCriterion("is_dx_center3 in", values, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3NotIn(List<String> values) {
            addCriterion("is_dx_center3 not in", values, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3Between(String value1, String value2) {
            addCriterion("is_dx_center3 between", value1, value2, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCenter3NotBetween(String value1, String value2) {
            addCriterion("is_dx_center3 not between", value1, value2, "isDxCenter3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3IsNull() {
            addCriterion("is_dx_college3 is null");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3IsNotNull() {
            addCriterion("is_dx_college3 is not null");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3EqualTo(String value) {
            addCriterion("is_dx_college3 =", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3NotEqualTo(String value) {
            addCriterion("is_dx_college3 <>", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3GreaterThan(String value) {
            addCriterion("is_dx_college3 >", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3GreaterThanOrEqualTo(String value) {
            addCriterion("is_dx_college3 >=", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3LessThan(String value) {
            addCriterion("is_dx_college3 <", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3LessThanOrEqualTo(String value) {
            addCriterion("is_dx_college3 <=", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3Like(String value) {
            addCriterion("is_dx_college3 like", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3NotLike(String value) {
            addCriterion("is_dx_college3 not like", value, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3In(List<String> values) {
            addCriterion("is_dx_college3 in", values, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3NotIn(List<String> values) {
            addCriterion("is_dx_college3 not in", values, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3Between(String value1, String value2) {
            addCriterion("is_dx_college3 between", value1, value2, "isDxCollege3");
            return (Criteria) this;
        }

        public Criteria andIsDxCollege3NotBetween(String value1, String value2) {
            addCriterion("is_dx_college3 not between", value1, value2, "isDxCollege3");
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

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
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