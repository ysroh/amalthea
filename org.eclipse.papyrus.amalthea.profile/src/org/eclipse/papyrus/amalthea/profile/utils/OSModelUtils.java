package org.eclipse.papyrus.amalthea.profile.utils;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSEK;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.PriorityBased;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author epp
 *
 */
public class OSModelUtils {

	private static final String OPERATING_SYSTEM = "AMALTHEA::OperatingSystem";
	private static final String SCHEDULER = "AMALTHEA::Scheduler";
	private static final String TASK_SCHEDULER = "AMALTHEA::TaskScheduler";
	private static final String INTERRUPT_CONTROLLER = "AMALTHEA::InterruptController";
	private static final String SCHEDULING_HWUNIT = "AMALTHEA::SchedulingHWUnit";
	private static final String TASK_SCHEDULING_ALGORITHM = "AMALTHEA::TaskSchedulingAlgorithm";
	private static final String OSEK = "AMALTHEA::OSEK";
	private static final String PRIORITY_BASED	= "AMALTHEA::PriorityBased";
	
	public static boolean isOperatingSystem(Element el) {
		Stereotype s = el.getAppliedStereotype(OPERATING_SYSTEM);
		return s != null;
	}

	public static OperatingSystem getOperatingSystem(Element el) {
		Stereotype s = el.getAppliedStereotype(OPERATING_SYSTEM);
		return s == null ? null : (OperatingSystem) el.getStereotypeApplication(s);
	}

	public static boolean isScheduler(Element el) {
		Stereotype s = el.getAppliedStereotype(SCHEDULER);
		return s != null;
	}

	public static Scheduler getScheduler(Element el) {
		Stereotype s = el.getAppliedStereotype(SCHEDULER);
		return s == null ? null : (Scheduler) el.getStereotypeApplication(s);
	}

	public static boolean isTaskScheduler(Element el) {
		Stereotype s = el.getAppliedStereotype(TASK_SCHEDULER);
		return s != null;
	}

	public static TaskScheduler getTaskScheduler(Element el) {
		Stereotype s = el.getAppliedStereotype(TASK_SCHEDULER);
		return s == null ? null : (TaskScheduler) el.getStereotypeApplication(s);
	}

	public static boolean isInterruptController(Element el) {
		Stereotype s = el.getAppliedStereotype(INTERRUPT_CONTROLLER);
		return s != null;
	}

	public static InterruptController getInterruptController(Element el) {
		Stereotype s = el.getAppliedStereotype(INTERRUPT_CONTROLLER);
		return s == null ? null : (InterruptController) el.getStereotypeApplication(s);
	}

	public static boolean isSchedulingHWUnit(Element el) {
		Stereotype s = el.getAppliedStereotype(SCHEDULING_HWUNIT);
		return s != null;
	}

	public static SchedulingHWUnit getSchedulingHWUnit(Element el) {
		Stereotype s = el.getAppliedStereotype(SCHEDULING_HWUNIT);
		return s == null ? null : (SchedulingHWUnit) el.getStereotypeApplication(s);
	}

	public static boolean isTaskSchedulingAlgorithm(Element el) {
		Stereotype s = el.getAppliedStereotype(TASK_SCHEDULING_ALGORITHM);
		return s != null;
	}

	public static TaskSchedulingAlgorithm getTaskSchedulingAlgorithm(Element el) {
		Stereotype s = el.getAppliedStereotype(TASK_SCHEDULING_ALGORITHM);
		return s == null ? null : (TaskSchedulingAlgorithm) el.getStereotypeApplication(s);
	}

	public static boolean isOSEK(Element el) {
		Stereotype s = el.getAppliedStereotype(OSEK);
		return s != null;
	}

	public static OSEK getOSEK(Element el) {
		Stereotype s = el.getAppliedStereotype(OSEK);
		return s == null ? null : (OSEK) el.getStereotypeApplication(s);
	}

	public static boolean isPriorityBased(Element el) {
		Stereotype s = el.getAppliedStereotype(PRIORITY_BASED);
		return s != null;
	}

	public static PriorityBased getComplexNode(Element el) {
		Stereotype s = el.getAppliedStereotype(PRIORITY_BASED);
		return s == null ? null : (PriorityBased) el.getStereotypeApplication(s);
	}

}
