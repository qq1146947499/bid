package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoOrderNodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoOrderNodeExample() {
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

        public Criteria andOrderNodeIdIsNull() {
            addCriterion("order_node_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdIsNotNull() {
            addCriterion("order_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdEqualTo(String value) {
            addCriterion("order_node_id =", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdNotEqualTo(String value) {
            addCriterion("order_node_id <>", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdGreaterThan(String value) {
            addCriterion("order_node_id >", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_node_id >=", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdLessThan(String value) {
            addCriterion("order_node_id <", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdLessThanOrEqualTo(String value) {
            addCriterion("order_node_id <=", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdLike(String value) {
            addCriterion("order_node_id like", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdNotLike(String value) {
            addCriterion("order_node_id not like", value, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdIn(List<String> values) {
            addCriterion("order_node_id in", values, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdNotIn(List<String> values) {
            addCriterion("order_node_id not in", values, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdBetween(String value1, String value2) {
            addCriterion("order_node_id between", value1, value2, "orderNodeId");
            return (Criteria) this;
        }

        public Criteria andOrderNodeIdNotBetween(String value1, String value2) {
            addCriterion("order_node_id not between", value1, value2, "orderNodeId");
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

        public Criteria andOperationTitleIsNull() {
            addCriterion("operation_title is null");
            return (Criteria) this;
        }

        public Criteria andOperationTitleIsNotNull() {
            addCriterion("operation_title is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTitleEqualTo(String value) {
            addCriterion("operation_title =", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleNotEqualTo(String value) {
            addCriterion("operation_title <>", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleGreaterThan(String value) {
            addCriterion("operation_title >", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleGreaterThanOrEqualTo(String value) {
            addCriterion("operation_title >=", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleLessThan(String value) {
            addCriterion("operation_title <", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleLessThanOrEqualTo(String value) {
            addCriterion("operation_title <=", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleLike(String value) {
            addCriterion("operation_title like", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleNotLike(String value) {
            addCriterion("operation_title not like", value, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleIn(List<String> values) {
            addCriterion("operation_title in", values, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleNotIn(List<String> values) {
            addCriterion("operation_title not in", values, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleBetween(String value1, String value2) {
            addCriterion("operation_title between", value1, value2, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOperationTitleNotBetween(String value1, String value2) {
            addCriterion("operation_title not between", value1, value2, "operationTitle");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNull() {
            addCriterion("order_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIsNotNull() {
            addCriterion("order_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdEqualTo(String value) {
            addCriterion("order_detail_id =", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotEqualTo(String value) {
            addCriterion("order_detail_id <>", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThan(String value) {
            addCriterion("order_detail_id >", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_detail_id >=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThan(String value) {
            addCriterion("order_detail_id <", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLessThanOrEqualTo(String value) {
            addCriterion("order_detail_id <=", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdLike(String value) {
            addCriterion("order_detail_id like", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotLike(String value) {
            addCriterion("order_detail_id not like", value, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdIn(List<String> values) {
            addCriterion("order_detail_id in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotIn(List<String> values) {
            addCriterion("order_detail_id not in", values, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdBetween(String value1, String value2) {
            addCriterion("order_detail_id between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andOrderDetailIdNotBetween(String value1, String value2) {
            addCriterion("order_detail_id not between", value1, value2, "orderDetailId");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNull() {
            addCriterion("node_type is null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIsNotNull() {
            addCriterion("node_type is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTypeEqualTo(String value) {
            addCriterion("node_type =", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotEqualTo(String value) {
            addCriterion("node_type <>", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThan(String value) {
            addCriterion("node_type >", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("node_type >=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThan(String value) {
            addCriterion("node_type <", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("node_type <=", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeLike(String value) {
            addCriterion("node_type like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotLike(String value) {
            addCriterion("node_type not like", value, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeIn(List<String> values) {
            addCriterion("node_type in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotIn(List<String> values) {
            addCriterion("node_type not in", values, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeBetween(String value1, String value2) {
            addCriterion("node_type between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeTypeNotBetween(String value1, String value2) {
            addCriterion("node_type not between", value1, value2, "nodeType");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameIsNull() {
            addCriterion("node_user_name is null");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameIsNotNull() {
            addCriterion("node_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameEqualTo(String value) {
            addCriterion("node_user_name =", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameNotEqualTo(String value) {
            addCriterion("node_user_name <>", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameGreaterThan(String value) {
            addCriterion("node_user_name >", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("node_user_name >=", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameLessThan(String value) {
            addCriterion("node_user_name <", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameLessThanOrEqualTo(String value) {
            addCriterion("node_user_name <=", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameLike(String value) {
            addCriterion("node_user_name like", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameNotLike(String value) {
            addCriterion("node_user_name not like", value, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameIn(List<String> values) {
            addCriterion("node_user_name in", values, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameNotIn(List<String> values) {
            addCriterion("node_user_name not in", values, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameBetween(String value1, String value2) {
            addCriterion("node_user_name between", value1, value2, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserNameNotBetween(String value1, String value2) {
            addCriterion("node_user_name not between", value1, value2, "nodeUserName");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdIsNull() {
            addCriterion("node_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdIsNotNull() {
            addCriterion("node_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdEqualTo(String value) {
            addCriterion("node_user_id =", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdNotEqualTo(String value) {
            addCriterion("node_user_id <>", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdGreaterThan(String value) {
            addCriterion("node_user_id >", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("node_user_id >=", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdLessThan(String value) {
            addCriterion("node_user_id <", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdLessThanOrEqualTo(String value) {
            addCriterion("node_user_id <=", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdLike(String value) {
            addCriterion("node_user_id like", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdNotLike(String value) {
            addCriterion("node_user_id not like", value, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdIn(List<String> values) {
            addCriterion("node_user_id in", values, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdNotIn(List<String> values) {
            addCriterion("node_user_id not in", values, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdBetween(String value1, String value2) {
            addCriterion("node_user_id between", value1, value2, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeUserIdNotBetween(String value1, String value2) {
            addCriterion("node_user_id not between", value1, value2, "nodeUserId");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIsNull() {
            addCriterion("node_time is null");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIsNotNull() {
            addCriterion("node_time is not null");
            return (Criteria) this;
        }

        public Criteria andNodeTimeEqualTo(Date value) {
            addCriterion("node_time =", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotEqualTo(Date value) {
            addCriterion("node_time <>", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeGreaterThan(Date value) {
            addCriterion("node_time >", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("node_time >=", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeLessThan(Date value) {
            addCriterion("node_time <", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeLessThanOrEqualTo(Date value) {
            addCriterion("node_time <=", value, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeIn(List<Date> values) {
            addCriterion("node_time in", values, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotIn(List<Date> values) {
            addCriterion("node_time not in", values, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeBetween(Date value1, Date value2) {
            addCriterion("node_time between", value1, value2, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeTimeNotBetween(Date value1, Date value2) {
            addCriterion("node_time not between", value1, value2, "nodeTime");
            return (Criteria) this;
        }

        public Criteria andNodeReasonIsNull() {
            addCriterion("node_reason is null");
            return (Criteria) this;
        }

        public Criteria andNodeReasonIsNotNull() {
            addCriterion("node_reason is not null");
            return (Criteria) this;
        }

        public Criteria andNodeReasonEqualTo(String value) {
            addCriterion("node_reason =", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonNotEqualTo(String value) {
            addCriterion("node_reason <>", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonGreaterThan(String value) {
            addCriterion("node_reason >", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("node_reason >=", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonLessThan(String value) {
            addCriterion("node_reason <", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonLessThanOrEqualTo(String value) {
            addCriterion("node_reason <=", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonLike(String value) {
            addCriterion("node_reason like", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonNotLike(String value) {
            addCriterion("node_reason not like", value, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonIn(List<String> values) {
            addCriterion("node_reason in", values, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonNotIn(List<String> values) {
            addCriterion("node_reason not in", values, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonBetween(String value1, String value2) {
            addCriterion("node_reason between", value1, value2, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeReasonNotBetween(String value1, String value2) {
            addCriterion("node_reason not between", value1, value2, "nodeReason");
            return (Criteria) this;
        }

        public Criteria andNodeResoultIsNull() {
            addCriterion("node_resoult is null");
            return (Criteria) this;
        }

        public Criteria andNodeResoultIsNotNull() {
            addCriterion("node_resoult is not null");
            return (Criteria) this;
        }

        public Criteria andNodeResoultEqualTo(String value) {
            addCriterion("node_resoult =", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultNotEqualTo(String value) {
            addCriterion("node_resoult <>", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultGreaterThan(String value) {
            addCriterion("node_resoult >", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultGreaterThanOrEqualTo(String value) {
            addCriterion("node_resoult >=", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultLessThan(String value) {
            addCriterion("node_resoult <", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultLessThanOrEqualTo(String value) {
            addCriterion("node_resoult <=", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultLike(String value) {
            addCriterion("node_resoult like", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultNotLike(String value) {
            addCriterion("node_resoult not like", value, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultIn(List<String> values) {
            addCriterion("node_resoult in", values, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultNotIn(List<String> values) {
            addCriterion("node_resoult not in", values, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultBetween(String value1, String value2) {
            addCriterion("node_resoult between", value1, value2, "nodeResoult");
            return (Criteria) this;
        }

        public Criteria andNodeResoultNotBetween(String value1, String value2) {
            addCriterion("node_resoult not between", value1, value2, "nodeResoult");
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