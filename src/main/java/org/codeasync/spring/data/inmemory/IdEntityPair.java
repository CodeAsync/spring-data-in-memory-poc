package org.codeasync.spring.data.inmemory;

public interface IdEntityPair<ID, ENTITY> {

	ID getId();

	ENTITY getEntity();

}
