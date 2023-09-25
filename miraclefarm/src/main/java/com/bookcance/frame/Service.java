package com.bookcance.frame;

import java.util.List;

public interface Service<K,V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V choice(K k) throws Exception;
	public List<V> choiceall() throws Exception;
}
