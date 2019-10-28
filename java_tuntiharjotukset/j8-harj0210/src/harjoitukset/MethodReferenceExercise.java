package harjoitukset;

import java.util.*;

/* Harjoitus 3 mallivastaus
 * 
 */

import java.util.function.*;
import java.time.*;
import static java.time.temporal.ChronoUnit.MINUTES;

public class MethodReferenceExercise {

	private static class Event implements Comparable<Event> {
		private String title;
		private LocalDateTime endTime;
		private LocalDateTime startTime;

		public Event(String title, LocalDateTime startTime, LocalDateTime endTime) {
			this.title = title;
			this.startTime = startTime;
			this.endTime = endTime;
		}

		@SuppressWarnings("unused")
		public String getTitle() {
			return title;
		}

		@SuppressWarnings("unused")
		public void setStartTime(LocalDateTime tm) {
			startTime = tm;
		}

		@SuppressWarnings("unused")
		public LocalDateTime getStartTime() {
			return startTime;
		}

		@SuppressWarnings("unused")
		public void setEndTime(LocalDateTime tm) {
			endTime = tm;
		}

		@SuppressWarnings("unused")
		public LocalDateTime getEndTime() {
			return endTime;
		}
		public long getDuration() {
			// return Duration.between(endTime, startTime);
			return MINUTES.between(startTime, endTime); // Counted Minutes between is double
		}
		public String getEventInformation() {
			return "event " + title + " start at " + startTime + " and duration is " + getDuration() + " minutes";
		}
		@Override
		public int compareTo(Event ev) {
			return this.startTime.compareTo(ev.startTime);
		}
	}
	public static void main(String[] args) {
		List<Event> Events = new ArrayList<>();
		// TODO 1: Luodaan tapahtumataulukko
		Events.add(new Event("Doing exercises", LocalDateTime.of(2017, 11, 10, 9, 30),
				LocalDateTime.of(2017, 11, 10, 13, 00)));
		Events.add(new Event("Java Course", LocalDateTime.of(2017, 11, 13, 9, 00),
				LocalDateTime.of(2017, 11, 13, 16, 00)));
		Events.add(new Event("Java Course", LocalDateTime.of(2017, 11, 14, 9, 00),
				LocalDateTime.of(2017, 11, 14, 15, 45)));
		Events.add(new Event("Client Meeting", LocalDateTime.of(2017, 11, 14, 17, 15),
				LocalDateTime.of(2017, 11, 14, 19, 30)));

		// TODO 2: Metodireferenssi metodiin getEventInformation
		List<String> eventInfos = MethodReferenceExercise.createEventInformationList(Events,
				Event::getEventInformation);
		System.out.println(eventInfos);
		// TODO 3: Lambda-versio
		List<String> eventInfos2 = createEventInformationList(Events, v -> v.getEventInformation());
		System.out.println(eventInfos2);
				
		// TODO Extra, sorttaa tapahtumat alkupäivämäärän mukaan tai tapahtuman keston mukaan 
		Optional<Event> firstEvent = Events.stream().sorted().findFirst();
		System.out.println("Ensimmäinen tapahtuma: " + firstEvent.get().getEventInformation());
		//Optional<Event> firstEvent = Events.stream().sorted(Comparator.comparing(Event::getStartTime)).findFirst();
		Optional<Event> firstEvent2 = Events.stream().sorted(Comparator.comparing(Event::getDuration)).findFirst();
		System.out.println("Ensimmäinen tapahtuma: " + firstEvent2.get().getEventInformation());
	}

	private static List<String> createEventInformationList(List<Event> EventList, Function<Event, String> func) {
		List<String> resultList = new ArrayList<>();
		EventList.forEach(x -> resultList.add(func.apply((Event) x)));
		return resultList;	
	}

}
