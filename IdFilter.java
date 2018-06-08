package com.google.test;

import java.util.Collection;

/**
 * Filters hardcoded test accounts out of a collection of IDs.
 * The test accounts are 100, 101 and 110.
 */
/* Hi there */
public class IdFilter {
  public static boolean containsTestAccount(Collection<Long> ids) {
    return ids.contains(100L) || ids.contains(101) || ids.contains(110);
  }

  public static void filter(Collection<Long> ids) {
    ids.remove(100);
    ids.remove(101);
    ids.remove(110);
  }
}
