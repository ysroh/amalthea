/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time Metric</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getTimeMetric()
 * @model
 * @generated
 */
public enum TimeMetric implements Enumerator {
	/**
	 * The '<em><b>undefined </b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_UNDEFINED__VALUE
	 * @generated
	 * @ordered
	 */
	_UNDEFINED_(0, "_undefined_", "_undefined_"),

	/**
	 * The '<em><b>Activate To Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_TO_ACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATE_TO_ACTIVATE(1, "ActivateToActivate", "ActivateToActivate"),

	/**
	 * The '<em><b>Core Execution Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORE_EXECUTION_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	CORE_EXECUTION_TIME(2, "CoreExecutionTime", "CoreExecutionTime"),

	/**
	 * The '<em><b>End To End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_TO_END_VALUE
	 * @generated
	 * @ordered
	 */
	END_TO_END(3, "EndToEnd", "EndToEnd"),

	/**
	 * The '<em><b>Gross Execution Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROSS_EXECUTION_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	GROSS_EXECUTION_TIME(4, "GrossExecutionTime", "GrossExecutionTime"),

	/**
	 * The '<em><b>Lateness</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LATENESS_VALUE
	 * @generated
	 * @ordered
	 */
	LATENESS(5, "Lateness", "Lateness"),

	/**
	 * The '<em><b>Memory Access Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_ACCESS_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_ACCESS_TIME(6, "MemoryAccessTime", "MemoryAccessTime"),

	/**
	 * The '<em><b>Net Execution Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NET_EXECUTION_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	NET_EXECUTION_TIME(7, "NetExecutionTime", "NetExecutionTime"),

	/**
	 * The '<em><b>Os Overhead</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OS_OVERHEAD_VALUE
	 * @generated
	 * @ordered
	 */
	OS_OVERHEAD(8, "OsOverhead", "OsOverhead"),

	/**
	 * The '<em><b>Parking Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARKING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	PARKING_TIME(9, "ParkingTime", "ParkingTime"),

	/**
	 * The '<em><b>Polling Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLLING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	POLLING_TIME(10, "PollingTime", "PollingTime"),

	/**
	 * The '<em><b>Ready Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READY_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	READY_TIME(11, "ReadyTime", "ReadyTime"),

	/**
	 * The '<em><b>Response Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE_TIME(12, "ResponseTime", "ResponseTime"),

	/**
	 * The '<em><b>Running Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNNING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	RUNNING_TIME(13, "RunningTime", "RunningTime"),

	/**
	 * The '<em><b>Start Delay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	START_DELAY(14, "StartDelay", "StartDelay"),

	/**
	 * The '<em><b>Start To Start</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #START_TO_START_VALUE
	 * @generated
	 * @ordered
	 */
	START_TO_START(15, "StartToStart", "StartToStart"),

	/**
	 * The '<em><b>Waiting Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAITING_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	WAITING_TIME(16, "WaitingTime", "WaitingTime");

	/**
	 * The '<em><b>undefined </b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>undefined </b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_UNDEFINED_
	 * @model name="_undefined_"
	 * @generated
	 * @ordered
	 */
	public static final int _UNDEFINED__VALUE = 0;

	/**
	 * The '<em><b>Activate To Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activate To Activate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_TO_ACTIVATE
	 * @model name="ActivateToActivate"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE_TO_ACTIVATE_VALUE = 1;

	/**
	 * The '<em><b>Core Execution Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Core Execution Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORE_EXECUTION_TIME
	 * @model name="CoreExecutionTime"
	 * @generated
	 * @ordered
	 */
	public static final int CORE_EXECUTION_TIME_VALUE = 2;

	/**
	 * The '<em><b>End To End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>End To End</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END_TO_END
	 * @model name="EndToEnd"
	 * @generated
	 * @ordered
	 */
	public static final int END_TO_END_VALUE = 3;

	/**
	 * The '<em><b>Gross Execution Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gross Execution Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROSS_EXECUTION_TIME
	 * @model name="GrossExecutionTime"
	 * @generated
	 * @ordered
	 */
	public static final int GROSS_EXECUTION_TIME_VALUE = 4;

	/**
	 * The '<em><b>Lateness</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lateness</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LATENESS
	 * @model name="Lateness"
	 * @generated
	 * @ordered
	 */
	public static final int LATENESS_VALUE = 5;

