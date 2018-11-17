package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class PtProcessParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PtProcessParamExample() {
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

        public Criteria andProcessValueIsNull() {
            addCriterion("process_value is null");
            return (Criteria) this;
        }

        public Criteria andProcessValueIsNotNull() {
            addCriterion("process_value is not null");
            return (Criteria) this;
        }

        public Criteria andProcessValueEqualTo(String value) {
            addCriterion("process_value =", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueNotEqualTo(String value) {
            addCriterion("process_value <>", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueGreaterThan(String value) {
            addCriterion("process_value >", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueGreaterThanOrEqualTo(String value) {
            addCriterion("process_value >=", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueLessThan(String value) {
            addCriterion("process_value <", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueLessThanOrEqualTo(String value) {
            addCriterion("process_value <=", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueLike(String value) {
            addCriterion("process_value like", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueNotLike(String value) {
            addCriterion("process_value not like", value, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueIn(List<String> values) {
            addCriterion("process_value in", values, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueNotIn(List<String> values) {
            addCriterion("process_value not in", values, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueBetween(String value1, String value2) {
            addCriterion("process_value between", value1, value2, "processValue");
            return (Criteria) this;
        }

        public Criteria andProcessValueNotBetween(String value1, String value2) {
            addCriterion("process_value not between", value1, value2, "processValue");
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

        public Criteria andProcessOrdernumIsNull() {
            addCriterion("process_ordernum is null");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumIsNotNull() {
            addCriterion("process_ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumEqualTo(String value) {
            addCriterion("process_ordernum =", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumNotEqualTo(String value) {
            addCriterion("process_ordernum <>", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumGreaterThan(String value) {
            addCriterion("process_ordernum >", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumGreaterThanOrEqualTo(String value) {
            addCriterion("process_ordernum >=", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumLessThan(String value) {
            addCriterion("process_ordernum <", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumLessThanOrEqualTo(String value) {
            addCriterion("process_ordernum <=", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumLike(String value) {
            addCriterion("process_ordernum like", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumNotLike(String value) {
            addCriterion("process_ordernum not like", value, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumIn(List<String> values) {
            addCriterion("process_ordernum in", values, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumNotIn(List<String> values) {
            addCriterion("process_ordernum not in", values, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumBetween(String value1, String value2) {
            addCriterion("process_ordernum between", value1, value2, "processOrdernum");
            return (Criteria) this;
        }

        public Criteria andProcessOrdernumNotBetween(String value1, String value2) {
            addCriterion("process_ordernum not between", value1, value2, "processOrdernum");
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