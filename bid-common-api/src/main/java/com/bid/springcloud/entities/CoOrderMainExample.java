package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoOrderMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoOrderMainExample() {
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

        public Criteria andOrderMainIdIsNull() {
            addCriterion("order_main_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIsNotNull() {
            addCriterion("order_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdEqualTo(Integer value) {
            addCriterion("order_main_id =", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotEqualTo(Integer value) {
            addCriterion("order_main_id <>", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThan(Integer value) {
            addCriterion("order_main_id >", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_main_id >=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThan(Integer value) {
            addCriterion("order_main_id <", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_main_id <=", value, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdIn(List<Integer> values) {
            addCriterion("order_main_id in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotIn(List<Integer> values) {
            addCriterion("order_main_id not in", values, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdBetween(Integer value1, Integer value2) {
            addCriterion("order_main_id between", value1, value2, "orderMainId");
            return (Criteria) this;
        }

        public Criteria andOrderMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_main_id not between", value1, value2, "orderMainId");
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

        public Criteria andOrderTitleIsNull() {
            addCriterion("order_title is null");
            return (Criteria) this;
        }

        public Criteria andOrderTitleIsNotNull() {
            addCriterion("order_title is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTitleEqualTo(String value) {
            addCriterion("order_title =", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotEqualTo(String value) {
            addCriterion("order_title <>", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleGreaterThan(String value) {
            addCriterion("order_title >", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleGreaterThanOrEqualTo(String value) {
            addCriterion("order_title >=", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLessThan(String value) {
            addCriterion("order_title <", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLessThanOrEqualTo(String value) {
            addCriterion("order_title <=", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleLike(String value) {
            addCriterion("order_title like", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotLike(String value) {
            addCriterion("order_title not like", value, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleIn(List<String> values) {
            addCriterion("order_title in", values, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotIn(List<String> values) {
            addCriterion("order_title not in", values, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleBetween(String value1, String value2) {
            addCriterion("order_title between", value1, value2, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andOrderTitleNotBetween(String value1, String value2) {
            addCriterion("order_title not between", value1, value2, "orderTitle");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectIsNull() {
            addCriterion("founds_subject is null");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectIsNotNull() {
            addCriterion("founds_subject is not null");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectEqualTo(String value) {
            addCriterion("founds_subject =", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectNotEqualTo(String value) {
            addCriterion("founds_subject <>", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectGreaterThan(String value) {
            addCriterion("founds_subject >", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("founds_subject >=", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectLessThan(String value) {
            addCriterion("founds_subject <", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectLessThanOrEqualTo(String value) {
            addCriterion("founds_subject <=", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectLike(String value) {
            addCriterion("founds_subject like", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectNotLike(String value) {
            addCriterion("founds_subject not like", value, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectIn(List<String> values) {
            addCriterion("founds_subject in", values, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectNotIn(List<String> values) {
            addCriterion("founds_subject not in", values, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectBetween(String value1, String value2) {
            addCriterion("founds_subject between", value1, value2, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsSubjectNotBetween(String value1, String value2) {
            addCriterion("founds_subject not between", value1, value2, "foundsSubject");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeIsNull() {
            addCriterion("founds_code is null");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeIsNotNull() {
            addCriterion("founds_code is not null");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeEqualTo(String value) {
            addCriterion("founds_code =", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeNotEqualTo(String value) {
            addCriterion("founds_code <>", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeGreaterThan(String value) {
            addCriterion("founds_code >", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("founds_code >=", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeLessThan(String value) {
            addCriterion("founds_code <", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeLessThanOrEqualTo(String value) {
            addCriterion("founds_code <=", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeLike(String value) {
            addCriterion("founds_code like", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeNotLike(String value) {
            addCriterion("founds_code not like", value, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeIn(List<String> values) {
            addCriterion("founds_code in", values, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeNotIn(List<String> values) {
            addCriterion("founds_code not in", values, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeBetween(String value1, String value2) {
            addCriterion("founds_code between", value1, value2, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andFoundsCodeNotBetween(String value1, String value2) {
            addCriterion("founds_code not between", value1, value2, "foundsCode");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyIsNull() {
            addCriterion("using_corrency is null");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyIsNotNull() {
            addCriterion("using_corrency is not null");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyEqualTo(String value) {
            addCriterion("using_corrency =", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyNotEqualTo(String value) {
            addCriterion("using_corrency <>", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyGreaterThan(String value) {
            addCriterion("using_corrency >", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyGreaterThanOrEqualTo(String value) {
            addCriterion("using_corrency >=", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyLessThan(String value) {
            addCriterion("using_corrency <", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyLessThanOrEqualTo(String value) {
            addCriterion("using_corrency <=", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyLike(String value) {
            addCriterion("using_corrency like", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyNotLike(String value) {
            addCriterion("using_corrency not like", value, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyIn(List<String> values) {
            addCriterion("using_corrency in", values, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyNotIn(List<String> values) {
            addCriterion("using_corrency not in", values, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyBetween(String value1, String value2) {
            addCriterion("using_corrency between", value1, value2, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andUsingCorrencyNotBetween(String value1, String value2) {
            addCriterion("using_corrency not between", value1, value2, "usingCorrency");
            return (Criteria) this;
        }

        public Criteria andIsDeliverIsNull() {
            addCriterion("is_deliver is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliverIsNotNull() {
            addCriterion("is_deliver is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliverEqualTo(String value) {
            addCriterion("is_deliver =", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverNotEqualTo(String value) {
            addCriterion("is_deliver <>", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverGreaterThan(String value) {
            addCriterion("is_deliver >", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverGreaterThanOrEqualTo(String value) {
            addCriterion("is_deliver >=", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverLessThan(String value) {
            addCriterion("is_deliver <", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverLessThanOrEqualTo(String value) {
            addCriterion("is_deliver <=", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverLike(String value) {
            addCriterion("is_deliver like", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverNotLike(String value) {
            addCriterion("is_deliver not like", value, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverIn(List<String> values) {
            addCriterion("is_deliver in", values, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverNotIn(List<String> values) {
            addCriterion("is_deliver not in", values, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverBetween(String value1, String value2) {
            addCriterion("is_deliver between", value1, value2, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andIsDeliverNotBetween(String value1, String value2) {
            addCriterion("is_deliver not between", value1, value2, "isDeliver");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(String value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(String value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(String value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(String value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(String value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLike(String value) {
            addCriterion("deliver_time like", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotLike(String value) {
            addCriterion("deliver_time not like", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<String> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<String> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(String value1, String value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(String value1, String value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andIsTaxIsNull() {
            addCriterion("is_tax is null");
            return (Criteria) this;
        }

        public Criteria andIsTaxIsNotNull() {
            addCriterion("is_tax is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaxEqualTo(String value) {
            addCriterion("is_tax =", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotEqualTo(String value) {
            addCriterion("is_tax <>", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThan(String value) {
            addCriterion("is_tax >", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThanOrEqualTo(String value) {
            addCriterion("is_tax >=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThan(String value) {
            addCriterion("is_tax <", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThanOrEqualTo(String value) {
            addCriterion("is_tax <=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLike(String value) {
            addCriterion("is_tax like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotLike(String value) {
            addCriterion("is_tax not like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxIn(List<String> values) {
            addCriterion("is_tax in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotIn(List<String> values) {
            addCriterion("is_tax not in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxBetween(String value1, String value2) {
            addCriterion("is_tax between", value1, value2, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotBetween(String value1, String value2) {
            addCriterion("is_tax not between", value1, value2, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(String value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(String value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(String value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(String value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(String value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLike(String value) {
            addCriterion("is_invoice like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotLike(String value) {
            addCriterion("is_invoice not like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<String> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<String> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(String value1, String value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(String value1, String value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceIsNull() {
            addCriterion("deliver_place is null");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceIsNotNull() {
            addCriterion("deliver_place is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceEqualTo(String value) {
            addCriterion("deliver_place =", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceNotEqualTo(String value) {
            addCriterion("deliver_place <>", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceGreaterThan(String value) {
            addCriterion("deliver_place >", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_place >=", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceLessThan(String value) {
            addCriterion("deliver_place <", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceLessThanOrEqualTo(String value) {
            addCriterion("deliver_place <=", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceLike(String value) {
            addCriterion("deliver_place like", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceNotLike(String value) {
            addCriterion("deliver_place not like", value, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceIn(List<String> values) {
            addCriterion("deliver_place in", values, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceNotIn(List<String> values) {
            addCriterion("deliver_place not in", values, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceBetween(String value1, String value2) {
            addCriterion("deliver_place between", value1, value2, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andDeliverPlaceNotBetween(String value1, String value2) {
            addCriterion("deliver_place not between", value1, value2, "deliverPlace");
            return (Criteria) this;
        }

        public Criteria andIsImplementedIsNull() {
            addCriterion("is_implemented is null");
            return (Criteria) this;
        }

        public Criteria andIsImplementedIsNotNull() {
            addCriterion("is_implemented is not null");
            return (Criteria) this;
        }

        public Criteria andIsImplementedEqualTo(String value) {
            addCriterion("is_implemented =", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedNotEqualTo(String value) {
            addCriterion("is_implemented <>", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedGreaterThan(String value) {
            addCriterion("is_implemented >", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedGreaterThanOrEqualTo(String value) {
            addCriterion("is_implemented >=", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedLessThan(String value) {
            addCriterion("is_implemented <", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedLessThanOrEqualTo(String value) {
            addCriterion("is_implemented <=", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedLike(String value) {
            addCriterion("is_implemented like", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedNotLike(String value) {
            addCriterion("is_implemented not like", value, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedIn(List<String> values) {
            addCriterion("is_implemented in", values, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedNotIn(List<String> values) {
            addCriterion("is_implemented not in", values, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedBetween(String value1, String value2) {
            addCriterion("is_implemented between", value1, value2, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andIsImplementedNotBetween(String value1, String value2) {
            addCriterion("is_implemented not between", value1, value2, "isImplemented");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNull() {
            addCriterion("budget is null");
            return (Criteria) this;
        }

        public Criteria andBudgetIsNotNull() {
            addCriterion("budget is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetEqualTo(String value) {
            addCriterion("budget =", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotEqualTo(String value) {
            addCriterion("budget <>", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThan(String value) {
            addCriterion("budget >", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetGreaterThanOrEqualTo(String value) {
            addCriterion("budget >=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThan(String value) {
            addCriterion("budget <", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLessThanOrEqualTo(String value) {
            addCriterion("budget <=", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetLike(String value) {
            addCriterion("budget like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotLike(String value) {
            addCriterion("budget not like", value, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetIn(List<String> values) {
            addCriterion("budget in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotIn(List<String> values) {
            addCriterion("budget not in", values, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetBetween(String value1, String value2) {
            addCriterion("budget between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andBudgetNotBetween(String value1, String value2) {
            addCriterion("budget not between", value1, value2, "budget");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeIsNull() {
            addCriterion("advice_expired_time is null");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeIsNotNull() {
            addCriterion("advice_expired_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeEqualTo(String value) {
            addCriterion("advice_expired_time =", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeNotEqualTo(String value) {
            addCriterion("advice_expired_time <>", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeGreaterThan(String value) {
            addCriterion("advice_expired_time >", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeGreaterThanOrEqualTo(String value) {
            addCriterion("advice_expired_time >=", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeLessThan(String value) {
            addCriterion("advice_expired_time <", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeLessThanOrEqualTo(String value) {
            addCriterion("advice_expired_time <=", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeLike(String value) {
            addCriterion("advice_expired_time like", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeNotLike(String value) {
            addCriterion("advice_expired_time not like", value, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeIn(List<String> values) {
            addCriterion("advice_expired_time in", values, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeNotIn(List<String> values) {
            addCriterion("advice_expired_time not in", values, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeBetween(String value1, String value2) {
            addCriterion("advice_expired_time between", value1, value2, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andAdviceExpiredTimeNotBetween(String value1, String value2) {
            addCriterion("advice_expired_time not between", value1, value2, "adviceExpiredTime");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeIsNull() {
            addCriterion("current_procee is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeIsNotNull() {
            addCriterion("current_procee is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeEqualTo(String value) {
            addCriterion("current_procee =", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeNotEqualTo(String value) {
            addCriterion("current_procee <>", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeGreaterThan(String value) {
            addCriterion("current_procee >", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeGreaterThanOrEqualTo(String value) {
            addCriterion("current_procee >=", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeLessThan(String value) {
            addCriterion("current_procee <", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeLessThanOrEqualTo(String value) {
            addCriterion("current_procee <=", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeLike(String value) {
            addCriterion("current_procee like", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeNotLike(String value) {
            addCriterion("current_procee not like", value, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeIn(List<String> values) {
            addCriterion("current_procee in", values, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeNotIn(List<String> values) {
            addCriterion("current_procee not in", values, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeBetween(String value1, String value2) {
            addCriterion("current_procee between", value1, value2, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andCurrentProceeNotBetween(String value1, String value2) {
            addCriterion("current_procee not between", value1, value2, "currentProcee");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidIsNull() {
            addCriterion("is_advance_endbid is null");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidIsNotNull() {
            addCriterion("is_advance_endbid is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidEqualTo(String value) {
            addCriterion("is_advance_endbid =", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidNotEqualTo(String value) {
            addCriterion("is_advance_endbid <>", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidGreaterThan(String value) {
            addCriterion("is_advance_endbid >", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidGreaterThanOrEqualTo(String value) {
            addCriterion("is_advance_endbid >=", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidLessThan(String value) {
            addCriterion("is_advance_endbid <", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidLessThanOrEqualTo(String value) {
            addCriterion("is_advance_endbid <=", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidLike(String value) {
            addCriterion("is_advance_endbid like", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidNotLike(String value) {
            addCriterion("is_advance_endbid not like", value, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidIn(List<String> values) {
            addCriterion("is_advance_endbid in", values, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidNotIn(List<String> values) {
            addCriterion("is_advance_endbid not in", values, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidBetween(String value1, String value2) {
            addCriterion("is_advance_endbid between", value1, value2, "isAdvanceEndbid");
            return (Criteria) this;
        }

        public Criteria andIsAdvanceEndbidNotBetween(String value1, String value2) {
            addCriterion("is_advance_endbid not between", value1, value2, "isAdvanceEndbid");
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

        public Criteria andOrderUnitIsNull() {
            addCriterion("order_unit is null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIsNotNull() {
            addCriterion("order_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitEqualTo(String value) {
            addCriterion("order_unit =", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotEqualTo(String value) {
            addCriterion("order_unit <>", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThan(String value) {
            addCriterion("order_unit >", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitGreaterThanOrEqualTo(String value) {
            addCriterion("order_unit >=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThan(String value) {
            addCriterion("order_unit <", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLessThanOrEqualTo(String value) {
            addCriterion("order_unit <=", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitLike(String value) {
            addCriterion("order_unit like", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotLike(String value) {
            addCriterion("order_unit not like", value, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitIn(List<String> values) {
            addCriterion("order_unit in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotIn(List<String> values) {
            addCriterion("order_unit not in", values, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitBetween(String value1, String value2) {
            addCriterion("order_unit between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderUnitNotBetween(String value1, String value2) {
            addCriterion("order_unit not between", value1, value2, "orderUnit");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIsNull() {
            addCriterion("order_person is null");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIsNotNull() {
            addCriterion("order_person is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPersonEqualTo(String value) {
            addCriterion("order_person =", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotEqualTo(String value) {
            addCriterion("order_person <>", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonGreaterThan(String value) {
            addCriterion("order_person >", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonGreaterThanOrEqualTo(String value) {
            addCriterion("order_person >=", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLessThan(String value) {
            addCriterion("order_person <", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLessThanOrEqualTo(String value) {
            addCriterion("order_person <=", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonLike(String value) {
            addCriterion("order_person like", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotLike(String value) {
            addCriterion("order_person not like", value, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonIn(List<String> values) {
            addCriterion("order_person in", values, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotIn(List<String> values) {
            addCriterion("order_person not in", values, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonBetween(String value1, String value2) {
            addCriterion("order_person between", value1, value2, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderPersonNotBetween(String value1, String value2) {
            addCriterion("order_person not between", value1, value2, "orderPerson");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(String value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(String value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(String value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(String value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(String value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLike(String value) {
            addCriterion("order_time like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotLike(String value) {
            addCriterion("order_time not like", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<String> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<String> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(String value1, String value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(String value1, String value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
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

        public Criteria andItemNumIsNull() {
            addCriterion("item_num is null");
            return (Criteria) this;
        }

        public Criteria andItemNumIsNotNull() {
            addCriterion("item_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumEqualTo(String value) {
            addCriterion("item_num =", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotEqualTo(String value) {
            addCriterion("item_num <>", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThan(String value) {
            addCriterion("item_num >", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumGreaterThanOrEqualTo(String value) {
            addCriterion("item_num >=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThan(String value) {
            addCriterion("item_num <", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLessThanOrEqualTo(String value) {
            addCriterion("item_num <=", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumLike(String value) {
            addCriterion("item_num like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotLike(String value) {
            addCriterion("item_num not like", value, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumIn(List<String> values) {
            addCriterion("item_num in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotIn(List<String> values) {
            addCriterion("item_num not in", values, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumBetween(String value1, String value2) {
            addCriterion("item_num between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andItemNumNotBetween(String value1, String value2) {
            addCriterion("item_num not between", value1, value2, "itemNum");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNull() {
            addCriterion("order_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIsNotNull() {
            addCriterion("order_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountEqualTo(String value) {
            addCriterion("order_total_amount =", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotEqualTo(String value) {
            addCriterion("order_total_amount <>", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThan(String value) {
            addCriterion("order_total_amount >", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("order_total_amount >=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThan(String value) {
            addCriterion("order_total_amount <", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("order_total_amount <=", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountLike(String value) {
            addCriterion("order_total_amount like", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotLike(String value) {
            addCriterion("order_total_amount not like", value, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountIn(List<String> values) {
            addCriterion("order_total_amount in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotIn(List<String> values) {
            addCriterion("order_total_amount not in", values, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountBetween(String value1, String value2) {
            addCriterion("order_total_amount between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andOrderTotalAmountNotBetween(String value1, String value2) {
            addCriterion("order_total_amount not between", value1, value2, "orderTotalAmount");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNull() {
            addCriterion("read_count is null");
            return (Criteria) this;
        }

        public Criteria andReadCountIsNotNull() {
            addCriterion("read_count is not null");
            return (Criteria) this;
        }

        public Criteria andReadCountEqualTo(String value) {
            addCriterion("read_count =", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotEqualTo(String value) {
            addCriterion("read_count <>", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThan(String value) {
            addCriterion("read_count >", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountGreaterThanOrEqualTo(String value) {
            addCriterion("read_count >=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThan(String value) {
            addCriterion("read_count <", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLessThanOrEqualTo(String value) {
            addCriterion("read_count <=", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountLike(String value) {
            addCriterion("read_count like", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotLike(String value) {
            addCriterion("read_count not like", value, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountIn(List<String> values) {
            addCriterion("read_count in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotIn(List<String> values) {
            addCriterion("read_count not in", values, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountBetween(String value1, String value2) {
            addCriterion("read_count between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andReadCountNotBetween(String value1, String value2) {
            addCriterion("read_count not between", value1, value2, "readCount");
            return (Criteria) this;
        }

        public Criteria andBidCountIsNull() {
            addCriterion("bid_count is null");
            return (Criteria) this;
        }

        public Criteria andBidCountIsNotNull() {
            addCriterion("bid_count is not null");
            return (Criteria) this;
        }

        public Criteria andBidCountEqualTo(String value) {
            addCriterion("bid_count =", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotEqualTo(String value) {
            addCriterion("bid_count <>", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountGreaterThan(String value) {
            addCriterion("bid_count >", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountGreaterThanOrEqualTo(String value) {
            addCriterion("bid_count >=", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountLessThan(String value) {
            addCriterion("bid_count <", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountLessThanOrEqualTo(String value) {
            addCriterion("bid_count <=", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountLike(String value) {
            addCriterion("bid_count like", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotLike(String value) {
            addCriterion("bid_count not like", value, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountIn(List<String> values) {
            addCriterion("bid_count in", values, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotIn(List<String> values) {
            addCriterion("bid_count not in", values, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountBetween(String value1, String value2) {
            addCriterion("bid_count between", value1, value2, "bidCount");
            return (Criteria) this;
        }

        public Criteria andBidCountNotBetween(String value1, String value2) {
            addCriterion("bid_count not between", value1, value2, "bidCount");
            return (Criteria) this;
        }

        public Criteria andOrderProcessIsNull() {
            addCriterion("order_process is null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessIsNotNull() {
            addCriterion("order_process is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProcessEqualTo(String value) {
            addCriterion("order_process =", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessNotEqualTo(String value) {
            addCriterion("order_process <>", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessGreaterThan(String value) {
            addCriterion("order_process >", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessGreaterThanOrEqualTo(String value) {
            addCriterion("order_process >=", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessLessThan(String value) {
            addCriterion("order_process <", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessLessThanOrEqualTo(String value) {
            addCriterion("order_process <=", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessLike(String value) {
            addCriterion("order_process like", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessNotLike(String value) {
            addCriterion("order_process not like", value, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessIn(List<String> values) {
            addCriterion("order_process in", values, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessNotIn(List<String> values) {
            addCriterion("order_process not in", values, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessBetween(String value1, String value2) {
            addCriterion("order_process between", value1, value2, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andOrderProcessNotBetween(String value1, String value2) {
            addCriterion("order_process not between", value1, value2, "orderProcess");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeIsNull() {
            addCriterion("start_bidtime is null");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeIsNotNull() {
            addCriterion("start_bidtime is not null");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeEqualTo(Date value) {
            addCriterion("start_bidtime =", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeNotEqualTo(Date value) {
            addCriterion("start_bidtime <>", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeGreaterThan(Date value) {
            addCriterion("start_bidtime >", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_bidtime >=", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeLessThan(Date value) {
            addCriterion("start_bidtime <", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeLessThanOrEqualTo(Date value) {
            addCriterion("start_bidtime <=", value, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeIn(List<Date> values) {
            addCriterion("start_bidtime in", values, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeNotIn(List<Date> values) {
            addCriterion("start_bidtime not in", values, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeBetween(Date value1, Date value2) {
            addCriterion("start_bidtime between", value1, value2, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andStartBidtimeNotBetween(Date value1, Date value2) {
            addCriterion("start_bidtime not between", value1, value2, "startBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeIsNull() {
            addCriterion("end_bidtime is null");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeIsNotNull() {
            addCriterion("end_bidtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeEqualTo(Date value) {
            addCriterion("end_bidtime =", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeNotEqualTo(Date value) {
            addCriterion("end_bidtime <>", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeGreaterThan(Date value) {
            addCriterion("end_bidtime >", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_bidtime >=", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeLessThan(Date value) {
            addCriterion("end_bidtime <", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeLessThanOrEqualTo(Date value) {
            addCriterion("end_bidtime <=", value, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeIn(List<Date> values) {
            addCriterion("end_bidtime in", values, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeNotIn(List<Date> values) {
            addCriterion("end_bidtime not in", values, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeBetween(Date value1, Date value2) {
            addCriterion("end_bidtime between", value1, value2, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andEndBidtimeNotBetween(Date value1, Date value2) {
            addCriterion("end_bidtime not between", value1, value2, "endBidtime");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIsNull() {
            addCriterion("audit_suggestion is null");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIsNotNull() {
            addCriterion("audit_suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionEqualTo(String value) {
            addCriterion("audit_suggestion =", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotEqualTo(String value) {
            addCriterion("audit_suggestion <>", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionGreaterThan(String value) {
            addCriterion("audit_suggestion >", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_suggestion >=", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionLessThan(String value) {
            addCriterion("audit_suggestion <", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionLessThanOrEqualTo(String value) {
            addCriterion("audit_suggestion <=", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionLike(String value) {
            addCriterion("audit_suggestion like", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotLike(String value) {
            addCriterion("audit_suggestion not like", value, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionIn(List<String> values) {
            addCriterion("audit_suggestion in", values, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotIn(List<String> values) {
            addCriterion("audit_suggestion not in", values, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionBetween(String value1, String value2) {
            addCriterion("audit_suggestion between", value1, value2, "auditSuggestion");
            return (Criteria) this;
        }

        public Criteria andAuditSuggestionNotBetween(String value1, String value2) {
            addCriterion("audit_suggestion not between", value1, value2, "auditSuggestion");
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

        public Criteria andAuditUseridEqualTo(String value) {
            addCriterion("audit_userid =", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotEqualTo(String value) {
            addCriterion("audit_userid <>", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThan(String value) {
            addCriterion("audit_userid >", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridGreaterThanOrEqualTo(String value) {
            addCriterion("audit_userid >=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThan(String value) {
            addCriterion("audit_userid <", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLessThanOrEqualTo(String value) {
            addCriterion("audit_userid <=", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridLike(String value) {
            addCriterion("audit_userid like", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotLike(String value) {
            addCriterion("audit_userid not like", value, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridIn(List<String> values) {
            addCriterion("audit_userid in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotIn(List<String> values) {
            addCriterion("audit_userid not in", values, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridBetween(String value1, String value2) {
            addCriterion("audit_userid between", value1, value2, "auditUserid");
            return (Criteria) this;
        }

        public Criteria andAuditUseridNotBetween(String value1, String value2) {
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

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeIsNull() {
            addCriterion("last_end_bidtime is null");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeIsNotNull() {
            addCriterion("last_end_bidtime is not null");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeEqualTo(Date value) {
            addCriterion("last_end_bidtime =", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeNotEqualTo(Date value) {
            addCriterion("last_end_bidtime <>", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeGreaterThan(Date value) {
            addCriterion("last_end_bidtime >", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_end_bidtime >=", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeLessThan(Date value) {
            addCriterion("last_end_bidtime <", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeLessThanOrEqualTo(Date value) {
            addCriterion("last_end_bidtime <=", value, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeIn(List<Date> values) {
            addCriterion("last_end_bidtime in", values, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeNotIn(List<Date> values) {
            addCriterion("last_end_bidtime not in", values, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeBetween(Date value1, Date value2) {
            addCriterion("last_end_bidtime between", value1, value2, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andLastEndBidtimeNotBetween(Date value1, Date value2) {
            addCriterion("last_end_bidtime not between", value1, value2, "lastEndBidtime");
            return (Criteria) this;
        }

        public Criteria andIsExtendIsNull() {
            addCriterion("is_extend is null");
            return (Criteria) this;
        }

        public Criteria andIsExtendIsNotNull() {
            addCriterion("is_extend is not null");
            return (Criteria) this;
        }

        public Criteria andIsExtendEqualTo(String value) {
            addCriterion("is_extend =", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotEqualTo(String value) {
            addCriterion("is_extend <>", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendGreaterThan(String value) {
            addCriterion("is_extend >", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendGreaterThanOrEqualTo(String value) {
            addCriterion("is_extend >=", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLessThan(String value) {
            addCriterion("is_extend <", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLessThanOrEqualTo(String value) {
            addCriterion("is_extend <=", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendLike(String value) {
            addCriterion("is_extend like", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotLike(String value) {
            addCriterion("is_extend not like", value, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendIn(List<String> values) {
            addCriterion("is_extend in", values, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotIn(List<String> values) {
            addCriterion("is_extend not in", values, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendBetween(String value1, String value2) {
            addCriterion("is_extend between", value1, value2, "isExtend");
            return (Criteria) this;
        }

        public Criteria andIsExtendNotBetween(String value1, String value2) {
            addCriterion("is_extend not between", value1, value2, "isExtend");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonIsNull() {
            addCriterion("extend_bid_reason is null");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonIsNotNull() {
            addCriterion("extend_bid_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonEqualTo(String value) {
            addCriterion("extend_bid_reason =", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonNotEqualTo(String value) {
            addCriterion("extend_bid_reason <>", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonGreaterThan(String value) {
            addCriterion("extend_bid_reason >", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonGreaterThanOrEqualTo(String value) {
            addCriterion("extend_bid_reason >=", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonLessThan(String value) {
            addCriterion("extend_bid_reason <", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonLessThanOrEqualTo(String value) {
            addCriterion("extend_bid_reason <=", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonLike(String value) {
            addCriterion("extend_bid_reason like", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonNotLike(String value) {
            addCriterion("extend_bid_reason not like", value, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonIn(List<String> values) {
            addCriterion("extend_bid_reason in", values, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonNotIn(List<String> values) {
            addCriterion("extend_bid_reason not in", values, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonBetween(String value1, String value2) {
            addCriterion("extend_bid_reason between", value1, value2, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendBidReasonNotBetween(String value1, String value2) {
            addCriterion("extend_bid_reason not between", value1, value2, "extendBidReason");
            return (Criteria) this;
        }

        public Criteria andExtendUseridIsNull() {
            addCriterion("extend_userid is null");
            return (Criteria) this;
        }

        public Criteria andExtendUseridIsNotNull() {
            addCriterion("extend_userid is not null");
            return (Criteria) this;
        }

        public Criteria andExtendUseridEqualTo(String value) {
            addCriterion("extend_userid =", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridNotEqualTo(String value) {
            addCriterion("extend_userid <>", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridGreaterThan(String value) {
            addCriterion("extend_userid >", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridGreaterThanOrEqualTo(String value) {
            addCriterion("extend_userid >=", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridLessThan(String value) {
            addCriterion("extend_userid <", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridLessThanOrEqualTo(String value) {
            addCriterion("extend_userid <=", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridLike(String value) {
            addCriterion("extend_userid like", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridNotLike(String value) {
            addCriterion("extend_userid not like", value, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridIn(List<String> values) {
            addCriterion("extend_userid in", values, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridNotIn(List<String> values) {
            addCriterion("extend_userid not in", values, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridBetween(String value1, String value2) {
            addCriterion("extend_userid between", value1, value2, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUseridNotBetween(String value1, String value2) {
            addCriterion("extend_userid not between", value1, value2, "extendUserid");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameIsNull() {
            addCriterion("extend_username is null");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameIsNotNull() {
            addCriterion("extend_username is not null");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameEqualTo(String value) {
            addCriterion("extend_username =", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameNotEqualTo(String value) {
            addCriterion("extend_username <>", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameGreaterThan(String value) {
            addCriterion("extend_username >", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("extend_username >=", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameLessThan(String value) {
            addCriterion("extend_username <", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameLessThanOrEqualTo(String value) {
            addCriterion("extend_username <=", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameLike(String value) {
            addCriterion("extend_username like", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameNotLike(String value) {
            addCriterion("extend_username not like", value, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameIn(List<String> values) {
            addCriterion("extend_username in", values, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameNotIn(List<String> values) {
            addCriterion("extend_username not in", values, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameBetween(String value1, String value2) {
            addCriterion("extend_username between", value1, value2, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andExtendUsernameNotBetween(String value1, String value2) {
            addCriterion("extend_username not between", value1, value2, "extendUsername");
            return (Criteria) this;
        }

        public Criteria andChooseTimeIsNull() {
            addCriterion("choose_time is null");
            return (Criteria) this;
        }

        public Criteria andChooseTimeIsNotNull() {
            addCriterion("choose_time is not null");
            return (Criteria) this;
        }

        public Criteria andChooseTimeEqualTo(String value) {
            addCriterion("choose_time =", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeNotEqualTo(String value) {
            addCriterion("choose_time <>", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeGreaterThan(String value) {
            addCriterion("choose_time >", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("choose_time >=", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeLessThan(String value) {
            addCriterion("choose_time <", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeLessThanOrEqualTo(String value) {
            addCriterion("choose_time <=", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeLike(String value) {
            addCriterion("choose_time like", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeNotLike(String value) {
            addCriterion("choose_time not like", value, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeIn(List<String> values) {
            addCriterion("choose_time in", values, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeNotIn(List<String> values) {
            addCriterion("choose_time not in", values, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeBetween(String value1, String value2) {
            addCriterion("choose_time between", value1, value2, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseTimeNotBetween(String value1, String value2) {
            addCriterion("choose_time not between", value1, value2, "chooseTime");
            return (Criteria) this;
        }

        public Criteria andChooseOptionIsNull() {
            addCriterion("choose_option is null");
            return (Criteria) this;
        }

        public Criteria andChooseOptionIsNotNull() {
            addCriterion("choose_option is not null");
            return (Criteria) this;
        }

        public Criteria andChooseOptionEqualTo(String value) {
            addCriterion("choose_option =", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionNotEqualTo(String value) {
            addCriterion("choose_option <>", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionGreaterThan(String value) {
            addCriterion("choose_option >", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionGreaterThanOrEqualTo(String value) {
            addCriterion("choose_option >=", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionLessThan(String value) {
            addCriterion("choose_option <", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionLessThanOrEqualTo(String value) {
            addCriterion("choose_option <=", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionLike(String value) {
            addCriterion("choose_option like", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionNotLike(String value) {
            addCriterion("choose_option not like", value, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionIn(List<String> values) {
            addCriterion("choose_option in", values, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionNotIn(List<String> values) {
            addCriterion("choose_option not in", values, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionBetween(String value1, String value2) {
            addCriterion("choose_option between", value1, value2, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseOptionNotBetween(String value1, String value2) {
            addCriterion("choose_option not between", value1, value2, "chooseOption");
            return (Criteria) this;
        }

        public Criteria andChooseReasonIsNull() {
            addCriterion("choose_reason is null");
            return (Criteria) this;
        }

        public Criteria andChooseReasonIsNotNull() {
            addCriterion("choose_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChooseReasonEqualTo(String value) {
            addCriterion("choose_reason =", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonNotEqualTo(String value) {
            addCriterion("choose_reason <>", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonGreaterThan(String value) {
            addCriterion("choose_reason >", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("choose_reason >=", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonLessThan(String value) {
            addCriterion("choose_reason <", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonLessThanOrEqualTo(String value) {
            addCriterion("choose_reason <=", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonLike(String value) {
            addCriterion("choose_reason like", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonNotLike(String value) {
            addCriterion("choose_reason not like", value, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonIn(List<String> values) {
            addCriterion("choose_reason in", values, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonNotIn(List<String> values) {
            addCriterion("choose_reason not in", values, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonBetween(String value1, String value2) {
            addCriterion("choose_reason between", value1, value2, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseReasonNotBetween(String value1, String value2) {
            addCriterion("choose_reason not between", value1, value2, "chooseReason");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdIsNull() {
            addCriterion("choose_user_id is null");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdIsNotNull() {
            addCriterion("choose_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdEqualTo(String value) {
            addCriterion("choose_user_id =", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdNotEqualTo(String value) {
            addCriterion("choose_user_id <>", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdGreaterThan(String value) {
            addCriterion("choose_user_id >", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("choose_user_id >=", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdLessThan(String value) {
            addCriterion("choose_user_id <", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdLessThanOrEqualTo(String value) {
            addCriterion("choose_user_id <=", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdLike(String value) {
            addCriterion("choose_user_id like", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdNotLike(String value) {
            addCriterion("choose_user_id not like", value, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdIn(List<String> values) {
            addCriterion("choose_user_id in", values, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdNotIn(List<String> values) {
            addCriterion("choose_user_id not in", values, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdBetween(String value1, String value2) {
            addCriterion("choose_user_id between", value1, value2, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserIdNotBetween(String value1, String value2) {
            addCriterion("choose_user_id not between", value1, value2, "chooseUserId");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameIsNull() {
            addCriterion("choose_user_name is null");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameIsNotNull() {
            addCriterion("choose_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameEqualTo(String value) {
            addCriterion("choose_user_name =", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameNotEqualTo(String value) {
            addCriterion("choose_user_name <>", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameGreaterThan(String value) {
            addCriterion("choose_user_name >", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("choose_user_name >=", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameLessThan(String value) {
            addCriterion("choose_user_name <", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameLessThanOrEqualTo(String value) {
            addCriterion("choose_user_name <=", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameLike(String value) {
            addCriterion("choose_user_name like", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameNotLike(String value) {
            addCriterion("choose_user_name not like", value, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameIn(List<String> values) {
            addCriterion("choose_user_name in", values, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameNotIn(List<String> values) {
            addCriterion("choose_user_name not in", values, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameBetween(String value1, String value2) {
            addCriterion("choose_user_name between", value1, value2, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andChooseUserNameNotBetween(String value1, String value2) {
            addCriterion("choose_user_name not between", value1, value2, "chooseUserName");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNull() {
            addCriterion("first_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIsNotNull() {
            addCriterion("first_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTimeEqualTo(Date value) {
            addCriterion("first_time =", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotEqualTo(Date value) {
            addCriterion("first_time <>", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThan(Date value) {
            addCriterion("first_time >", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_time >=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThan(Date value) {
            addCriterion("first_time <", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_time <=", value, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeIn(List<Date> values) {
            addCriterion("first_time in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotIn(List<Date> values) {
            addCriterion("first_time not in", values, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeBetween(Date value1, Date value2) {
            addCriterion("first_time between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_time not between", value1, value2, "firstTime");
            return (Criteria) this;
        }

        public Criteria andFirstAuditIsNull() {
            addCriterion("first_audit is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditIsNotNull() {
            addCriterion("first_audit is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditEqualTo(String value) {
            addCriterion("first_audit =", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditNotEqualTo(String value) {
            addCriterion("first_audit <>", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditGreaterThan(String value) {
            addCriterion("first_audit >", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditGreaterThanOrEqualTo(String value) {
            addCriterion("first_audit >=", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditLessThan(String value) {
            addCriterion("first_audit <", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditLessThanOrEqualTo(String value) {
            addCriterion("first_audit <=", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditLike(String value) {
            addCriterion("first_audit like", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditNotLike(String value) {
            addCriterion("first_audit not like", value, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditIn(List<String> values) {
            addCriterion("first_audit in", values, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditNotIn(List<String> values) {
            addCriterion("first_audit not in", values, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditBetween(String value1, String value2) {
            addCriterion("first_audit between", value1, value2, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditNotBetween(String value1, String value2) {
            addCriterion("first_audit not between", value1, value2, "firstAudit");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonIsNull() {
            addCriterion("first_audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonIsNotNull() {
            addCriterion("first_audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonEqualTo(String value) {
            addCriterion("first_audit_reason =", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonNotEqualTo(String value) {
            addCriterion("first_audit_reason <>", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonGreaterThan(String value) {
            addCriterion("first_audit_reason >", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("first_audit_reason >=", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonLessThan(String value) {
            addCriterion("first_audit_reason <", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("first_audit_reason <=", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonLike(String value) {
            addCriterion("first_audit_reason like", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonNotLike(String value) {
            addCriterion("first_audit_reason not like", value, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonIn(List<String> values) {
            addCriterion("first_audit_reason in", values, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonNotIn(List<String> values) {
            addCriterion("first_audit_reason not in", values, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonBetween(String value1, String value2) {
            addCriterion("first_audit_reason between", value1, value2, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditReasonNotBetween(String value1, String value2) {
            addCriterion("first_audit_reason not between", value1, value2, "firstAuditReason");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdIsNull() {
            addCriterion("first_audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdIsNotNull() {
            addCriterion("first_audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdEqualTo(String value) {
            addCriterion("first_audit_user_id =", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdNotEqualTo(String value) {
            addCriterion("first_audit_user_id <>", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdGreaterThan(String value) {
            addCriterion("first_audit_user_id >", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_audit_user_id >=", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdLessThan(String value) {
            addCriterion("first_audit_user_id <", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("first_audit_user_id <=", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdLike(String value) {
            addCriterion("first_audit_user_id like", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdNotLike(String value) {
            addCriterion("first_audit_user_id not like", value, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdIn(List<String> values) {
            addCriterion("first_audit_user_id in", values, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdNotIn(List<String> values) {
            addCriterion("first_audit_user_id not in", values, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdBetween(String value1, String value2) {
            addCriterion("first_audit_user_id between", value1, value2, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("first_audit_user_id not between", value1, value2, "firstAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameIsNull() {
            addCriterion("first_audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameIsNotNull() {
            addCriterion("first_audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameEqualTo(String value) {
            addCriterion("first_audit_user_name =", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameNotEqualTo(String value) {
            addCriterion("first_audit_user_name <>", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameGreaterThan(String value) {
            addCriterion("first_audit_user_name >", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_audit_user_name >=", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameLessThan(String value) {
            addCriterion("first_audit_user_name <", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("first_audit_user_name <=", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameLike(String value) {
            addCriterion("first_audit_user_name like", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameNotLike(String value) {
            addCriterion("first_audit_user_name not like", value, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameIn(List<String> values) {
            addCriterion("first_audit_user_name in", values, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameNotIn(List<String> values) {
            addCriterion("first_audit_user_name not in", values, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameBetween(String value1, String value2) {
            addCriterion("first_audit_user_name between", value1, value2, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFirstAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("first_audit_user_name not between", value1, value2, "firstAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditIsNull() {
            addCriterion("second_audit is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditIsNotNull() {
            addCriterion("second_audit is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditEqualTo(String value) {
            addCriterion("second_audit =", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditNotEqualTo(String value) {
            addCriterion("second_audit <>", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditGreaterThan(String value) {
            addCriterion("second_audit >", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditGreaterThanOrEqualTo(String value) {
            addCriterion("second_audit >=", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditLessThan(String value) {
            addCriterion("second_audit <", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditLessThanOrEqualTo(String value) {
            addCriterion("second_audit <=", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditLike(String value) {
            addCriterion("second_audit like", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditNotLike(String value) {
            addCriterion("second_audit not like", value, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditIn(List<String> values) {
            addCriterion("second_audit in", values, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditNotIn(List<String> values) {
            addCriterion("second_audit not in", values, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditBetween(String value1, String value2) {
            addCriterion("second_audit between", value1, value2, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditNotBetween(String value1, String value2) {
            addCriterion("second_audit not between", value1, value2, "secondAudit");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonIsNull() {
            addCriterion("second_audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonIsNotNull() {
            addCriterion("second_audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonEqualTo(String value) {
            addCriterion("second_audit_reason =", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonNotEqualTo(String value) {
            addCriterion("second_audit_reason <>", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonGreaterThan(String value) {
            addCriterion("second_audit_reason >", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("second_audit_reason >=", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonLessThan(String value) {
            addCriterion("second_audit_reason <", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("second_audit_reason <=", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonLike(String value) {
            addCriterion("second_audit_reason like", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonNotLike(String value) {
            addCriterion("second_audit_reason not like", value, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonIn(List<String> values) {
            addCriterion("second_audit_reason in", values, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonNotIn(List<String> values) {
            addCriterion("second_audit_reason not in", values, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonBetween(String value1, String value2) {
            addCriterion("second_audit_reason between", value1, value2, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditReasonNotBetween(String value1, String value2) {
            addCriterion("second_audit_reason not between", value1, value2, "secondAuditReason");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdIsNull() {
            addCriterion("second_audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdIsNotNull() {
            addCriterion("second_audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdEqualTo(String value) {
            addCriterion("second_audit_user_id =", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdNotEqualTo(String value) {
            addCriterion("second_audit_user_id <>", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdGreaterThan(String value) {
            addCriterion("second_audit_user_id >", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_audit_user_id >=", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdLessThan(String value) {
            addCriterion("second_audit_user_id <", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("second_audit_user_id <=", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdLike(String value) {
            addCriterion("second_audit_user_id like", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdNotLike(String value) {
            addCriterion("second_audit_user_id not like", value, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdIn(List<String> values) {
            addCriterion("second_audit_user_id in", values, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdNotIn(List<String> values) {
            addCriterion("second_audit_user_id not in", values, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdBetween(String value1, String value2) {
            addCriterion("second_audit_user_id between", value1, value2, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("second_audit_user_id not between", value1, value2, "secondAuditUserId");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameIsNull() {
            addCriterion("second_audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameIsNotNull() {
            addCriterion("second_audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameEqualTo(String value) {
            addCriterion("second_audit_user_name =", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameNotEqualTo(String value) {
            addCriterion("second_audit_user_name <>", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameGreaterThan(String value) {
            addCriterion("second_audit_user_name >", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_audit_user_name >=", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameLessThan(String value) {
            addCriterion("second_audit_user_name <", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("second_audit_user_name <=", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameLike(String value) {
            addCriterion("second_audit_user_name like", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameNotLike(String value) {
            addCriterion("second_audit_user_name not like", value, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameIn(List<String> values) {
            addCriterion("second_audit_user_name in", values, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameNotIn(List<String> values) {
            addCriterion("second_audit_user_name not in", values, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameBetween(String value1, String value2) {
            addCriterion("second_audit_user_name between", value1, value2, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("second_audit_user_name not between", value1, value2, "secondAuditUserName");
            return (Criteria) this;
        }

        public Criteria andSecondTimeIsNull() {
            addCriterion("second_time is null");
            return (Criteria) this;
        }

        public Criteria andSecondTimeIsNotNull() {
            addCriterion("second_time is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTimeEqualTo(String value) {
            addCriterion("second_time =", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeNotEqualTo(String value) {
            addCriterion("second_time <>", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeGreaterThan(String value) {
            addCriterion("second_time >", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeGreaterThanOrEqualTo(String value) {
            addCriterion("second_time >=", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeLessThan(String value) {
            addCriterion("second_time <", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeLessThanOrEqualTo(String value) {
            addCriterion("second_time <=", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeLike(String value) {
            addCriterion("second_time like", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeNotLike(String value) {
            addCriterion("second_time not like", value, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeIn(List<String> values) {
            addCriterion("second_time in", values, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeNotIn(List<String> values) {
            addCriterion("second_time not in", values, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeBetween(String value1, String value2) {
            addCriterion("second_time between", value1, value2, "secondTime");
            return (Criteria) this;
        }

        public Criteria andSecondTimeNotBetween(String value1, String value2) {
            addCriterion("second_time not between", value1, value2, "secondTime");
            return (Criteria) this;
        }

        public Criteria andBidAmountIsNull() {
            addCriterion("bid_amount is null");
            return (Criteria) this;
        }

        public Criteria andBidAmountIsNotNull() {
            addCriterion("bid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBidAmountEqualTo(String value) {
            addCriterion("bid_amount =", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotEqualTo(String value) {
            addCriterion("bid_amount <>", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountGreaterThan(String value) {
            addCriterion("bid_amount >", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountGreaterThanOrEqualTo(String value) {
            addCriterion("bid_amount >=", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountLessThan(String value) {
            addCriterion("bid_amount <", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountLessThanOrEqualTo(String value) {
            addCriterion("bid_amount <=", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountLike(String value) {
            addCriterion("bid_amount like", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotLike(String value) {
            addCriterion("bid_amount not like", value, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountIn(List<String> values) {
            addCriterion("bid_amount in", values, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotIn(List<String> values) {
            addCriterion("bid_amount not in", values, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountBetween(String value1, String value2) {
            addCriterion("bid_amount between", value1, value2, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountNotBetween(String value1, String value2) {
            addCriterion("bid_amount not between", value1, value2, "bidAmount");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiIsNull() {
            addCriterion("bid_amount_renminbi is null");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiIsNotNull() {
            addCriterion("bid_amount_renminbi is not null");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiEqualTo(String value) {
            addCriterion("bid_amount_renminbi =", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiNotEqualTo(String value) {
            addCriterion("bid_amount_renminbi <>", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiGreaterThan(String value) {
            addCriterion("bid_amount_renminbi >", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiGreaterThanOrEqualTo(String value) {
            addCriterion("bid_amount_renminbi >=", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiLessThan(String value) {
            addCriterion("bid_amount_renminbi <", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiLessThanOrEqualTo(String value) {
            addCriterion("bid_amount_renminbi <=", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiLike(String value) {
            addCriterion("bid_amount_renminbi like", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiNotLike(String value) {
            addCriterion("bid_amount_renminbi not like", value, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiIn(List<String> values) {
            addCriterion("bid_amount_renminbi in", values, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiNotIn(List<String> values) {
            addCriterion("bid_amount_renminbi not in", values, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiBetween(String value1, String value2) {
            addCriterion("bid_amount_renminbi between", value1, value2, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andBidAmountRenminbiNotBetween(String value1, String value2) {
            addCriterion("bid_amount_renminbi not between", value1, value2, "bidAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultIsNull() {
            addCriterion("is_publish_bidresult is null");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultIsNotNull() {
            addCriterion("is_publish_bidresult is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultEqualTo(String value) {
            addCriterion("is_publish_bidresult =", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultNotEqualTo(String value) {
            addCriterion("is_publish_bidresult <>", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultGreaterThan(String value) {
            addCriterion("is_publish_bidresult >", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultGreaterThanOrEqualTo(String value) {
            addCriterion("is_publish_bidresult >=", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultLessThan(String value) {
            addCriterion("is_publish_bidresult <", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultLessThanOrEqualTo(String value) {
            addCriterion("is_publish_bidresult <=", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultLike(String value) {
            addCriterion("is_publish_bidresult like", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultNotLike(String value) {
            addCriterion("is_publish_bidresult not like", value, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultIn(List<String> values) {
            addCriterion("is_publish_bidresult in", values, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultNotIn(List<String> values) {
            addCriterion("is_publish_bidresult not in", values, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultBetween(String value1, String value2) {
            addCriterion("is_publish_bidresult between", value1, value2, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andIsPublishBidresultNotBetween(String value1, String value2) {
            addCriterion("is_publish_bidresult not between", value1, value2, "isPublishBidresult");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeIsNull() {
            addCriterion("publish_bidresult_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeIsNotNull() {
            addCriterion("publish_bidresult_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeEqualTo(Date value) {
            addCriterion("publish_bidresult_time =", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeNotEqualTo(Date value) {
            addCriterion("publish_bidresult_time <>", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeGreaterThan(Date value) {
            addCriterion("publish_bidresult_time >", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_bidresult_time >=", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeLessThan(Date value) {
            addCriterion("publish_bidresult_time <", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_bidresult_time <=", value, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeIn(List<Date> values) {
            addCriterion("publish_bidresult_time in", values, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeNotIn(List<Date> values) {
            addCriterion("publish_bidresult_time not in", values, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeBetween(Date value1, Date value2) {
            addCriterion("publish_bidresult_time between", value1, value2, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_bidresult_time not between", value1, value2, "publishBidresultTime");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridIsNull() {
            addCriterion("publish_bidresult_userid is null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridIsNotNull() {
            addCriterion("publish_bidresult_userid is not null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridEqualTo(String value) {
            addCriterion("publish_bidresult_userid =", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridNotEqualTo(String value) {
            addCriterion("publish_bidresult_userid <>", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridGreaterThan(String value) {
            addCriterion("publish_bidresult_userid >", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridGreaterThanOrEqualTo(String value) {
            addCriterion("publish_bidresult_userid >=", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridLessThan(String value) {
            addCriterion("publish_bidresult_userid <", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridLessThanOrEqualTo(String value) {
            addCriterion("publish_bidresult_userid <=", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridLike(String value) {
            addCriterion("publish_bidresult_userid like", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridNotLike(String value) {
            addCriterion("publish_bidresult_userid not like", value, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridIn(List<String> values) {
            addCriterion("publish_bidresult_userid in", values, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridNotIn(List<String> values) {
            addCriterion("publish_bidresult_userid not in", values, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridBetween(String value1, String value2) {
            addCriterion("publish_bidresult_userid between", value1, value2, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUseridNotBetween(String value1, String value2) {
            addCriterion("publish_bidresult_userid not between", value1, value2, "publishBidresultUserid");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameIsNull() {
            addCriterion("publish_bidresult_username is null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameIsNotNull() {
            addCriterion("publish_bidresult_username is not null");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameEqualTo(String value) {
            addCriterion("publish_bidresult_username =", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameNotEqualTo(String value) {
            addCriterion("publish_bidresult_username <>", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameGreaterThan(String value) {
            addCriterion("publish_bidresult_username >", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("publish_bidresult_username >=", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameLessThan(String value) {
            addCriterion("publish_bidresult_username <", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameLessThanOrEqualTo(String value) {
            addCriterion("publish_bidresult_username <=", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameLike(String value) {
            addCriterion("publish_bidresult_username like", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameNotLike(String value) {
            addCriterion("publish_bidresult_username not like", value, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameIn(List<String> values) {
            addCriterion("publish_bidresult_username in", values, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameNotIn(List<String> values) {
            addCriterion("publish_bidresult_username not in", values, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameBetween(String value1, String value2) {
            addCriterion("publish_bidresult_username between", value1, value2, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andPublishBidresultUsernameNotBetween(String value1, String value2) {
            addCriterion("publish_bidresult_username not between", value1, value2, "publishBidresultUsername");
            return (Criteria) this;
        }

        public Criteria andBidFinishedIsNull() {
            addCriterion("bid_finished is null");
            return (Criteria) this;
        }

        public Criteria andBidFinishedIsNotNull() {
            addCriterion("bid_finished is not null");
            return (Criteria) this;
        }

        public Criteria andBidFinishedEqualTo(String value) {
            addCriterion("bid_finished =", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedNotEqualTo(String value) {
            addCriterion("bid_finished <>", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedGreaterThan(String value) {
            addCriterion("bid_finished >", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("bid_finished >=", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedLessThan(String value) {
            addCriterion("bid_finished <", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedLessThanOrEqualTo(String value) {
            addCriterion("bid_finished <=", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedLike(String value) {
            addCriterion("bid_finished like", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedNotLike(String value) {
            addCriterion("bid_finished not like", value, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedIn(List<String> values) {
            addCriterion("bid_finished in", values, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedNotIn(List<String> values) {
            addCriterion("bid_finished not in", values, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedBetween(String value1, String value2) {
            addCriterion("bid_finished between", value1, value2, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andBidFinishedNotBetween(String value1, String value2) {
            addCriterion("bid_finished not between", value1, value2, "bidFinished");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeIsNull() {
            addCriterion("stop_bid_time is null");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeIsNotNull() {
            addCriterion("stop_bid_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeEqualTo(Date value) {
            addCriterion("stop_bid_time =", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeNotEqualTo(Date value) {
            addCriterion("stop_bid_time <>", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeGreaterThan(Date value) {
            addCriterion("stop_bid_time >", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("stop_bid_time >=", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeLessThan(Date value) {
            addCriterion("stop_bid_time <", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeLessThanOrEqualTo(Date value) {
            addCriterion("stop_bid_time <=", value, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeIn(List<Date> values) {
            addCriterion("stop_bid_time in", values, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeNotIn(List<Date> values) {
            addCriterion("stop_bid_time not in", values, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeBetween(Date value1, Date value2) {
            addCriterion("stop_bid_time between", value1, value2, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidTimeNotBetween(Date value1, Date value2) {
            addCriterion("stop_bid_time not between", value1, value2, "stopBidTime");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonIsNull() {
            addCriterion("stop_bid_reason is null");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonIsNotNull() {
            addCriterion("stop_bid_reason is not null");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonEqualTo(String value) {
            addCriterion("stop_bid_reason =", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonNotEqualTo(String value) {
            addCriterion("stop_bid_reason <>", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonGreaterThan(String value) {
            addCriterion("stop_bid_reason >", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonGreaterThanOrEqualTo(String value) {
            addCriterion("stop_bid_reason >=", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonLessThan(String value) {
            addCriterion("stop_bid_reason <", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonLessThanOrEqualTo(String value) {
            addCriterion("stop_bid_reason <=", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonLike(String value) {
            addCriterion("stop_bid_reason like", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonNotLike(String value) {
            addCriterion("stop_bid_reason not like", value, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonIn(List<String> values) {
            addCriterion("stop_bid_reason in", values, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonNotIn(List<String> values) {
            addCriterion("stop_bid_reason not in", values, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonBetween(String value1, String value2) {
            addCriterion("stop_bid_reason between", value1, value2, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidReasonNotBetween(String value1, String value2) {
            addCriterion("stop_bid_reason not between", value1, value2, "stopBidReason");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridIsNull() {
            addCriterion("stop_bid_userid is null");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridIsNotNull() {
            addCriterion("stop_bid_userid is not null");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridEqualTo(String value) {
            addCriterion("stop_bid_userid =", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridNotEqualTo(String value) {
            addCriterion("stop_bid_userid <>", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridGreaterThan(String value) {
            addCriterion("stop_bid_userid >", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridGreaterThanOrEqualTo(String value) {
            addCriterion("stop_bid_userid >=", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridLessThan(String value) {
            addCriterion("stop_bid_userid <", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridLessThanOrEqualTo(String value) {
            addCriterion("stop_bid_userid <=", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridLike(String value) {
            addCriterion("stop_bid_userid like", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridNotLike(String value) {
            addCriterion("stop_bid_userid not like", value, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridIn(List<String> values) {
            addCriterion("stop_bid_userid in", values, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridNotIn(List<String> values) {
            addCriterion("stop_bid_userid not in", values, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridBetween(String value1, String value2) {
            addCriterion("stop_bid_userid between", value1, value2, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUseridNotBetween(String value1, String value2) {
            addCriterion("stop_bid_userid not between", value1, value2, "stopBidUserid");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameIsNull() {
            addCriterion("stop_bid_username is null");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameIsNotNull() {
            addCriterion("stop_bid_username is not null");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameEqualTo(String value) {
            addCriterion("stop_bid_username =", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameNotEqualTo(String value) {
            addCriterion("stop_bid_username <>", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameGreaterThan(String value) {
            addCriterion("stop_bid_username >", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("stop_bid_username >=", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameLessThan(String value) {
            addCriterion("stop_bid_username <", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameLessThanOrEqualTo(String value) {
            addCriterion("stop_bid_username <=", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameLike(String value) {
            addCriterion("stop_bid_username like", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameNotLike(String value) {
            addCriterion("stop_bid_username not like", value, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameIn(List<String> values) {
            addCriterion("stop_bid_username in", values, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameNotIn(List<String> values) {
            addCriterion("stop_bid_username not in", values, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameBetween(String value1, String value2) {
            addCriterion("stop_bid_username between", value1, value2, "stopBidUsername");
            return (Criteria) this;
        }

        public Criteria andStopBidUsernameNotBetween(String value1, String value2) {
            addCriterion("stop_bid_username not between", value1, value2, "stopBidUsername");
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

        public Criteria andReAuditTimeIsNull() {
            addCriterion("re_audit_time is null");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeIsNotNull() {
            addCriterion("re_audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeEqualTo(Date value) {
            addCriterion("re_audit_time =", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeNotEqualTo(Date value) {
            addCriterion("re_audit_time <>", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeGreaterThan(Date value) {
            addCriterion("re_audit_time >", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("re_audit_time >=", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeLessThan(Date value) {
            addCriterion("re_audit_time <", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("re_audit_time <=", value, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeIn(List<Date> values) {
            addCriterion("re_audit_time in", values, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeNotIn(List<Date> values) {
            addCriterion("re_audit_time not in", values, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeBetween(Date value1, Date value2) {
            addCriterion("re_audit_time between", value1, value2, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("re_audit_time not between", value1, value2, "reAuditTime");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridIsNull() {
            addCriterion("re_audit_userid is null");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridIsNotNull() {
            addCriterion("re_audit_userid is not null");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridEqualTo(String value) {
            addCriterion("re_audit_userid =", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridNotEqualTo(String value) {
            addCriterion("re_audit_userid <>", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridGreaterThan(String value) {
            addCriterion("re_audit_userid >", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridGreaterThanOrEqualTo(String value) {
            addCriterion("re_audit_userid >=", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridLessThan(String value) {
            addCriterion("re_audit_userid <", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridLessThanOrEqualTo(String value) {
            addCriterion("re_audit_userid <=", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridLike(String value) {
            addCriterion("re_audit_userid like", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridNotLike(String value) {
            addCriterion("re_audit_userid not like", value, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridIn(List<String> values) {
            addCriterion("re_audit_userid in", values, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridNotIn(List<String> values) {
            addCriterion("re_audit_userid not in", values, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridBetween(String value1, String value2) {
            addCriterion("re_audit_userid between", value1, value2, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUseridNotBetween(String value1, String value2) {
            addCriterion("re_audit_userid not between", value1, value2, "reAuditUserid");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameIsNull() {
            addCriterion("re_audit_username is null");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameIsNotNull() {
            addCriterion("re_audit_username is not null");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameEqualTo(String value) {
            addCriterion("re_audit_username =", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameNotEqualTo(String value) {
            addCriterion("re_audit_username <>", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameGreaterThan(String value) {
            addCriterion("re_audit_username >", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("re_audit_username >=", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameLessThan(String value) {
            addCriterion("re_audit_username <", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameLessThanOrEqualTo(String value) {
            addCriterion("re_audit_username <=", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameLike(String value) {
            addCriterion("re_audit_username like", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameNotLike(String value) {
            addCriterion("re_audit_username not like", value, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameIn(List<String> values) {
            addCriterion("re_audit_username in", values, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameNotIn(List<String> values) {
            addCriterion("re_audit_username not in", values, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameBetween(String value1, String value2) {
            addCriterion("re_audit_username between", value1, value2, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditUsernameNotBetween(String value1, String value2) {
            addCriterion("re_audit_username not between", value1, value2, "reAuditUsername");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonIsNull() {
            addCriterion("re_audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonIsNotNull() {
            addCriterion("re_audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonEqualTo(String value) {
            addCriterion("re_audit_reason =", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonNotEqualTo(String value) {
            addCriterion("re_audit_reason <>", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonGreaterThan(String value) {
            addCriterion("re_audit_reason >", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("re_audit_reason >=", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonLessThan(String value) {
            addCriterion("re_audit_reason <", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("re_audit_reason <=", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonLike(String value) {
            addCriterion("re_audit_reason like", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonNotLike(String value) {
            addCriterion("re_audit_reason not like", value, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonIn(List<String> values) {
            addCriterion("re_audit_reason in", values, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonNotIn(List<String> values) {
            addCriterion("re_audit_reason not in", values, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonBetween(String value1, String value2) {
            addCriterion("re_audit_reason between", value1, value2, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andReAuditReasonNotBetween(String value1, String value2) {
            addCriterion("re_audit_reason not between", value1, value2, "reAuditReason");
            return (Criteria) this;
        }

        public Criteria andIsReauditIsNull() {
            addCriterion("is_reaudit is null");
            return (Criteria) this;
        }

        public Criteria andIsReauditIsNotNull() {
            addCriterion("is_reaudit is not null");
            return (Criteria) this;
        }

        public Criteria andIsReauditEqualTo(String value) {
            addCriterion("is_reaudit =", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditNotEqualTo(String value) {
            addCriterion("is_reaudit <>", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditGreaterThan(String value) {
            addCriterion("is_reaudit >", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditGreaterThanOrEqualTo(String value) {
            addCriterion("is_reaudit >=", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditLessThan(String value) {
            addCriterion("is_reaudit <", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditLessThanOrEqualTo(String value) {
            addCriterion("is_reaudit <=", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditLike(String value) {
            addCriterion("is_reaudit like", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditNotLike(String value) {
            addCriterion("is_reaudit not like", value, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditIn(List<String> values) {
            addCriterion("is_reaudit in", values, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditNotIn(List<String> values) {
            addCriterion("is_reaudit not in", values, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditBetween(String value1, String value2) {
            addCriterion("is_reaudit between", value1, value2, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andIsReauditNotBetween(String value1, String value2) {
            addCriterion("is_reaudit not between", value1, value2, "isReaudit");
            return (Criteria) this;
        }

        public Criteria andConfNumIsNull() {
            addCriterion("conf_num is null");
            return (Criteria) this;
        }

        public Criteria andConfNumIsNotNull() {
            addCriterion("conf_num is not null");
            return (Criteria) this;
        }

        public Criteria andConfNumEqualTo(String value) {
            addCriterion("conf_num =", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumNotEqualTo(String value) {
            addCriterion("conf_num <>", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumGreaterThan(String value) {
            addCriterion("conf_num >", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumGreaterThanOrEqualTo(String value) {
            addCriterion("conf_num >=", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumLessThan(String value) {
            addCriterion("conf_num <", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumLessThanOrEqualTo(String value) {
            addCriterion("conf_num <=", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumLike(String value) {
            addCriterion("conf_num like", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumNotLike(String value) {
            addCriterion("conf_num not like", value, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumIn(List<String> values) {
            addCriterion("conf_num in", values, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumNotIn(List<String> values) {
            addCriterion("conf_num not in", values, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumBetween(String value1, String value2) {
            addCriterion("conf_num between", value1, value2, "confNum");
            return (Criteria) this;
        }

        public Criteria andConfNumNotBetween(String value1, String value2) {
            addCriterion("conf_num not between", value1, value2, "confNum");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdIsNull() {
            addCriterion("agent_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdIsNotNull() {
            addCriterion("agent_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdEqualTo(String value) {
            addCriterion("agent_user_id =", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdNotEqualTo(String value) {
            addCriterion("agent_user_id <>", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdGreaterThan(String value) {
            addCriterion("agent_user_id >", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("agent_user_id >=", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdLessThan(String value) {
            addCriterion("agent_user_id <", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdLessThanOrEqualTo(String value) {
            addCriterion("agent_user_id <=", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdLike(String value) {
            addCriterion("agent_user_id like", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdNotLike(String value) {
            addCriterion("agent_user_id not like", value, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdIn(List<String> values) {
            addCriterion("agent_user_id in", values, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdNotIn(List<String> values) {
            addCriterion("agent_user_id not in", values, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdBetween(String value1, String value2) {
            addCriterion("agent_user_id between", value1, value2, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserIdNotBetween(String value1, String value2) {
            addCriterion("agent_user_id not between", value1, value2, "agentUserId");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameIsNull() {
            addCriterion("agent_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameIsNotNull() {
            addCriterion("agent_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameEqualTo(String value) {
            addCriterion("agent_user_name =", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameNotEqualTo(String value) {
            addCriterion("agent_user_name <>", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameGreaterThan(String value) {
            addCriterion("agent_user_name >", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_user_name >=", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameLessThan(String value) {
            addCriterion("agent_user_name <", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameLessThanOrEqualTo(String value) {
            addCriterion("agent_user_name <=", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameLike(String value) {
            addCriterion("agent_user_name like", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameNotLike(String value) {
            addCriterion("agent_user_name not like", value, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameIn(List<String> values) {
            addCriterion("agent_user_name in", values, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameNotIn(List<String> values) {
            addCriterion("agent_user_name not in", values, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameBetween(String value1, String value2) {
            addCriterion("agent_user_name between", value1, value2, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentUserNameNotBetween(String value1, String value2) {
            addCriterion("agent_user_name not between", value1, value2, "agentUserName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameIsNull() {
            addCriterion("agent_real_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameIsNotNull() {
            addCriterion("agent_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameEqualTo(String value) {
            addCriterion("agent_real_name =", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameNotEqualTo(String value) {
            addCriterion("agent_real_name <>", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameGreaterThan(String value) {
            addCriterion("agent_real_name >", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_real_name >=", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameLessThan(String value) {
            addCriterion("agent_real_name <", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameLessThanOrEqualTo(String value) {
            addCriterion("agent_real_name <=", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameLike(String value) {
            addCriterion("agent_real_name like", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameNotLike(String value) {
            addCriterion("agent_real_name not like", value, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameIn(List<String> values) {
            addCriterion("agent_real_name in", values, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameNotIn(List<String> values) {
            addCriterion("agent_real_name not in", values, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameBetween(String value1, String value2) {
            addCriterion("agent_real_name between", value1, value2, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andAgentRealNameNotBetween(String value1, String value2) {
            addCriterion("agent_real_name not between", value1, value2, "agentRealName");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNull() {
            addCriterion("deliver_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIsNotNull() {
            addCriterion("deliver_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeEqualTo(String value) {
            addCriterion("deliver_type =", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotEqualTo(String value) {
            addCriterion("deliver_type <>", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThan(String value) {
            addCriterion("deliver_type >", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_type >=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThan(String value) {
            addCriterion("deliver_type <", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLessThanOrEqualTo(String value) {
            addCriterion("deliver_type <=", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeLike(String value) {
            addCriterion("deliver_type like", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotLike(String value) {
            addCriterion("deliver_type not like", value, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeIn(List<String> values) {
            addCriterion("deliver_type in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotIn(List<String> values) {
            addCriterion("deliver_type not in", values, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeBetween(String value1, String value2) {
            addCriterion("deliver_type between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andDeliverTypeNotBetween(String value1, String value2) {
            addCriterion("deliver_type not between", value1, value2, "deliverType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNull() {
            addCriterion("transport_type is null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIsNotNull() {
            addCriterion("transport_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransportTypeEqualTo(String value) {
            addCriterion("transport_type =", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotEqualTo(String value) {
            addCriterion("transport_type <>", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThan(String value) {
            addCriterion("transport_type >", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transport_type >=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThan(String value) {
            addCriterion("transport_type <", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLessThanOrEqualTo(String value) {
            addCriterion("transport_type <=", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeLike(String value) {
            addCriterion("transport_type like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotLike(String value) {
            addCriterion("transport_type not like", value, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeIn(List<String> values) {
            addCriterion("transport_type in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotIn(List<String> values) {
            addCriterion("transport_type not in", values, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeBetween(String value1, String value2) {
            addCriterion("transport_type between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andTransportTypeNotBetween(String value1, String value2) {
            addCriterion("transport_type not between", value1, value2, "transportType");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteIsNull() {
            addCriterion("installationg_site is null");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteIsNotNull() {
            addCriterion("installationg_site is not null");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteEqualTo(String value) {
            addCriterion("installationg_site =", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteNotEqualTo(String value) {
            addCriterion("installationg_site <>", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteGreaterThan(String value) {
            addCriterion("installationg_site >", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteGreaterThanOrEqualTo(String value) {
            addCriterion("installationg_site >=", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteLessThan(String value) {
            addCriterion("installationg_site <", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteLessThanOrEqualTo(String value) {
            addCriterion("installationg_site <=", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteLike(String value) {
            addCriterion("installationg_site like", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteNotLike(String value) {
            addCriterion("installationg_site not like", value, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteIn(List<String> values) {
            addCriterion("installationg_site in", values, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteNotIn(List<String> values) {
            addCriterion("installationg_site not in", values, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteBetween(String value1, String value2) {
            addCriterion("installationg_site between", value1, value2, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andInstallationgSiteNotBetween(String value1, String value2) {
            addCriterion("installationg_site not between", value1, value2, "installationgSite");
            return (Criteria) this;
        }

        public Criteria andPackLevelIsNull() {
            addCriterion("pack_level is null");
            return (Criteria) this;
        }

        public Criteria andPackLevelIsNotNull() {
            addCriterion("pack_level is not null");
            return (Criteria) this;
        }

        public Criteria andPackLevelEqualTo(String value) {
            addCriterion("pack_level =", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelNotEqualTo(String value) {
            addCriterion("pack_level <>", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelGreaterThan(String value) {
            addCriterion("pack_level >", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelGreaterThanOrEqualTo(String value) {
            addCriterion("pack_level >=", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelLessThan(String value) {
            addCriterion("pack_level <", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelLessThanOrEqualTo(String value) {
            addCriterion("pack_level <=", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelLike(String value) {
            addCriterion("pack_level like", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelNotLike(String value) {
            addCriterion("pack_level not like", value, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelIn(List<String> values) {
            addCriterion("pack_level in", values, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelNotIn(List<String> values) {
            addCriterion("pack_level not in", values, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelBetween(String value1, String value2) {
            addCriterion("pack_level between", value1, value2, "packLevel");
            return (Criteria) this;
        }

        public Criteria andPackLevelNotBetween(String value1, String value2) {
            addCriterion("pack_level not between", value1, value2, "packLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelIsNull() {
            addCriterion("accpetance_level is null");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelIsNotNull() {
            addCriterion("accpetance_level is not null");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelEqualTo(String value) {
            addCriterion("accpetance_level =", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelNotEqualTo(String value) {
            addCriterion("accpetance_level <>", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelGreaterThan(String value) {
            addCriterion("accpetance_level >", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("accpetance_level >=", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelLessThan(String value) {
            addCriterion("accpetance_level <", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelLessThanOrEqualTo(String value) {
            addCriterion("accpetance_level <=", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelLike(String value) {
            addCriterion("accpetance_level like", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelNotLike(String value) {
            addCriterion("accpetance_level not like", value, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelIn(List<String> values) {
            addCriterion("accpetance_level in", values, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelNotIn(List<String> values) {
            addCriterion("accpetance_level not in", values, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelBetween(String value1, String value2) {
            addCriterion("accpetance_level between", value1, value2, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andAccpetanceLevelNotBetween(String value1, String value2) {
            addCriterion("accpetance_level not between", value1, value2, "accpetanceLevel");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditIsNull() {
            addCriterion("is_finance_audit is null");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditIsNotNull() {
            addCriterion("is_finance_audit is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditEqualTo(String value) {
            addCriterion("is_finance_audit =", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditNotEqualTo(String value) {
            addCriterion("is_finance_audit <>", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditGreaterThan(String value) {
            addCriterion("is_finance_audit >", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditGreaterThanOrEqualTo(String value) {
            addCriterion("is_finance_audit >=", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditLessThan(String value) {
            addCriterion("is_finance_audit <", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditLessThanOrEqualTo(String value) {
            addCriterion("is_finance_audit <=", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditLike(String value) {
            addCriterion("is_finance_audit like", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditNotLike(String value) {
            addCriterion("is_finance_audit not like", value, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditIn(List<String> values) {
            addCriterion("is_finance_audit in", values, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditNotIn(List<String> values) {
            addCriterion("is_finance_audit not in", values, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditBetween(String value1, String value2) {
            addCriterion("is_finance_audit between", value1, value2, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andIsFinanceAuditNotBetween(String value1, String value2) {
            addCriterion("is_finance_audit not between", value1, value2, "isFinanceAudit");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdIsNull() {
            addCriterion("finance_audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdIsNotNull() {
            addCriterion("finance_audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdEqualTo(String value) {
            addCriterion("finance_audit_user_id =", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdNotEqualTo(String value) {
            addCriterion("finance_audit_user_id <>", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdGreaterThan(String value) {
            addCriterion("finance_audit_user_id >", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("finance_audit_user_id >=", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdLessThan(String value) {
            addCriterion("finance_audit_user_id <", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdLessThanOrEqualTo(String value) {
            addCriterion("finance_audit_user_id <=", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdLike(String value) {
            addCriterion("finance_audit_user_id like", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdNotLike(String value) {
            addCriterion("finance_audit_user_id not like", value, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdIn(List<String> values) {
            addCriterion("finance_audit_user_id in", values, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdNotIn(List<String> values) {
            addCriterion("finance_audit_user_id not in", values, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdBetween(String value1, String value2) {
            addCriterion("finance_audit_user_id between", value1, value2, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserIdNotBetween(String value1, String value2) {
            addCriterion("finance_audit_user_id not between", value1, value2, "financeAuditUserId");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameIsNull() {
            addCriterion("finance_audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameIsNotNull() {
            addCriterion("finance_audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameEqualTo(String value) {
            addCriterion("finance_audit_user_name =", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameNotEqualTo(String value) {
            addCriterion("finance_audit_user_name <>", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameGreaterThan(String value) {
            addCriterion("finance_audit_user_name >", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("finance_audit_user_name >=", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameLessThan(String value) {
            addCriterion("finance_audit_user_name <", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("finance_audit_user_name <=", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameLike(String value) {
            addCriterion("finance_audit_user_name like", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameNotLike(String value) {
            addCriterion("finance_audit_user_name not like", value, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameIn(List<String> values) {
            addCriterion("finance_audit_user_name in", values, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameNotIn(List<String> values) {
            addCriterion("finance_audit_user_name not in", values, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameBetween(String value1, String value2) {
            addCriterion("finance_audit_user_name between", value1, value2, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("finance_audit_user_name not between", value1, value2, "financeAuditUserName");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonIsNull() {
            addCriterion("finance_audit_reason is null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonIsNotNull() {
            addCriterion("finance_audit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonEqualTo(String value) {
            addCriterion("finance_audit_reason =", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonNotEqualTo(String value) {
            addCriterion("finance_audit_reason <>", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonGreaterThan(String value) {
            addCriterion("finance_audit_reason >", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonGreaterThanOrEqualTo(String value) {
            addCriterion("finance_audit_reason >=", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonLessThan(String value) {
            addCriterion("finance_audit_reason <", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonLessThanOrEqualTo(String value) {
            addCriterion("finance_audit_reason <=", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonLike(String value) {
            addCriterion("finance_audit_reason like", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonNotLike(String value) {
            addCriterion("finance_audit_reason not like", value, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonIn(List<String> values) {
            addCriterion("finance_audit_reason in", values, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonNotIn(List<String> values) {
            addCriterion("finance_audit_reason not in", values, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonBetween(String value1, String value2) {
            addCriterion("finance_audit_reason between", value1, value2, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andFinanceAuditReasonNotBetween(String value1, String value2) {
            addCriterion("finance_audit_reason not between", value1, value2, "financeAuditReason");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitIsNull() {
            addCriterion("is_auto_submit is null");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitIsNotNull() {
            addCriterion("is_auto_submit is not null");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitEqualTo(String value) {
            addCriterion("is_auto_submit =", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitNotEqualTo(String value) {
            addCriterion("is_auto_submit <>", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitGreaterThan(String value) {
            addCriterion("is_auto_submit >", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitGreaterThanOrEqualTo(String value) {
            addCriterion("is_auto_submit >=", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitLessThan(String value) {
            addCriterion("is_auto_submit <", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitLessThanOrEqualTo(String value) {
            addCriterion("is_auto_submit <=", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitLike(String value) {
            addCriterion("is_auto_submit like", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitNotLike(String value) {
            addCriterion("is_auto_submit not like", value, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitIn(List<String> values) {
            addCriterion("is_auto_submit in", values, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitNotIn(List<String> values) {
            addCriterion("is_auto_submit not in", values, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitBetween(String value1, String value2) {
            addCriterion("is_auto_submit between", value1, value2, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andIsAutoSubmitNotBetween(String value1, String value2) {
            addCriterion("is_auto_submit not between", value1, value2, "isAutoSubmit");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNull() {
            addCriterion("pause_reason is null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNotNull() {
            addCriterion("pause_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonEqualTo(String value) {
            addCriterion("pause_reason =", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotEqualTo(String value) {
            addCriterion("pause_reason <>", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThan(String value) {
            addCriterion("pause_reason >", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("pause_reason >=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThan(String value) {
            addCriterion("pause_reason <", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThanOrEqualTo(String value) {
            addCriterion("pause_reason <=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLike(String value) {
            addCriterion("pause_reason like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotLike(String value) {
            addCriterion("pause_reason not like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIn(List<String> values) {
            addCriterion("pause_reason in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotIn(List<String> values) {
            addCriterion("pause_reason not in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonBetween(String value1, String value2) {
            addCriterion("pause_reason between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotBetween(String value1, String value2) {
            addCriterion("pause_reason not between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleIsNull() {
            addCriterion("winning_principle is null");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleIsNotNull() {
            addCriterion("winning_principle is not null");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleEqualTo(String value) {
            addCriterion("winning_principle =", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleNotEqualTo(String value) {
            addCriterion("winning_principle <>", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleGreaterThan(String value) {
            addCriterion("winning_principle >", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleGreaterThanOrEqualTo(String value) {
            addCriterion("winning_principle >=", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleLessThan(String value) {
            addCriterion("winning_principle <", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleLessThanOrEqualTo(String value) {
            addCriterion("winning_principle <=", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleLike(String value) {
            addCriterion("winning_principle like", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleNotLike(String value) {
            addCriterion("winning_principle not like", value, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleIn(List<String> values) {
            addCriterion("winning_principle in", values, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleNotIn(List<String> values) {
            addCriterion("winning_principle not in", values, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleBetween(String value1, String value2) {
            addCriterion("winning_principle between", value1, value2, "winningPrinciple");
            return (Criteria) this;
        }

        public Criteria andWinningPrincipleNotBetween(String value1, String value2) {
            addCriterion("winning_principle not between", value1, value2, "winningPrinciple");
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