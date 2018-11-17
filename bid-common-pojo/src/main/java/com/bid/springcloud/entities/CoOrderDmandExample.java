package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoOrderDmandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoOrderDmandExample() {
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

        public Criteria andDmainIdIsNull() {
            addCriterion("dmain_id is null");
            return (Criteria) this;
        }

        public Criteria andDmainIdIsNotNull() {
            addCriterion("dmain_id is not null");
            return (Criteria) this;
        }

        public Criteria andDmainIdEqualTo(String value) {
            addCriterion("dmain_id =", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdNotEqualTo(String value) {
            addCriterion("dmain_id <>", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdGreaterThan(String value) {
            addCriterion("dmain_id >", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdGreaterThanOrEqualTo(String value) {
            addCriterion("dmain_id >=", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdLessThan(String value) {
            addCriterion("dmain_id <", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdLessThanOrEqualTo(String value) {
            addCriterion("dmain_id <=", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdLike(String value) {
            addCriterion("dmain_id like", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdNotLike(String value) {
            addCriterion("dmain_id not like", value, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdIn(List<String> values) {
            addCriterion("dmain_id in", values, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdNotIn(List<String> values) {
            addCriterion("dmain_id not in", values, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdBetween(String value1, String value2) {
            addCriterion("dmain_id between", value1, value2, "dmainId");
            return (Criteria) this;
        }

        public Criteria andDmainIdNotBetween(String value1, String value2) {
            addCriterion("dmain_id not between", value1, value2, "dmainId");
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

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andInquirePriceIsNull() {
            addCriterion("inquire_price is null");
            return (Criteria) this;
        }

        public Criteria andInquirePriceIsNotNull() {
            addCriterion("inquire_price is not null");
            return (Criteria) this;
        }

        public Criteria andInquirePriceEqualTo(String value) {
            addCriterion("inquire_price =", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceNotEqualTo(String value) {
            addCriterion("inquire_price <>", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceGreaterThan(String value) {
            addCriterion("inquire_price >", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceGreaterThanOrEqualTo(String value) {
            addCriterion("inquire_price >=", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceLessThan(String value) {
            addCriterion("inquire_price <", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceLessThanOrEqualTo(String value) {
            addCriterion("inquire_price <=", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceLike(String value) {
            addCriterion("inquire_price like", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceNotLike(String value) {
            addCriterion("inquire_price not like", value, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceIn(List<String> values) {
            addCriterion("inquire_price in", values, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceNotIn(List<String> values) {
            addCriterion("inquire_price not in", values, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceBetween(String value1, String value2) {
            addCriterion("inquire_price between", value1, value2, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andInquirePriceNotBetween(String value1, String value2) {
            addCriterion("inquire_price not between", value1, value2, "inquirePrice");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyIsNull() {
            addCriterion("price_company is null");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyIsNotNull() {
            addCriterion("price_company is not null");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyEqualTo(String value) {
            addCriterion("price_company =", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyNotEqualTo(String value) {
            addCriterion("price_company <>", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyGreaterThan(String value) {
            addCriterion("price_company >", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("price_company >=", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyLessThan(String value) {
            addCriterion("price_company <", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyLessThanOrEqualTo(String value) {
            addCriterion("price_company <=", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyLike(String value) {
            addCriterion("price_company like", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyNotLike(String value) {
            addCriterion("price_company not like", value, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyIn(List<String> values) {
            addCriterion("price_company in", values, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyNotIn(List<String> values) {
            addCriterion("price_company not in", values, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyBetween(String value1, String value2) {
            addCriterion("price_company between", value1, value2, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andPriceCompanyNotBetween(String value1, String value2) {
            addCriterion("price_company not between", value1, value2, "priceCompany");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNull() {
            addCriterion("is_standard is null");
            return (Criteria) this;
        }

        public Criteria andIsStandardIsNotNull() {
            addCriterion("is_standard is not null");
            return (Criteria) this;
        }

        public Criteria andIsStandardEqualTo(String value) {
            addCriterion("is_standard =", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotEqualTo(String value) {
            addCriterion("is_standard <>", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThan(String value) {
            addCriterion("is_standard >", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardGreaterThanOrEqualTo(String value) {
            addCriterion("is_standard >=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThan(String value) {
            addCriterion("is_standard <", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLessThanOrEqualTo(String value) {
            addCriterion("is_standard <=", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardLike(String value) {
            addCriterion("is_standard like", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotLike(String value) {
            addCriterion("is_standard not like", value, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardIn(List<String> values) {
            addCriterion("is_standard in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotIn(List<String> values) {
            addCriterion("is_standard not in", values, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardBetween(String value1, String value2) {
            addCriterion("is_standard between", value1, value2, "isStandard");
            return (Criteria) this;
        }

        public Criteria andIsStandardNotBetween(String value1, String value2) {
            addCriterion("is_standard not between", value1, value2, "isStandard");
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

        public Criteria andStatus3IsNull() {
            addCriterion("status3 is null");
            return (Criteria) this;
        }

        public Criteria andStatus3IsNotNull() {
            addCriterion("status3 is not null");
            return (Criteria) this;
        }

        public Criteria andStatus3EqualTo(String value) {
            addCriterion("status3 =", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotEqualTo(String value) {
            addCriterion("status3 <>", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3GreaterThan(String value) {
            addCriterion("status3 >", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3GreaterThanOrEqualTo(String value) {
            addCriterion("status3 >=", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3LessThan(String value) {
            addCriterion("status3 <", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3LessThanOrEqualTo(String value) {
            addCriterion("status3 <=", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3Like(String value) {
            addCriterion("status3 like", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotLike(String value) {
            addCriterion("status3 not like", value, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3In(List<String> values) {
            addCriterion("status3 in", values, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotIn(List<String> values) {
            addCriterion("status3 not in", values, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3Between(String value1, String value2) {
            addCriterion("status3 between", value1, value2, "status3");
            return (Criteria) this;
        }

        public Criteria andStatus3NotBetween(String value1, String value2) {
            addCriterion("status3 not between", value1, value2, "status3");
            return (Criteria) this;
        }

        public Criteria andInitBidIdIsNull() {
            addCriterion("init_bid_id is null");
            return (Criteria) this;
        }

        public Criteria andInitBidIdIsNotNull() {
            addCriterion("init_bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andInitBidIdEqualTo(String value) {
            addCriterion("init_bid_id =", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdNotEqualTo(String value) {
            addCriterion("init_bid_id <>", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdGreaterThan(String value) {
            addCriterion("init_bid_id >", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdGreaterThanOrEqualTo(String value) {
            addCriterion("init_bid_id >=", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdLessThan(String value) {
            addCriterion("init_bid_id <", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdLessThanOrEqualTo(String value) {
            addCriterion("init_bid_id <=", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdLike(String value) {
            addCriterion("init_bid_id like", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdNotLike(String value) {
            addCriterion("init_bid_id not like", value, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdIn(List<String> values) {
            addCriterion("init_bid_id in", values, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdNotIn(List<String> values) {
            addCriterion("init_bid_id not in", values, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdBetween(String value1, String value2) {
            addCriterion("init_bid_id between", value1, value2, "initBidId");
            return (Criteria) this;
        }

        public Criteria andInitBidIdNotBetween(String value1, String value2) {
            addCriterion("init_bid_id not between", value1, value2, "initBidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNull() {
            addCriterion("bid_id is null");
            return (Criteria) this;
        }

        public Criteria andBidIdIsNotNull() {
            addCriterion("bid_id is not null");
            return (Criteria) this;
        }

        public Criteria andBidIdEqualTo(String value) {
            addCriterion("bid_id =", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotEqualTo(String value) {
            addCriterion("bid_id <>", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThan(String value) {
            addCriterion("bid_id >", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdGreaterThanOrEqualTo(String value) {
            addCriterion("bid_id >=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThan(String value) {
            addCriterion("bid_id <", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLessThanOrEqualTo(String value) {
            addCriterion("bid_id <=", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdLike(String value) {
            addCriterion("bid_id like", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotLike(String value) {
            addCriterion("bid_id not like", value, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdIn(List<String> values) {
            addCriterion("bid_id in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotIn(List<String> values) {
            addCriterion("bid_id not in", values, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdBetween(String value1, String value2) {
            addCriterion("bid_id between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andBidIdNotBetween(String value1, String value2) {
            addCriterion("bid_id not between", value1, value2, "bidId");
            return (Criteria) this;
        }

        public Criteria andIsCheapestIsNull() {
            addCriterion("is_cheapest is null");
            return (Criteria) this;
        }

        public Criteria andIsCheapestIsNotNull() {
            addCriterion("is_cheapest is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheapestEqualTo(String value) {
            addCriterion("is_cheapest =", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestNotEqualTo(String value) {
            addCriterion("is_cheapest <>", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestGreaterThan(String value) {
            addCriterion("is_cheapest >", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestGreaterThanOrEqualTo(String value) {
            addCriterion("is_cheapest >=", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestLessThan(String value) {
            addCriterion("is_cheapest <", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestLessThanOrEqualTo(String value) {
            addCriterion("is_cheapest <=", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestLike(String value) {
            addCriterion("is_cheapest like", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestNotLike(String value) {
            addCriterion("is_cheapest not like", value, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestIn(List<String> values) {
            addCriterion("is_cheapest in", values, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestNotIn(List<String> values) {
            addCriterion("is_cheapest not in", values, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestBetween(String value1, String value2) {
            addCriterion("is_cheapest between", value1, value2, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andIsCheapestNotBetween(String value1, String value2) {
            addCriterion("is_cheapest not between", value1, value2, "isCheapest");
            return (Criteria) this;
        }

        public Criteria andInitTimeIsNull() {
            addCriterion("init_time is null");
            return (Criteria) this;
        }

        public Criteria andInitTimeIsNotNull() {
            addCriterion("init_time is not null");
            return (Criteria) this;
        }

        public Criteria andInitTimeEqualTo(String value) {
            addCriterion("init_time =", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotEqualTo(String value) {
            addCriterion("init_time <>", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeGreaterThan(String value) {
            addCriterion("init_time >", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("init_time >=", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLessThan(String value) {
            addCriterion("init_time <", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLessThanOrEqualTo(String value) {
            addCriterion("init_time <=", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeLike(String value) {
            addCriterion("init_time like", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotLike(String value) {
            addCriterion("init_time not like", value, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeIn(List<String> values) {
            addCriterion("init_time in", values, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotIn(List<String> values) {
            addCriterion("init_time not in", values, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeBetween(String value1, String value2) {
            addCriterion("init_time between", value1, value2, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitTimeNotBetween(String value1, String value2) {
            addCriterion("init_time not between", value1, value2, "initTime");
            return (Criteria) this;
        }

        public Criteria andInitUserIdIsNull() {
            addCriterion("init_user_id is null");
            return (Criteria) this;
        }

        public Criteria andInitUserIdIsNotNull() {
            addCriterion("init_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andInitUserIdEqualTo(String value) {
            addCriterion("init_user_id =", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotEqualTo(String value) {
            addCriterion("init_user_id <>", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdGreaterThan(String value) {
            addCriterion("init_user_id >", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("init_user_id >=", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdLessThan(String value) {
            addCriterion("init_user_id <", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdLessThanOrEqualTo(String value) {
            addCriterion("init_user_id <=", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdLike(String value) {
            addCriterion("init_user_id like", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotLike(String value) {
            addCriterion("init_user_id not like", value, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdIn(List<String> values) {
            addCriterion("init_user_id in", values, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotIn(List<String> values) {
            addCriterion("init_user_id not in", values, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdBetween(String value1, String value2) {
            addCriterion("init_user_id between", value1, value2, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUserIdNotBetween(String value1, String value2) {
            addCriterion("init_user_id not between", value1, value2, "initUserId");
            return (Criteria) this;
        }

        public Criteria andInitUsernameIsNull() {
            addCriterion("init_username is null");
            return (Criteria) this;
        }

        public Criteria andInitUsernameIsNotNull() {
            addCriterion("init_username is not null");
            return (Criteria) this;
        }

        public Criteria andInitUsernameEqualTo(String value) {
            addCriterion("init_username =", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameNotEqualTo(String value) {
            addCriterion("init_username <>", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameGreaterThan(String value) {
            addCriterion("init_username >", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("init_username >=", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameLessThan(String value) {
            addCriterion("init_username <", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameLessThanOrEqualTo(String value) {
            addCriterion("init_username <=", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameLike(String value) {
            addCriterion("init_username like", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameNotLike(String value) {
            addCriterion("init_username not like", value, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameIn(List<String> values) {
            addCriterion("init_username in", values, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameNotIn(List<String> values) {
            addCriterion("init_username not in", values, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameBetween(String value1, String value2) {
            addCriterion("init_username between", value1, value2, "initUsername");
            return (Criteria) this;
        }

        public Criteria andInitUsernameNotBetween(String value1, String value2) {
            addCriterion("init_username not between", value1, value2, "initUsername");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonIsNull() {
            addCriterion("user_init_reason is null");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonIsNotNull() {
            addCriterion("user_init_reason is not null");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonEqualTo(String value) {
            addCriterion("user_init_reason =", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonNotEqualTo(String value) {
            addCriterion("user_init_reason <>", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonGreaterThan(String value) {
            addCriterion("user_init_reason >", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonGreaterThanOrEqualTo(String value) {
            addCriterion("user_init_reason >=", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonLessThan(String value) {
            addCriterion("user_init_reason <", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonLessThanOrEqualTo(String value) {
            addCriterion("user_init_reason <=", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonLike(String value) {
            addCriterion("user_init_reason like", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonNotLike(String value) {
            addCriterion("user_init_reason not like", value, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonIn(List<String> values) {
            addCriterion("user_init_reason in", values, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonNotIn(List<String> values) {
            addCriterion("user_init_reason not in", values, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonBetween(String value1, String value2) {
            addCriterion("user_init_reason between", value1, value2, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andUserInitReasonNotBetween(String value1, String value2) {
            addCriterion("user_init_reason not between", value1, value2, "userInitReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIsNull() {
            addCriterion("close_reason is null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIsNotNull() {
            addCriterion("close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonEqualTo(String value) {
            addCriterion("close_reason =", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotEqualTo(String value) {
            addCriterion("close_reason <>", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThan(String value) {
            addCriterion("close_reason >", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("close_reason >=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThan(String value) {
            addCriterion("close_reason <", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThanOrEqualTo(String value) {
            addCriterion("close_reason <=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLike(String value) {
            addCriterion("close_reason like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotLike(String value) {
            addCriterion("close_reason not like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIn(List<String> values) {
            addCriterion("close_reason in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotIn(List<String> values) {
            addCriterion("close_reason not in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonBetween(String value1, String value2) {
            addCriterion("close_reason between", value1, value2, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotBetween(String value1, String value2) {
            addCriterion("close_reason not between", value1, value2, "closeReason");
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

        public Criteria andDeliverTimeIsNull() {
            addCriterion("deliver_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIsNotNull() {
            addCriterion("deliver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeEqualTo(Date value) {
            addCriterion("deliver_time =", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotEqualTo(Date value) {
            addCriterion("deliver_time <>", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThan(Date value) {
            addCriterion("deliver_time >", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliver_time >=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThan(Date value) {
            addCriterion("deliver_time <", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeLessThanOrEqualTo(Date value) {
            addCriterion("deliver_time <=", value, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeIn(List<Date> values) {
            addCriterion("deliver_time in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotIn(List<Date> values) {
            addCriterion("deliver_time not in", values, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeBetween(Date value1, Date value2) {
            addCriterion("deliver_time between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimeNotBetween(Date value1, Date value2) {
            addCriterion("deliver_time not between", value1, value2, "deliverTime");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridIsNull() {
            addCriterion("deliver_userid is null");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridIsNotNull() {
            addCriterion("deliver_userid is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridEqualTo(String value) {
            addCriterion("deliver_userid =", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridNotEqualTo(String value) {
            addCriterion("deliver_userid <>", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridGreaterThan(String value) {
            addCriterion("deliver_userid >", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_userid >=", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridLessThan(String value) {
            addCriterion("deliver_userid <", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridLessThanOrEqualTo(String value) {
            addCriterion("deliver_userid <=", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridLike(String value) {
            addCriterion("deliver_userid like", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridNotLike(String value) {
            addCriterion("deliver_userid not like", value, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridIn(List<String> values) {
            addCriterion("deliver_userid in", values, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridNotIn(List<String> values) {
            addCriterion("deliver_userid not in", values, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridBetween(String value1, String value2) {
            addCriterion("deliver_userid between", value1, value2, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUseridNotBetween(String value1, String value2) {
            addCriterion("deliver_userid not between", value1, value2, "deliverUserid");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameIsNull() {
            addCriterion("deliver_username is null");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameIsNotNull() {
            addCriterion("deliver_username is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameEqualTo(String value) {
            addCriterion("deliver_username =", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameNotEqualTo(String value) {
            addCriterion("deliver_username <>", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameGreaterThan(String value) {
            addCriterion("deliver_username >", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_username >=", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameLessThan(String value) {
            addCriterion("deliver_username <", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameLessThanOrEqualTo(String value) {
            addCriterion("deliver_username <=", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameLike(String value) {
            addCriterion("deliver_username like", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameNotLike(String value) {
            addCriterion("deliver_username not like", value, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameIn(List<String> values) {
            addCriterion("deliver_username in", values, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameNotIn(List<String> values) {
            addCriterion("deliver_username not in", values, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameBetween(String value1, String value2) {
            addCriterion("deliver_username between", value1, value2, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverUsernameNotBetween(String value1, String value2) {
            addCriterion("deliver_username not between", value1, value2, "deliverUsername");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkIsNull() {
            addCriterion("deliver_remark is null");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkIsNotNull() {
            addCriterion("deliver_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkEqualTo(String value) {
            addCriterion("deliver_remark =", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkNotEqualTo(String value) {
            addCriterion("deliver_remark <>", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkGreaterThan(String value) {
            addCriterion("deliver_remark >", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("deliver_remark >=", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkLessThan(String value) {
            addCriterion("deliver_remark <", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkLessThanOrEqualTo(String value) {
            addCriterion("deliver_remark <=", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkLike(String value) {
            addCriterion("deliver_remark like", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkNotLike(String value) {
            addCriterion("deliver_remark not like", value, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkIn(List<String> values) {
            addCriterion("deliver_remark in", values, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkNotIn(List<String> values) {
            addCriterion("deliver_remark not in", values, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkBetween(String value1, String value2) {
            addCriterion("deliver_remark between", value1, value2, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andDeliverRemarkNotBetween(String value1, String value2) {
            addCriterion("deliver_remark not between", value1, value2, "deliverRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridIsNull() {
            addCriterion("receive_userid is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridIsNotNull() {
            addCriterion("receive_userid is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridEqualTo(String value) {
            addCriterion("receive_userid =", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridNotEqualTo(String value) {
            addCriterion("receive_userid <>", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridGreaterThan(String value) {
            addCriterion("receive_userid >", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridGreaterThanOrEqualTo(String value) {
            addCriterion("receive_userid >=", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridLessThan(String value) {
            addCriterion("receive_userid <", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridLessThanOrEqualTo(String value) {
            addCriterion("receive_userid <=", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridLike(String value) {
            addCriterion("receive_userid like", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridNotLike(String value) {
            addCriterion("receive_userid not like", value, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridIn(List<String> values) {
            addCriterion("receive_userid in", values, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridNotIn(List<String> values) {
            addCriterion("receive_userid not in", values, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridBetween(String value1, String value2) {
            addCriterion("receive_userid between", value1, value2, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveUseridNotBetween(String value1, String value2) {
            addCriterion("receive_userid not between", value1, value2, "receiveUserid");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIsNull() {
            addCriterion("receive_remark is null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIsNotNull() {
            addCriterion("receive_remark is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkEqualTo(String value) {
            addCriterion("receive_remark =", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotEqualTo(String value) {
            addCriterion("receive_remark <>", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkGreaterThan(String value) {
            addCriterion("receive_remark >", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("receive_remark >=", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLessThan(String value) {
            addCriterion("receive_remark <", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLessThanOrEqualTo(String value) {
            addCriterion("receive_remark <=", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkLike(String value) {
            addCriterion("receive_remark like", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotLike(String value) {
            addCriterion("receive_remark not like", value, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkIn(List<String> values) {
            addCriterion("receive_remark in", values, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotIn(List<String> values) {
            addCriterion("receive_remark not in", values, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkBetween(String value1, String value2) {
            addCriterion("receive_remark between", value1, value2, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveRemarkNotBetween(String value1, String value2) {
            addCriterion("receive_remark not between", value1, value2, "receiveRemark");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameIsNull() {
            addCriterion("receive_username is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameIsNotNull() {
            addCriterion("receive_username is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameEqualTo(String value) {
            addCriterion("receive_username =", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameNotEqualTo(String value) {
            addCriterion("receive_username <>", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameGreaterThan(String value) {
            addCriterion("receive_username >", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_username >=", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameLessThan(String value) {
            addCriterion("receive_username <", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameLessThanOrEqualTo(String value) {
            addCriterion("receive_username <=", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameLike(String value) {
            addCriterion("receive_username like", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameNotLike(String value) {
            addCriterion("receive_username not like", value, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameIn(List<String> values) {
            addCriterion("receive_username in", values, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameNotIn(List<String> values) {
            addCriterion("receive_username not in", values, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameBetween(String value1, String value2) {
            addCriterion("receive_username between", value1, value2, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andReceiveUsernameNotBetween(String value1, String value2) {
            addCriterion("receive_username not between", value1, value2, "receiveUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeIsNull() {
            addCriterion("acception_time is null");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeIsNotNull() {
            addCriterion("acception_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeEqualTo(Date value) {
            addCriterion("acception_time =", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeNotEqualTo(Date value) {
            addCriterion("acception_time <>", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeGreaterThan(Date value) {
            addCriterion("acception_time >", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("acception_time >=", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeLessThan(Date value) {
            addCriterion("acception_time <", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeLessThanOrEqualTo(Date value) {
            addCriterion("acception_time <=", value, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeIn(List<Date> values) {
            addCriterion("acception_time in", values, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeNotIn(List<Date> values) {
            addCriterion("acception_time not in", values, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeBetween(Date value1, Date value2) {
            addCriterion("acception_time between", value1, value2, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionTimeNotBetween(Date value1, Date value2) {
            addCriterion("acception_time not between", value1, value2, "acceptionTime");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridIsNull() {
            addCriterion("acception_userid is null");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridIsNotNull() {
            addCriterion("acception_userid is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridEqualTo(String value) {
            addCriterion("acception_userid =", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridNotEqualTo(String value) {
            addCriterion("acception_userid <>", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridGreaterThan(String value) {
            addCriterion("acception_userid >", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridGreaterThanOrEqualTo(String value) {
            addCriterion("acception_userid >=", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridLessThan(String value) {
            addCriterion("acception_userid <", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridLessThanOrEqualTo(String value) {
            addCriterion("acception_userid <=", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridLike(String value) {
            addCriterion("acception_userid like", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridNotLike(String value) {
            addCriterion("acception_userid not like", value, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridIn(List<String> values) {
            addCriterion("acception_userid in", values, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridNotIn(List<String> values) {
            addCriterion("acception_userid not in", values, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridBetween(String value1, String value2) {
            addCriterion("acception_userid between", value1, value2, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUseridNotBetween(String value1, String value2) {
            addCriterion("acception_userid not between", value1, value2, "acceptionUserid");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameIsNull() {
            addCriterion("acception_username is null");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameIsNotNull() {
            addCriterion("acception_username is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameEqualTo(String value) {
            addCriterion("acception_username =", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameNotEqualTo(String value) {
            addCriterion("acception_username <>", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameGreaterThan(String value) {
            addCriterion("acception_username >", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("acception_username >=", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameLessThan(String value) {
            addCriterion("acception_username <", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameLessThanOrEqualTo(String value) {
            addCriterion("acception_username <=", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameLike(String value) {
            addCriterion("acception_username like", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameNotLike(String value) {
            addCriterion("acception_username not like", value, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameIn(List<String> values) {
            addCriterion("acception_username in", values, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameNotIn(List<String> values) {
            addCriterion("acception_username not in", values, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameBetween(String value1, String value2) {
            addCriterion("acception_username between", value1, value2, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionUsernameNotBetween(String value1, String value2) {
            addCriterion("acception_username not between", value1, value2, "acceptionUsername");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkIsNull() {
            addCriterion("acception_remark is null");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkIsNotNull() {
            addCriterion("acception_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkEqualTo(String value) {
            addCriterion("acception_remark =", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkNotEqualTo(String value) {
            addCriterion("acception_remark <>", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkGreaterThan(String value) {
            addCriterion("acception_remark >", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("acception_remark >=", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkLessThan(String value) {
            addCriterion("acception_remark <", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkLessThanOrEqualTo(String value) {
            addCriterion("acception_remark <=", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkLike(String value) {
            addCriterion("acception_remark like", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkNotLike(String value) {
            addCriterion("acception_remark not like", value, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkIn(List<String> values) {
            addCriterion("acception_remark in", values, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkNotIn(List<String> values) {
            addCriterion("acception_remark not in", values, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkBetween(String value1, String value2) {
            addCriterion("acception_remark between", value1, value2, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andAcceptionRemarkNotBetween(String value1, String value2) {
            addCriterion("acception_remark not between", value1, value2, "acceptionRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridIsNull() {
            addCriterion("register_userid is null");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridIsNotNull() {
            addCriterion("register_userid is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridEqualTo(String value) {
            addCriterion("register_userid =", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridNotEqualTo(String value) {
            addCriterion("register_userid <>", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridGreaterThan(String value) {
            addCriterion("register_userid >", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridGreaterThanOrEqualTo(String value) {
            addCriterion("register_userid >=", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridLessThan(String value) {
            addCriterion("register_userid <", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridLessThanOrEqualTo(String value) {
            addCriterion("register_userid <=", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridLike(String value) {
            addCriterion("register_userid like", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridNotLike(String value) {
            addCriterion("register_userid not like", value, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridIn(List<String> values) {
            addCriterion("register_userid in", values, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridNotIn(List<String> values) {
            addCriterion("register_userid not in", values, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridBetween(String value1, String value2) {
            addCriterion("register_userid between", value1, value2, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUseridNotBetween(String value1, String value2) {
            addCriterion("register_userid not between", value1, value2, "registerUserid");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameIsNull() {
            addCriterion("register_username is null");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameIsNotNull() {
            addCriterion("register_username is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameEqualTo(String value) {
            addCriterion("register_username =", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameNotEqualTo(String value) {
            addCriterion("register_username <>", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameGreaterThan(String value) {
            addCriterion("register_username >", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("register_username >=", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameLessThan(String value) {
            addCriterion("register_username <", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameLessThanOrEqualTo(String value) {
            addCriterion("register_username <=", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameLike(String value) {
            addCriterion("register_username like", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameNotLike(String value) {
            addCriterion("register_username not like", value, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameIn(List<String> values) {
            addCriterion("register_username in", values, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameNotIn(List<String> values) {
            addCriterion("register_username not in", values, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameBetween(String value1, String value2) {
            addCriterion("register_username between", value1, value2, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterUsernameNotBetween(String value1, String value2) {
            addCriterion("register_username not between", value1, value2, "registerUsername");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkIsNull() {
            addCriterion("register_remark is null");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkIsNotNull() {
            addCriterion("register_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkEqualTo(String value) {
            addCriterion("register_remark =", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkNotEqualTo(String value) {
            addCriterion("register_remark <>", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkGreaterThan(String value) {
            addCriterion("register_remark >", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("register_remark >=", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkLessThan(String value) {
            addCriterion("register_remark <", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkLessThanOrEqualTo(String value) {
            addCriterion("register_remark <=", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkLike(String value) {
            addCriterion("register_remark like", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkNotLike(String value) {
            addCriterion("register_remark not like", value, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkIn(List<String> values) {
            addCriterion("register_remark in", values, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkNotIn(List<String> values) {
            addCriterion("register_remark not in", values, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkBetween(String value1, String value2) {
            addCriterion("register_remark between", value1, value2, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andRegisterRemarkNotBetween(String value1, String value2) {
            addCriterion("register_remark not between", value1, value2, "registerRemark");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedIsNull() {
            addCriterion("buyer_is_assessed is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedIsNotNull() {
            addCriterion("buyer_is_assessed is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedEqualTo(String value) {
            addCriterion("buyer_is_assessed =", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedNotEqualTo(String value) {
            addCriterion("buyer_is_assessed <>", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedGreaterThan(String value) {
            addCriterion("buyer_is_assessed >", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_is_assessed >=", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedLessThan(String value) {
            addCriterion("buyer_is_assessed <", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedLessThanOrEqualTo(String value) {
            addCriterion("buyer_is_assessed <=", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedLike(String value) {
            addCriterion("buyer_is_assessed like", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedNotLike(String value) {
            addCriterion("buyer_is_assessed not like", value, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedIn(List<String> values) {
            addCriterion("buyer_is_assessed in", values, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedNotIn(List<String> values) {
            addCriterion("buyer_is_assessed not in", values, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedBetween(String value1, String value2) {
            addCriterion("buyer_is_assessed between", value1, value2, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andBuyerIsAssessedNotBetween(String value1, String value2) {
            addCriterion("buyer_is_assessed not between", value1, value2, "buyerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedIsNull() {
            addCriterion("seller_is_assessed is null");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedIsNotNull() {
            addCriterion("seller_is_assessed is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedEqualTo(String value) {
            addCriterion("seller_is_assessed =", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedNotEqualTo(String value) {
            addCriterion("seller_is_assessed <>", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedGreaterThan(String value) {
            addCriterion("seller_is_assessed >", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedGreaterThanOrEqualTo(String value) {
            addCriterion("seller_is_assessed >=", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedLessThan(String value) {
            addCriterion("seller_is_assessed <", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedLessThanOrEqualTo(String value) {
            addCriterion("seller_is_assessed <=", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedLike(String value) {
            addCriterion("seller_is_assessed like", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedNotLike(String value) {
            addCriterion("seller_is_assessed not like", value, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedIn(List<String> values) {
            addCriterion("seller_is_assessed in", values, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedNotIn(List<String> values) {
            addCriterion("seller_is_assessed not in", values, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedBetween(String value1, String value2) {
            addCriterion("seller_is_assessed between", value1, value2, "sellerIsAssessed");
            return (Criteria) this;
        }

        public Criteria andSellerIsAssessedNotBetween(String value1, String value2) {
            addCriterion("seller_is_assessed not between", value1, value2, "sellerIsAssessed");
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