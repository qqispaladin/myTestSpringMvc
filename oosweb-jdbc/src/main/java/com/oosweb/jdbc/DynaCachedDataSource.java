/*package com.oosweb.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynaCachedDataSource extends AbstractRoutingDataSource{

	boolean hasInit = false;

	public DynaCachedDataSource() {
		super();
		super.setTargetDataSources(new HashMap());
	}

	@Override
	public Connection getConnection() throws SQLException {
		if (!hasInit) {
			initDateSourceByProperties();
		}
		return super.getConnection();
	}

	*//**
	 * 初始化配置
	 *//*
	private void initDateSourceByProperties() {
		String driver ="db.driverClass";
		String url = "db.jdbcUrl";
		String username ="db.username";
		String password = "db.username";
		
		int poolMaximumActiveConnections =10;// PropertiesUtils.getInt("db.maxActive", 10);
		int poolMaximumIdleConnections = 100;//PropertiesUtils.getInt("db.maxIdle", 10);
		PooledDataSource defaultDS = new PooledDataSource();
		defaultDS.setDriver(driver);
		defaultDS.setUrl(url);
		defaultDS.setUsername(username);
		defaultDS.setPassword(password);
		defaultDS.setPoolMaximumActiveConnections(poolMaximumActiveConnections);
		defaultDS.setPoolMaximumIdleConnections(poolMaximumIdleConnections);
		this.setDefaultTargetDataSource(defaultDS);
		this.setTargetDataSources(getTargetsMap(poolMaximumActiveConnections, poolMaximumIdleConnections));
		super.afterPropertiesSet();
		hasInit = true;
	}

	private Map<Object, Object> getTargetsMap(int poolMaximumActiveConnections, int poolMaximumIdleConnections) {
		Map<Object, Object> targets = new HashMap<Object, Object>();
		DBConfigCache dbCache = SpringContext.getBean(DBConfigCache.class);
		Map props = dbCache.getConfigData();
		for (Object prop : props.entrySet()) {
			String key = ((Entry<String, String>)prop).getKey();
			if (!StringUtils.startsWith(key, "db.jdbcUrl.")) {
				continue;
			}
			String pkg = key.replace("db.jdbcUrl.", "");
			String value = ((Entry<String, String>)prop).getValue();
			PooledDataSource dataSource = new PooledDataSource();
			dataSource.setDriver((String)props.get("db.driverClass." + pkg));
			dataSource.setUrl(value);
			dataSource.setUsername((String)props.get("db.username." + pkg));
			dataSource.setPassword((String)props.get("db.password." + pkg));
			String maxActive = (String)props.get("db.maxActive." + pkg);
			if (NumberUtils.isNumber(maxActive)) {
				poolMaximumActiveConnections = NumberUtils.toInt(maxActive);
			}
			String maxIdle = (String)props.get("db.maxActive." + pkg);
			if (NumberUtils.isNumber(maxIdle)) {
				poolMaximumIdleConnections = NumberUtils.toInt(maxIdle);
			}
			dataSource.setPoolMaximumActiveConnections(poolMaximumActiveConnections);
			dataSource.setPoolMaximumIdleConnections(poolMaximumIdleConnections);
			targets.put(pkg, dataSource);
		}
		return targets;
	}

	@Override
	protected Object determineCurrentLookupKey() {
		return getDataSource();
	}

	// 线程本地环境
	private static final ThreadLocal<String> dataSources = new ThreadLocal<String>();

	// 设置数据源
	public static void setDataSource(String customerType) {
		dataSources.set(customerType);
	}

	// 获取数据源
	public static String getDataSource() {
		return (String)dataSources.get();
	}
}
*/