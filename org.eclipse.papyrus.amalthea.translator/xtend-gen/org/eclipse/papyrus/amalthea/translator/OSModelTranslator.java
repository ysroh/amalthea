package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.utils.OSModelUtils;
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
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final OperatingSystem _result;
    synchronized (_createCache_translate) {
      if (_createCache_translate.containsKey(_cacheKey)) {
        return _createCache_translate.get(_cacheKey);
      }
      OperatingSystem _switchResult = null;
      boolean _matched = false;
      boolean _isOperatingSystem = OSModelUtils.isOperatingSystem(element);
      if (_isOperatingSystem) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createOperatingSystem();
      }
      _result = _switchResult;
      _createCache_translate.put(_cacheKey, _result);
    }
    _init_translate(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate = CollectionLiterals.newHashMap();
  
  private void _init_translate(final OperatingSystem it, final org.eclipse.uml2.uml.Class element) {
    throw new Error("Unresolved compilation problems:"
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
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final IAnnotatable _result;
    synchronized (_createCache_translate_1) {
      if (_createCache_translate_1.containsKey(_cacheKey)) {
        return _createCache_translate_1.get(_cacheKey);
      }
      IAnnotatable _switchResult = null;
      boolean _matched = false;
      boolean _isTaskScheduler = OSModelUtils.isTaskScheduler(element);
      if (_isTaskScheduler) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createTargetScheduler();
      }
      if (!_matched) {
        boolean _isInterruptController = OSModelUtils.isInterruptController(element);
        if (_isInterruptController) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createInterruptController();
        }
      }
      _result = _switchResult;
      _createCache_translate_1.put(_cacheKey, _result);
    }
    _init_translate_1(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_1 = CollectionLiterals.newHashMap();
  
  private void _init_translate_1(final IAnnotatable it, final NamedElement element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
      + "\nThe method or field getTaskScheduler is undefined for the type NamedElement"
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
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(element);
    final BaseObject _result;
    synchronized (_createCache_translate_2) {
      if (_createCache_translate_2.containsKey(_cacheKey)) {
        return _createCache_translate_2.get(_cacheKey);
      }
      BaseObject _switchResult = null;
      boolean _matched = false;
      boolean _isSchedulingHWUnit = OSModelUtils.isSchedulingHWUnit(element);
      if (_isSchedulingHWUnit) {
        _matched=true;
        _switchResult = AmaltheaFactory.eINSTANCE.createSchedulingHWUnit();
      }
      if (!_matched) {
        boolean _isOSEK = OSModelUtils.isOSEK(element);
        if (_isOSEK) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createOSEK();
        }
      }
      if (!_matched) {
        boolean _isPriorityBased = OSModelUtils.isPriorityBased(element);
        if (_isPriorityBased) {
          _matched=true;
          _switchResult = AmaltheaFactory.eINSTANCE.createPriorityBased();
        }
      }
      _result = _switchResult;
      _createCache_translate_2.put(_cacheKey, _result);
    }
    _init_translate_2(_result, element);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, IAnnotatable> _createCache_translate_2 = CollectionLiterals.newHashMap();
  
  private void _init_translate_2(final BaseObject it, final Element element) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field getSchedulingHWUnit is undefined for the type Element"
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
