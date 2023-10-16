package me.cuale.db;

import java.util.Collection;
import java.util.Set;

import me.cuale.model.MenuItem;

public interface DbInterface {
	public Set<MenuItem> readMenuItems(); 
	public int createMenuItem();
	public void updateMenuItem();
	public void deleteMenuItems(Collection<Integer> menuItemIds);
}
