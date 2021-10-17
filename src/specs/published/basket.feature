Feature: basket creation
  Background:
    Given the following users
      | name        | email                        | mobile      | password |
      | Abdelrahman | abdelrahman.awad@elmenus.com | 01200000000 | qwerty12 |
      | Amr         | amr@elmenus.com              | 01100000000 | qwerty45 |

    And the following restaurants
      | name           | mobile number | address                                                                    | latitude           | longitude         |
      | Crave          | 01500000000   | 213، معادي السرايات الغربية، قسم المعادي، محافظة القاهرة                   | 29.961183738041594 | 31.27686744657627 |
      | Domino's Pizza | +20225200044  | 14 Rd 210, Near Cairo American College, Degla, قسم المعادي، محافظة القاهرة | 29.9575958577713   | 31.27495658812403 |

    And the following items for restaurant "crave"
      | item            | description | price |
      | Grilled Chicken | x,y,z       | 100.0 |
      | Taco Salad      | a,b,c       | 20.0  |

    And the following items for restaurant "Domino's Pizza"
      | item                | description | price |
      | Philly Cheese Steak | x,y,z       | 100.0 |
      | Chicken Legend BBQ  | a,b,c       | 150.0 |

  @implemented
  Scenario: user logged in, basket is created when the add item
    Given the following user is logged in
      | email                        | password |
      | abdelrahman.awad@elmenus.com | qwerty12 |

    When user select restaurant "crave" and add item "Grilled Chicken" to basket

    Then the user "abdelrahman.awad@elmenus.com" should have the following basket items
      | Item            |
      | Grilled Chicken |