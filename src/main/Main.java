/**
 * 
 */
package main;

import org.hibernate.Session;

import persistence.HibernateUtil;

/**
 * @author bertrand
 *
 */
public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Session session = HibernateUtil.currentSession();

		HibernateUtil.closeSession();
	}
}
