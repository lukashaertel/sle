package sle.fsml.run;

import java.util.Arrays;

@SuppressWarnings("all")
public class Resolve {
  protected static Object _resolveFSM(final /* MachineReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\nfsm cannot be resolved");
  }
  
  protected static Object _resolveFSM(final /* MachineLocation */Object location) {
    throw new Error("Unresolved compilation problems:"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  protected static Object _resolveInput(final /* InputReference */Object reference) {
    throw new Error("Unresolved compilation problems:"
      + "\ninput cannot be resolved");
  }
  
  protected static Object _resolveInput(final /* InputLocation */Object location) {
    throw new Error("Unresolved compilation problems:"
      + "\neResource cannot be resolved"
      + "\nresourceSet cannot be resolved"
      + "\ngetResource cannot be resolved"
      + "\nlocation cannot be resolved"
      + "\n== cannot be resolved"
      + "\ncontents cannot be resolved"
      + "\nget cannot be resolved");
  }
  
  public static Object resolveFSM(final MachineReference reference) {
    if (reference != null) {
      return _resolveFSM(reference);
    } else if (reference != null) {
      return _resolveFSM(reference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(reference).toString());
    }
  }
  
  public static Object resolveInput(final InputReference reference) {
    if (reference != null) {
      return _resolveInput(reference);
    } else if (reference != null) {
      return _resolveInput(reference);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(reference).toString());
    }
  }
}
