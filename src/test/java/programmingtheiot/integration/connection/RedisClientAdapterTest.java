/**
 * 
 * This class is part of the Programming the Internet of Things
 * project, and is available via the MIT License, which can be
 * found in the LICENSE file at the top level of this repository.
 * 
 * Copyright (c) 2020 - 2025 by Andrew D. King
 */ 

package programmingtheiot.integration.connection;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import programmingtheiot.gda.connection.RedisPersistenceAdapter;
import programmingtheiot.data.SensorData;
import programmingtheiot.data.ActuatorData;
import programmingtheiot.data.SystemPerformanceData;

/**
 * This test case class contains very basic integration tests for
 * RedisPersistenceAdapter. It should not be considered complete,
 * but serve as a starting point for the student implementing
 * additional functionality within their Programming the IoT
 * environment.
 *
 */
public class RedisClientAdapterTest
{
	// static
	
	private static final Logger _Logger =
		Logger.getLogger(RedisClientAdapterTest.class.getName());
	
	
	// member var's
	
	private RedisPersistenceAdapter rpa = null;
	
	
	// test setup methods
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
	}
	
	// test methods
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#connectClient()}.
	 */
	@Test
	public void testConnectClient()
	{
		boolean result = rpa.connectClient();
		assertFalse("connectClient should return false by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#disconnectClient()}.
	 */
	@Test
	public void testDisconnectClient()
	{
		boolean result = rpa.disconnectClient();
		assertFalse("disconnectClient should return false by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#getActuatorData(java.lang.String, java.util.Date, java.util.Date)}.
	 */
	@Test
	public void testGetActuatorData()
	{
		ActuatorData[] result = rpa.getActuatorData("test/actuator", new Date(), new Date());
		assertNull("getActuatorData should return null by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#getSensorData(java.lang.String, java.util.Date, java.util.Date)}.
	 */
	@Test
	public void testGetSensorData()
	{
		SensorData[] result = rpa.getSensorData("test/sensor", new Date(), new Date());
		assertNull("getSensorData should return null by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#storeData(java.lang.String, int, programmingtheiot.data.ActuatorData[])}.
	 */
	@Test
	public void testStoreDataStringIntActuatorDataArray()
	{
		ActuatorData ad = new ActuatorData();
		boolean result = rpa.storeData("test/actuator", 0, ad);
		assertFalse("storeData with ActuatorData should return false by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#storeData(java.lang.String, int, programmingtheiot.data.SensorData[])}.
	 */
	@Test
	public void testStoreDataStringIntSensorDataArray()
	{
		SensorData sd = new SensorData();
		boolean result = rpa.storeData("test/sensor", 0, sd);
		assertFalse("storeData with SensorData should return false by default", result);
	}
	
	/**
	 * Test method for {@link programmingtheiot.gda.connection.RedisPersistenceAdapter#storeData(java.lang.String, int, programmingtheiot.data.SystemPerformanceData[])}.
	 */
	@Test
	public void testStoreDataStringIntSystemPerformanceDataArray()
	{
		SystemPerformanceData spd = new SystemPerformanceData();
		boolean result = rpa.storeData("test/sysperf", 0, spd);
		assertFalse("storeData with SystemPerformanceData should return false by default", result);
	}
	
}
