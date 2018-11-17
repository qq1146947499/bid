package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FnBidBalancesheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FnBidBalancesheetExample() {
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

        public Criteria andBalanceIdIsNull() {
            addCriterion("balance_id is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIdIsNotNull() {
            addCriterion("balance_id is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceIdEqualTo(String value) {
            addCriterion("balance_id =", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotEqualTo(String value) {
            addCriterion("balance_id <>", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdGreaterThan(String value) {
            addCriterion("balance_id >", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("balance_id >=", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdLessThan(String value) {
            addCriterion("balance_id <", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdLessThanOrEqualTo(String value) {
            addCriterion("balance_id <=", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdLike(String value) {
            addCriterion("balance_id like", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotLike(String value) {
            addCriterion("balance_id not like", value, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdIn(List<String> values) {
            addCriterion("balance_id in", values, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotIn(List<String> values) {
            addCriterion("balance_id not in", values, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdBetween(String value1, String value2) {
            addCriterion("balance_id between", value1, value2, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceIdNotBetween(String value1, String value2) {
            addCriterion("balance_id not between", value1, value2, "balanceId");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeIsNull() {
            addCriterion("balance_code is null");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeIsNotNull() {
            addCriterion("balance_code is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeEqualTo(String value) {
            addCriterion("balance_code =", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeNotEqualTo(String value) {
            addCriterion("balance_code <>", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeGreaterThan(String value) {
            addCriterion("balance_code >", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("balance_code >=", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeLessThan(String value) {
            addCriterion("balance_code <", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeLessThanOrEqualTo(String value) {
            addCriterion("balance_code <=", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeLike(String value) {
            addCriterion("balance_code like", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeNotLike(String value) {
            addCriterion("balance_code not like", value, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeIn(List<String> values) {
            addCriterion("balance_code in", values, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeNotIn(List<String> values) {
            addCriterion("balance_code not in", values, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeBetween(String value1, String value2) {
            addCriterion("balance_code between", value1, value2, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceCodeNotBetween(String value1, String value2) {
            addCriterion("balance_code not between", value1, value2, "balanceCode");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNull() {
            addCriterion("balance_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNotNull() {
            addCriterion("balance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountEqualTo(String value) {
            addCriterion("balance_amount =", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotEqualTo(String value) {
            addCriterion("balance_amount <>", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThan(String value) {
            addCriterion("balance_amount >", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThanOrEqualTo(String value) {
            addCriterion("balance_amount >=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThan(String value) {
            addCriterion("balance_amount <", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThanOrEqualTo(String value) {
            addCriterion("balance_amount <=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLike(String value) {
            addCriterion("balance_amount like", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotLike(String value) {
            addCriterion("balance_amount not like", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIn(List<String> values) {
            addCriterion("balance_amount in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotIn(List<String> values) {
            addCriterion("balance_amount not in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountBetween(String value1, String value2) {
            addCriterion("balance_amount between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotBetween(String value1, String value2) {
            addCriterion("balance_amount not between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIsNull() {
            addCriterion("charging_time is null");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIsNotNull() {
            addCriterion("charging_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargingTimeEqualTo(String value) {
            addCriterion("charging_time =", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotEqualTo(String value) {
            addCriterion("charging_time <>", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeGreaterThan(String value) {
            addCriterion("charging_time >", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("charging_time >=", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLessThan(String value) {
            addCriterion("charging_time <", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLessThanOrEqualTo(String value) {
            addCriterion("charging_time <=", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeLike(String value) {
            addCriterion("charging_time like", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotLike(String value) {
            addCriterion("charging_time not like", value, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeIn(List<String> values) {
            addCriterion("charging_time in", values, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotIn(List<String> values) {
            addCriterion("charging_time not in", values, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeBetween(String value1, String value2) {
            addCriterion("charging_time between", value1, value2, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andChargingTimeNotBetween(String value1, String value2) {
            addCriterion("charging_time not between", value1, value2, "chargingTime");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(String value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(String value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(String value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(String value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(String value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(String value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLike(String value) {
            addCriterion("real_amount like", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotLike(String value) {
            addCriterion("real_amount not like", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<String> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<String> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(String value1, String value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(String value1, String value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutIsNull() {
            addCriterion("difference_amout is null");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutIsNotNull() {
            addCriterion("difference_amout is not null");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutEqualTo(String value) {
            addCriterion("difference_amout =", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutNotEqualTo(String value) {
            addCriterion("difference_amout <>", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutGreaterThan(String value) {
            addCriterion("difference_amout >", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutGreaterThanOrEqualTo(String value) {
            addCriterion("difference_amout >=", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutLessThan(String value) {
            addCriterion("difference_amout <", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutLessThanOrEqualTo(String value) {
            addCriterion("difference_amout <=", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutLike(String value) {
            addCriterion("difference_amout like", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutNotLike(String value) {
            addCriterion("difference_amout not like", value, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutIn(List<String> values) {
            addCriterion("difference_amout in", values, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutNotIn(List<String> values) {
            addCriterion("difference_amout not in", values, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutBetween(String value1, String value2) {
            addCriterion("difference_amout between", value1, value2, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andDifferenceAmoutNotBetween(String value1, String value2) {
            addCriterion("difference_amout not between", value1, value2, "differenceAmout");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeIsNull() {
            addCriterion("pay_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeIsNotNull() {
            addCriterion("pay_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeEqualTo(Date value) {
            addCriterion("pay_endtime =", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeNotEqualTo(Date value) {
            addCriterion("pay_endtime <>", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeGreaterThan(Date value) {
            addCriterion("pay_endtime >", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_endtime >=", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeLessThan(Date value) {
            addCriterion("pay_endtime <", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_endtime <=", value, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeIn(List<Date> values) {
            addCriterion("pay_endtime in", values, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeNotIn(List<Date> values) {
            addCriterion("pay_endtime not in", values, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeBetween(Date value1, Date value2) {
            addCriterion("pay_endtime between", value1, value2, "payEndtime");
            return (Criteria) this;
        }

        public Criteria andPayEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_endtime not between", value1, value2, "payEndtime");
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

        public Criteria andIsPayedIsNull() {
            addCriterion("is_payed is null");
            return (Criteria) this;
        }

        public Criteria andIsPayedIsNotNull() {
            addCriterion("is_payed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayedEqualTo(String value) {
            addCriterion("is_payed =", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotEqualTo(String value) {
            addCriterion("is_payed <>", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThan(String value) {
            addCriterion("is_payed >", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThanOrEqualTo(String value) {
            addCriterion("is_payed >=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThan(String value) {
            addCriterion("is_payed <", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThanOrEqualTo(String value) {
            addCriterion("is_payed <=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLike(String value) {
            addCriterion("is_payed like", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotLike(String value) {
            addCriterion("is_payed not like", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedIn(List<String> values) {
            addCriterion("is_payed in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotIn(List<String> values) {
            addCriterion("is_payed not in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedBetween(String value1, String value2) {
            addCriterion("is_payed between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotBetween(String value1, String value2) {
            addCriterion("is_payed not between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIsNull() {
            addCriterion("comfirm_time is null");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIsNotNull() {
            addCriterion("comfirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeEqualTo(Date value) {
            addCriterion("comfirm_time =", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotEqualTo(Date value) {
            addCriterion("comfirm_time <>", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeGreaterThan(Date value) {
            addCriterion("comfirm_time >", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comfirm_time >=", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeLessThan(Date value) {
            addCriterion("comfirm_time <", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("comfirm_time <=", value, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeIn(List<Date> values) {
            addCriterion("comfirm_time in", values, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotIn(List<Date> values) {
            addCriterion("comfirm_time not in", values, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeBetween(Date value1, Date value2) {
            addCriterion("comfirm_time between", value1, value2, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("comfirm_time not between", value1, value2, "comfirmTime");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridIsNull() {
            addCriterion("comfirm_userid is null");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridIsNotNull() {
            addCriterion("comfirm_userid is not null");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridEqualTo(String value) {
            addCriterion("comfirm_userid =", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridNotEqualTo(String value) {
            addCriterion("comfirm_userid <>", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridGreaterThan(String value) {
            addCriterion("comfirm_userid >", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridGreaterThanOrEqualTo(String value) {
            addCriterion("comfirm_userid >=", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridLessThan(String value) {
            addCriterion("comfirm_userid <", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridLessThanOrEqualTo(String value) {
            addCriterion("comfirm_userid <=", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridLike(String value) {
            addCriterion("comfirm_userid like", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridNotLike(String value) {
            addCriterion("comfirm_userid not like", value, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridIn(List<String> values) {
            addCriterion("comfirm_userid in", values, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridNotIn(List<String> values) {
            addCriterion("comfirm_userid not in", values, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridBetween(String value1, String value2) {
            addCriterion("comfirm_userid between", value1, value2, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUseridNotBetween(String value1, String value2) {
            addCriterion("comfirm_userid not between", value1, value2, "comfirmUserid");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameIsNull() {
            addCriterion("comfirm_username is null");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameIsNotNull() {
            addCriterion("comfirm_username is not null");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameEqualTo(String value) {
            addCriterion("comfirm_username =", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameNotEqualTo(String value) {
            addCriterion("comfirm_username <>", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameGreaterThan(String value) {
            addCriterion("comfirm_username >", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("comfirm_username >=", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameLessThan(String value) {
            addCriterion("comfirm_username <", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameLessThanOrEqualTo(String value) {
            addCriterion("comfirm_username <=", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameLike(String value) {
            addCriterion("comfirm_username like", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameNotLike(String value) {
            addCriterion("comfirm_username not like", value, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameIn(List<String> values) {
            addCriterion("comfirm_username in", values, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameNotIn(List<String> values) {
            addCriterion("comfirm_username not in", values, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameBetween(String value1, String value2) {
            addCriterion("comfirm_username between", value1, value2, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andComfirmUsernameNotBetween(String value1, String value2) {
            addCriterion("comfirm_username not between", value1, value2, "comfirmUsername");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayIsNull() {
            addCriterion("company_comfirm_pay is null");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayIsNotNull() {
            addCriterion("company_comfirm_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayEqualTo(String value) {
            addCriterion("company_comfirm_pay =", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayNotEqualTo(String value) {
            addCriterion("company_comfirm_pay <>", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayGreaterThan(String value) {
            addCriterion("company_comfirm_pay >", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayGreaterThanOrEqualTo(String value) {
            addCriterion("company_comfirm_pay >=", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayLessThan(String value) {
            addCriterion("company_comfirm_pay <", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayLessThanOrEqualTo(String value) {
            addCriterion("company_comfirm_pay <=", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayLike(String value) {
            addCriterion("company_comfirm_pay like", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayNotLike(String value) {
            addCriterion("company_comfirm_pay not like", value, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayIn(List<String> values) {
            addCriterion("company_comfirm_pay in", values, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayNotIn(List<String> values) {
            addCriterion("company_comfirm_pay not in", values, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayBetween(String value1, String value2) {
            addCriterion("company_comfirm_pay between", value1, value2, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andCompanyComfirmPayNotBetween(String value1, String value2) {
            addCriterion("company_comfirm_pay not between", value1, value2, "companyComfirmPay");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("apply_id like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("apply_id not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
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

        public Criteria andDelStatusIsNull() {
            addCriterion("del_status is null");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNotNull() {
            addCriterion("del_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelStatusEqualTo(String value) {
            addCriterion("del_status =", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotEqualTo(String value) {
            addCriterion("del_status <>", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThan(String value) {
            addCriterion("del_status >", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("del_status >=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThan(String value) {
            addCriterion("del_status <", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThanOrEqualTo(String value) {
            addCriterion("del_status <=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLike(String value) {
            addCriterion("del_status like", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotLike(String value) {
            addCriterion("del_status not like", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusIn(List<String> values) {
            addCriterion("del_status in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotIn(List<String> values) {
            addCriterion("del_status not in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusBetween(String value1, String value2) {
            addCriterion("del_status between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotBetween(String value1, String value2) {
            addCriterion("del_status not between", value1, value2, "delStatus");
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

        public Criteria andChargeStartTimeIsNull() {
            addCriterion("charge_start_time is null");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeIsNotNull() {
            addCriterion("charge_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeEqualTo(Date value) {
            addCriterion("charge_start_time =", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeNotEqualTo(Date value) {
            addCriterion("charge_start_time <>", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeGreaterThan(Date value) {
            addCriterion("charge_start_time >", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("charge_start_time >=", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeLessThan(Date value) {
            addCriterion("charge_start_time <", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("charge_start_time <=", value, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeIn(List<Date> values) {
            addCriterion("charge_start_time in", values, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeNotIn(List<Date> values) {
            addCriterion("charge_start_time not in", values, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeBetween(Date value1, Date value2) {
            addCriterion("charge_start_time between", value1, value2, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("charge_start_time not between", value1, value2, "chargeStartTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeIsNull() {
            addCriterion("charge_end_time is null");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeIsNotNull() {
            addCriterion("charge_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeEqualTo(String value) {
            addCriterion("charge_end_time =", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeNotEqualTo(String value) {
            addCriterion("charge_end_time <>", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeGreaterThan(String value) {
            addCriterion("charge_end_time >", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_end_time >=", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeLessThan(String value) {
            addCriterion("charge_end_time <", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeLessThanOrEqualTo(String value) {
            addCriterion("charge_end_time <=", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeLike(String value) {
            addCriterion("charge_end_time like", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeNotLike(String value) {
            addCriterion("charge_end_time not like", value, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeIn(List<String> values) {
            addCriterion("charge_end_time in", values, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeNotIn(List<String> values) {
            addCriterion("charge_end_time not in", values, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeBetween(String value1, String value2) {
            addCriterion("charge_end_time between", value1, value2, "chargeEndTime");
            return (Criteria) this;
        }

        public Criteria andChargeEndTimeNotBetween(String value1, String value2) {
            addCriterion("charge_end_time not between", value1, value2, "chargeEndTime");
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