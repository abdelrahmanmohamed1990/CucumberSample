package com.elmenus.test.bdd

import org.junit.Assert._


import io.cucumber.datatable.DataTable
import io.cucumber.scala.{EN, ScalaDsl}

class BasketSteps extends ScalaDsl with EN {
  Given("""the following users""") { (dataTable: DataTable) =>
    //TODO Insert in db or call api to create this data in db
    dataTable.asMaps().forEach(println)
    throw new io.cucumber.scala.PendingException()
  }
  Given("""the following restaurants""") { (dataTable: DataTable) =>
    //TODO Insert in db or call api to create this data in db
    dataTable.asMaps().forEach(println)
    throw new io.cucumber.scala.PendingException()
  }
  Given("""the following items for restaurant {string}""") { (restaurantName: String, dataTable: DataTable) =>
    //TODO Insert in db or call api to create this data in db
    println(restaurantName)
    dataTable.asMaps().forEach(println)
    throw new io.cucumber.scala.PendingException()
  }
  Given("""the following user is logged in""") { (dataTable: DataTable) =>
    dataTable.asMaps().forEach(println)
    throw new io.cucumber.scala.PendingException()
  }
  When("""user select restaurant {string} and add item {string} to basket""") { (restaurantName: String, item: String) =>
    println(restaurantName)
    println(item)
    //TODO call api, or do multiple ui actions
    throw new io.cucumber.scala.PendingException()
  }
  Then("""the user {string} should have the following basket items""") { (email: String, dataTable: DataTable) =>
    //TODO call api to get the data and assert it, or get data from ui and assert it
    // assertEquals(data from api , data from dataTable)
    dataTable.asMaps().forEach(println)
    throw new io.cucumber.scala.PendingException()
  }

}
