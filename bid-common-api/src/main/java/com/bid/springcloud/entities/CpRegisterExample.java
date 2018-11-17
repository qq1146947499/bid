package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class CpRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpRegisterExample() {
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

        public Criteria andRegResourceIdIsNull() {
            addCriterion("reg_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdIsNotNull() {
            addCriterion("reg_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdEqualTo(String value) {
            addCriterion("reg_resource_id =", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotEqualTo(String value) {
            addCriterion("reg_resource_id <>", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdGreaterThan(String value) {
            addCriterion("reg_resource_id >", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_resource_id >=", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLessThan(String value) {
            addCriterion("reg_resource_id <", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLessThanOrEqualTo(String value) {
            addCriterion("reg_resource_id <=", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLike(String value) {
            addCriterion("reg_resource_id like", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotLike(String value) {
            addCriterion("reg_resource_id not like", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdIn(List<String> values) {
            addCriterion("reg_resource_id in", values, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotIn(List<String> values) {
            addCriterion("reg_resource_id not in", values, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdBetween(String value1, String value2) {
            addCriterion("reg_resource_id between", value1, value2, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotBetween(String value1, String value2) {
            addCriterion("reg_resource_id not between", value1, value2, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIsNull() {
            addCriterion("audit_college_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIsNotNull() {
            addCriterion("audit_college_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdEqualTo(String value) {
            addCriterion("audit_college_id =", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotEqualTo(String value) {
            addCriterion("audit_college_id <>", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdGreaterThan(String value) {
            addCriterion("audit_college_id >", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_college_id >=", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLessThan(String value) {
            addCriterion("audit_college_id <", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("audit_college_id <=", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLike(String value) {
            addCriterion("audit_college_id like", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotLike(String value) {
            addCriterion("audit_college_id not like", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIn(List<String> values) {
            addCriterion("audit_college_id in", values, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotIn(List<String> values) {
            addCriterion("audit_college_id not in", values, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdBetween(String value1, String value2) {
            addCriterion("audit_college_id between", value1, value2, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotBetween(String value1, String value2) {
            addCriterion("audit_college_id not between", value1, value2, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeIsNull() {
            addCriterion("Ainfo_type is null");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeIsNotNull() {
            addCriterion("Ainfo_type is not null");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeEqualTo(String value) {
            addCriterion("Ainfo_type =", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeNotEqualTo(String value) {
            addCriterion("Ainfo_type <>", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeGreaterThan(String value) {
            addCriterion("Ainfo_type >", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Ainfo_type >=", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeLessThan(String value) {
            addCriterion("Ainfo_type <", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeLessThanOrEqualTo(String value) {
            addCriterion("Ainfo_type <=", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeLike(String value) {
            addCriterion("Ainfo_type like", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeNotLike(String value) {
            addCriterion("Ainfo_type not like", value, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeIn(List<String> values) {
            addCriterion("Ainfo_type in", values, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeNotIn(List<String> values) {
            addCriterion("Ainfo_type not in", values, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeBetween(String value1, String value2) {
            addCriterion("Ainfo_type between", value1, value2, "ainfoType");
            return (Criteria) this;
        }

        public Criteria andAinfoTypeNotBetween(String value1, String value2) {
            addCriterion("Ainfo_type not between", value1, value2, "ainfoType");
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