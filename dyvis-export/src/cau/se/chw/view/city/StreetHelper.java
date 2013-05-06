package cau.se.chw.view.city;

import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

/**
 * <code>StreetHelper</code> provides static methods in order to create a
 * <code>Street</code> with Java3D.
 * 
 * @author chw
 * 
 */
public class StreetHelper {

	private StreetHelper() {
		// should not be constructible
	}

//	public static double getStreetLength(Street street) {
//		Vector3d dir = getDirectionVector(street);
//		return dir.length();
//	}
//
//	public static Matrix3d getStreetsDifference(Street street) {
//		Vector3d dir = getDirectionVector(street);
//		// compute rotation axis from direction vector
//		return getRotationMatrix(dir);
//	}
//
//	private static Vector3d getDirectionVector(Street street) {
//		Floor caller = street.getCallerFloor();
//		Floor callee = street.getCalleeFloor();
//
//		if (caller == callee) {
//			throw new UnsupportedOperationException(
//					"Visualizing a method call from and to the same class instance is not yet supported.");
//		}
//
//		Vector3d dir = new Vector3d();
//		dir.sub(callee.getAbsPosition(), caller.getAbsPosition());
//		return dir;
//	}

	/**
	 * Returns the rotation matrix equivalent to the given
	 * <code>direction</code> vector.
	 * 
	 * @param direction
	 * @return
	 */
	public static Matrix3d getRotationMatrix(Vector3d direction) {
		Vector3d vec_y = (Vector3d) direction.clone();
		vec_y.normalize();

		Vector3d vec_x; // reference vector, will be corrected later
		if (vec_y.x == 0 && vec_y.z == 0) {
			vec_x = new Vector3d(-vec_y.y, 0f, 0f); // could be optimized
		} else {
			vec_x = new Vector3d(0f, 1f, 0f);
		}

		Vector3d vec_z = new Vector3d();
		vec_z.cross(vec_x, vec_y);
		vec_z.normalize();

		vec_x.cross(vec_z, vec_y);
		vec_x.normalize();
		vec_x.negate();

		Matrix3d rotation = new Matrix3d(vec_x.x, vec_x.y, vec_x.z, vec_y.x, vec_y.y, vec_y.z,
				vec_z.x, vec_z.y, vec_z.z);
		rotation.invert();
		return rotation;
	}
}
