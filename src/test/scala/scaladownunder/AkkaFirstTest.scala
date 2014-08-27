package scaladownunder

import akka.actor.Actor
import akka.actor.Props
import akka.testkit.TestActorRef

class AkkaFirstTest extends AkkaSpec {

  describe("akka first test") {

    it("should respond to ping") {
      val first = TestActorRef(Props(new MyFirstActor))

      first ! "Hello World"
      
      expectMsg("back at you - Hello World")
    }
  }
}

class MyFirstActor extends Actor {

  def receive = {

    case message: String ⇒
      println(s"We received a message: $message")
      val reply = s"back at you - $message"
      println(s"Sending back: $reply")
      sender ! reply

    case _ ⇒ println("Oh no we got a message we don't handle")
  }
}
