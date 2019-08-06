package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorksExample() {
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

        public Criteria andWorksNameIsNull() {
            addCriterion("works_name is null");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNotNull() {
            addCriterion("works_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNameEqualTo(String value) {
            addCriterion("works_name =", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotEqualTo(String value) {
            addCriterion("works_name <>", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThan(String value) {
            addCriterion("works_name >", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThanOrEqualTo(String value) {
            addCriterion("works_name >=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThan(String value) {
            addCriterion("works_name <", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThanOrEqualTo(String value) {
            addCriterion("works_name <=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLike(String value) {
            addCriterion("works_name like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotLike(String value) {
            addCriterion("works_name not like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameIn(List<String> values) {
            addCriterion("works_name in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotIn(List<String> values) {
            addCriterion("works_name not in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameBetween(String value1, String value2) {
            addCriterion("works_name between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotBetween(String value1, String value2) {
            addCriterion("works_name not between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andBelongFirstIsNull() {
            addCriterion("belong_first is null");
            return (Criteria) this;
        }

        public Criteria andBelongFirstIsNotNull() {
            addCriterion("belong_first is not null");
            return (Criteria) this;
        }

        public Criteria andBelongFirstEqualTo(String value) {
            addCriterion("belong_first =", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstNotEqualTo(String value) {
            addCriterion("belong_first <>", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstGreaterThan(String value) {
            addCriterion("belong_first >", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstGreaterThanOrEqualTo(String value) {
            addCriterion("belong_first >=", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstLessThan(String value) {
            addCriterion("belong_first <", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstLessThanOrEqualTo(String value) {
            addCriterion("belong_first <=", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstLike(String value) {
            addCriterion("belong_first like", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstNotLike(String value) {
            addCriterion("belong_first not like", value, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstIn(List<String> values) {
            addCriterion("belong_first in", values, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstNotIn(List<String> values) {
            addCriterion("belong_first not in", values, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstBetween(String value1, String value2) {
            addCriterion("belong_first between", value1, value2, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongFirstNotBetween(String value1, String value2) {
            addCriterion("belong_first not between", value1, value2, "belongFirst");
            return (Criteria) this;
        }

        public Criteria andBelongSecondIsNull() {
            addCriterion("belong_second is null");
            return (Criteria) this;
        }

        public Criteria andBelongSecondIsNotNull() {
            addCriterion("belong_second is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSecondEqualTo(String value) {
            addCriterion("belong_second =", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondNotEqualTo(String value) {
            addCriterion("belong_second <>", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondGreaterThan(String value) {
            addCriterion("belong_second >", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondGreaterThanOrEqualTo(String value) {
            addCriterion("belong_second >=", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondLessThan(String value) {
            addCriterion("belong_second <", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondLessThanOrEqualTo(String value) {
            addCriterion("belong_second <=", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondLike(String value) {
            addCriterion("belong_second like", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondNotLike(String value) {
            addCriterion("belong_second not like", value, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondIn(List<String> values) {
            addCriterion("belong_second in", values, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondNotIn(List<String> values) {
            addCriterion("belong_second not in", values, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondBetween(String value1, String value2) {
            addCriterion("belong_second between", value1, value2, "belongSecond");
            return (Criteria) this;
        }

        public Criteria andBelongSecondNotBetween(String value1, String value2) {
            addCriterion("belong_second not between", value1, value2, "belongSecond");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
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

        public Criteria andEditorIsNull() {
            addCriterion("editor is null");
            return (Criteria) this;
        }

        public Criteria andEditorIsNotNull() {
            addCriterion("editor is not null");
            return (Criteria) this;
        }

        public Criteria andEditorEqualTo(String value) {
            addCriterion("editor =", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotEqualTo(String value) {
            addCriterion("editor <>", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThan(String value) {
            addCriterion("editor >", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorGreaterThanOrEqualTo(String value) {
            addCriterion("editor >=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThan(String value) {
            addCriterion("editor <", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLessThanOrEqualTo(String value) {
            addCriterion("editor <=", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorLike(String value) {
            addCriterion("editor like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotLike(String value) {
            addCriterion("editor not like", value, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorIn(List<String> values) {
            addCriterion("editor in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotIn(List<String> values) {
            addCriterion("editor not in", values, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorBetween(String value1, String value2) {
            addCriterion("editor between", value1, value2, "editor");
            return (Criteria) this;
        }

        public Criteria andEditorNotBetween(String value1, String value2) {
            addCriterion("editor not between", value1, value2, "editor");
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