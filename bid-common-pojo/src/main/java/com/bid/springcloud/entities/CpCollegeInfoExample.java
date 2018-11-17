package com.bid.springcloud.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpCollegeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpCollegeInfoExample() {
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

        public Criteria andCollegeIdIsNull() {
            addCriterion("college_id is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIsNotNull() {
            addCriterion("college_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeIdEqualTo(Integer value) {
            addCriterion("college_id =", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotEqualTo(Integer value) {
            addCriterion("college_id <>", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThan(Integer value) {
            addCriterion("college_id >", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("college_id >=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThan(Integer value) {
            addCriterion("college_id <", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdLessThanOrEqualTo(Integer value) {
            addCriterion("college_id <=", value, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdIn(List<Integer> values) {
            addCriterion("college_id in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotIn(List<Integer> values) {
            addCriterion("college_id not in", values, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdBetween(Integer value1, Integer value2) {
            addCriterion("college_id between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("college_id not between", value1, value2, "collegeId");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeIsNull() {
            addCriterion("college_code is null");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeIsNotNull() {
            addCriterion("college_code is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeEqualTo(String value) {
            addCriterion("college_code =", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeNotEqualTo(String value) {
            addCriterion("college_code <>", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeGreaterThan(String value) {
            addCriterion("college_code >", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("college_code >=", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeLessThan(String value) {
            addCriterion("college_code <", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeLessThanOrEqualTo(String value) {
            addCriterion("college_code <=", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeLike(String value) {
            addCriterion("college_code like", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeNotLike(String value) {
            addCriterion("college_code not like", value, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeIn(List<String> values) {
            addCriterion("college_code in", values, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeNotIn(List<String> values) {
            addCriterion("college_code not in", values, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeBetween(String value1, String value2) {
            addCriterion("college_code between", value1, value2, "collegeCode");
            return (Criteria) this;
        }

        public Criteria andCollegeCodeNotBetween(String value1, String value2) {
            addCriterion("college_code not between", value1, value2, "collegeCode");
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

        public Criteria andLogoPathIsNull() {
            addCriterion("logo_path is null");
            return (Criteria) this;
        }

        public Criteria andLogoPathIsNotNull() {
            addCriterion("logo_path is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPathEqualTo(String value) {
            addCriterion("logo_path =", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotEqualTo(String value) {
            addCriterion("logo_path <>", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThan(String value) {
            addCriterion("logo_path >", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathGreaterThanOrEqualTo(String value) {
            addCriterion("logo_path >=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThan(String value) {
            addCriterion("logo_path <", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLessThanOrEqualTo(String value) {
            addCriterion("logo_path <=", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathLike(String value) {
            addCriterion("logo_path like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotLike(String value) {
            addCriterion("logo_path not like", value, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathIn(List<String> values) {
            addCriterion("logo_path in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotIn(List<String> values) {
            addCriterion("logo_path not in", values, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathBetween(String value1, String value2) {
            addCriterion("logo_path between", value1, value2, "logoPath");
            return (Criteria) this;
        }

        public Criteria andLogoPathNotBetween(String value1, String value2) {
            addCriterion("logo_path not between", value1, value2, "logoPath");
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

        public Criteria andAuditCompanyIsNull() {
            addCriterion("audit_company is null");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyIsNotNull() {
            addCriterion("audit_company is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyEqualTo(String value) {
            addCriterion("audit_company =", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyNotEqualTo(String value) {
            addCriterion("audit_company <>", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyGreaterThan(String value) {
            addCriterion("audit_company >", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("audit_company >=", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyLessThan(String value) {
            addCriterion("audit_company <", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyLessThanOrEqualTo(String value) {
            addCriterion("audit_company <=", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyLike(String value) {
            addCriterion("audit_company like", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyNotLike(String value) {
            addCriterion("audit_company not like", value, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyIn(List<String> values) {
            addCriterion("audit_company in", values, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyNotIn(List<String> values) {
            addCriterion("audit_company not in", values, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyBetween(String value1, String value2) {
            addCriterion("audit_company between", value1, value2, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andAuditCompanyNotBetween(String value1, String value2) {
            addCriterion("audit_company not between", value1, value2, "auditCompany");
            return (Criteria) this;
        }

        public Criteria andIsRedutionIsNull() {
            addCriterion("is_redution is null");
            return (Criteria) this;
        }

        public Criteria andIsRedutionIsNotNull() {
            addCriterion("is_redution is not null");
            return (Criteria) this;
        }

        public Criteria andIsRedutionEqualTo(String value) {
            addCriterion("is_redution =", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionNotEqualTo(String value) {
            addCriterion("is_redution <>", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionGreaterThan(String value) {
            addCriterion("is_redution >", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionGreaterThanOrEqualTo(String value) {
            addCriterion("is_redution >=", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionLessThan(String value) {
            addCriterion("is_redution <", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionLessThanOrEqualTo(String value) {
            addCriterion("is_redution <=", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionLike(String value) {
            addCriterion("is_redution like", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionNotLike(String value) {
            addCriterion("is_redution not like", value, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionIn(List<String> values) {
            addCriterion("is_redution in", values, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionNotIn(List<String> values) {
            addCriterion("is_redution not in", values, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionBetween(String value1, String value2) {
            addCriterion("is_redution between", value1, value2, "isRedution");
            return (Criteria) this;
        }

        public Criteria andIsRedutionNotBetween(String value1, String value2) {
            addCriterion("is_redution not between", value1, value2, "isRedution");
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

        public Criteria andSortNum8IsNull() {
            addCriterion("sort_num8 is null");
            return (Criteria) this;
        }

        public Criteria andSortNum8IsNotNull() {
            addCriterion("sort_num8 is not null");
            return (Criteria) this;
        }

        public Criteria andSortNum8EqualTo(Integer value) {
            addCriterion("sort_num8 =", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8NotEqualTo(Integer value) {
            addCriterion("sort_num8 <>", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8GreaterThan(Integer value) {
            addCriterion("sort_num8 >", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8GreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_num8 >=", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8LessThan(Integer value) {
            addCriterion("sort_num8 <", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8LessThanOrEqualTo(Integer value) {
            addCriterion("sort_num8 <=", value, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8In(List<Integer> values) {
            addCriterion("sort_num8 in", values, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8NotIn(List<Integer> values) {
            addCriterion("sort_num8 not in", values, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8Between(Integer value1, Integer value2) {
            addCriterion("sort_num8 between", value1, value2, "sortNum8");
            return (Criteria) this;
        }

        public Criteria andSortNum8NotBetween(Integer value1, Integer value2) {
            addCriterion("sort_num8 not between", value1, value2, "sortNum8");
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