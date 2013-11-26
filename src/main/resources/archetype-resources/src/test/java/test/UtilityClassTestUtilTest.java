#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.test;

import static ${package}.UtilityClassTestUtil.assertUtilityClassWellDefined;
import ${package}.DisableSslCertificateCheckUtil;
import ${package}.UtilityClassTestUtil;
import ${package}.test.util.MultipleConstructorUtil;
import ${package}.test.util.NonFinalUtil;
import ${package}.test.util.PublicConstructorUtil;

import org.junit.Test;

/**
 * Tests {@link UtilityClassTestUtil}.
 * 
 * @author Archimedes Trajano
 * 
 */
public class UtilityClassTestUtilTest {
	@Test(expected = AssertionError.class)
	public void testBadUtil1() throws Exception {
		assertUtilityClassWellDefined(NonFinalUtil.class);
	}

	@Test(expected = AssertionError.class)
	public void testBadUtil2() throws Exception {
		assertUtilityClassWellDefined(PublicConstructorUtil.class);
	}

	@Test(expected = AssertionError.class)
	public void testBadUtil3() throws Exception {
		assertUtilityClassWellDefined(MultipleConstructorUtil.class);
	}

	/**
	 * Tests {@link DisableSslCertificateCheckUtil} which should be valid.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDisableSSLCerificateCheckUtil() throws Exception {
		assertUtilityClassWellDefined(DisableSslCertificateCheckUtil.class);
	}

	/**
	 * Tests the utility class itself which should be valid.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSelf() throws Exception {
		assertUtilityClassWellDefined(UtilityClassTestUtil.class);
	}

	@Test(expected = AssertionError.class)
	public void testTestSelf() throws Exception {
		assertUtilityClassWellDefined(UtilityClassTestUtilTest.class);
	}
}
