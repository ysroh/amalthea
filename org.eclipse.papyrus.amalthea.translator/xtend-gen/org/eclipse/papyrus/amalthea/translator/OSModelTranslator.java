package org.eclipse.papyrus.amalthea.translator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.BaseObject;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.OperatingSystem;
import org.eclipse.app4mc.amalthea.model.SchedulingHWUnit;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time;
import org.eclipse.papyrus.amalthea.translator.CommonModelTranslator;
import org.eclipse.papyrus.amalthea.util.OSModelUtils;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

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
    it.setName(element.getName());
    boolean _matched = false;
    boolean _isOperatingSystem = OSModelUtils.isOperatingSystem(element);
    if (_isOperatingSystem) {
      _matched=true;
      final OperatingSystem newElement = ((OperatingSystem) it);
      final Function1<TaskScheduler, NamedElement> _function = (TaskScheduler it_1) -> {
        return ((NamedElement) it_1);
      };
      final Function1<NamedElement, IAnnotatable> _function_1 = (NamedElement it_1) -> {
        return this.translate(it_1);
      };
      final Function1<IAnnotatable, org.eclipse.app4mc.amalthea.model.TaskScheduler> _function_2 = (IAnnotatable it_1) -> {
        return ((org.eclipse.app4mc.amalthea.model.TaskScheduler) it_1);
      };
      newElement.getTaskSchedulers().addAll(
        ListExtensions.<IAnnotatable, org.eclipse.app4mc.amalthea.model.TaskScheduler>map(ListExtensions.<NamedElement, IAnnotatable>map(ListExtensions.<TaskScheduler, NamedElement>map(OSModelUtils.getOperatingSystem(element).getTaskSchedulers(), _function), _function_1), _function_2));
      final Function1<InterruptController, NamedElement> _function_3 = (InterruptController it_1) -> {
        return ((NamedElement) it_1);
      };
      final Function1<NamedElement, IAnnotatable> _function_4 = (NamedElement it_1) -> {
        return this.translate(it_1);
      };
      final Function1<IAnnotatable, org.eclipse.app4mc.amalthea.model.InterruptController> _function_5 = (IAnnotatable it_1) -> {
        return ((org.eclipse.app4mc.amalthea.model.InterruptController) it_1);
      };
      newElement.getInterruptControllers().addAll(
        ListExtensions.<IAnnotatable, org.eclipse.app4mc.amalthea.model.InterruptController>map(ListExtensions.<NamedElement, IAnnotatable>map(ListExtensions.<InterruptController, NamedElement>map(OSModelUtils.getOperatingSystem(element).getInterruptControllers(), _function_3), _function_4), _function_5));
    }
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
    boolean _matched = false;
    boolean _isTaskScheduler = OSModelUtils.isTaskScheduler(element);
    if (_isTaskScheduler) {
      _matched=true;
      final org.eclipse.app4mc.amalthea.model.TaskScheduler newElement = ((org.eclipse.app4mc.amalthea.model.TaskScheduler) it);
      newElement.setName(element.getName());
      newElement.setScheduleUnitPriority(OSModelUtils.getTaskScheduler(element).getScheduleUnitPriority());
      SchedulingUnit _schedulingUnit = OSModelUtils.getTaskScheduler(element).getSchedulingUnit();
      IAnnotatable _translate = this.translate(((Element) _schedulingUnit));
      newElement.setSchedulingUnit(((org.eclipse.app4mc.amalthea.model.SchedulingUnit) _translate));
      TaskSchedulingAlgorithm _taskSchedulingAlgorithm = OSModelUtils.getTaskScheduler(element).getTaskSchedulingAlgorithm();
      IAnnotatable _translate_1 = this.translate(((Element) _taskSchedulingAlgorithm));
      newElement.setSchedulingAlgorithm(((org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm) _translate_1));
    }
    if (!_matched) {
      boolean _isInterruptController = OSModelUtils.isInterruptController(element);
      if (_isInterruptController) {
        _matched=true;
        final org.eclipse.app4mc.amalthea.model.InterruptController newElement_1 = ((org.eclipse.app4mc.amalthea.model.InterruptController) it);
        newElement_1.setName(element.getName());
        newElement_1.setScheduleUnitPriority(OSModelUtils.getInterruptController(element).getScheduleUnitPriority());
        SchedulingUnit _schedulingUnit_1 = OSModelUtils.getInterruptController(element).getSchedulingUnit();
        IAnnotatable _translate_2 = this.translate(((Element) _schedulingUnit_1));
        newElement_1.setSchedulingUnit(((org.eclipse.app4mc.amalthea.model.SchedulingUnit) _translate_2));
        InterruptSchedulingAlgorithm _interruptSchedulingAlgorithm = OSModelUtils.getInterruptController(element).getInterruptSchedulingAlgorithm();
        IAnnotatable _translate_3 = this.translate(((Element) _interruptSchedulingAlgorithm));
        newElement_1.setSchedulingAlgorithm(((org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm) _translate_3));
      }
    }
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
    boolean _matched = false;
    boolean _isSchedulingHWUnit = OSModelUtils.isSchedulingHWUnit(element);
    if (_isSchedulingHWUnit) {
      _matched=true;
      final SchedulingHWUnit newElement = ((SchedulingHWUnit) it);
      Time _delay = OSModelUtils.getSchedulingHWUnit(element).getDelay();
      EObject _translate = this.commonTranslator.translate(((Element) _delay));
      newElement.setDelay(((org.eclipse.app4mc.amalthea.model.Time) _translate));
    }
    if (!_matched) {
      boolean _isOSEK = OSModelUtils.isOSEK(element);
      if (_isOSEK) {
        _matched=true;
      }
    }
    if (!_matched) {
      boolean _isPriorityBased = OSModelUtils.isPriorityBased(element);
      if (_isPriorityBased) {
        _matched=true;
      }
    }
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
