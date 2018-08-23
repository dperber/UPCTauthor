/**
 */
package upctformagami;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Missions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see upctformagami.UpctformagamiPackage#getTypeMissions()
 * @model
 * @generated
 */
public enum TypeMissions implements Enumerator {
	/**
	 * The '<em><b>Strong</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRONG_VALUE
	 * @generated
	 * @ordered
	 */
	STRONG(1, "strong", "strong"),

	/**
	 * The '<em><b>Weak</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEAK_VALUE
	 * @generated
	 * @ordered
	 */
	WEAK(2, "weak", "weak"),

	/**
	 * The '<em><b>Inhibitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHIBITOR_VALUE
	 * @generated
	 * @ordered
	 */
	INHIBITOR(3, "inhibitor", "inhibitor"),

	/**
	 * The '<em><b>Scores</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCORES_VALUE
	 * @generated
	 * @ordered
	 */
	SCORES(4, "scores", "scores");

	/**
	 * The '<em><b>Strong</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strong</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRONG
	 * @model name="strong"
	 * @generated
	 * @ordered
	 */
	public static final int STRONG_VALUE = 1;

	/**
	 * The '<em><b>Weak</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weak</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEAK
	 * @model name="weak"
	 * @generated
	 * @ordered
	 */
	public static final int WEAK_VALUE = 2;

	/**
	 * The '<em><b>Inhibitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inhibitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHIBITOR
	 * @model name="inhibitor"
	 * @generated
	 * @ordered
	 */
	public static final int INHIBITOR_VALUE = 3;

	/**
	 * The '<em><b>Scores</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scores</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCORES
	 * @model name="scores"
	 * @generated
	 * @ordered
	 */
	public static final int SCORES_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Missions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeMissions[] VALUES_ARRAY =
		new TypeMissions[] {
			STRONG,
			WEAK,
			INHIBITOR,
			SCORES,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Missions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeMissions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Missions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeMissions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeMissions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Missions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeMissions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeMissions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Missions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeMissions get(int value) {
		switch (value) {
			case STRONG_VALUE: return STRONG;
			case WEAK_VALUE: return WEAK;
			case INHIBITOR_VALUE: return INHIBITOR;
			case SCORES_VALUE: return SCORES;
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
	private TypeMissions(int value, String name, String literal) {
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
	
} //TypeMissions
