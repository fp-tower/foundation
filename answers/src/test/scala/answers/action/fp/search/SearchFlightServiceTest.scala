package answers.action.fp.search

import answers.action.DateGenerator._
import answers.action.fp.search.SearchFlightGenerator._
import org.scalacheck.Gen
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class SearchFlightServiceTest extends AnyFunSuite with ScalaCheckDrivenPropertyChecks {

  test("all results must match the criteria") {
    forAll(Gen.listOf(searchFlightClientGen), airportGen, airportGen, dateGen, MinSuccessful(100)) {
      (clients, from, to, date) =>
        val service = SearchFlightService.fromClients(clients)
        val result  = service.search(from, to, date).unsafeRun()

        result.flights.foreach { flight =>
          assert(flight.from == from)
          assert(flight.to == to)
          assert(flight.departureDate == date)
        }
    }
  }

}
