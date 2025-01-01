package dsalgoexplorer.test;

import java.util.Objects;
import java.util.Comparator;

public class CurrencyCountryKey implements Comparable<CurrencyCountryKey> {

    private Integer currencyId;
    private Integer countryId;//nullable

    public CurrencyCountryKey(Integer currencyId, Integer countryId) {
        this.currencyId = currencyId;
        this.countryId = countryId;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyCountryKey that = (CurrencyCountryKey) o;
        return Objects.equals(currencyId, that.currencyId) && Objects.equals(countryId, that.countryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currencyId, countryId);
    }

    @Override
    public int compareTo(CurrencyCountryKey o) {
        return Comparator.comparing(CurrencyCountryKey::getCurrencyId, Comparator.nullsFirst(Integer::compareTo))
                .thenComparing(CurrencyCountryKey::getCountryId, Comparator.nullsFirst(Integer::compareTo))
                .compare(this, o);
    }

    @Override
    public String toString() {
        return "{" +
                "currencyId=" + currencyId +
                ", countryId=" + countryId +
                '}';
    }
}
