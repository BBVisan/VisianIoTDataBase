/**
 * 
 */
package tests;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.junit.Test;

import junit.framework.TestCase;
import persistence.HibernateUtil;

/**
 * @author bertrand
 *
 */
public class testConnectDB extends TestCase
{
	final static Logger	logger	= Logger.getLogger(testConnectDB.class);
	private Session		session;

	@Override
	protected void setUp() throws Exception
	{
		logger.info("================ Start setting up.");
	}

	@Test
	public void testConnection()
	{
		logger.info("================ Start testConnection.");
		this.session = HibernateUtil.currentSession();
		HibernateUtil.closeSession();
	}

	@Override
	protected void tearDown()
	{
		logger.info("================ Start tearDown.");
	}
}
