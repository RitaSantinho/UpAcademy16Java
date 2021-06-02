package io.altar.relations.repositories;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.altar.relations.models.Shelf;

@ApplicationScoped
public class ShelfRepository extends EntityRepository<Shelf> {

	@Override
	protected Class<Shelf> getEntityClass() {
		return Shelf.class;
	}
	
	public List<Shelf> getAll() {
		return entityManager.createNamedQuery(Shelf.GET_ALL_SHELVES, getEntityClass()).getResultList();
	}
}