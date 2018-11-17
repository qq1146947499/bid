package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PtRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultIsNull() {
            addCriterion("is_college_defsult is null");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultIsNotNull() {
            addCriterion("is_college_defsult is not null");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultEqualTo(String value) {
            addCriterion("is_college_defsult =", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultNotEqualTo(String value) {
            addCriterion("is_college_defsult <>", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultGreaterThan(String value) {
            addCriterion("is_college_defsult >", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultGreaterThanOrEqualTo(String value) {
            addCriterion("is_college_defsult >=", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultLessThan(String value) {
            addCriterion("is_college_defsult <", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultLessThanOrEqualTo(String value) {
            addCriterion("is_college_defsult <=", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultLike(String value) {
            addCriterion("is_college_defsult like", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultNotLike(String value) {
            addCriterion("is_college_defsult not like", value, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultIn(List<String> values) {
            addCriterion("is_college_defsult in", values, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultNotIn(List<String> values) {
            addCriterion("is_college_defsult not in", values, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultBetween(String value1, String value2) {
            addCriterion("is_college_defsult between", value1, value2, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsCollegeDefsultNotBetween(String value1, String value2) {
            addCriterion("is_college_defsult not between", value1, value2, "isCollegeDefsult");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditIsNull() {
            addCriterion("is_first_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditIsNotNull() {
            addCriterion("is_first_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditEqualTo(String value) {
            addCriterion("is_first_audit =", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditNotEqualTo(String value) {
            addCriterion("is_first_audit <>", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditGreaterThan(String value) {
            addCriterion("is_first_audit >", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditGreaterThanOrEqualTo(String value) {
            addCriterion("is_first_audit >=", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditLessThan(String value) {
            addCriterion("is_first_audit <", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditLessThanOrEqualTo(String value) {
            addCriterion("is_first_audit <=", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditLike(String value) {
            addCriterion("is_first_audit like", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditNotLike(String value) {
            addCriterion("is_first_audit not like", value, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditIn(List<String> values) {
            addCriterion("is_first_audit in", values, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditNotIn(List<String> values) {
            addCriterion("is_first_audit not in", values, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditBetween(String value1, String value2) {
            addCriterion("is_first_audit between", value1, value2, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsFirstAuditNotBetween(String value1, String value2) {
            addCriterion("is_first_audit not between", value1, value2, "isFirstAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditIsNull() {
            addCriterion("is_second_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditIsNotNull() {
            addCriterion("is_second_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditEqualTo(String value) {
            addCriterion("is_second_audit =", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditNotEqualTo(String value) {
            addCriterion("is_second_audit <>", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditGreaterThan(String value) {
            addCriterion("is_second_audit >", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditGreaterThanOrEqualTo(String value) {
            addCriterion("is_second_audit >=", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditLessThan(String value) {
            addCriterion("is_second_audit <", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditLessThanOrEqualTo(String value) {
            addCriterion("is_second_audit <=", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditLike(String value) {
            addCriterion("is_second_audit like", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditNotLike(String value) {
            addCriterion("is_second_audit not like", value, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditIn(List<String> values) {
            addCriterion("is_second_audit in", values, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditNotIn(List<String> values) {
            addCriterion("is_second_audit not in", values, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditBetween(String value1, String value2) {
            addCriterion("is_second_audit between", value1, value2, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsSecondAuditNotBetween(String value1, String value2) {
            addCriterion("is_second_audit not between", value1, value2, "isSecondAudit");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIsNull() {
            addCriterion("is_company is null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIsNotNull() {
            addCriterion("is_company is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompanyEqualTo(String value) {
            addCriterion("is_company =", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotEqualTo(String value) {
            addCriterion("is_company <>", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyGreaterThan(String value) {
            addCriterion("is_company >", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("is_company >=", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLessThan(String value) {
            addCriterion("is_company <", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLessThanOrEqualTo(String value) {
            addCriterion("is_company <=", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyLike(String value) {
            addCriterion("is_company like", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotLike(String value) {
            addCriterion("is_company not like", value, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyIn(List<String> values) {
            addCriterion("is_company in", values, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotIn(List<String> values) {
            addCriterion("is_company not in", values, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyBetween(String value1, String value2) {
            addCriterion("is_company between", value1, value2, "isCompany");
            return (Criteria) this;
        }

        public Criteria andIsCompanyNotBetween(String value1, String value2) {
            addCriterion("is_company not between", value1, value2, "isCompany");
            return (Criteria) this;
        }

        public Criteria andPtTypeIsNull() {
            addCriterion("pt_type is null");
            return (Criteria) this;
        }

        public Criteria andPtTypeIsNotNull() {
            addCriterion("pt_type is not null");
            return (Criteria) this;
        }

        public Criteria andPtTypeEqualTo(String value) {
            addCriterion("pt_type =", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotEqualTo(String value) {
            addCriterion("pt_type <>", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeGreaterThan(String value) {
            addCriterion("pt_type >", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pt_type >=", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLessThan(String value) {
            addCriterion("pt_type <", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLessThanOrEqualTo(String value) {
            addCriterion("pt_type <=", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeLike(String value) {
            addCriterion("pt_type like", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotLike(String value) {
            addCriterion("pt_type not like", value, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeIn(List<String> values) {
            addCriterion("pt_type in", values, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotIn(List<String> values) {
            addCriterion("pt_type not in", values, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeBetween(String value1, String value2) {
            addCriterion("pt_type between", value1, value2, "ptType");
            return (Criteria) this;
        }

        public Criteria andPtTypeNotBetween(String value1, String value2) {
            addCriterion("pt_type not between", value1, value2, "ptType");
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

        public Criteria andCreateUseridEqualTo(Integer value) {
            addCriterion("create_userid =", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotEqualTo(Integer value) {
            addCriterion("create_userid <>", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThan(Integer value) {
            addCriterion("create_userid >", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_userid >=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThan(Integer value) {
            addCriterion("create_userid <", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("create_userid <=", value, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridIn(List<Integer> values) {
            addCriterion("create_userid in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotIn(List<Integer> values) {
            addCriterion("create_userid not in", values, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridBetween(Integer value1, Integer value2) {
            addCriterion("create_userid between", value1, value2, "createUserid");
            return (Criteria) this;
        }

        public Criteria andCreateUseridNotBetween(Integer value1, Integer value2) {
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