	/**
	 * The '<em><b>Memory Access Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Memory Access Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_ACCESS_TIME
	 * @model name="MemoryAccessTime"
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_ACCESS_TIME_VALUE = 6;

	/**
	 * The '<em><b>Net Execution Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Net Execution Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NET_EXECUTION_TIME
	 * @model name="NetExecutionTime"
	 * @generated
	 * @ordered
	 */
	public static final int NET_EXECUTION_TIME_VALUE = 7;

	/**
	 * The '<em><b>Os Overhead</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Os Overhead</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OS_OVERHEAD
	 * @model name="OsOverhead"
	 * @generated
	 * @ordered
	 */
	public static final int OS_OVERHEAD_VALUE = 8;

	/**
	 * The '<em><b>Parking Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parking Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARKING_TIME
	 * @model name="ParkingTime"
	 * @generated
	 * @ordered
	 */
	public static final int PARKING_TIME_VALUE = 9;

	/**
	 * The '<em><b>Polling Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polling Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLLING_TIME
	 * @model name="PollingTime"
	 * @generated
	 * @ordered
	 */
	public static final int POLLING_TIME_VALUE = 10;

	/**
	 * The '<em><b>Ready Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ready Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READY_TIME
	 * @model name="ReadyTime"
	 * @generated
	 * @ordered
	 */
	public static final int READY_TIME_VALUE = 11;

	/**
	 * The '<em><b>Response Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Response Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_TIME
	 * @model name="ResponseTime"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_TIME_VALUE = 12;

	/**
	 * The '<em><b>Running Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Running Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUNNING_TIME
	 * @model name="RunningTime"
	 * @generated
	 * @ordered
	 */
	public static final int RUNNING_TIME_VALUE = 13;

	/**
	 * The '<em><b>Start Delay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start Delay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_DELAY
	 * @model name="StartDelay"
	 * @generated
	 * @ordered
	 */
	public static final int START_DELAY_VALUE = 14;

	/**
	 * The '<em><b>Start To Start</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Start To Start</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #START_TO_START
	 * @model name="StartToStart"
	 * @generated
	 * @ordered
	 */
	public static final int START_TO_START_VALUE = 15;

	/**
	 * The '<em><b>Waiting Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Waiting Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAITING_TIME
	 * @model name="WaitingTime"
	 * @generated
	 * @ordered
	 */
	public static final int WAITING_TIME_VALUE = 16;

	/**
	 * An array of all the '<em><b>Time Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeMetric[] VALUES_ARRAY =
		new TimeMetric[] {
			_UNDEFINED_,
			ACTIVATE_TO_ACTIVATE,
			CORE_EXECUTION_TIME,
			END_TO_END,
			GROSS_EXECUTION_TIME,
			LATENESS,
			MEMORY_ACCESS_TIME,
			NET_EXECUTION_TIME,
			OS_OVERHEAD,
			PARKING_TIME,
			POLLING_TIME,
			READY_TIME,
			RESPONSE_TIME,
			RUNNING_TIME,
			START_DELAY,
			START_TO_START,
			WAITING_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Time Metric</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeMetric> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time Metric</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeMetric get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeMetric result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Metric</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeMetric getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeMetric result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time Metric</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeMetric get(int value) {
		switch (value) {
			case _UNDEFINED__VALUE: return _UNDEFINED_;
			case ACTIVATE_TO_ACTIVATE_VALUE: return ACTIVATE_TO_ACTIVATE;
			case CORE_EXECUTION_TIME_VALUE: return CORE_EXECUTION_TIME;
			case END_TO_END_VALUE: return END_TO_END;
			case GROSS_EXECUTION_TIME_VALUE: return GROSS_EXECUTION_TIME;
			case LATENESS_VALUE: return LATENESS;
			case MEMORY_ACCESS_TIME_VALUE: return MEMORY_ACCESS_TIME;
			case NET_EXECUTION_TIME_VALUE: return NET_EXECUTION_TIME;
			case OS_OVERHEAD_VALUE: return OS_OVERHEAD;
			case PARKING_TIME_VALUE: return PARKING_TIME;
			case POLLING_TIME_VALUE: return POLLING_TIME;
			case READY_TIME_VALUE: return READY_TIME;
			case RESPONSE_TIME_VALUE: return RESPONSE_TIME;
			case RUNNING_TIME_VALUE: return RUNNING_TIME;
			case START_DELAY_VALUE: return START_DELAY;
			case START_TO_START_VALUE: return START_TO_START;
			case WAITING_TIME_VALUE: return WAITING_TIME;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TimeMetric(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TimeMetric
