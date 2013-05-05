package cau.se.chw.probes.aspectj.helpers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectIdGenerator {

	private final Map<Object, Long> objectIdmapper = new ConcurrentHashMap<Object, Long>();
	private volatile long nextFreeId = Long.MIN_VALUE;

	/**
	 * Static inner class. Synchronously instantiated by first access.
	 */
	private static final class InstanceHolder {
		static final ObjectIdGenerator INSTANCE = new ObjectIdGenerator();
	}

	/**
	 * Private constructor.
	 */
	private ObjectIdGenerator() {
	}

	/**
	 * Returns the only instance of this class.
	 */
	public static ObjectIdGenerator getInstance() {
		return InstanceHolder.INSTANCE;
	}

	/**
	 * Assumption (for performance): <code>obj</code> must be not
	 * <code>null</code>. No <code>null</code>-check is performed!
	 * 
	 * @param obj
	 * @return
	 */
	public long generateUniqueId(Object obj) {
		long temp;
		synchronized (this) {
			temp = nextFreeId;
			nextFreeId++;
		}
		objectIdmapper.put(obj, temp);
		return temp;
	}

	/**
	 * Returns the unique object identifier, if available; otherwise
	 * <code>null</code>, i.e., {@link generateUniqueId} should be called to get
	 * a new unique object identifier.
	 * 
	 * @param obj
	 * @return
	 */
	public Long getObjectId(Object obj) {
		return objectIdmapper.get(obj);
	}
}
