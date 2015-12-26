package constructor;

public class ProtectedTitBit {
	protected ProtectedTitBit() {
	}
}

// public class OtherClass extends ProtectedTitBit {
// public OtherClass() {
// super();
// }
// }

// Above must be in comment because there must be 2 publicclasses which is of
// course forbidden in the same file in Java.
// The above example will work only if the constructor from ProtectedTitBit is
// protected, if it would be default then we wouldn't have access to this
// constructor.