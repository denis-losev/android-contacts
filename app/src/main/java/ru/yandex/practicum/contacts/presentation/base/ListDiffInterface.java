package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<C> {

    boolean theSameAs(C type);

    boolean equals(Object o);
}
