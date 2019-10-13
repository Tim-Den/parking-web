package pers.arrayli.dao;

import java.sql.SQLException;

import pers.arrayli.domain.CheFeiPrice;

/**
 *	车费标准接口
 *	主要用来定义一些设置和查询车费标准的接口
 */
public interface CheFeiPriceDao {
	/**	查询车费标准
	 * @return 查询的车费标准
	 * @throws SQLException
	 */
	int findFare() throws SQLException;
	
	
	/**	设置车费标准
	 * @param  id		车费标准id
	 * @param price		车费标准
	 * @return	设置车费标准成功与否
	 * @throws SQLException
	 */
	boolean setFare(int id, CheFeiPrice price) throws SQLException;
	
	/**	查询车费价格信息对象
	 * @return	返回查询的车费价格信息对象
	 * @throws SQLException
	 */
	CheFeiPrice QueryFare() throws SQLException;
	
	/**	通过车费价格 id来设置车费价格标准
	 * @param id		车费价格 id
	 * @return			设置车费价格成功与否
	 * @throws SQLException
	 */
	//boolean setFare(int id) throws SQLException;
	
	
	
}
 