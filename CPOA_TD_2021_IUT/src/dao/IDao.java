package dao;

import java.util.List;

public interface IDao<T> {

	T getById(int id);

	List<T> getAll();

	boolean update(T objet);

	boolean create(T objet);

	boolean delete(T objet);

}
