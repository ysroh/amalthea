package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.papyrus.amalthea.translator.CommonModelTranslator;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * @author epp
 */
@SuppressWarnings("all")
public class OSModelTranslator {
  private final CommonModelTranslator commonTranslator = new CommonModelTranslator();
  
  protected IAnnotatable _translate(final org.eclipse.uml2.uml.Class element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isOperatingSystem is undefined for the type Class");
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final OperatingSystem it, final org.eclipse.uml2.uml.Class element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isOperatingSystem is undefined for the type Class"
      + "\nThe method or field getOperatingSystem is undefined for the type Class"
      + "\nThe method or field getOperatingSystem is undefined for the type Class"
      + "\ntaskSchedulers cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ninterruptControllers cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nmap cannot be resolved");
  }
  
  protected IAnnotatable _translate(final NamedElement element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field isInterruptController is undefined for the type NamedElement");
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final IAnnotatable it, final NamedElement element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field isInterruptController is undefined for the type NamedElement"
      + "\nThe method or field getInterruptController is undefined for the type NamedElement"
      + "\nThe method or field getInterruptController is undefined for the type NamedElement"
      + "\nThe method or field getInterruptController is undefined for the type NamedElement"
      + "\nscheduleUnitPriority cannot be resolved"
      + "\nschedulingUnit cannot be resolved"
      + "\ntaskSchedulingAlgorithm cannot be resolved"
      + "\nscheduleUnitPriority cannot be resolved"
      + "\nschedulingUnit cannot be resolved"
      + "\ninterruptSchedulingAlgorithm cannot be resolved");
  }
  
  protected IAnnotatable _translate(final Element element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isSchedulingHWUnit is undefined for the type Element"
      + "\nThe method or field isOSEK is undefined for the type Element"
      + "\nThe method or field isPriorityBased is undefined for the type Element");
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final BaseObject it, final Element element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isSchedulingHWUnit is undefined for the type Element"
      + "\nThe method or field getSchedulingHWUnit is undefined for the type Element"
      + "\nThe method or field isOSEK is undefined for the type Element"
      + "\nThe method or field isPriorityBased is undefined for the type Element"
      + "\ndelay cannot be resolved");
  }
  
  public IAnnotatable translate(final Element element) {
    if (element instanceof org.eclipse.uml2.uml.Class) {
      return _translate((org.eclipse.uml2.uml.Class)element);
    } else if (element instanceof NamedElement) {
      return _translate((NamedElement)element);
    } else if (element != null) {
      return _translate(element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
