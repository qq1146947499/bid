package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoCompusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoCompusExample() {
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
     * У
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * У
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