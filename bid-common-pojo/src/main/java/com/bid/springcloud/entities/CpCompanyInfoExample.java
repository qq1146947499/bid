package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.List;

public class CpCompanyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpCompanyInfoExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdIsNull() {
            addCriterion("reg_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdIsNotNull() {
            addCriterion("reg_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdEqualTo(String value) {
            addCriterion("reg_resource_id =", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotEqualTo(String value) {
            addCriterion("reg_resource_id <>", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdGreaterThan(String value) {
            addCriterion("reg_resource_id >", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("reg_resource_id >=", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLessThan(String value) {
            addCriterion("reg_resource_id <", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLessThanOrEqualTo(String value) {
            addCriterion("reg_resource_id <=", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdLike(String value) {
            addCriterion("reg_resource_id like", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotLike(String value) {
            addCriterion("reg_resource_id not like", value, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdIn(List<String> values) {
            addCriterion("reg_resource_id in", values, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotIn(List<String> values) {
            addCriterion("reg_resource_id not in", values, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdBetween(String value1, String value2) {
            addCriterion("reg_resource_id between", value1, value2, "regResourceId");
            return (Criteria) this;
        }

        public Criteria andRegResourceIdNotBetween(String value1, String value2) {
            addCriterion("reg_resource_id not between", value1, value2, "regResourceId");
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

        public Criteria andCompanyAbstractIsNull() {
            addCriterion("company_abstract is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractIsNotNull() {
            addCriterion("company_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractEqualTo(String value) {
            addCriterion("company_abstract =", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractNotEqualTo(String value) {
            addCriterion("company_abstract <>", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractGreaterThan(String value) {
            addCriterion("company_abstract >", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("company_abstract >=", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractLessThan(String value) {
            addCriterion("company_abstract <", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractLessThanOrEqualTo(String value) {
            addCriterion("company_abstract <=", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractLike(String value) {
            addCriterion("company_abstract like", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractNotLike(String value) {
            addCriterion("company_abstract not like", value, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractIn(List<String> values) {
            addCriterion("company_abstract in", values, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractNotIn(List<String> values) {
            addCriterion("company_abstract not in", values, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractBetween(String value1, String value2) {
            addCriterion("company_abstract between", value1, value2, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andCompanyAbstractNotBetween(String value1, String value2) {
            addCriterion("company_abstract not between", value1, value2, "companyAbstract");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andInProvinceIsNull() {
            addCriterion("in_province is null");
            return (Criteria) this;
        }

        public Criteria andInProvinceIsNotNull() {
            addCriterion("in_province is not null");
            return (Criteria) this;
        }

        public Criteria andInProvinceEqualTo(String value) {
            addCriterion("in_province =", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceNotEqualTo(String value) {
            addCriterion("in_province <>", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceGreaterThan(String value) {
            addCriterion("in_province >", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("in_province >=", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceLessThan(String value) {
            addCriterion("in_province <", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceLessThanOrEqualTo(String value) {
            addCriterion("in_province <=", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceLike(String value) {
            addCriterion("in_province like", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceNotLike(String value) {
            addCriterion("in_province not like", value, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceIn(List<String> values) {
            addCriterion("in_province in", values, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceNotIn(List<String> values) {
            addCriterion("in_province not in", values, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceBetween(String value1, String value2) {
            addCriterion("in_province between", value1, value2, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInProvinceNotBetween(String value1, String value2) {
            addCriterion("in_province not between", value1, value2, "inProvince");
            return (Criteria) this;
        }

        public Criteria andInCityIsNull() {
            addCriterion("in_city is null");
            return (Criteria) this;
        }

        public Criteria andInCityIsNotNull() {
            addCriterion("in_city is not null");
            return (Criteria) this;
        }

        public Criteria andInCityEqualTo(String value) {
            addCriterion("in_city =", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotEqualTo(String value) {
            addCriterion("in_city <>", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityGreaterThan(String value) {
            addCriterion("in_city >", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityGreaterThanOrEqualTo(String value) {
            addCriterion("in_city >=", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLessThan(String value) {
            addCriterion("in_city <", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLessThanOrEqualTo(String value) {
            addCriterion("in_city <=", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityLike(String value) {
            addCriterion("in_city like", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotLike(String value) {
            addCriterion("in_city not like", value, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityIn(List<String> values) {
            addCriterion("in_city in", values, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotIn(List<String> values) {
            addCriterion("in_city not in", values, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityBetween(String value1, String value2) {
            addCriterion("in_city between", value1, value2, "inCity");
            return (Criteria) this;
        }

        public Criteria andInCityNotBetween(String value1, String value2) {
            addCriterion("in_city not between", value1, value2, "inCity");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonIsNull() {
            addCriterion("juridical_person is null");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonIsNotNull() {
            addCriterion("juridical_person is not null");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonEqualTo(String value) {
            addCriterion("juridical_person =", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonNotEqualTo(String value) {
            addCriterion("juridical_person <>", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonGreaterThan(String value) {
            addCriterion("juridical_person >", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("juridical_person >=", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonLessThan(String value) {
            addCriterion("juridical_person <", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonLessThanOrEqualTo(String value) {
            addCriterion("juridical_person <=", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonLike(String value) {
            addCriterion("juridical_person like", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonNotLike(String value) {
            addCriterion("juridical_person not like", value, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonIn(List<String> values) {
            addCriterion("juridical_person in", values, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonNotIn(List<String> values) {
            addCriterion("juridical_person not in", values, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonBetween(String value1, String value2) {
            addCriterion("juridical_person between", value1, value2, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andJuridicalPersonNotBetween(String value1, String value2) {
            addCriterion("juridical_person not between", value1, value2, "juridicalPerson");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIsNull() {
            addCriterion("certificate_code is null");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIsNotNull() {
            addCriterion("certificate_code is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeEqualTo(String value) {
            addCriterion("certificate_code =", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotEqualTo(String value) {
            addCriterion("certificate_code <>", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeGreaterThan(String value) {
            addCriterion("certificate_code >", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_code >=", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLessThan(String value) {
            addCriterion("certificate_code <", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLessThanOrEqualTo(String value) {
            addCriterion("certificate_code <=", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeLike(String value) {
            addCriterion("certificate_code like", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotLike(String value) {
            addCriterion("certificate_code not like", value, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeIn(List<String> values) {
            addCriterion("certificate_code in", values, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotIn(List<String> values) {
            addCriterion("certificate_code not in", values, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeBetween(String value1, String value2) {
            addCriterion("certificate_code between", value1, value2, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andCertificateCodeNotBetween(String value1, String value2) {
            addCriterion("certificate_code not between", value1, value2, "certificateCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNull() {
            addCriterion("registration_code is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIsNotNull() {
            addCriterion("registration_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeEqualTo(String value) {
            addCriterion("registration_code =", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotEqualTo(String value) {
            addCriterion("registration_code <>", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThan(String value) {
            addCriterion("registration_code >", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("registration_code >=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThan(String value) {
            addCriterion("registration_code <", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLessThanOrEqualTo(String value) {
            addCriterion("registration_code <=", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeLike(String value) {
            addCriterion("registration_code like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotLike(String value) {
            addCriterion("registration_code not like", value, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeIn(List<String> values) {
            addCriterion("registration_code in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotIn(List<String> values) {
            addCriterion("registration_code not in", values, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeBetween(String value1, String value2) {
            addCriterion("registration_code between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andRegistrationCodeNotBetween(String value1, String value2) {
            addCriterion("registration_code not between", value1, value2, "registrationCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBidRightIsNull() {
            addCriterion("bid_right is null");
            return (Criteria) this;
        }

        public Criteria andBidRightIsNotNull() {
            addCriterion("bid_right is not null");
            return (Criteria) this;
        }

        public Criteria andBidRightEqualTo(String value) {
            addCriterion("bid_right =", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightNotEqualTo(String value) {
            addCriterion("bid_right <>", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightGreaterThan(String value) {
            addCriterion("bid_right >", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightGreaterThanOrEqualTo(String value) {
            addCriterion("bid_right >=", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightLessThan(String value) {
            addCriterion("bid_right <", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightLessThanOrEqualTo(String value) {
            addCriterion("bid_right <=", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightLike(String value) {
            addCriterion("bid_right like", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightNotLike(String value) {
            addCriterion("bid_right not like", value, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightIn(List<String> values) {
            addCriterion("bid_right in", values, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightNotIn(List<String> values) {
            addCriterion("bid_right not in", values, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightBetween(String value1, String value2) {
            addCriterion("bid_right between", value1, value2, "bidRight");
            return (Criteria) this;
        }

        public Criteria andBidRightNotBetween(String value1, String value2) {
            addCriterion("bid_right not between", value1, value2, "bidRight");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderIsNull() {
            addCriterion("authorized_bidder is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderIsNotNull() {
            addCriterion("authorized_bidder is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderEqualTo(String value) {
            addCriterion("authorized_bidder =", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderNotEqualTo(String value) {
            addCriterion("authorized_bidder <>", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderGreaterThan(String value) {
            addCriterion("authorized_bidder >", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderGreaterThanOrEqualTo(String value) {
            addCriterion("authorized_bidder >=", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderLessThan(String value) {
            addCriterion("authorized_bidder <", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderLessThanOrEqualTo(String value) {
            addCriterion("authorized_bidder <=", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderLike(String value) {
            addCriterion("authorized_bidder like", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderNotLike(String value) {
            addCriterion("authorized_bidder not like", value, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderIn(List<String> values) {
            addCriterion("authorized_bidder in", values, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderNotIn(List<String> values) {
            addCriterion("authorized_bidder not in", values, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderBetween(String value1, String value2) {
            addCriterion("authorized_bidder between", value1, value2, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderNotBetween(String value1, String value2) {
            addCriterion("authorized_bidder not between", value1, value2, "authorizedBidder");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelIsNull() {
            addCriterion("authorized_bidder_tel is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelIsNotNull() {
            addCriterion("authorized_bidder_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelEqualTo(String value) {
            addCriterion("authorized_bidder_tel =", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelNotEqualTo(String value) {
            addCriterion("authorized_bidder_tel <>", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelGreaterThan(String value) {
            addCriterion("authorized_bidder_tel >", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelGreaterThanOrEqualTo(String value) {
            addCriterion("authorized_bidder_tel >=", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelLessThan(String value) {
            addCriterion("authorized_bidder_tel <", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelLessThanOrEqualTo(String value) {
            addCriterion("authorized_bidder_tel <=", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelLike(String value) {
            addCriterion("authorized_bidder_tel like", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelNotLike(String value) {
            addCriterion("authorized_bidder_tel not like", value, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelIn(List<String> values) {
            addCriterion("authorized_bidder_tel in", values, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelNotIn(List<String> values) {
            addCriterion("authorized_bidder_tel not in", values, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelBetween(String value1, String value2) {
            addCriterion("authorized_bidder_tel between", value1, value2, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedBidderTelNotBetween(String value1, String value2) {
            addCriterion("authorized_bidder_tel not between", value1, value2, "authorizedBidderTel");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailIsNull() {
            addCriterion("authorized_email is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailIsNotNull() {
            addCriterion("authorized_email is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailEqualTo(String value) {
            addCriterion("authorized_email =", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailNotEqualTo(String value) {
            addCriterion("authorized_email <>", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailGreaterThan(String value) {
            addCriterion("authorized_email >", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailGreaterThanOrEqualTo(String value) {
            addCriterion("authorized_email >=", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailLessThan(String value) {
            addCriterion("authorized_email <", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailLessThanOrEqualTo(String value) {
            addCriterion("authorized_email <=", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailLike(String value) {
            addCriterion("authorized_email like", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailNotLike(String value) {
            addCriterion("authorized_email not like", value, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailIn(List<String> values) {
            addCriterion("authorized_email in", values, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailNotIn(List<String> values) {
            addCriterion("authorized_email not in", values, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailBetween(String value1, String value2) {
            addCriterion("authorized_email between", value1, value2, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuthorizedEmailNotBetween(String value1, String value2) {
            addCriterion("authorized_email not between", value1, value2, "authorizedEmail");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIsNull() {
            addCriterion("audit_college_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIsNotNull() {
            addCriterion("audit_college_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdEqualTo(String value) {
            addCriterion("audit_college_id =", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotEqualTo(String value) {
            addCriterion("audit_college_id <>", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdGreaterThan(String value) {
            addCriterion("audit_college_id >", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdGreaterThanOrEqualTo(String value) {
            addCriterion("audit_college_id >=", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLessThan(String value) {
            addCriterion("audit_college_id <", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLessThanOrEqualTo(String value) {
            addCriterion("audit_college_id <=", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdLike(String value) {
            addCriterion("audit_college_id like", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotLike(String value) {
            addCriterion("audit_college_id not like", value, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdIn(List<String> values) {
            addCriterion("audit_college_id in", values, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotIn(List<String> values) {
            addCriterion("audit_college_id not in", values, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdBetween(String value1, String value2) {
            addCriterion("audit_college_id between", value1, value2, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andAuditCollegeIdNotBetween(String value1, String value2) {
            addCriterion("audit_college_id not between", value1, value2, "auditCollegeId");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(String value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(String value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(String value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(String value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(String value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLike(String value) {
            addCriterion("is_recommend like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotLike(String value) {
            addCriterion("is_recommend not like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<String> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<String> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(String value1, String value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(String value1, String value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
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

        public Criteria andRegistCapitalIsNull() {
            addCriterion("regist_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalIsNotNull() {
            addCriterion("regist_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalEqualTo(String value) {
            addCriterion("regist_capital =", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotEqualTo(String value) {
            addCriterion("regist_capital <>", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalGreaterThan(String value) {
            addCriterion("regist_capital >", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("regist_capital >=", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalLessThan(String value) {
            addCriterion("regist_capital <", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalLessThanOrEqualTo(String value) {
            addCriterion("regist_capital <=", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalLike(String value) {
            addCriterion("regist_capital like", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotLike(String value) {
            addCriterion("regist_capital not like", value, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalIn(List<String> values) {
            addCriterion("regist_capital in", values, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotIn(List<String> values) {
            addCriterion("regist_capital not in", values, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalBetween(String value1, String value2) {
            addCriterion("regist_capital between", value1, value2, "registCapital");
            return (Criteria) this;
        }

        public Criteria andRegistCapitalNotBetween(String value1, String value2) {
            addCriterion("regist_capital not between", value1, value2, "registCapital");
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