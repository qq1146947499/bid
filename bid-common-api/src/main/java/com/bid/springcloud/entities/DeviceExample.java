package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
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

        public Criteria andNameIdIsNull() {
            addCriterion("name_id is null");
            return (Criteria) this;
        }

        public Criteria andNameIdIsNotNull() {
            addCriterion("name_id is not null");
            return (Criteria) this;
        }

        public Criteria andNameIdEqualTo(String value) {
            addCriterion("name_id =", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotEqualTo(String value) {
            addCriterion("name_id <>", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdGreaterThan(String value) {
            addCriterion("name_id >", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("name_id >=", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLessThan(String value) {
            addCriterion("name_id <", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLessThanOrEqualTo(String value) {
            addCriterion("name_id <=", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLike(String value) {
            addCriterion("name_id like", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotLike(String value) {
            addCriterion("name_id not like", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdIn(List<String> values) {
            addCriterion("name_id in", values, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotIn(List<String> values) {
            addCriterion("name_id not in", values, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdBetween(String value1, String value2) {
            addCriterion("name_id between", value1, value2, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotBetween(String value1, String value2) {
            addCriterion("name_id not between", value1, value2, "nameId");
            return (Criteria) this;
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

        public Criteria andDeviceTypeIdIsNull() {
            addCriterion("device_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIsNotNull() {
            addCriterion("device_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdEqualTo(String value) {
            addCriterion("device_type_id =", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotEqualTo(String value) {
            addCriterion("device_type_id <>", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThan(String value) {
            addCriterion("device_type_id >", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_type_id >=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThan(String value) {
            addCriterion("device_type_id <", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThanOrEqualTo(String value) {
            addCriterion("device_type_id <=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLike(String value) {
            addCriterion("device_type_id like", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotLike(String value) {
            addCriterion("device_type_id not like", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIn(List<String> values) {
            addCriterion("device_type_id in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotIn(List<String> values) {
            addCriterion("device_type_id not in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdBetween(String value1, String value2) {
            addCriterion("device_type_id between", value1, value2, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotBetween(String value1, String value2) {
            addCriterion("device_type_id not between", value1, value2, "deviceTypeId");
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