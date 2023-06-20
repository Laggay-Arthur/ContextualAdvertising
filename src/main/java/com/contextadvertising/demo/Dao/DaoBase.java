package com.contextadvertising.demo.Dao;

public interface DaoBase<T> {

    public T findById(int id);

    public void save(T model);

    public void update(T model);

    public void delete(T model);
}
