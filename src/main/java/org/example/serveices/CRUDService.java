package org.example.serveices;

import java.util.Collection;

public interface CRUDService<T>{
  T getById(Integer id);
  Collection<T> getAll();
  void create(T t);

  void update(T t);

  void deleteById(Integer id);
}
