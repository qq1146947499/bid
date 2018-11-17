package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoOrderProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoOrderProcessExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("process_id like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("process_id not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("process_id not between", value1, value2, "processId");
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

        public Criteria andOrderBidTypeIsNull() {
            addCriterion("order_bid_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeIsNotNull() {
            addCriterion("order_bid_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeEqualTo(String value) {
            addCriterion("order_bid_type =", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeNotEqualTo(String value) {
            addCriterion("order_bid_type <>", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeGreaterThan(String value) {
            addCriterion("order_bid_type >", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_bid_type >=", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeLessThan(String value) {
            addCriterion("order_bid_type <", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeLessThanOrEqualTo(String value) {
            addCriterion("order_bid_type <=", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeLike(String value) {
            addCriterion("order_bid_type like", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeNotLike(String value) {
            addCriterion("order_bid_type not like", value, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeIn(List<String> values) {
            addCriterion("order_bid_type in", values, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeNotIn(List<String> values) {
            addCriterion("order_bid_type not in", values, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeBetween(String value1, String value2) {
            addCriterion("order_bid_type between", value1, value2, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andOrderBidTypeNotBetween(String value1, String value2) {
            addCriterion("order_bid_type not between", value1, value2, "orderBidType");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdIsNull() {
            addCriterion("source_college_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdIsNotNull() {
            addCriterion("source_college_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdEqualTo(String value) {
            addCriterion("source_college_id =", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdNotEqualTo(String value) {
            addCriterion("source_college_id <>", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdGreaterThan(String value) {
            addCriterion("source_college_id >", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_college_id >=", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdLessThan(String value) {
            addCriterion("source_college_id <", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("source_college_id <=", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdLike(String value) {
            addCriterion("source_college_id like", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdNotLike(String value) {
            addCriterion("source_college_id not like", value, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdIn(List<String> values) {
            addCriterion("source_college_id in", values, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdNotIn(List<String> values) {
            addCriterion("source_college_id not in", values, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdBetween(String value1, String value2) {
            addCriterion("source_college_id between", value1, value2, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andSourceCollegeIdNotBetween(String value1, String value2) {
            addCriterion("source_college_id not between", value1, value2, "sourceCollegeId");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(String value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(String value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(String value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(String value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(String value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(String value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLike(String value) {
            addCriterion("audit_result like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotLike(String value) {
            addCriterion("audit_result not like", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<String> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<String> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(String value1, String value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(String value1, String value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
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