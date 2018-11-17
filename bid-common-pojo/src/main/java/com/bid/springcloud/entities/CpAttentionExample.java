package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class CpAttentionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpAttentionExample() {
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

        public Criteria andAttentionIdIsNull() {
            addCriterion("attention_id is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIdIsNotNull() {
            addCriterion("attention_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionIdEqualTo(Integer value) {
            addCriterion("attention_id =", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotEqualTo(Integer value) {
            addCriterion("attention_id <>", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThan(Integer value) {
            addCriterion("attention_id >", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention_id >=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThan(Integer value) {
            addCriterion("attention_id <", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdLessThanOrEqualTo(Integer value) {
            addCriterion("attention_id <=", value, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdIn(List<Integer> values) {
            addCriterion("attention_id in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotIn(List<Integer> values) {
            addCriterion("attention_id not in", values, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdBetween(Integer value1, Integer value2) {
            addCriterion("attention_id between", value1, value2, "attentionId");
            return (Criteria) this;
        }

        public Criteria andAttentionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attention_id not between", value1, value2, "attentionId");
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

        public Criteria andOrderMainIdIsNull() {
            addCriterion("order_main_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIsNotNull() {
            addCriterion("order_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdEqualTo(String value) {
            addCriterion("order_main_id =", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotEqualTo(String value) {
            addCriterion("order_main_id <>", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThan(String value) {
            addCriterion("order_main_id >", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_main_id >=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThan(String value) {
            addCriterion("order_main_id <", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThanOrEqualTo(String value) {
            addCriterion("order_main_id <=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLike(String value) {
            addCriterion("order_main_id like", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotLike(String value) {
            addCriterion("order_main_id not like", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIn(List<String> values) {
            addCriterion("order_main_id in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotIn(List<String> values) {
            addCriterion("order_main_id not in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdBetween(String value1, String value2) {
            addCriterion("order_main_id between", value1, value2, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotBetween(String value1, String value2) {
            addCriterion("order_main_id not between", value1, value2, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIsNull() {
            addCriterion("follow_type is null");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIsNotNull() {
            addCriterion("follow_type is not null");
            return (Criteria) this;
        }

        public Criteria andFollowTypeEqualTo(String value) {
            addCriterion("follow_type =", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotEqualTo(String value) {
            addCriterion("follow_type <>", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeGreaterThan(String value) {
            addCriterion("follow_type >", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("follow_type >=", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeLessThan(String value) {
            addCriterion("follow_type <", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeLessThanOrEqualTo(String value) {
            addCriterion("follow_type <=", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeLike(String value) {
            addCriterion("follow_type like", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotLike(String value) {
            addCriterion("follow_type not like", value, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeIn(List<String> values) {
            addCriterion("follow_type in", values, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotIn(List<String> values) {
            addCriterion("follow_type not in", values, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeBetween(String value1, String value2) {
            addCriterion("follow_type between", value1, value2, "followType");
            return (Criteria) this;
        }

        public Criteria andFollowTypeNotBetween(String value1, String value2) {
            addCriterion("follow_type not between", value1, value2, "followType");
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