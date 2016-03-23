package org.openweathermap.api.query.builder;

import org.openweathermap.api.query.Language;
import org.openweathermap.api.query.Query;
import org.openweathermap.api.query.ResponseFormat;
import org.openweathermap.api.query.UnitFormat;

public abstract class QueryBuilder<T extends QueryBuilder<T, E>, E extends Query> {
    protected abstract T self();

    protected abstract E getQuery();

    public E build() {
        return getQuery();
    }

    public T language(Language language) {
        getQuery().setLanguage(language);
        return self();
    }

    public T unitFormat(UnitFormat unitFormat) {
        getQuery().setUnitFormat(unitFormat);
        return self();
    }

    public T responseFormat(ResponseFormat responseFormat) {
        getQuery().setResponseFormat(responseFormat);
        return self();
    }
}
