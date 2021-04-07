package com.dom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * booking test.
 */
@RunWith(JMockit.class)
public class LearnerTest {

  private static DbConnection db;
  private BookingDAO bookingDAO;

  /**
   * db connection.
   */
  @BeforeClass
  public static void setup() {
    db = new DbConnection();
  }
  // /**
  // * setup method.
  // */
  // @Before
  // public void initInput() {

  // }
  /**
   * Tests the equals/hashcode methods of the room class.
   */
  @Test
  public final void testLearner() {
    Learner l = new Learner();
    Learner l1 = new Learner(100);
    Learner l2 = new Learner(101);
    Learner l3 = new Learner(103);
    Learning l4 = null;
    Learner l5 = new Learner(1, "Joseph", "1989-02-27", "jhones.cherry@gmail.com");
    Learner l6 = new Learner(2, "Nick", "2000-01-08", "nickdavis@gmail.com");
    Learner l7 = new Learner(1, "Joseph", "1989-02-27", "jhones.cherry@gmail.com");
    assertNotEquals(l, null);
    assertNotEquals(l1, null);
    assertNotEquals(l2, null);
    assertNotEquals(l3, null);
    assertEquals(l4, null);
    assertNotEquals(l5, null);
    assertNotEquals(l5, l6);
    assertNotEquals(l6, l7);
    assertEquals(l5.getLearnerId(), l7.getLearnerId());
    assertEquals(l5.getFirstName(), l7.getFirstName());
    assertEquals(l5.getDateOfBirth(), l7.getDateOfBirth());
    assertEquals(l5.getEmail(), l7.getEmail());
    assertNotEquals(l5.getLearnerId(), l6.getLearnerId());
    assertNotEquals(l5.getFirstName(), l6.getFirstName());
    assertNotEquals(l5.getDateOfBirth(), l6.getDateOfBirth());
    assertNotEquals(l5.getEmail(), l6.getEmail());
    assertEquals(l1.getLearnerId(), new Learner(100).getLearnerId());
    l2.setLearnerId(100);
    l5.setFirstName("Sahasra");
    l5.setDateOfBirth("1988-02-27");
    l5.setEmail("sahasra@gmail.com");
    // assertNotEquals(l2, new Learner(101));
    assertNotEquals(l5.getLearnerId(), l6.getLearnerId());
    assertNotEquals(l5.getFirstName(), l6.getFirstName());
    assertNotEquals(l5.getDateOfBirth(), l6.getDateOfBirth());
    assertNotEquals(l5.getEmail(), l6.getEmail());
    assertNotEquals(l1.hashCode(), new Learner(100).hashCode());
    // assertNotEquals(l1, new Learner(100));
    l5.toString();
  }
  /**
   * db connection.
   */
  // @AfterClass
  // public static void tearDown() {
  // DbConnection db = new DbConnection();
  // }
}
