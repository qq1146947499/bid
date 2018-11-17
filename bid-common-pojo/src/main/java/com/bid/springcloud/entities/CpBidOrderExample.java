package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpBidOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpBidOrderExample() {
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

        public Criteria andBidInfoIdIsNull() {
            addCriterion("bid_info_id is null");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdIsNotNull() {
            addCriterion("bid_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdEqualTo(Integer value) {
            addCriterion("bid_info_id =", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotEqualTo(Integer value) {
            addCriterion("bid_info_id <>", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdGreaterThan(Integer value) {
            addCriterion("bid_info_id >", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_info_id >=", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdLessThan(Integer value) {
            addCriterion("bid_info_id <", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("bid_info_id <=", value, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdIn(List<Integer> values) {
            addCriterion("bid_info_id in", values, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotIn(List<Integer> values) {
            addCriterion("bid_info_id not in", values, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("bid_info_id between", value1, value2, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andBidInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_info_id not between", value1, value2, "bidInfoId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("detail_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("detail_id =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("detail_id <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("detail_id >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("detail_id >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("detail_id <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("detail_id <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("detail_id like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("detail_id not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("detail_id in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("detail_id not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("detail_id between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("detail_id not between", value1, value2, "detailId");
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

        public Criteria andSourceCompanyIdIsNull() {
            addCriterion("source_company_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdIsNotNull() {
            addCriterion("source_company_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdEqualTo(String value) {
            addCriterion("source_company_id =", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdNotEqualTo(String value) {
            addCriterion("source_company_id <>", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdGreaterThan(String value) {
            addCriterion("source_company_id >", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_company_id >=", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdLessThan(String value) {
            addCriterion("source_company_id <", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("source_company_id <=", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdLike(String value) {
            addCriterion("source_company_id like", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdNotLike(String value) {
            addCriterion("source_company_id not like", value, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdIn(List<String> values) {
            addCriterion("source_company_id in", values, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdNotIn(List<String> values) {
            addCriterion("source_company_id not in", values, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdBetween(String value1, String value2) {
            addCriterion("source_company_id between", value1, value2, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andSourceCompanyIdNotBetween(String value1, String value2) {
            addCriterion("source_company_id not between", value1, value2, "sourceCompanyId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNull() {
            addCriterion("bid_price is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(String value) {
            addCriterion("bid_price =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(String value) {
            addCriterion("bid_price <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(String value) {
            addCriterion("bid_price >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(String value) {
            addCriterion("bid_price >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(String value) {
            addCriterion("bid_price <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(String value) {
            addCriterion("bid_price <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLike(String value) {
            addCriterion("bid_price like", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotLike(String value) {
            addCriterion("bid_price not like", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<String> values) {
            addCriterion("bid_price in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<String> values) {
            addCriterion("bid_price not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(String value1, String value2) {
            addCriterion("bid_price between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(String value1, String value2) {
            addCriterion("bid_price not between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(String value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(String value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(String value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(String value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(String value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLike(String value) {
            addCriterion("total_amount like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotLike(String value) {
            addCriterion("total_amount not like", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<String> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<String> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(String value1, String value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(String value1, String value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiIsNull() {
            addCriterion("total_amount_renminbi is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiIsNotNull() {
            addCriterion("total_amount_renminbi is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiEqualTo(String value) {
            addCriterion("total_amount_renminbi =", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiNotEqualTo(String value) {
            addCriterion("total_amount_renminbi <>", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiGreaterThan(String value) {
            addCriterion("total_amount_renminbi >", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiGreaterThanOrEqualTo(String value) {
            addCriterion("total_amount_renminbi >=", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiLessThan(String value) {
            addCriterion("total_amount_renminbi <", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiLessThanOrEqualTo(String value) {
            addCriterion("total_amount_renminbi <=", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiLike(String value) {
            addCriterion("total_amount_renminbi like", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiNotLike(String value) {
            addCriterion("total_amount_renminbi not like", value, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiIn(List<String> values) {
            addCriterion("total_amount_renminbi in", values, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiNotIn(List<String> values) {
            addCriterion("total_amount_renminbi not in", values, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiBetween(String value1, String value2) {
            addCriterion("total_amount_renminbi between", value1, value2, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andTotalAmountRenminbiNotBetween(String value1, String value2) {
            addCriterion("total_amount_renminbi not between", value1, value2, "totalAmountRenminbi");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIsNull() {
            addCriterion("after_service is null");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIsNotNull() {
            addCriterion("after_service is not null");
            return (Criteria) this;
        }

        public Criteria andAfterServiceEqualTo(String value) {
            addCriterion("after_service =", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotEqualTo(String value) {
            addCriterion("after_service <>", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceGreaterThan(String value) {
            addCriterion("after_service >", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceGreaterThanOrEqualTo(String value) {
            addCriterion("after_service >=", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLessThan(String value) {
            addCriterion("after_service <", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLessThanOrEqualTo(String value) {
            addCriterion("after_service <=", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceLike(String value) {
            addCriterion("after_service like", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotLike(String value) {
            addCriterion("after_service not like", value, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceIn(List<String> values) {
            addCriterion("after_service in", values, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotIn(List<String> values) {
            addCriterion("after_service not in", values, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceBetween(String value1, String value2) {
            addCriterion("after_service between", value1, value2, "afterService");
            return (Criteria) this;
        }

        public Criteria andAfterServiceNotBetween(String value1, String value2) {
            addCriterion("after_service not between", value1, value2, "afterService");
            return (Criteria) this;
        }

        public Criteria andIsFulfilIsNull() {
            addCriterion("is_fulfil is null");
            return (Criteria) this;
        }

        public Criteria andIsFulfilIsNotNull() {
            addCriterion("is_fulfil is not null");
            return (Criteria) this;
        }

        public Criteria andIsFulfilEqualTo(String value) {
            addCriterion("is_fulfil =", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilNotEqualTo(String value) {
            addCriterion("is_fulfil <>", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilGreaterThan(String value) {
            addCriterion("is_fulfil >", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilGreaterThanOrEqualTo(String value) {
            addCriterion("is_fulfil >=", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilLessThan(String value) {
            addCriterion("is_fulfil <", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilLessThanOrEqualTo(String value) {
            addCriterion("is_fulfil <=", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilLike(String value) {
            addCriterion("is_fulfil like", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilNotLike(String value) {
            addCriterion("is_fulfil not like", value, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilIn(List<String> values) {
            addCriterion("is_fulfil in", values, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilNotIn(List<String> values) {
            addCriterion("is_fulfil not in", values, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilBetween(String value1, String value2) {
            addCriterion("is_fulfil between", value1, value2, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andIsFulfilNotBetween(String value1, String value2) {
            addCriterion("is_fulfil not between", value1, value2, "isFulfil");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescIsNull() {
            addCriterion("diffrences_desc is null");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescIsNotNull() {
            addCriterion("diffrences_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescEqualTo(String value) {
            addCriterion("diffrences_desc =", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescNotEqualTo(String value) {
            addCriterion("diffrences_desc <>", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescGreaterThan(String value) {
            addCriterion("diffrences_desc >", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescGreaterThanOrEqualTo(String value) {
            addCriterion("diffrences_desc >=", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescLessThan(String value) {
            addCriterion("diffrences_desc <", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescLessThanOrEqualTo(String value) {
            addCriterion("diffrences_desc <=", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescLike(String value) {
            addCriterion("diffrences_desc like", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescNotLike(String value) {
            addCriterion("diffrences_desc not like", value, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescIn(List<String> values) {
            addCriterion("diffrences_desc in", values, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescNotIn(List<String> values) {
            addCriterion("diffrences_desc not in", values, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescBetween(String value1, String value2) {
            addCriterion("diffrences_desc between", value1, value2, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andDiffrencesDescNotBetween(String value1, String value2) {
            addCriterion("diffrences_desc not between", value1, value2, "diffrencesDesc");
            return (Criteria) this;
        }

        public Criteria andBidPersonIsNull() {
            addCriterion("bid_person is null");
            return (Criteria) this;
        }

        public Criteria andBidPersonIsNotNull() {
            addCriterion("bid_person is not null");
            return (Criteria) this;
        }

        public Criteria andBidPersonEqualTo(String value) {
            addCriterion("bid_person =", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonNotEqualTo(String value) {
            addCriterion("bid_person <>", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonGreaterThan(String value) {
            addCriterion("bid_person >", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonGreaterThanOrEqualTo(String value) {
            addCriterion("bid_person >=", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonLessThan(String value) {
            addCriterion("bid_person <", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonLessThanOrEqualTo(String value) {
            addCriterion("bid_person <=", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonLike(String value) {
            addCriterion("bid_person like", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonNotLike(String value) {
            addCriterion("bid_person not like", value, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonIn(List<String> values) {
            addCriterion("bid_person in", values, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonNotIn(List<String> values) {
            addCriterion("bid_person not in", values, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonBetween(String value1, String value2) {
            addCriterion("bid_person between", value1, value2, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidPersonNotBetween(String value1, String value2) {
            addCriterion("bid_person not between", value1, value2, "bidPerson");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIsNull() {
            addCriterion("bid_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIsNotNull() {
            addCriterion("bid_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidUserIdEqualTo(String value) {
            addCriterion("bid_user_id =", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotEqualTo(String value) {
            addCriterion("bid_user_id <>", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdGreaterThan(String value) {
            addCriterion("bid_user_id >", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("bid_user_id >=", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdLessThan(String value) {
            addCriterion("bid_user_id <", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdLessThanOrEqualTo(String value) {
            addCriterion("bid_user_id <=", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdLike(String value) {
            addCriterion("bid_user_id like", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotLike(String value) {
            addCriterion("bid_user_id not like", value, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdIn(List<String> values) {
            addCriterion("bid_user_id in", values, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotIn(List<String> values) {
            addCriterion("bid_user_id not in", values, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdBetween(String value1, String value2) {
            addCriterion("bid_user_id between", value1, value2, "bidUserId");
            return (Criteria) this;
        }

        public Criteria andBidUserIdNotBetween(String value1, String value2) {
            addCriterion("bid_user_id not between", value1, value2, "bidUserId");
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

        public Criteria andBidTimeIsNull() {
            addCriterion("bid_time is null");
            return (Criteria) this;
        }

        public Criteria andBidTimeIsNotNull() {
            addCriterion("bid_time is not null");
            return (Criteria) this;
        }

        public Criteria andBidTimeEqualTo(String value) {
            addCriterion("bid_time =", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotEqualTo(String value) {
            addCriterion("bid_time <>", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThan(String value) {
            addCriterion("bid_time >", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("bid_time >=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThan(String value) {
            addCriterion("bid_time <", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLessThanOrEqualTo(String value) {
            addCriterion("bid_time <=", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeLike(String value) {
            addCriterion("bid_time like", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotLike(String value) {
            addCriterion("bid_time not like", value, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeIn(List<String> values) {
            addCriterion("bid_time in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotIn(List<String> values) {
            addCriterion("bid_time not in", values, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeBetween(String value1, String value2) {
            addCriterion("bid_time between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidTimeNotBetween(String value1, String value2) {
            addCriterion("bid_time not between", value1, value2, "bidTime");
            return (Criteria) this;
        }

        public Criteria andBidStatusIsNull() {
            addCriterion("bid_status is null");
            return (Criteria) this;
        }

        public Criteria andBidStatusIsNotNull() {
            addCriterion("bid_status is not null");
            return (Criteria) this;
        }

        public Criteria andBidStatusEqualTo(String value) {
            addCriterion("bid_status =", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusNotEqualTo(String value) {
            addCriterion("bid_status <>", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusGreaterThan(String value) {
            addCriterion("bid_status >", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bid_status >=", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusLessThan(String value) {
            addCriterion("bid_status <", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusLessThanOrEqualTo(String value) {
            addCriterion("bid_status <=", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusLike(String value) {
            addCriterion("bid_status like", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusNotLike(String value) {
            addCriterion("bid_status not like", value, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusIn(List<String> values) {
            addCriterion("bid_status in", values, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusNotIn(List<String> values) {
            addCriterion("bid_status not in", values, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusBetween(String value1, String value2) {
            addCriterion("bid_status between", value1, value2, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidStatusNotBetween(String value1, String value2) {
            addCriterion("bid_status not between", value1, value2, "bidStatus");
            return (Criteria) this;
        }

        public Criteria andBidReasonIsNull() {
            addCriterion("bid_reason is null");
            return (Criteria) this;
        }

        public Criteria andBidReasonIsNotNull() {
            addCriterion("bid_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBidReasonEqualTo(String value) {
            addCriterion("bid_reason =", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonNotEqualTo(String value) {
            addCriterion("bid_reason <>", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonGreaterThan(String value) {
            addCriterion("bid_reason >", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonGreaterThanOrEqualTo(String value) {
            addCriterion("bid_reason >=", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonLessThan(String value) {
            addCriterion("bid_reason <", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonLessThanOrEqualTo(String value) {
            addCriterion("bid_reason <=", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonLike(String value) {
            addCriterion("bid_reason like", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonNotLike(String value) {
            addCriterion("bid_reason not like", value, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonIn(List<String> values) {
            addCriterion("bid_reason in", values, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonNotIn(List<String> values) {
            addCriterion("bid_reason not in", values, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonBetween(String value1, String value2) {
            addCriterion("bid_reason between", value1, value2, "bidReason");
            return (Criteria) this;
        }

        public Criteria andBidReasonNotBetween(String value1, String value2) {
            addCriterion("bid_reason not between", value1, value2, "bidReason");
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

        public Criteria andIsInquireIsNull() {
            addCriterion("is_inquire is null");
            return (Criteria) this;
        }

        public Criteria andIsInquireIsNotNull() {
            addCriterion("is_inquire is not null");
            return (Criteria) this;
        }

        public Criteria andIsInquireEqualTo(String value) {
            addCriterion("is_inquire =", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireNotEqualTo(String value) {
            addCriterion("is_inquire <>", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireGreaterThan(String value) {
            addCriterion("is_inquire >", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireGreaterThanOrEqualTo(String value) {
            addCriterion("is_inquire >=", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireLessThan(String value) {
            addCriterion("is_inquire <", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireLessThanOrEqualTo(String value) {
            addCriterion("is_inquire <=", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireLike(String value) {
            addCriterion("is_inquire like", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireNotLike(String value) {
            addCriterion("is_inquire not like", value, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireIn(List<String> values) {
            addCriterion("is_inquire in", values, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireNotIn(List<String> values) {
            addCriterion("is_inquire not in", values, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireBetween(String value1, String value2) {
            addCriterion("is_inquire between", value1, value2, "isInquire");
            return (Criteria) this;
        }

        public Criteria andIsInquireNotBetween(String value1, String value2) {
            addCriterion("is_inquire not between", value1, value2, "isInquire");
            return (Criteria) this;
        }

        public Criteria andCelNumIsNull() {
            addCriterion("cel_num is null");
            return (Criteria) this;
        }

        public Criteria andCelNumIsNotNull() {
            addCriterion("cel_num is not null");
            return (Criteria) this;
        }

        public Criteria andCelNumEqualTo(String value) {
            addCriterion("cel_num =", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumNotEqualTo(String value) {
            addCriterion("cel_num <>", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumGreaterThan(String value) {
            addCriterion("cel_num >", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumGreaterThanOrEqualTo(String value) {
            addCriterion("cel_num >=", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumLessThan(String value) {
            addCriterion("cel_num <", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumLessThanOrEqualTo(String value) {
            addCriterion("cel_num <=", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumLike(String value) {
            addCriterion("cel_num like", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumNotLike(String value) {
            addCriterion("cel_num not like", value, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumIn(List<String> values) {
            addCriterion("cel_num in", values, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumNotIn(List<String> values) {
            addCriterion("cel_num not in", values, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumBetween(String value1, String value2) {
            addCriterion("cel_num between", value1, value2, "celNum");
            return (Criteria) this;
        }

        public Criteria andCelNumNotBetween(String value1, String value2) {
            addCriterion("cel_num not between", value1, value2, "celNum");
            return (Criteria) this;
        }

        public Criteria andEccNumIsNull() {
            addCriterion("ecc_num is null");
            return (Criteria) this;
        }

        public Criteria andEccNumIsNotNull() {
            addCriterion("ecc_num is not null");
            return (Criteria) this;
        }

        public Criteria andEccNumEqualTo(String value) {
            addCriterion("ecc_num =", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumNotEqualTo(String value) {
            addCriterion("ecc_num <>", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumGreaterThan(String value) {
            addCriterion("ecc_num >", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumGreaterThanOrEqualTo(String value) {
            addCriterion("ecc_num >=", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumLessThan(String value) {
            addCriterion("ecc_num <", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumLessThanOrEqualTo(String value) {
            addCriterion("ecc_num <=", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumLike(String value) {
            addCriterion("ecc_num like", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumNotLike(String value) {
            addCriterion("ecc_num not like", value, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumIn(List<String> values) {
            addCriterion("ecc_num in", values, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumNotIn(List<String> values) {
            addCriterion("ecc_num not in", values, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumBetween(String value1, String value2) {
            addCriterion("ecc_num between", value1, value2, "eccNum");
            return (Criteria) this;
        }

        public Criteria andEccNumNotBetween(String value1, String value2) {
            addCriterion("ecc_num not between", value1, value2, "eccNum");
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

        public Criteria andWarrantyPeriodIsNull() {
            addCriterion("warranty_period is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodIsNotNull() {
            addCriterion("warranty_period is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodEqualTo(String value) {
            addCriterion("warranty_period =", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotEqualTo(String value) {
            addCriterion("warranty_period <>", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodGreaterThan(String value) {
            addCriterion("warranty_period >", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_period >=", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLessThan(String value) {
            addCriterion("warranty_period <", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLessThanOrEqualTo(String value) {
            addCriterion("warranty_period <=", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLike(String value) {
            addCriterion("warranty_period like", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotLike(String value) {
            addCriterion("warranty_period not like", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodIn(List<String> values) {
            addCriterion("warranty_period in", values, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotIn(List<String> values) {
            addCriterion("warranty_period not in", values, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodBetween(String value1, String value2) {
            addCriterion("warranty_period between", value1, value2, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotBetween(String value1, String value2) {
            addCriterion("warranty_period not between", value1, value2, "warrantyPeriod");
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