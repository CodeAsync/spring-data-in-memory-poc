package org.codeasync.spring.data.inmemory;

public interface DataStore<ID, ENTITY> extends Iterable<IdEntityPair<ID, ENTITY>> {
	Object getDelegate();
}
