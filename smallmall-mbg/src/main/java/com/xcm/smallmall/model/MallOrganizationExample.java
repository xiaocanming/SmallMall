package com.xcm.smallmall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MallOrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallOrganizationExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("org_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("org_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("org_no =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("org_no <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("org_no >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_no >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("org_no <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("org_no <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("org_no like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("org_no not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("org_no in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("org_no not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("org_no between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("org_no not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameIsNull() {
            addCriterion("org_full_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameIsNotNull() {
            addCriterion("org_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameEqualTo(String value) {
            addCriterion("org_full_name =", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameNotEqualTo(String value) {
            addCriterion("org_full_name <>", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameGreaterThan(String value) {
            addCriterion("org_full_name >", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_full_name >=", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameLessThan(String value) {
            addCriterion("org_full_name <", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameLessThanOrEqualTo(String value) {
            addCriterion("org_full_name <=", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameLike(String value) {
            addCriterion("org_full_name like", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameNotLike(String value) {
            addCriterion("org_full_name not like", value, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameIn(List<String> values) {
            addCriterion("org_full_name in", values, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameNotIn(List<String> values) {
            addCriterion("org_full_name not in", values, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameBetween(String value1, String value2) {
            addCriterion("org_full_name between", value1, value2, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgFullNameNotBetween(String value1, String value2) {
            addCriterion("org_full_name not between", value1, value2, "orgFullName");
            return (Criteria) this;
        }

        public Criteria andOrgAbrIsNull() {
            addCriterion("org_abr is null");
            return (Criteria) this;
        }

        public Criteria andOrgAbrIsNotNull() {
            addCriterion("org_abr is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAbrEqualTo(String value) {
            addCriterion("org_abr =", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrNotEqualTo(String value) {
            addCriterion("org_abr <>", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrGreaterThan(String value) {
            addCriterion("org_abr >", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrGreaterThanOrEqualTo(String value) {
            addCriterion("org_abr >=", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrLessThan(String value) {
            addCriterion("org_abr <", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrLessThanOrEqualTo(String value) {
            addCriterion("org_abr <=", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrLike(String value) {
            addCriterion("org_abr like", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrNotLike(String value) {
            addCriterion("org_abr not like", value, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrIn(List<String> values) {
            addCriterion("org_abr in", values, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrNotIn(List<String> values) {
            addCriterion("org_abr not in", values, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrBetween(String value1, String value2) {
            addCriterion("org_abr between", value1, value2, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgAbrNotBetween(String value1, String value2) {
            addCriterion("org_abr not between", value1, value2, "orgAbr");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdIsNull() {
            addCriterion("org_tpcd is null");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdIsNotNull() {
            addCriterion("org_tpcd is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdEqualTo(String value) {
            addCriterion("org_tpcd =", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdNotEqualTo(String value) {
            addCriterion("org_tpcd <>", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdGreaterThan(String value) {
            addCriterion("org_tpcd >", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdGreaterThanOrEqualTo(String value) {
            addCriterion("org_tpcd >=", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdLessThan(String value) {
            addCriterion("org_tpcd <", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdLessThanOrEqualTo(String value) {
            addCriterion("org_tpcd <=", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdLike(String value) {
            addCriterion("org_tpcd like", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdNotLike(String value) {
            addCriterion("org_tpcd not like", value, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdIn(List<String> values) {
            addCriterion("org_tpcd in", values, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdNotIn(List<String> values) {
            addCriterion("org_tpcd not in", values, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdBetween(String value1, String value2) {
            addCriterion("org_tpcd between", value1, value2, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgTpcdNotBetween(String value1, String value2) {
            addCriterion("org_tpcd not between", value1, value2, "orgTpcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdIsNull() {
            addCriterion("org_stcd is null");
            return (Criteria) this;
        }

        public Criteria andOrgStcdIsNotNull() {
            addCriterion("org_stcd is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStcdEqualTo(String value) {
            addCriterion("org_stcd =", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdNotEqualTo(String value) {
            addCriterion("org_stcd <>", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdGreaterThan(String value) {
            addCriterion("org_stcd >", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdGreaterThanOrEqualTo(String value) {
            addCriterion("org_stcd >=", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdLessThan(String value) {
            addCriterion("org_stcd <", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdLessThanOrEqualTo(String value) {
            addCriterion("org_stcd <=", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdLike(String value) {
            addCriterion("org_stcd like", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdNotLike(String value) {
            addCriterion("org_stcd not like", value, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdIn(List<String> values) {
            addCriterion("org_stcd in", values, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdNotIn(List<String> values) {
            addCriterion("org_stcd not in", values, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdBetween(String value1, String value2) {
            addCriterion("org_stcd between", value1, value2, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgStcdNotBetween(String value1, String value2) {
            addCriterion("org_stcd not between", value1, value2, "orgStcd");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoIsNull() {
            addCriterion("org_parent_no is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoIsNotNull() {
            addCriterion("org_parent_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoEqualTo(String value) {
            addCriterion("org_parent_no =", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoNotEqualTo(String value) {
            addCriterion("org_parent_no <>", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoGreaterThan(String value) {
            addCriterion("org_parent_no >", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoGreaterThanOrEqualTo(String value) {
            addCriterion("org_parent_no >=", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoLessThan(String value) {
            addCriterion("org_parent_no <", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoLessThanOrEqualTo(String value) {
            addCriterion("org_parent_no <=", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoLike(String value) {
            addCriterion("org_parent_no like", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoNotLike(String value) {
            addCriterion("org_parent_no not like", value, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoIn(List<String> values) {
            addCriterion("org_parent_no in", values, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoNotIn(List<String> values) {
            addCriterion("org_parent_no not in", values, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoBetween(String value1, String value2) {
            addCriterion("org_parent_no between", value1, value2, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andOrgParentNoNotBetween(String value1, String value2) {
            addCriterion("org_parent_no not between", value1, value2, "orgParentNo");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(Long value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(Long value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(Long value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(Long value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(Long value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(Long value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<Long> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<Long> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(Long value1, Long value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(Long value1, Long value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIsNull() {
            addCriterion("org_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIsNotNull() {
            addCriterion("org_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeEqualTo(Date value) {
            addCriterion("org_create_time =", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotEqualTo(Date value) {
            addCriterion("org_create_time <>", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeGreaterThan(Date value) {
            addCriterion("org_create_time >", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_create_time >=", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeLessThan(Date value) {
            addCriterion("org_create_time <", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_create_time <=", value, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeIn(List<Date> values) {
            addCriterion("org_create_time in", values, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotIn(List<Date> values) {
            addCriterion("org_create_time not in", values, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeBetween(Date value1, Date value2) {
            addCriterion("org_create_time between", value1, value2, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_create_time not between", value1, value2, "orgCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeIsNull() {
            addCriterion("org_stop_time is null");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeIsNotNull() {
            addCriterion("org_stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeEqualTo(Date value) {
            addCriterion("org_stop_time =", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeNotEqualTo(Date value) {
            addCriterion("org_stop_time <>", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeGreaterThan(Date value) {
            addCriterion("org_stop_time >", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_stop_time >=", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeLessThan(Date value) {
            addCriterion("org_stop_time <", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeLessThanOrEqualTo(Date value) {
            addCriterion("org_stop_time <=", value, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeIn(List<Date> values) {
            addCriterion("org_stop_time in", values, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeNotIn(List<Date> values) {
            addCriterion("org_stop_time not in", values, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeBetween(Date value1, Date value2) {
            addCriterion("org_stop_time between", value1, value2, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andOrgStopTimeNotBetween(Date value1, Date value2) {
            addCriterion("org_stop_time not between", value1, value2, "orgStopTime");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("tenant_id is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("tenant_id is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Long value) {
            addCriterion("tenant_id =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Long value) {
            addCriterion("tenant_id <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Long value) {
            addCriterion("tenant_id >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tenant_id >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Long value) {
            addCriterion("tenant_id <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Long value) {
            addCriterion("tenant_id <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Long> values) {
            addCriterion("tenant_id in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Long> values) {
            addCriterion("tenant_id not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Long value1, Long value2) {
            addCriterion("tenant_id between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Long value1, Long value2) {
            addCriterion("tenant_id not between", value1, value2, "tenantId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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